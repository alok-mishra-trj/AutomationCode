package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    // ✅ Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ✅ Locators using @FindBy annotation
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(@class,'flex gap-3 mt-6')]//input")
    private List<WebElement> otpFields;

    @FindBy(xpath = "//button[contains(text(),'Verify')]")
    private WebElement verifyButton;

    @FindBy(xpath = "(//img[@decoding='async'])[1]")
    private WebElement dashboardLogo;

    // ✅ Page Factory Getter Methods
    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public List<WebElement> getOtpFields() {
        return otpFields;
    }

    public WebElement getVerifyButton() {
        return verifyButton;
    }

    public WebElement getDashboardLogo() {
        return dashboardLogo;
    }

    // ✅ Consolidated Login Method
    public void login(String email, String password) {
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    // ✅ OTP Entry Method
    public void enterOtp(String otp) {
        wait.until(ExpectedConditions.visibilityOfAllElements(otpFields));

        if (otpFields.size() == otp.length()) {
            for (int i = 0; i < otp.length(); i++) {
                otpFields.get(i).sendKeys(String.valueOf(otp.charAt(i)));
            }
        } else {
            System.out.println("OTP fields do not match the OTP length.");
        }
    }

    // ✅ OTP Verification + URL & Logo Validation
    public boolean verifyOtpAndDashboard() {
        wait.until(ExpectedConditions.elementToBeClickable(verifyButton)).click();

        // Validate if URL contains 'dashboard'
        wait.until(ExpectedConditions.urlContains("dashboard"));

        // Verify the logo presence on the dashboard
        wait.until(ExpectedConditions.visibilityOf(dashboardLogo));

        return driver.getCurrentUrl().contains("dashboard") && dashboardLogo.isDisplayed();
    }
}
