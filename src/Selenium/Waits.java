package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    WebDriverWait wt = new WebDriverWait(driver, 30);
	    wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).sendKeys("MANGESH");
		
		
		
		
		
	}
	
}
