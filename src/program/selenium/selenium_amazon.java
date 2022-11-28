package program.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_amazon {
public static void main(String args[]) throws InterruptedException {
	
	    System.setProperty("webdriver.chrome.driver", "F:\\LocalDisk F\\mp\\phase 5\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); // this intializes the chrome web browser
	    
	    // Step 2: open the url/website
	    driver.get("https://www.amazon.in/");
	    
	    // Step 3: make full screen of window
	    driver.manage().window().maximize(); // this enables the browser to maximize its width and height
	    Thread.sleep(2000); 
	
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
    Thread.sleep(4000);
    driver.findElement(By.id("nav-search-submit-button")).click();
    Thread.sleep(6000);
    driver.findElement(By.linkText("GPS")).click();
    Thread.sleep(6000);
    
    driver.findElement(By.partialLinkText("OPPO A31 (Mystery Black, 6GB RAM, 128GB Storage) with No Cost EMI")).click();
    Thread.sleep(6000);
    driver.navigate().back();  // it will move back to the immedaite parent window
    
    Thread.sleep(6000);
    driver.navigate().to("https://login.yahoo.com");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#login-username")).sendKeys("abc@yahoo.com");    
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#login-signin")).click();
    
    Thread.sleep(2000);
    driver.quit();
}
}
