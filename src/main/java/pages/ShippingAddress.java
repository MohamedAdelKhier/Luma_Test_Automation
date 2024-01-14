package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ShippingAddress {

	

	 private WebDriver driver;

	    public ShippingAddress(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public void Fill_Shipping_Fields () {
	    	
	    	WebElement Company = driver.findElement(By.id("MVBTJ0Q"));
	    	Company.sendKeys("PayMob");
	    	
	    	WebElement Address = driver.findElement(By.id("E0XA24S"));
	    	Address.sendKeys("Haram ST");
	    	
	    	WebElement City = driver.findElement(By.id("V47W8CE"));
	    	City.sendKeys("Giza");
	    	
	    	WebElement State = driver.findElement(By.id("QR4S8U4"));
	    	 Select dropdown = new Select(State);
	    	 dropdown.selectByVisibleText("California");
	    	 
	    	 
	    	 WebElement Postal_Code = driver.findElement(By.id("UH331M7"));
	    	 Postal_Code.sendKeys("12345");
	    	 
	    	 WebElement Country = driver.findElement(By.id("R7RIP56"));
	    	 Select Country_dropdown = new Select(Country);
	    	 Country_dropdown.selectByVisibleText("Egypt");
	    	 
	    	 
	    	 WebElement PhoneNo = driver.findElement(By.id("BWC41DN"));
	    	 PhoneNo.sendKeys("01142520266");
	    	 
	    	 WebElement ShippingMethod = driver.findElement(By.cssSelector(".radio"));
	    	 ShippingMethod.click();
	    	 
	    	
	    }
	    
	    public void ClickNextBtnn () {
	    	driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
	    	
	    }
}
