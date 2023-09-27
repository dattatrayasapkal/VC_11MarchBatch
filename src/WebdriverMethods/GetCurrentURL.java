package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException  {
		GetCurrentURL.M1();
		GetCurrentURL.M2();

	}

 public static void M1(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavana\\Desktop\\driver\\Chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.amazon.in");
String URL = driver.getCurrentUrl();
System.out.println(URL);
if(URL.equals("http://www.amazon.i/"))
	System.out.println("Correct URL");
else {
	System.out.println("Incorrect URL");
}
System.out.println("**************************************");

	driver.close();
	}
 
 // Get position---->>
 public static void M2()throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavana\\Desktop\\driver\\Chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 Thread.sleep(4000);
	 driver.manage().window().maximize();
	 driver.get("http://www.amazon.in/");
	 Thread.sleep(10000);
	 System.out.println(driver.manage().window().getPosition());
	 driver.close();


 }
}
