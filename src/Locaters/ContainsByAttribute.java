package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsByAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();;
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 //contains by attribute
	 //syntax
	 //tagname[contains(@attributename,'attributevalue')]
	 //driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("dattatrayasapkal299@gamil.com");
	driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy')]")).sendKeys("dattatrayasapkal299@gmail.com");
	 driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("Datta@123");
	driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy')]")).click();
	Thread.sleep(5000);
	// driver.close();
	 
	}

}
