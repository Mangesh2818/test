package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
  
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    driver.get("https://demoqa.com/links");
	    
	    driver.findElement(By.xpath("//a[text()='Created'][1]")).click();
	}
	
	
}
