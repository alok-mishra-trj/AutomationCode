package pomTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.LoginPage;
import pom.Logout;

public class LogoutTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dev-trjpartner.thereturnjourney.com/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    void TestLogin() {
        LoginPage loginPage = new LoginPage(driver);
        
        // ✅ Login with email and password
        loginPage.login("Alokmi2111997@gmail.com", "oK0LKaO2");

        // ✅ Enter OTP
        loginPage.enterOtp("123456");  // Replace with correct OTP

        // ✅ Verify login and dashboard validation
        Assert.assertTrue(loginPage.verifyOtpAndDashboard(), "Login or Dashboard validation failed!");
    }
    

    @Test(priority = 1, dependsOnMethods = "TestLogin")
    void TestLogout() throws InterruptedException {
        Logout lo = new Logout(driver);
        lo.ClickProfile();
        lo.ClickLogout();

        // ✅ Verify logout by checking URL contains "login"
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Logout failed!");
    }

    @AfterClass
    void teardown() {
        driver.quit();
    }
}
