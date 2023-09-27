package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		 driver.get("https://facebook.com/");
			driver.manage().window().maximize();
driver.findElement(By.linkText("Forgotten password?")).click();


//driver.findElement(By.linkText("Create a Page")).click();
Thread.sleep(5000);
driver.quit();
	}
	}


