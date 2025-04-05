package pom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravellerDetails {
	WebDriver driver;

    public TravellerDetails(WebDriver driver) {
        this.driver = driver;
    }
    // Locators 
    //Adult1
    By title = By.xpath("(//button[@type=\"button\"])[1]");
    By MrClick=By.xpath("//span[contains(text(),'Mr.')]");
    By FirstName = By.xpath("(//input[@placeholder=\"Mention First Name\"])[1]");
    By LastName = By.xpath("//input[@placeholder=\"Mention Last Name\"]");
    By Age = By.xpath("(//input[@placeholder='Mention Age In Years'])[1]");
    By ContactNumber = By.xpath("(//input[@placeholder='Mention Contact'])[1]");
    By Email = By.xpath("(//input[@placeholder='Mention Email'])[1]");
    By CountryField = By.xpath("(//button[@type=\"button\"])[2]");
    By SelectIndia = By.xpath("//span[contains(text(),'India')]");
    By pinCode = By.xpath("//input[@placeholder='Enter Pincode']");
    By City = By.xpath("(//input[@placeholder='Enter City'])[1]");
    By State = By.xpath("(//input[@placeholder='Enter State'])[1]");
    By Address = By.xpath("(//input[@placeholder='Mention Address'])[1]");
    
    // Adult2
    By title2 = By.xpath("(//button[@type=\"button\"])[3]");
    By mr = By.xpath("(//span[contains(text(),'Mr.')])[2]");
    By FirstName2 = By.xpath("(//input[@name='adults.0.firstName'])[1]");
    By LastName2 = By.xpath("(//input[@name='adults.0.lastName'])[1]");
    By Age2 = By.xpath("(//input[@placeholder='Mention Age'])[1]");
    
    // Child
    By title3 = By.xpath("(//button[@type=\"button\"])[4]");
    By mr1= By.xpath("(//span[contains(text(),'Mr.')])[3]");
    By FirstName3 = By.xpath("(//input[@name='childrens.0.firstName'])[1]");
    By LastName3 = By.xpath("(//input[@name='childrens.0.lastName'])[1]");
    
    // SpecialRequest 
    By SR = By.xpath("(//*[name()='svg'][@class='h-4 w-4 shrink-0 transition-transform duration-200 group-data-[state=open]:rotate-180'])[1]");
    By FiledMessage = By.xpath("//textarea[@placeholder='Enter requests (if any) made by the customer']");
    
    //PayMent 
    By PartialPay = By.xpath("(//input[@type=\"radio\"])[1]");
    By FullPay = By.xpath("//input[@id='100%']");
    By QR = By.xpath("//input[@id='Qr Code']");
    By PaymentGateways = By.xpath("(//input[@id='Payment Gateway'])[1]");
    By PayNow = By.xpath("(//button[normalize-space()='Pay Now'])[1]");
    By Upload=By.xpath("//*[@type='file']");
    By Submit =By.xpath("//button[normalize-space()='Submit']");
    By ClickViewBooking = By.xpath("//button[normalize-space()='View Bookings']");
    
    //Booking
    By clickUpComing = By.xpath("//p[normalize-space()='Upcoming(29)']");
    By Completed = By.xpath("(//p[normalize-space()='Completed(75)'])[1]");
    By Cancelled = By.xpath("(//p[normalize-space()='Cancelled(1)'])[1]");
    By ForwordPagination = By.xpath("//p[contains(@class,'cursor-pointer font-bold text-lg text-text-secondary hover:text-primary')][normalize-space()='>']");
    By BackwordPagination = By.xpath("(//p[normalize-space()='<'])[1]");
    By view = By.xpath("(//div[normalize-space()='View'])[2]");
    
    //Share Booking 
    By ShareBooking = By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[2]/button/h2");
    By whatsApp = By.xpath("[class=\"w-[32px] h-[32px]\"]");
    By Placeholder = By.xpath("//input[@placeholder=\"Enter the Number\"]");
    By share = By.xpath("(//button[normalize-space()='Share'])[2]");
    
    //Canceled
    By BookDetails = By.xpath("//h6[normalize-space()='Booking Details']");
    By CanclledOption = By.xpath("//button[normalize-space()='Cancel Booking']");
    By ReasonClick = By.xpath("//input[@id=\"reason-0\"]");
    By CancelClick = By.xpath("(//button[@type='submit'])[1]");
    
    // MobileNumber
    By MobileNum=By.cssSelector("[class=\"relative z-[5] ml-auto flex cursor-text items-center\"]");
    By Countinue = By.cssSelector("[name=\"button\"]");
    
   
//     
    // Adult1
    public void selectTile() throws InterruptedException {
        driver.findElement(title).click();
        Thread.sleep(1000);
        driver.findElement(MrClick).click();	
        Thread.sleep(1000);
    }

    public void FirstName(String name) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstName)).sendKeys(name);
        Thread.sleep(1000);
       
    }
    public void LastName(String lname) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LastName)).sendKeys(lname);
        Thread.sleep(1000);
    }
    public void Age(String age) throws InterruptedException {
    	WebElement fill = driver.findElement(Age);
//    	fill.sendKeys("14");
    	Thread.sleep(1000);
//    	fill.clear();
    	fill.sendKeys("20");
    	 Thread.sleep(1000);
    	
    }
    public void contact() throws InterruptedException {
    	WebElement contact = driver.findElement(ContactNumber);
//    	contact.sendKeys("893294527456789");
//    	Thread.sleep(3000);
//    	contact.clear();
    	contact.sendKeys("8932945274");
    	 Thread.sleep(1000);
    	
    }
    public void Email() throws InterruptedException {
    	WebElement eml = driver.findElement(Email);
//    	eml.sendKeys("Alokmi456776@gmailcom456776");
      	Thread.sleep(2000);
//    	eml.clear();
    	eml.sendKeys("Alokmi2111997@gmail.com");
    }
    public void CountrySelect() throws InterruptedException {
    	driver.findElement(CountryField).click();
    	 Thread.sleep(2000);
    	driver.findElement(SelectIndia).click();
    	 Thread.sleep(1000);
    	
    }
    public void pincode(String pn) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	driver.findElement(pinCode).sendKeys(pn);
    	 Thread.sleep(1000);
    	
    }
    public void City(String ct) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	driver.findElement(City).sendKeys(ct);
    	 Thread.sleep(1000);
    	
    }
    public void State(String st) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	driver.findElement(State).sendKeys(st);
    	 Thread.sleep(1000);
    	
    }
    public void Address(String ad) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	driver.findElement(Address).sendKeys(ad);
    	 Thread.sleep(1000);
    }
    
    // Adult2
   public void title2() throws InterruptedException {
	driver.findElement(title2).click();
	Thread.sleep(2000);
	 driver.findElement(mr).click();
	 Thread.sleep(1000);
     
   }
   public void FirstName2(String fn) throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.findElement(FirstName2).sendKeys(fn);
	   Thread.sleep(1000);
   }
   public void lastName2(String fn) throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.findElement(LastName2).sendKeys(fn);
	   Thread.sleep(1000);
   }
   public void Age2() throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   WebElement fill = wait.until(ExpectedConditions.elementToBeClickable(Age2));
	    fill.sendKeys("20");  
	    Thread.sleep(1000);
   }
   //Child
   public void title3() throws InterruptedException {
	driver.findElement(title3).click();
	 Thread.sleep(2000);
	 driver.findElement(mr1).click();
     Thread.sleep(2000);
   }
   public void FirstName3(String fn) throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.findElement(FirstName3).sendKeys(fn);
	   Thread.sleep(2000);
	  
   }
   public void lastName3(String fn) throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.findElement(LastName3).sendKeys(fn);
	   Thread.sleep(2000);
   }
   public void SpecialRequest() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.findElement(SR).click();
	   
   }
   public void message(String msg) throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.findElement(FiledMessage).sendKeys(msg);
	   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -800);");
	   Thread.sleep(3000);
   }
   
   public void QR_Payment(String str) throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // ✅ Click Partial Payment
	    driver.findElement(PartialPay).click();
	    Thread.sleep(1000);
	    driver.findElement(QR).click();
	    
	 // ✅ Click on "Pay Now"
	    driver.findElement(PayNow).click();
	    Thread.sleep(5000);
	    
	    
	    // QR payment options 
	       WebElement fileInput = driver.findElement(By.xpath("//*[@type='file']"));
		   String filePath = "C:\\Users\\AlokMishra\\Desktop\\TRJPOM\\src\\test\\resources\\Images\\QR.png";
	       fileInput.sendKeys(filePath);
	       Thread.sleep(2000);
	       driver.findElement(Submit).click();
	       Thread.sleep(5000);
   }
 
   public void PaymentGateway() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    driver.findElement(PartialPay).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(PaymentGateways).click();
	    Thread.sleep(2000);

	    js.executeScript("arguments[0].click();", driver.findElement(PayNow));

	    WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@src, 'razorpay.com')]")));
	    driver.switchTo().frame(iframe);

	    WebElement mobileNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='tel']")));
	    mobileNumberField.sendKeys("8932945274");

	    WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Continue')]")));
	    continueBtn.click();
	    Thread.sleep(1000);

	    WebElement cardOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-sidebar\"]/div[1]/label[3]/div/div/span/div/div[3]")));
	    cardOption.click();

	    driver.findElement(By.xpath("//input[contains(@placeholder,'Card Number')]")).sendKeys("4111 1111 1111 1111");
	    driver.findElement(By.xpath("//input[@placeholder='MM / YY']")).sendKeys("12/25");
	    driver.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("123");
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Enter name on card')]")).sendKeys("Test User");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("testuser@example.com");

	    driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	    Thread.sleep(2000);

	    try {
	        WebElement maybeLaterIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@src, 'razorpay.com')]")));
	        driver.switchTo().frame(maybeLaterIframe);
	    } catch (Exception e) {
	        System.out.println("No additional iframe found for 'Maybe Later' button.");
	    }

	    WebElement maybeLaterBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Maybe later']")));
	    js.executeScript("arguments[0].click();", maybeLaterBtn);

	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);

	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;

	    List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

	    for (int i = 0; i < iframes.size(); i++) {
	        driver.switchTo().frame(i);
	        List<WebElement> otpFields = driver.findElements(By.xpath("//input[@placeholder='Enter OTP']"));

	        if (!otpFields.isEmpty()) {
	            break;
	        }

	        driver.switchTo().defaultContent();
	    }

	    WebElement otpField = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter OTP']")));

	    String otp = "123456";
	    js2.executeScript("arguments[0].value='" + otp + "';", otpField);
	    Thread.sleep(1000);

	    WebElement continueBtn1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Continue')]")));
	    js.executeScript("arguments[0].click();", continueBtn1);
	    
	    Thread.sleep(1000); 
	    driver.switchTo().defaultContent();
	    
	    
	}
   
   
   public void UPI() throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    driver.findElement(PartialPay).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(PaymentGateways).click();
	    Thread.sleep(2000);

	    js.executeScript("arguments[0].click();", driver.findElement(PayNow));
	    

	    WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@src, 'razorpay.com')]")));
	    driver.switchTo().frame(iframe);

	    WebElement mobileNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='tel']")));
	    mobileNumberField.sendKeys("8932945274");

	    WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Continue')]")));
	    continueBtn.click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//span[contains(text(),'UPI - PhonePe')]")).click();
	    Thread.sleep(1000);
	    
	    WebElement web = driver.findElement(By.xpath("//input[contains(@placeholder,'example@okhdfcbank')]"));
	    Thread.sleep(3000);
	    web.clear();
	    Thread.sleep(1000);
	 // ✅ Use BACKSPACE to remove any unwanted characters before "@ybl"
	    web.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
	    Thread.sleep(500);

	    // ✅ Enter the UPI prefix before "@ybl"
	    web.sendKeys("");
	    Thread.sleep(500);
	    web.sendKeys("a-@ybl");
	    
	    driver.findElement(By.xpath("(//button[normalize-space()='Verify and Pay'])[1]")).click();
	    Thread.sleep(5000);  
	    
	    driver.switchTo().defaultContent(); 
	    
	    ViewBooking();    
   }
    
    // ViewBooking
      public void ViewBooking() throws InterruptedException {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	    JavascriptExecutor js = (JavascriptExecutor) driver;

    	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	    System.out.println(js.executeScript("return window.pageYOffset;"));

    	    WebElement viewBookingBtn = wait.until(ExpectedConditions.elementToBeClickable(ClickViewBooking));
    	    viewBookingBtn.click();

    	    // Optional: Wait for bookings table/list to load before paginating
    	    Thread.sleep(3000); 

    	    // Loop through pagination
//    	    for (int i = 0; i < 1; i++) {
//    	        WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(ForwordPagination));
//    	        nextBtn.click();
//    	        Thread.sleep(1000);
//    	    }

    	    // Now scroll to and click the final booking element
    	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
    	        By.xpath("(//div[normalize-space()='View'])[2]")));
    	    js.executeScript("arguments[0].scrollIntoView(true);", element);
    	    element.click();
       }
       
       // Cancelled 
       public void CanclledPage() throws InterruptedException {
  	
       Object[] windowHandles1 = driver.getWindowHandles().toArray();
       driver.switchTo().window((String) windowHandles1[2]);
       Thread.sleep(3000);
       JavascriptExecutor js1 =(JavascriptExecutor)driver;
   	   js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
   	   System.out.println(js1.executeScript("return window.pageYOffset;"));
   	   Thread.sleep(1000);
       driver.findElement(CanclledOption).click();
       Thread.sleep(2000);
       driver.findElement(ReasonClick).click();
       Thread.sleep(2000);
       driver.findElement(CancelClick).click();  
   }
       
       // SharesBookingDetails 
       public void shareBookingDetails() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	driver.findElement(ShareBooking ).click();
    	Thread.sleep(1000);
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	 System.out.println(js.executeScript("return window.pageYOffset;"));
    	 Thread.sleep(1000);
    	driver.findElement(whatsApp).click();
    	 Thread.sleep(1000);
    	driver.findElement(Placeholder).sendKeys("8932945274");
    	 Thread.sleep(1000);
    	driver.findElement(share).click();	
    }
    
   
}
