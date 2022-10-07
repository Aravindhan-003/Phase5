package program.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_lamda {
	public static void main(String args[]) throws InterruptedException {
		// Step 1: load the chrome driver
	   //"C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe"
	    System.setProperty("webdriver.chrome.driver", "F:\\LocalDisk F\\Mphasis\\phase 5\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); // this intializes the chrome web browser
	    
	    // Step 2: open the url/website
	    driver.get("https://accounts.lambdatest.com/register");
	    
	    // Step 3: make full screen of window
	    driver.manage().window().maximize(); // this enables the browser to maximize its width and height
	    driver.manage().deleteAllCookies();
	    
	    
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Arav");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arav@123gmil.com");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("arav@123");
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
	    driver.findElement(By.xpath("//samp[@class='customcheckbox w-20 h-20 inline-block bg-white border border-gray-20 relative cursor-pointer mr-10']")).click();
        driver.findElement(By.xpath("//button[@class='rounded border border-black block w-full xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 lg:h-35 xls:h-40 xlx:h-47 xxxl:h-54 xxld:h-60 h-40 tracking-widest font-bold uppercase g-recaptcha bg-black text-white  hover:bg-transparent hover:text-black']")).click();
        driver.findElement(By.xpath("//button[@class='rounded border border-black block w-full xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 lg:h-35 xls:h-40 xlx:h-47 xxxl:h-54 xxld:h-60 h-40 tracking-widest font-bold uppercase g-recaptcha bg-black text-white  hover:bg-transparent hover:text-black']")).clear();

	}
}
