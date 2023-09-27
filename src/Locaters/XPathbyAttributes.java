package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathbyAttributes {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
WebDriver driver  = new ChromeDriver();
driver.manage();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("dattatrayasapkal@gmail.com");
//driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Dattatrayasapkal");
driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Dgrs@3477");
driver.findElement(By.xpath("//button[@id=\"u_0_5_Ck\"]")).click();
}

}
