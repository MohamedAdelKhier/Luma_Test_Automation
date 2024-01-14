package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ProductDetails {
	

	
	 private WebDriver driver;

	    public ProductDetails(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public void AddToCart() {
	    	WebElement Size = driver.findElement(By.id("option-label-size-143-item-167"));
	    	Size.click();
	    	
	    	WebElement Collor = driver.findElement(By.id("option-label-color-93-item-59"));
	    	Collor.click();
	    	
	    	WebElement AddBttn = driver.findElement(By.id("product-addtocart-button"));
	    	AddBttn.click();
	    	
	    	WebElement SuccessMsg = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[2]/div/div"));
	    	SuccessMsg.getText();
	    	
	    	Assert.assertEquals(SuccessMsg, "You added Breathe-Easy Tank to your", "Text does not match.");
	    }
	    
	    public void NavigateToCart() {
	    	driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
	    }
	    
	    public void ClickOncheckout() {
	    	driver.findElement(By.id("top-cart-btn-checkout")).click();
	    }
	    
	    

	

}
