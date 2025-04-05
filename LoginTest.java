//package pomTest;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import pom.LoginPage;
//
//public class LoginTest {
//    WebDriver driver;
//
//    @BeforeClass
//    void setup() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://dev-trjpartner.thereturnjourney.com/login");
//        driver.manage().window().maximize();
//    }
// // ✅ Test Case: Invalid Login
//    @Test(priority = 1)
//    void testInvalidLogin() {
//        LoginPage lp = new LoginPage(driver);
//
//        // ✅ Enter invalid credentials
//        lp.login("invalidUser@gmail.com", "invalidPass123");
//
//        // ✅ Verify invalid login by checking that the URL doesn't change to dashboard
//        Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"), "Invalid login should not navigate to the dashboard!");
//        System.out.println("Successfully not login...");
//    }
//
//
//    // ✅ Test Case: Valid Login
//    @Test(priority = 2)
//    void testValidLogin() {
//        LoginPage lp = new LoginPage(driver);
//
//        // ✅ Enter valid credentials
//        lp.login("Alokmi2111997@gmail.com", "oK0LKaO2");
//
//        // ✅ Enter valid OTP
//        lp.enterOtp("123456");
//
//        // ✅ Validate successful login
//        Assert.assertTrue(lp.verifyOtpAndDashboard(), "Login failed!");
//        System.out.println("Successfully login...");
//    }
//
//    
//    @AfterClass
//    void teardown() {
//        driver.quit();
//    }
//}
package pomTest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.LoginPage;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dev-trjpartner.thereturnjourney.com/login");
        driver.manage().window().maximize();
    }

    // ✅ Invalid Login Test
    @Test(priority = 1)
    void testInvalidLogin() {
        System.out.println("Running Invalid Login Test...");

        LoginPage lp = new LoginPage(driver);

        // Invalid credentials
        lp.login("invalidUser@gmail.com", "invalidPass123");

        // Verify invalid login by checking that the URL doesn't change to dashboard
        Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"), "Invalid login should not navigate to the dashboard!");
        
        System.out.println("❌ Invalid Login Test Passed (Did not navigate to dashboard)");
    }

    // ✅ Valid Login Test (depends on Invalid Login execution)
    @Test(priority = 2, dependsOnMethods = "testInvalidLogin")
    void testValidLogin() {
        System.out.println("Running Valid Login Test...");

        // Refreshing the page after invalid login to reset the state
        driver.navigate().refresh();

        LoginPage lp = new LoginPage(driver);

        // Valid credentials
        lp.login("Alokmi2111997@gmail.com", "oK0LKaO2");

        // Valid OTP
        lp.enterOtp("123456");

        // Validate successful login
        Assert.assertTrue(lp.verifyOtpAndDashboard(), "Valid login failed!");
        System.out.println("✅ Successfully logged in with valid credentials.");
    }

   
}
