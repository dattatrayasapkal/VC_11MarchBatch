package Seleniumdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com/"); 
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rahul@gamil.com");
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]")).sendKeys("9789568975");
driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("123456789");
//driver.findElement(By.xpath("//a[text()=\"Forgotten account?\"]").click();

driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
Thread.sleep(5000);

driver.close();
	}

}

      


  