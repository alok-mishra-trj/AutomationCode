package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
	 WebDriver driver;
	    WebDriverWait wait;

	    // Constructor
	    public Logout(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	    
	 // ClickProfileIcon
	    By ClickProfile=By.xpath("//div[contains(@class,'relative cursor-pointer')]//*[name()='svg']");
	    By ClickLogout=By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > h6:nth-child(2)");
	    
	    
	    public void ClickProfile() throws InterruptedException {
	    	driver.findElement(ClickProfile).click();
	    	Thread.sleep(2000);
	    }
	    public void ClickLogout() {
	    	driver.findElement(ClickLogout).click();
	    }

}
