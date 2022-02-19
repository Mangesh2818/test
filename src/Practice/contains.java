package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class contains 
{
	 public static void main(String[] args) throws Exception 
     {
    	 System.setProperty("webdriver.chrome.driver", "F:\\aaa\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		driver.manage().window().maximize();
   		
   		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   		
   		driver.get("https://worldatwork.org/");
   		Thread.sleep(2000);
   		
   		WebElement a = driver.findElement(By.xpath("//span[@class='icon-community-message']"));
   		
   		a.click();
   		
     }
	 
}
