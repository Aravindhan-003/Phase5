package program.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_aler {
 public static void main(String args[]) throws InterruptedException {
	// Step 1: load the chrome driver
	   //"C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe"
	    System.setProperty("webdriver.chrome.driver", "F:\\LocalDisk F\\Mphasis\\phase 5\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); // this intializes the chrome web browser
	    
	    // Step 2: open the url/website
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    
	    // Step 3: make full screen of window
	    driver.manage().window().maximize(); // this enables the browser to maximize its width and height
	    Thread.sleep(2000); 
	    
//	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//	    Alert alert=driver.switchTo().alert();
//	    System.out.println(alert.getText());
//	    Thread.sleep(2000); 
//	    alert.accept();
	    //a[contains(text(),'Alert with OK & Cancel')]
	    driver.findElement(By.xpath("//*[contains(@href,'CancelTab')]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Alert alert=driver.switchTo().alert();
	    System.out.println(alert.getText());
	    Thread.sleep(2000); 
	    alert.dismiss();
	    
	    driver.close();
 }
 
}
