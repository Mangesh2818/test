package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
     
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    driver.get("https://skpatro.github.io/demo/iframes/");
	    
	    List<WebElement> aa = driver.findElements(By.tagName("iframe"));
	    
	    driver.switchTo().frame(1);
	    
	    driver.findElement(By.xpath("//a[text() = 'Category3']")).click();
	    
	    
	    
	    
	    
	    
	    
	}
	
}
