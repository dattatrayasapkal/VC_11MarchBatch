package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyAndClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		 driver.get("https://mail.google.com/mail/u/0/#inbox");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("dattatrayasapkal299@gmail.com");
driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
}
	}


