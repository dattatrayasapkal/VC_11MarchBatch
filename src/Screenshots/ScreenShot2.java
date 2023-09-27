package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.redbus.in/");
Thread.sleep(3000);

	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Dest= new File("C:\\Users\\bhavana\\Desktop\\11 March\\Redbus1.jpg");
	FileHandler.copy(source, Dest);
	driver.close();	
	}

}
