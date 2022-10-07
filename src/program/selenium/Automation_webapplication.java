package program.selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test
public class Automation_webapplication {
		    
	        WebDriver driver;
			// Step 1: load the chrome driver
		 
			  @Test
			  public void erform() throws InterruptedException{
				// Step 2: open the url/website
				    driver.get("C:/Users/USER/Myprgm%20VS/phase4-prgm/phase4-2prgm/index.html");
				    
				    
				    // Step 3: make full screen of window
				    driver.manage().window().maximize(); 
				    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// this enables the browser to maximize its width and height
				    Thread.sleep(4000); 
				    
				    WebDriverWait wait = new WebDriverWait(driver, 20);

				    driver.findElement(By.id("ans")).sendKeys("5000");
				    Thread.sleep(4000); 
				    driver.findElement(By.xpath("//option[@value='$']"));
				    Thread.sleep(4000); 
				    
				    driver.findElement(By.id("crtdiv")).click();
				    Thread.sleep(4000); 
				    driver.findElement(By.name("exp-tlt")).sendKeys("AWS cloud");
				    Thread.sleep(4000); 
				    driver.findElement(By.name("exp-amt")).sendKeys("2000");
				    Thread.sleep(4000); 

				    driver.findElement(By.id("expenses")).click();
				    Thread.sleep(2000); 
				    
				    
				    
					// Here we will wait until element is not visible, if element is visible then it will return web element
					// or else it will throw exception
					WebElement element = wait
							.until(ExpectedConditions.visibilityOfElementLocated(By.id("final")));
			 
					// if element found then we will use- In this example I just called isDisplayed method
					boolean status = element.isDisplayed();
			 
					// if else condition
					if (status) {
						System.out.println("===== Element is visible======");
					} else {
						System.out.println("===== Element is not visible======");
					}
			  }
			  
			  @BeforeMethod
			  public void Beforemethod() {
			    System.setProperty("webdriver.chrome.driver", "F:\\LocalDisk F\\Mphasis\\phase 5\\chromedriver.exe");
			    driver = new ChromeDriver(); // this intializes the chrome web browser
			  }
			  
			  @AfterMethod
			    public void afterMethod() {
			    driver.close();
			    }
		 
		 
}
