package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocaters {

	public static void main(String[] args) throws InterruptedException {
		AllLocaters.xapth();
	}
static void xapth() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		

		Thread.sleep(5000);
		driver.close();		
	
}
}
