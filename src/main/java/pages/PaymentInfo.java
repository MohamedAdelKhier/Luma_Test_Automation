package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaymentInfo {
	
	 private WebDriver driver;
	
    public PaymentInfo(WebDriver driver) {
        this.driver = driver;
    }
    
    public void Click_ON_PlaceOrder () {
    	
    	driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
    }

}
