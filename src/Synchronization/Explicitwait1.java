package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait1 {

	public static void main(String[] args) {

		//Step1//20
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
         WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		 @SuppressWarnings("unused")
		WebDriverWait MyWait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 
	}

}
