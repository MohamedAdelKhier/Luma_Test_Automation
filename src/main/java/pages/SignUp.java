package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {

	 private WebDriver driver;

	    public SignUp(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public void FillRequiredData() {
	    	WebElement FirstName = driver.findElement(By.id("firstname"));
	    	FirstName.sendKeys("Mohamed");
	    	
	    	WebElement LastName = driver.findElement(By.id("lastname"));
	    	LastName.sendKeys("Adel");
	    	
	    	
	    	WebElement Email = driver.findElement(By.id("email_address"));
	    	Email.sendKeys("Mohamed.Adel@gmail.com");
	    	
	    	WebElement password = driver.findElement(By.id("password"));
	    	password.sendKeys("Test@123");
	    	
	    	
	    	WebElement passwordconfirmation = driver.findElement(By.id("password-confirmation"));
	    	passwordconfirmation.sendKeys("Test@123");
	    	
	    }
	    
	    public void ClickOnSubmit () {
	    	
	    	WebElement SubmitBttn = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
	    	SubmitBttn.click();
	    }
	    
	    public void BackToHome() {
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/a")).click();
	    }
}
