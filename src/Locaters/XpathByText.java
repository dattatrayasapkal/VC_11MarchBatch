package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		 WebDriver driver  = new ChromeDriver();
		 
		 driver.manage().window().maximize();;
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("dattatrayasapkal299@gamil.com");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Dgrs@3477");
		// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//	driver.findElement(By.xpath("//button[@name=\"login\"]")).click() ;
	driver.findElement(By.xpath("//a[text()=\"Create a Page\"]")).click();
	
	Thread.sleep(5000);
	driver.close();
}

}
