package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Close {

	public static void main(String[] args)throws InterruptedException {
		// Close - to close the current driveropen driver
		//1.GetMethod
		// This meyhod is used to open aplication or to enter the URl on webdriver
		//1.Step
		System.setProperty("webdriver.chrome.driver", "C:\\Users\bhavana\\Desktop\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//3.Step 
driver.get("https://www.facebook.com");
Thread.sleep(5000);
driver.close();
	}


}
