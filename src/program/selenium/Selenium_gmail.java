package program.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Selenium_gmail {
	
	public static void main(String[] args) throws InterruptedException{
		
	// Step 1: load the chrome driver
	System.setProperty("webdriver.chrome.driver", "F:\\LocalDisk F\\Mphasis\\phase 5\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); // this intializes the chrome web browser
	
	// Step 2: open the url/website
	driver.get("https://www.gmail.com/");
	
	// Step 3: make full screen of window
	driver.manage().window().maximize(); // this enables the browser to maximize its width and height
	Thread.sleep(6000); 
	
	// Step 4: use the ID web locator
	//findElement: finds a single WebElement and returns it as a WebElement object.
	driver.findElement(By.id("identifierId")).sendKeys("virendra@gmail.com"); 
	// this finds the web element of textfield-email and sendKeys is used to send the value to the textfield
	// which we are passing here in sendKeys(" "). This will auto-populate the value into the gmail field.
	
	Thread.sleep(4000); 
	driver.findElement(By.className("VfPpkd-vQzf8d")).click(); // this finds ths web element of the submit button	
	Thread.sleep(3000); // pause of 3 sec
	
	String at= driver.getTitle();
	System.out.println("driver title:"+ at);
	String st= "gmail";
	driver.close(); 
	
	if(at.equalsIgnoreCase(st))
	{
		System.out.println("Test successfull");
	}
	else
	{
		System.out.println("Not successfull");
	}
	} 
}