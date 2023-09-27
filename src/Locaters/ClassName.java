package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		 driver.get("https://login.yahoo.com/");
			driver.manage().window().maximize();
	driver.findElement(By.className("phone-no")).sendKeys("9975161441");
	driver.findElement(By.className("pure-button")).click();
	Thread.sleep(5000);
	driver.close();	}

}
