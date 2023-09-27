package Parameterizaton;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
// to Fetch Data from excel Sheet
		FileInputStream file = new FileInputStream("\"C:\\Users\\bhavana\\Desktop\\Login_Id.xlsx\"");
		String data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		FileInputStream file1 = new FileInputStream("");
		XSSFWorkbook workbook = new XSSFWorkbook(file1);
		String Data1=workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data1);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavana\\Desktop\\driver");
		 ChromeDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys(data);
		 driver.findElement(By.id("pass")).sendKeys("Data1");
		 driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		 Thread.sleep(5000);
		 driver.close();
	}

}
