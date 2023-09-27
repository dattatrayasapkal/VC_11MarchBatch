package Synchronization;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imlicitwait1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  

		// step-1
		// step1//20
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       //Step3
       driver.manage().window().maximize();
       String URL= "https://www.facebook.com/";
       driver.get(URL);
       driver.findElement(By.id("email")).sendKeys("1234545");// 2 visible-ignor 18 second
       driver.findElement(By.id("pass")).sendKeys("wertyui");// 5 -Ignore-15 second
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
