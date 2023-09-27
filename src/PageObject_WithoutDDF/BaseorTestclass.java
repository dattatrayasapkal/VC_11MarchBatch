package PageObject_WithoutDDF;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseorTestclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage LP= new LoginPage();
		LP.GoTo();
		LP.Usermail("Admin");
		LP.Password("admin123");
		LP.Login();
		DasboardPage DP = new DasboardPage(Driver);
		DP.NameValidation();
		driver.quit();
	}

}
