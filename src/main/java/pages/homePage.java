package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;


public class homePage {

	
	 private WebDriver driver;

	    public homePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickOnSignUp() {
	    	
	    	driver.findElement(By.linkText("Create an Account")).click();
	    	
	    }
	    
	    public void ScrollToSection () {
	    WebElement elementToScroll = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[2]/h2"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScroll);

	    }
	    
	    public void AddProductToCompare () {
	    	
	    	 WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[2]/div"));

	         Actions actions = new Actions(driver);

	        
	         actions.moveToElement(elementToHover).perform();
	         
	         driver.findElement(By.linkText("Add to Compare")).click();

	    }
	    
	    public void AddToCart () {

	    	 WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[2]/div"));

	         Actions actions = new Actions(driver);

	         actions.moveToElement(elementToHover).perform();
	         
	         driver.findElement(By.linkText("Add to Cart")).click();
	         
	    }
	    

}
