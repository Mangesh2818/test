package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radiobutton {
   
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    Thread.sleep(2000);
	    
		List<WebElement> aa = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println(aa.size());
		
		String a = "Female";
		
		for(int i=0;i<aa.size();i++)
		{
			if(aa.get(i).getText().equalsIgnoreCase(a))
			{
				aa.get(i).click();
				System.out.println(a);
				break;
			}
		}
		
		WebElement bb = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select s = new Select(bb);
		
		s.selectByVisibleText("1996");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
}
}
