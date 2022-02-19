package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class avc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		 driver.get("https://www.amazon.in/b/?node=1375424031&ref_=Oct_d_odnav_d_976392031_0&pd_rd_w=Ojvfb&pf_rd_p=b185fab4-9bf9-4026-9df2-0aa0533ca508&pf_rd_r=CMMKWQ5QVS5PR48BYD52&pd_rd_r=dcc39e97-382f-49e9-9a99-45d464b619ab&pd_rd_wg=eGkkG");
		 
		 driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		 
		 WebElement a = driver.findElement(By.xpath("//span[text()='HP Chromebook MT8183 Mediatek 11.…']"));
		 String aa = a.getText();
		 
		 WebElement b = driver.findElement(By.xpath("//span[text()='20,990']"));
		 String bb = b.getText();
		 
		 
		 
		 
		
	}
	
}
