package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		 driver.get("https://facebook.com/");
			driver.manage().window().maximize();
	driver.findElement(By.tagName("input")).sendKeys("dattatrayasapkal299@gmail.com");
	//driver.findElement(By.tagName("input")).sendKeys("Dgrs@3477");
Thread.sleep(5000);
	driver.close();
	}

}
