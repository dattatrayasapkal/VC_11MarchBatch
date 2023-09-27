package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_Without_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//Step1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavana\\Desktop\\driver\\chromedriver.exe");  
WebDriver driver = new ChromeDriver();	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//enter username
String Path="C:\\Users\\bhavana\\Desktop\\Orange_exel1.xlsx";
FileInputStream File = new FileInputStream(Path);
String Username= WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);

//Enter Password
FileInputStream File1 = new FileInputStream(Path);
String PassWord= WorkbookFactory.create(File1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(PassWord);
driver.findElement(By.xpath("//Button[@type=\"submit\"]")).click();

FileInputStream File2 = new FileInputStream(Path);
String Name= WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
String UName=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
System.out.println(Name);
if(UName.equals(Name)) {
	System.out.println("Correct username or Login Successfully");
}else {
	System.out.println("Incorrect Username or PassWord");
}

	}

}
