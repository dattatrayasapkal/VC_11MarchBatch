package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();;
    driver.get("https://www.redbus.in/");
	 driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();
	Thread.sleep(2000);
	String month="June 2023";
	String day= "13";
	
while(true) {
	String text= driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[4]/div/div/text")).getText();

if(text.equals(month))
{
	break;
	}
else {driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[4]/div")).click();	
}
}
	
	}}

