package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();

		 driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		 Thread.sleep(7000);

		 driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("datta");
		 driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sapkal");
		 driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("dattatrayasapkal299@gmail.com");
         driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Dgrs@3477");
        // driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Dgrs@3477");
         WebElement Day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		 WebElement Month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
WebElement Year =driver.findElement(By.xpath("//select[@id=\"year\"]"));

		 // Questions1
// How will u get the total no list of list

		 Select S1 = new Select(Day); 
	List<WebElement> ListDay= S1.getOptions();
	System.out.println("Total day"+ListDay.size());
	//Question2
	//how will u print all the values
	//0;0<31
	//1<31
	for(int i=0;i<ListDay.size();i++) {
		String DayValues=ListDay.get(i).getText();
		System.err.println(DayValues);
		
		//Question 3
		//how will u select specifix values from dropdown
		if(DayValues.equals("14")) {//14 is equal to 14
			ListDay.get(i).click();	
			
		}
	}
	//select month
	Select S2 = new Select(Month);
	List<WebElement> MonthValues= S2.getOptions();
	System.out.println("Total month-->"+MonthValues.size());
	System.out.println();
	for(int j=0;j<MonthValues.size();j++) {
	String Months= MonthValues.get(j).getText();
	System.out.println(Months);
	
	if(Months.equals("May")){
		MonthValues.get(j).click();
	
	}
	}
	 Select S3 = new Select(Year);
	 List<WebElement> YearValues = S3.getOptions();
	 System.out.println("total year-->"+YearValues.size());
	 System.out.println();
	 for(int k=0;k<YearValues.size();k++) {
		 String Years = YearValues.get(k).getText();
		 System.out.println(k);
		 
if(Years.equals("2022")) {
	YearValues.get(k).click();
	}
	 }
	driver.close();
		 
	}}	
			 
		 	
		 


