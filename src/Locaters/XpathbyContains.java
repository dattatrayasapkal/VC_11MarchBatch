package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyContains {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		 WebDriver driver  = new ChromeDriver();
		 
		 driver.manage().window().maximize();;
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("ketan");
		 driver.findElement(By.xpath("//input[(@type=\"password\")]")).sendKeys("12345");
		 driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy')]")).click();

		 Thread.sleep(5000);
	driver.close();
	}

}
