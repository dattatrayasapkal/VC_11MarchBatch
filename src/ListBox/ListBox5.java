package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
/// ***Handle listbox without select class
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");
	//step
		 driver = new ChromeDriver();	
      //ChromeDriver driver1 = new ChromeDriver();
     driver.manage().window().maximize();
     
    driver.get("https://www.redbus.in/");
   // driver.findElement(By.xpath("//input[@class=\"sc-bxivhb hrsLPT\"]")).sendKeys("pune");
    driver.findElement(By.id("src")).sendKeys("pune");
    Thread.sleep(5000);

   // driver.findElement(By.id("dest")).sendKeys("mumbai");
   List<WebElement>City=driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li"));
    System.out.println("Total count--->"+City.size());
    for(int i=0;i<City.size();i++) {
    	String CityNames =City.get(i).getText();
    	System.out.println(CityNames);
    	if(City.get(i).getText().equals("Wakad")) {
    		System.out.println(City.get(i).getText());
    		City.get(i).click();  
    		}
    }
    
    driver.findElement(By.id("dest")).sendKeys("Buldhana");
    Thread.sleep(5000);

    List<WebElement> DestCity =driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
    System.out.println(DestCity.size());
    for(int i=0;i<DestCity.size();i++) {
    	String DestCityNames=DestCity.get(i).getText();
    System.out.println(DestCityNames);
    if(DestCity.get(i).getTagName().equals("Malkapur")) {
    	System.out.println(DestCity.get(i).getTagName());
   DestCity.get(i).click() ;
   
   String Day = "//select[@id=\"day\"]/option";
	String Month = "//select[@id=\"Month\"]/option";
	String Year = "//select[@id=\"year\"]/option";
	 // splite method
	String DOB = "15-Jun-2020";
	String date[]= DOB.split("-");
	
	Selectdropdown(Day, date[0]);
	Selectdropdown(Month, date[1]);
	Selectdropdown(Year, date[2]);
	
   
    }
    }
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
}}