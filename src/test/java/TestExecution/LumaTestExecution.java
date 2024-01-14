package TestExecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.homePage;
import pages.SignUp;
import pages.ProductDetails;
import pages.ShippingAddress;
import pages.PaymentInfo;

public class LumaTestExecution {
	private WebDriver driver;
	private homePage Homescreen;
	private SignUp Register; 
	private ProductDetails ProductScreen;
	private ShippingAddress shippingInfo;
	private PaymentInfo Payment;

	
	 @BeforeClass
	    public void setUp() {
	        
		 System.setProperty("webdriver.gecko.driver", "C:/Users/moham/eclipse-workspace/LumaProject/Drivers/geckodriver2.exe");
		  driver = new FirefoxDriver();

	        driver.get("https://magento.softwaretestingboard.com/");
	        
	    	homePage Homescreen = new homePage(driver);
	        SignUp   Register 	= new SignUp(driver);
	        ProductDetails ProductScreen = new ProductDetails(driver);
	        ShippingAddress shippingInfo = new ShippingAddress(driver);
	        PaymentInfo Payment = new PaymentInfo(driver);
	 }
	 
	 @Test
	    public void CreateAccount() {
		 
		 Homescreen.clickOnSignUp();
		 Register.FillRequiredData();
		 Register.ClickOnSubmit();
		 Register.BackToHome();
		 
		 
	 }
	 @Test
	 public void VerifyHotSeller_section () {
		 
		 Homescreen.ScrollToSection();
		 Homescreen.AddProductToCompare();
	 }
	 
	 @Test
	 public void AddProductToCart () {
		 
		 Homescreen.AddToCart();
	 }
	 @Test
	 public void ProceedToCheckout() {
		 
		 ProductScreen.AddToCart();
		 ProductScreen.ClickOncheckout();
	 }
	 @Test
	 public void fill_shippingInfo () {
		 shippingInfo.Fill_Shipping_Fields();
		 shippingInfo.ClickNextBtnn();
	 }
	 
	 @Test
	 public void fill_PaymentInfo () {
		 
		 Payment.Click_ON_PlaceOrder();
	 }
	 
	 

	 
	 
	 

}
