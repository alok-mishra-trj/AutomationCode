
package pomTest;
import java.time.Duration;
import java.util.List;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pom.BookItineries;
import pom.Dashboard;
import pom.DashboardFun;
import pom.LoginPage;
import pom.TravellerDetails;
public class TestRunner {
    WebDriver driver;
    Dashboard db;
    LoginPage loginPage;
    BookItineries bi;
    TravellerDetails td;
    DashboardFun dbf;
  
    static void sleep(int duration) throws InterruptedException{
    Thread.sleep(duration);
	
    }
    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://staging-trjpartner.thereturnjourney.com/login");
        driver.manage().window().maximize();
        db=new Dashboard (driver);
        bi=new BookItineries(driver);
        td=new TravellerDetails(driver);
        loginPage = new LoginPage(driver);
        dbf = new DashboardFun(driver);
    }
    
    @Test(priority = 1)
    public void TestLogin() throws InterruptedException {
    	sleep(1000);
    	System.out.println("TestLogin started....");
       
        // ✅ Login with email and password
        loginPage.login("alokmi2111997@gmail.com", "q9nUpgQt");// oK0LKaO2 // q9nUpgQt
        loginPage.enterOtp("123456");
        sleep(10000);
        Assert.assertTrue(loginPage.verifyOtpAndDashboard(),"Login or Dashboard validation failed!");
        System.out.println("TestLogin ended...."); 
      
     }
    
    // Title 
    @Test(priority = 2)
    public void Title() throws InterruptedException{
    	sleep(1000);
    	System.out.println("Title started....");
    	
        System.out.println("Page title name : "+db.getPageTitle());
        System.out.println("Title end....");
    }
    
     // InvalidSearch
       @Test(priority = 3)
       public void InvalidCityState() throws InterruptedException {
    	   sleep(1000);
    	   System.out.println("InvalidCityState....");
           db.InValidsearchCity("ABC123");
           
           }
       //ValidSearch
        @Test(priority = 4)
        public void destination() throws InterruptedException {
        sleep(1000);
        Dashboard db = new Dashboard(driver);
        db.ValidsearchCity("Munnar");
        
        }
       // Depature_date_Not_Availble
       @Test(priority = 5)
       public void SelectDate() throws InterruptedException {
       sleep(500);
    	db.UnAvailableDate();
    	   
       }
       
        // Depature_date_Availble
        @Test(priority = 6)
       public void chooseDate() throws InterruptedException {
       sleep(500);
        db.chooseDate();
        }
        
        
        // Room & Travelers
//        @Test(priority = 7)
//       public void Room() throws InterruptedException{
//       sleep(1000);
//        db.RoomAndTravel();
//        	
//        }
        
        // Filter
        @Test(priority = 8)
        public void Applyfilter() throws InterruptedException{
        sleep(500);
        db.ApplyFilter();
        System.out.println("Successfully apply filter....");
        }
        
        // Occasion
        @Test(priority = 9)
        public void verifyOccasions() throws InterruptedException {
            sleep(500);
            List<String> occasions = db.Occasion();
            
            // Assertions
            Assert.assertTrue(occasions.contains("Couple"), "Couple occasion not applied.");
            Assert.assertTrue(occasions.contains("Solo"), "Solo occasion not applied.");
            Assert.assertTrue(occasions.contains("Friends"), "Friends occasion not applied."); 
        }  
        @Test(priority = 10)
        public void SearchResult() throws InterruptedException {
        	bi.SearchResult("Student");
        }
//        @Test(priority = 11)
//        public void Root() throws InterruptedException {
//        	sleep(500);
//        	bi.SearchRoot();
//        }
        @Test(priority = 12)
        public void ClickView() throws InterruptedException {
        	sleep(500);
        	bi.View();		
        }
        @Test(priority = 13)
        public void CollapseAll() throws InterruptedException {
        	sleep(2000);
        	bi.CollapseAll();
        }
        
        @Test(priority = 14)
        public void Notes() throws InterruptedException {
        	sleep(2000);
        	bi.ClickNotes();
        }
        @Test(priority = 15)
        public void Booking() throws InterruptedException {
        	sleep(2000);
        	bi.Booking();
        }
        @Test(priority = 16)
        public void policy() throws InterruptedException {
        	sleep(2000);
        	bi.Policy();
        }
        
        @Test(priority = 17)
        public void trjSelect() throws InterruptedException{
        	bi.trjSelect(); 
        	sleep(1000);
       }
        @Test(priority = 18)
        public void FareSummary() throws InterruptedException {
        	sleep(1000);
        	bi.FareSummary("1000");
        	bi.discount("5000");
        	bi.gst();
        	bi.BookItinearyClick();

        }
        @Test(priority = 19)
        public void Adult1() throws InterruptedException  {
        	sleep(2000);
        	td.selectTile();
        }
        @Test(priority = 20)
        public void Fname() throws InterruptedException {
        	sleep(1000);
        	td.FirstName("Alok");
        }
        @Test(priority = 21)
        public void lname() throws InterruptedException {
        	sleep(1000);
        	td.LastName("Mishra");	
        }
        @Test(priority = 22)
        public void age() throws InterruptedException {
        	sleep(1000);
        	td.Age("23");
        }
        @Test(priority = 23)
        public void Contact() throws InterruptedException {
        	sleep(1000);
        	td.contact();
        }
        @Test(priority = 24)
        public void email() throws InterruptedException {
        	sleep(1000);
        	td.Email();
        	td.CountrySelect();
        	td.pincode("230141");
        	td.City("noida");
        	td.State("up");
        	td.Address("XYZ");
        	
        }
        @Test(priority = 25)
        public void Adult2() throws InterruptedException {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	td.title2();
        	td.FirstName2("Alok");
        	td.lastName2("Mishra");
        	td.Age2();
        		
        }
        
        public void child() throws InterruptedException {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	td.title3();
        	td.FirstName3("Alok");
        	td.lastName3("Mishra");
        	
        }
        @Test(priority = 27)
        public void SpecialRequest() throws InterruptedException {
        	sleep(1000);
        	td.SpecialRequest();
        	td. message("The Return Journey");
        }
        
        @Test(priority = 28)
        public void QRpayment()throws InterruptedException {
        	sleep(1000);
        	td.QR_Payment("file:///C:/Users/AlokMishra/Desktop/TRJPOM/src/test/resources/Images/QR.jpg.png");
        	//td.Payment("8932945274");
        } 
       
        public void OnlinePayment() throws InterruptedException {
        	td.PaymentGateway();
        }
        
      
        public void UpiPayment() throws InterruptedException {
        	td.UPI();
        }
        
        @Test(priority = 29)
        public void ViewBooking() throws InterruptedException {
        	td.ViewBooking();
        }
        
        @Test(priority = 30)
        public void CanclledPage() throws InterruptedException {
        	td.CanclledPage();
        }
        
        public void sharedetails() throws InterruptedException {
        	td.shareBookingDetails();
        } 
        
//       @Test(priority = 30)
//       public void clickBookingIcon() throws InterruptedException {
//       	sleep(500);
//       	dbf .clickBookingIcon();
//       }
//        @Test(priority = 31)
//        public void clickProfile() throws InterruptedException {
//        	sleep(500);
//        	dbf.clickProfile();
//        }
//        @Test(priority = 32)
//        public void  scrollToBottom() throws InterruptedException {
//        	sleep(500);
//        	dbf.scrollToBottom();
//        }
//        @Test(priority = 33)
//        public void  fiveAreas() throws InterruptedException {
//        	sleep(500);
//        	dbf.fiveAreas();
//        }
//        @Test(priority = 34)
//        public void  Footer() throws InterruptedException {
//        	sleep(500);
//        	dbf.Footer();
//        }       
}

            
    



