package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		 driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("student");
driver.findElement(By.id("password")).sendKeys("Password123");
driver.findElement(By.id("submit")).click();
Thread.sleep(5000);
driver.quit();
	}

}
