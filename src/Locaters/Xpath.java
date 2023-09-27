package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          // xpath---> Adrress of particular web element/dom
          //type of xpath-- two type 
		//1) absolute/Full xapth(start from root nodes)--> more accurate,risky to used
		//roots nodes-->/html/body/div[2]/div/div[3]/p/a[2]
		//2)Relative/dynamic/customized xapth--->accurate,recommended to use
		
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bhavana\\\\Desktop\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//a[@class ='signin']")).click();	
		//driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("dattatrayasapkal");
	//	driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("123336556");
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		// xpath syntax-- > //htmltag[@attribut='valus']
				// attributes--> Id,Class,Name,
				//BY Attribute
				//driver.findElement(By.xpath("//a[@class=\"signin\"]")).click();
					//by another one xpath from parent xml.
				//driver.findElement(By.xpath("//p[@id=\"signin_info\"]/child::a[1]")).click();
				// xpath by using following to parent xml
				
				//driver.findElement(By.xpath("//span[@id=\"username\"]/following::p[1]/child::a[1]")).click();
				// by using precending-sibling::tagname
				
				//driver.findElement(By.xpath("//a[text()='Create Account']/preceding-sibling::a[1]")).click();
				// xapth by using descendant to parent
				//driver.findElement(By.xpath("//div[@class=\"logobar\"]/descendant::p[1]/child::a[1]")).click();
		Thread.sleep(5000);
		driver.close();
		}

}
