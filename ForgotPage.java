package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ForgotPage {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public ForgotPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By forgotPasswordLink = By.xpath("//p[contains(text(),'Forgot Password')]");
    public By emailField = By.xpath("//input[@id='email']");
    private By getOtpButton = By.xpath("//button[contains(text(),'Get OTP')]");
    private By otpField = By.xpath("//input[@id='otp']");
    private By verifyResetButton = By.xpath("//button[contains(text(),'Verify')]");

    // Methods
    public void clickForgotPassword() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordLink)).click();
        Thread.sleep(2000);
    }

    public void enterEmail(String email) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
        Thread.sleep(2000);
    }

    public void clickGetOtp() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(getOtpButton)).click();
        Thread.sleep(2000);
    }

    public void enterOtp(String otp) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(otpField)).sendKeys(otp);
        Thread.sleep(2000);
    }

    public void clickVerify() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(verifyResetButton)).click();
        Thread.sleep(2000);
        
//       
    }

	

	
}