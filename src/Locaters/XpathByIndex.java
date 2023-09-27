package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"nav-a  \"][3]")).click();
		Thread.sleep(5000);
		 driver.quit();		 
	}

}
