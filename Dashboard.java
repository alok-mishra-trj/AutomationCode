
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

public class Dashboard {
    WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }
    
    
    // Seach_field
    By DestinationFieldClick = By.xpath("//div[@class='flex gap-2 cursor-pointer']");
//    By City1 = By.xpath("//body//div[@data-overlay-container='true']//div//div//div//div//div//div[1]//div[1]//span[1]//input[1]");
//    By City2 = By.xpath("(//input[@class=\"PrivateSwitchBase-input css-j8yymo\"])[3]");
    By SearchCity = By.xpath("//input[@placeholder='Where do you wish to go?']");
    By SearchCityClick = By.xpath("//input[@aria-label='Checkbox demo']");
    By Apply_Button = By.xpath("//button[contains(text(),'Apply')]");
    
    // DepatureDate_field
    By DateField = By.xpath("//div[@class=\"flex gap-2 cursor-pointer items-start \"]");
    By DatePagination = By.xpath("//div[@class='group w-[36px] h-[36px] flex justify-center items-center cursor-pointer rounded-[8px] border border-[#DADDE8] hover:bg-[#FF5903] hover:border-[#FF5903]']//*[name()='svg']");
    By SelectUnAvailbeDate=By.xpath("(//span[@class=\"text-[16px] text-[#C1C2C6] leading-[21px] font-normal\"])[10]");
    By ClikCancleIcon=By.xpath("//button[@type='button']//*[name()='svg']");
    By picDate = By.xpath("//span[contains(@class,'undefined w-[40px] h-[100%] flex justify-center items-center rounded-[50%] hover:bg-[#FF5903] hover:text-[#FFFFFF] cursor-pointer')][normalize-space()='23']");
    
    // Room & Travelers
    By Rooms_Travellers = By.xpath("//div[@class='flex gap-3 cursor-pointer relative']");
    By Number_Adult = By.cssSelector("[class=\"w-6 h-6 text-gray-400 text-orange-500\"]");
    By Numbver_Children=By.xpath("(//*[name()='path'])[11]");
    By ClickAgeField= By.cssSelector("div[role='combobox']");
    By Select_Age=By.xpath("//li[@data-value=\"5\"]");
    By Add_Room=By.xpath("//button[@class='inline-flex items-center justify-center whitespace-nowrap font-Manrope font-bold rounded-[8px] ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-[#FF5903] text-[#FF5903] h-[40px] px-[32px] text-[17px] leading-[23.22px] tracking-[0.1px] bg-white']");
    By ClickApply=By.xpath("//button[@class='inline-flex items-center justify-center whitespace-nowrap font-Manrope font-bold rounded-[8px] ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-[#FF5903] text-white hover:bg-[#FF7A35] h-[40px] px-[32px] text-[17px] leading-[23.22px] tracking-[0.1px]']");
    
    
    // Filter_Field
    By FilterField=By.xpath("//div[@class=\"h-[77px] xl:h-[96px] flex items-center text-left gap-2 w-full p-[16px] xl:px-8 xl:py-2\"]");
    By Click_PackageType=By.xpath("//input[@id=\"664d9aa0540fd162df20fa61\"]");
    By Itinerary_Type=By.xpath("//input[@id=\"665989a6cfbad257e20d7239\"]");
    By Clear_All_Filter=By.xpath("//button[contains(text(),'Clear All')]");
    By ClickApplyFilter=By.xpath("//button[contains(text(),'Apply')]");
    
    //Occasion
    By Occasion_Couple=By.xpath("//button[normalize-space()='Couple']");
    By Occasion_solo=By.xpath("//button[normalize-space()='Solo']");
    By Occasion_friends=By.xpath("//button[normalize-space()='Friends']");
    By ClickSearch=By.xpath("//button[@id='searchButton']");
    
    
    // Title
    public String getPageTitle() {
    	String expectedTitle = "TRJ Partner Dashboard";
    	String actualTitle = driver.getTitle();
    	Assert.assertEquals(actualTitle, expectedTitle, "Page title does't match");
    	return driver.getTitle();
    	
    }
     
    
    // Search destination
//    // 1) choose cityState
//    public void ChooseCityState() throws InterruptedException {
//        driver.findElement(DestinationFieldClick).click();
//        driver.findElement(City1).click();
//        Thread.sleep(2000);
//        driver.findElement(City2).click();
//        driver.findElement(Apply_Button).click();
//        Thread.sleep(1000);
   // }
   // 2) Search InValidcityState
    public void InValidsearchCity(String city) throws InterruptedException {
    	driver.findElement(DestinationFieldClick).click();
    	Thread.sleep(1000);
        driver.findElement(SearchCity).sendKeys(city);
        Thread.sleep(1000);
        driver.findElement(Apply_Button).click(); 
        
    }
    
     // 3) SearchValidcityState
    public void ValidsearchCity(String city) throws InterruptedException {
    	driver.findElement(DestinationFieldClick).click();
    	Thread.sleep(1000);
        driver.findElement(SearchCity).sendKeys(city);
        Thread.sleep(1000);
        driver.findElement(SearchCityClick).click(); // Fixed missing .click()
        Thread.sleep(1000);
        driver.findElement(Apply_Button).click(); 
        
    }
    
     // Depature_Date
    // 1) DateNotAvailable
    public void UnAvailableDate() throws InterruptedException {
    	driver.findElement(DateField).click();
    	Thread.sleep(1000);
    	driver.findElement(DatePagination).click();
    	Thread.sleep(1000);
    	driver.findElement(SelectUnAvailbeDate).click();
    	Thread.sleep(1000);
    	driver.findElement(ClikCancleIcon).click();
    	Thread.sleep(1000);
    	//driver.navigate().back();
    	
    }
    
    // 2) DateVisible
    public void chooseDate() throws InterruptedException {
    	driver.findElement(DateField).click();
    	Thread.sleep(2000);
    	driver.findElement(picDate).click();
    	Thread.sleep(1000);
    }
    
    // Room & Travel
      public void RoomAndTravel() throws InterruptedException {
    	driver.findElement(Rooms_Travellers).click();
    	Thread.sleep(1000);
    	driver.findElement(Number_Adult).click();
    	Thread.sleep(1000);
    	driver.findElement(Numbver_Children).click();
    	Thread.sleep(1000);
    	driver.findElement(ClickAgeField).click();
    	Thread.sleep(1000);
    	driver.findElement(Select_Age).click();
    	Thread.sleep(1000);
    	driver.findElement(Add_Room).click();
    	Thread.sleep(1000);
    	driver.findElement(ClickApply).click();
    
    } 
    
 // Filter
    public void ApplyFilter() {
        driver.findElement(FilterField).click();
        
        boolean isStandardAvailable = isFilterPresent(Click_PackageType);
        boolean isHoneymoonAvailable = isFilterPresent(Itinerary_Type);

        if (isStandardAvailable) {
            driver.findElement(Click_PackageType).click();
            System.out.println("✅ Standard filter applied.");
        }

        if (isHoneymoonAvailable) {
            driver.findElement(Itinerary_Type).click();
            System.out.println("✅ Honeymoon filter applied.");
        }

        if (isStandardAvailable || isHoneymoonAvailable) {
            driver.findElement(ClickApplyFilter).click();
            System.out.println("🚀 Filters applied successfully!");
        } else {
            System.out.println("⚠️ No filters available.");
        }
    }

    // Helper method to check if filter is present
    private boolean isFilterPresent(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        return elements.size() > 0;
    }

    
    // ClearFilter
    public void ClearFilter() {
    	driver.findElement(Clear_All_Filter).click();
    	
    }
    
     // Occasion
    public List<String> Occasion() throws InterruptedException {
        List<String> appliedOccasions = new ArrayList<>();

        // Select occasions
        WebElement couple = driver.findElement(Occasion_Couple);
        couple.click();
        appliedOccasions.add(couple.getText());
        //Thread.sleep(1000);

        WebElement solo = driver.findElement(Occasion_solo);
        solo.click();
        appliedOccasions.add(solo.getText());
        //Thread.sleep(1000);

        WebElement friends = driver.findElement(Occasion_friends);
        friends.click();
        appliedOccasions.add(friends.getText());
        //Thread.sleep(1000);

        driver.findElement(ClickSearch).click();
        Thread.sleep(3000);
//        JavascriptExecutor js =(JavascriptExecutor)driver;
//    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//    	System.out.println(js.executeScript("return window.pageYOffset;"));
//        
        System.out.println("Applied Occasions: " + String.join(", ", appliedOccasions));

        return appliedOccasions;
    }
    

   

    
}

