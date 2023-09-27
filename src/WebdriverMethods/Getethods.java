package WebdriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getethods {

	public static void main(String[] args) {
// 1.Get Method
		//This Methods is used to open application or to enter the Url on webdriver.
		// 1.step 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver/chromedriver.exe");
		// 2.Step 2
		WebDriver driver = new ChromeDriver();
		// Step 
		driver.get("https:www.facebook.com");
	}

}
