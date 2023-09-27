package ListBox;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;  
  
public class ListBox1{  
  
    public static void main(String[] args) {  
          
          // System Property for Gecko Driver   
System.setProperty("webdriver.gecko.driver","\"C:\\Users\\bhavana\\Desktop\\Tools\"geckodriver.exe" );  
          
          // Initialize Gecko Driver using Desired Capabilities Class  
   // FirefoxOptions capabilities = DesiredCapabilities.firefox();  
  //  capabilities.setCapability("marionette",true);  
    WebDriver driver= new FirefoxDriver();  
          
         // Launch Website  
    driver.navigate().to("http://www.javatpoint.com/");  
          
        // Click on the Custom Search text box and send value  
    driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
          
        // Click on the Search button  
driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();    
        }  
  
}  