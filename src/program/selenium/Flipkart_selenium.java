package program.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart_selenium {
   
	WebDriver driver;

	@Test
public void  flipkart() throws InterruptedException{
	   driver.get("https://www.flipkart.com/");
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// this enables the browser to maximize its width and height
	    
	  
	   driver.findElement(By.className("_2doB4z")).click();
	   Thread.sleep(4000); 
	   
	   driver.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
	   Thread.sleep(4000);
	   driver.findElement(By.className("L0Z3Pu")).click();
	   Thread.sleep(6000); 

	   
	   //The images are loaded and visible till the screen height only
	   WebElement imageWebElement=driver.findElement(By.cssSelector("[alt='APPLE iPhone 13 ((PRODUCT)RED, 256 GB)']"));
	   Thread.sleep(4000);
	   
	   Boolean isImageLoaded = (Boolean) ((JavascriptExecutor)driver)
			   .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageWebElement);
	   Thread.sleep(4000);
	   
	   if (isImageLoaded) {
			System.out.println("Image is loaded");
		} else {
			System.out.println("Image not loaded");
		}

	   Thread.sleep(4000); 
	   
	   //check features of scroll the page 
	   String script = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
	    JavascriptExecutor scrollBar = (JavascriptExecutor) driver;
	    Boolean test = (Boolean) (scrollBar.executeScript(script));
	    
	     if(test) {
	    	 System.out.println("Yeah,this screen is scrollable");
	     }else {
	    	 System.out.println("Not scrollable");
	     }
	     
	     if(imageWebElement.isDisplayed()) {
	    	 scrollBar.executeScript("arguments[0].scrollIntoView();",imageWebElement);
	    	 System.out.println("Yeah,the image is loaded");
	     }else {
	    	 System.out.println("Image,Not loaded yet");
	     }
		
		Thread.sleep(5000);
		 scrollBar.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(5000);
   }
	@BeforeMethod
	  public void Beforemethod() {
	    System.setProperty("webdriver.chrome.driver", "F:\\LocalDisk F\\mp\\phase 5\\chromedriver.exe");
	    driver = new ChromeDriver(); // this intializes the chrome web browser
	  }
	  
	  @AfterMethod
	    public void afterMethod() {
	    driver.close();
	    }

   
}
