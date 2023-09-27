package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// step1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
//step 2
		WebDriver driver = new ChromeDriver();
		// step 3
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// Take screensho and copy object
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File Destination = new File("C:\\Users\\bhavana\\Desktop\\11 March\\sample.jpg");
		FileHandler.copy(source, Destination);
	}

}
