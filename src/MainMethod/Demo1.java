package MainMethod;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class Demo1 {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.get("http://www.google.com/");  
          
    
      
    }  
  
}  