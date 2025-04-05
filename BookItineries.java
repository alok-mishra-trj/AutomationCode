package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BookItineries {
	WebDriver driver;

    public BookItineries(WebDriver driver) {
        this.driver = driver;
    }
    
    //Locators
    
    //locations
    By Locations=By.xpath("//div[contains(@class,'w-[130px]')]//span//*[name()='svg']");
    By Apply = By.xpath("//button[normalize-space()='Apply']");
    
    // Occassion
    By Occassion = By.xpath("//div[contains(@class,'w-[115px]')]//span//*[name()='svg']");
    By Faimly = By.xpath("//div[contains(@class,'relative')]//div[4]");
    By OccassionApply= By.xpath("//button[contains(@class,'inline-flex items-center justify-center whitespace-nowrap font-Manrope font-bold rounded-[8px] ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-[#FF5903] text-white hover:bg-[#FF7A35] h-[36px] px-[24px] text-[14px] leading-[19.12px] tracking-[0.4px] mt-2')]");
    
    // Tags 
    By Tags = By.xpath("//div[contains(@class,'w-[106px]')]//span//*[name()='svg']");
    By Placeholder = By.xpath("(//input[@placeholder='Search and Add from the List'])[1]");
    By South_Ind=By.xpath("//span[@class='font-Inter font-[600] text-[14px] leading-[16.94px] tracking-[0.4px] text-text-secondary']");
    By TagsApply = By.xpath("//button[normalize-space()='Apply']");
    
    // Duration 
    By Duration = By.xpath("//p[normalize-space()='Duration']");
    By DurationApply = By.xpath("(//button[normalize-space()='Apply'])[1]");
    
    // Commission
    By Commission = By.xpath("(//p[normalize-space()='Commission'])[1]");
    By Commision15 = By.xpath("(//div[contains(@class,'flex justify-between items-center cursor-pointer rounded-md w-full')])[1]");
    By CommissionApply = By.xpath("(//button[normalize-space()='Apply'])[1]");
    
    //PriceAdult
    By PriceAdult = By.xpath("(//p[normalize-space()='Price/Adult'])[1]");
    By Go = By.xpath("//button[normalize-space()='Go']");
    
    //MinMax
    By SortBy = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > svg:nth-child(2)");
    By Lowest = By.xpath("(//h3[normalize-space()='Price (Lowest First)'])[1]");
    
    // ShowVariations
    By showvari = By.xpath("(//span[normalize-space()='Show variations'])[1]");
    
    //ClickViewButton
    By SearchRoot=By.xpath("(//div[contains(@class,'max-w-[1280px] m-auto flex justify-between')])[1]");
    By View = By.xpath("(//button[normalize-space()='View'])[1]");
    By Day1LearnMore1=By.xpath("(//span[normalize-space()='Learn more'])[1]");
    
    //ClickNotes
    By notes = By.xpath("//div[@class=\"flex gap-2 justify-between items-center\"]/div[2]");
    By FortKochi = By.xpath("(//*[name()='svg'][@class='w-[16px] h-[16px] text-[#000] '])[1]");
    By Eranakulam = By.xpath("(//*[name()='svg'][@class='w-[16px] h-[16px] text-[#000] '])[2]");
    By Munnar = By.xpath("(//*[name()='svg'][@class='w-[16px] h-[16px] text-[#000] '])[3]");
    By Trissure = By.xpath("(//*[name()='svg'])[17]");
    
    // ClickBooking
    By BookingClick = By.xpath("//div[normalize-space()='Booking']");
    
    // ClickPolicy
    By Policy = By.xpath("(//div[normalize-space()='Policy'])[1]");
    
    // CollapseAll
    By CollapseAll = By.xpath("(//*[name()='svg'][@class=' text-[#0094FF] transition-transform rotate-[180deg]'])[1]");
    
    //TrjSelect
    By trjSelect = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/button/div/span");
    By Premium = By.xpath("//span[normalize-space()='Premium Itinerary']");
    
    //FareSummay
    By Additional_commisnal = By.xpath("(//input[contains(@placeholder,'0')])[1]");
    
    By PromoCode = By.xpath("//input[@placeholder='Enter Code']");
    By ApplyPomo = By.xpath("(//span[normalize-space()='Apply'])[1]");
    By CouponApplied = By.xpath("(//td[@class='py-[12px] font-Inter font-normal text-[#4CAF50] text-[17px] leading-[20.57px] tracking-[0.1px]'])[1]");
    
    By Discount = By.cssSelector("body > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(2) > div:nth-child(1) > input:nth-child(2)");
    By Gst = By.xpath("(//button[@id='gst'])[1]");
    By BookItinearyClick = By.xpath("(//button[normalize-space()='Book Itinerary'])[1]");
    
    public void SearchResult(String tag) throws InterruptedException {
    	
    	driver.findElement(Occassion).click();
    	driver.findElement(Faimly).click();
    	driver.findElement( OccassionApply).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(Tags).click();
    	Thread.sleep(1000);
    	driver.findElement(Placeholder).sendKeys("Student");
    	Thread.sleep(2000);
    	driver.findElement(South_Ind).click();
    	driver.findElement(TagsApply).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(Duration).click();
    	Thread.sleep(4000);
    	
    	driver.findElement(DurationApply).click();
    	Thread.sleep(3000);

    	driver.findElement(Commission).click();
    	Thread.sleep(1000);
    	driver.findElement(Commision15).click();
    	Thread.sleep(1000);
    	driver.findElement( CommissionApply).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(PriceAdult).click();
    	driver.findElement(Go).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(SortBy).click();
    	Thread.sleep(3000);
    	driver.findElement(Lowest).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(showvari).click();
    	Thread.sleep(2000);
    	driver.findElement(showvari).click();	
    	
    }

    //Root
    public void SearchRoot() {
    	WebElement root = driver.findElement(SearchRoot);
    	System.out.println(root.getText());
    	System.out.println("SearchRoot Length : "+driver.findElements(SearchRoot).size());
    }
    //ClickView
    public void View() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(View).click();
    	Object[] windowHandles = driver.getWindowHandles().toArray();
    	driver.switchTo().window((String) windowHandles[1]);
    	
    }
 
    public void ClickNotes() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(notes).click();
    	driver.findElement(CollapseAll).click();
    }
    
    public void Booking() {
    	driver.findElement(BookingClick).click();
    }
    public void Policy() {
    	driver.findElement(Policy).click();
    }
    public void CollapseAll() throws InterruptedException {
    	WebElement clcik = driver.findElement(CollapseAll);
    	clcik.click();
    	
    }
    public void trjSelect() throws InterruptedException {
    	Thread.sleep(1000);
    	driver.findElement(trjSelect).click();
    	Thread.sleep(1000);
    	driver.findElement(Premium).click();
    	Thread.sleep(2000);
    }
    public void FareSummary(String amt) throws InterruptedException {	
    WebElement wb=driver.findElement(Additional_commisnal);
    wb.clear();
    Thread.sleep(1000);
    wb.sendKeys(amt);
    Thread.sleep(2000);
//    WebElement c1 = driver.findElement(PromoCode );
//    c1.click();
//    c1.sendKeys("OTM2025");
   // driver.findElement(ApplyPomo ).click();
    }
    public void discount(String dis) throws InterruptedException {
    WebElement ds=driver.findElement(Discount);
    Thread.sleep(3000);
    ds.clear();
    Thread.sleep(2000);
    ds.sendKeys(dis);
    Thread.sleep(1000);
    }
    public void gst() throws InterruptedException {
    	driver.findElement(Gst).click();
    	Thread.sleep(2000);
    }
    public void BookItinearyClick() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(BookItinearyClick).click();
    	Thread.sleep(3000);
    	
    }
}
