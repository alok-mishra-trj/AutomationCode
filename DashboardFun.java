package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DashboardFun {
    WebDriver driver;
    WebDriverWait wait;

    public DashboardFun(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By BookingIcon = By.xpath("//div[@class='flex justify-center gap-8']//div[2]//*[name()='svg']");
    By ClickProfile = By.xpath("//div[contains(@class,'relative cursor-pointer')]//*[name()='svg']");
    By My_Account = By.xpath("//div[@class='flex items-center m-auto justify-center gap-2']//div[1]//*[name()='svg']");
    By Recent_Searches = By.xpath("//div[@class=\"w-[821px] h-[268px] border rounded-[8px] p-4 \"]");
    
    By HimachalPradesh = By.xpath("//img[@alt='Himachal Pradesh']");
    By JammuAndKashmir = By.xpath("//img[@alt='Jammu & Kashmir']");
    By Goa = By.xpath("//img[@alt='Goa']");
    By Kerala = By.xpath("//img[@alt='Kerala']");
    By Rajasthan = By.xpath("//img[@alt='Rajasthan']");

    By CompanyAboutUs = By.xpath("//span[normalize-space()='About us']");
    By CompanyPrivacyPolicy = By.xpath("//span[normalize-space()='Privacy Policy']");
    
    By Social_Linkedin = By.xpath("//a[normalize-space()='Linkedin']");
    By Social_Instagram = By.xpath("//a[normalize-space()='Instagram']");
    
    By Contact_Email = By.xpath("//a[contains(text(),'trjpartner@thereturnjourney.com')]");
    By Contact_Address = By.xpath("//a[contains(text(),'910, Gera’s Imperium Rise, Hinjewadi Phase II, Pun')]");

    // Helper method for waiting and clicking
    private void waitForElementAndClick(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Click Booking Icon
    public void clickBookingIcon() {
        waitForElementAndClick(BookingIcon);
        scrollToBottom();
        driver.navigate().back();
    }

    // Click Profile and My Account
    public void clickProfile() {
        waitForElementAndClick(ClickProfile);
        waitForElementAndClick(My_Account);
        scrollToBottom();
        driver.navigate().back();
    }

    // Scroll to bottom
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    // Five Areas Navigation
    public void fiveAreas() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        List<By> areas = List.of(HimachalPradesh, JammuAndKashmir, Goa, Kerala, Rajasthan);
        List<String> areaNames = new ArrayList<>();

        for (By area : areas) {
            WebElement areaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(area));
            String areaName = areaElement.getAttribute("alt");
            areaNames.add(areaName);

            areaElement.click();
            driver.navigate().back();
        }

        System.out.println("All Five Areas: " + String.join(", ", areaNames));
    }

    // Recent Searches
    public List<WebElement> recentSearches() {
        return driver.findElements(Recent_Searches);
    }

    public void printRecentSearches() {
        List<WebElement> searches = recentSearches();
        for (WebElement search : searches) {
            System.out.println(search.getText());
        }
    }

    public boolean isDestinationInRecentSearches(String destination) {
        for (WebElement search : recentSearches()) {
            if (search.getText().contains(destination)) {
                return true;
            }
        }
        return false;
    }

    // Footer Navigation
    public void Footer() {
        waitForElementAndClick(CompanyAboutUs);
        driver.navigate().back();
        waitForElementAndClick(CompanyPrivacyPolicy);
        driver.navigate().back();
        waitForElementAndClick(Social_Linkedin);
        driver.navigate().back();
   
        waitForElementAndClick(Social_Instagram);
        driver.navigate().back();
    
        waitForElementAndClick(Contact_Email);
        driver.navigate().back();
        
        waitForElementAndClick(Contact_Address);
        driver.navigate().back();
    }
}
