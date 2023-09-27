package MainMethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static void main(String[] args) throws IOException {
 String path= "C:\\Users\\bhavana\\Desktop\\Test cases.xlsx";
		FileInputStream file= new FileInputStream(path);	// to open file
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		String Data =workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(Data);// firstname
		//System.out.println(Data);// last name
	}

}
