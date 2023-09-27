package MultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		 driver.get("https://facebook.com/");
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
		List<WebElement> Links	=driver.findElements(By.tagName("a"));
		System.out.println("Numberof link-->"+Links.size());	
			
		for(WebElement link:Links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
				}
		driver.quit();	}
	

}
