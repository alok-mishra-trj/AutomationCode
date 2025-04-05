package pomTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ForgotPage;

public class ForgotPasswordTest {
	 WebDriver driver;

	    @BeforeClass
	    void setup() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://dev-trjpartner.thereturnjourney.com/login");
	        driver.manage().window().maximize();

} 
	    @Test(priority=1)
	    public void InValiadCredentials() throws InterruptedException {
	        ForgotPage fp = new ForgotPage(driver);
	        
	        fp.clickForgotPassword();
	        fp.enterEmail("Alokmi2111997@gmail.com");
	        fp.clickGetOtp();
	        
	        // Explicit wait for OTP field to be visible
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        fp.enterOtp("123456");
	        fp.clickVerify();
	        
	        driver.navigate().back();  
	    }
	    @Test(priority=2)
	    public void ValiadCredentials() throws InterruptedException {
	    	driver.navigate().refresh();
	        ForgotPage fp = new ForgotPage(driver);
	        
	        fp.clickForgotPassword();
	        Thread.sleep(2000);
	        fp.enterEmail("Alokmi2111997@gmail.com");
	        Thread.sleep(2000);
	        fp.clickGetOtp();
	        
	        // Explicit wait for OTP field to be visible
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        fp.enterOtp("987654");
	        fp.clickVerify();
	        
	    }

}