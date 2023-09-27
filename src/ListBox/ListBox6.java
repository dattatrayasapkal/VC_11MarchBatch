package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class ListBox6 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		// step 2
		
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();;
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();

		 driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		 Thread.sleep(7000);

	        driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("dattatraya");
		 driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sapkal");
		 driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("dattatrayasapkal299@gmail.com");
		 driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Dgrs@3477");
		String Day = "//select[@id=\"day\"]/option";
		String Month = "//select[@id=\"Month\"]/option";
		String Year = "//select[@id=\"year\"]/option";
		 // splite method
		String DOB = "15-Jun-2020";
		String date[]= DOB.split("-");
		//date[0]=15
		//date[1]=Jun
		//date[2]=2020
		Selectdropdown(Day, date[0]);
		Selectdropdown(Month, date[1]);
		Selectdropdown(Year, date[2]);

	}
public static void Selectdropdown(String element,String values) {
	List<WebElement> V1=  driver.findElements(By.xpath(element));
	System.out.println(V1);
	System.out.println(V1.size());
	for(int i=0;i<V1.size();i++) {
		System.out.println(V1.get(i).getText());
		if(V1.get(i).getText().equals(values)) {
			V1.get(i).click();
			
		}
	}
}
}
	
	

		
	


