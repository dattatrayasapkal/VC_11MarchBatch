package Parameterizaton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData3 {

	public static void main(String[] args) throws IOException {
		String file = "";
FileInputStream file1= new FileInputStream(file);		
		XSSFWorkbook work = new XSSFWorkbook(file1);
		XSSFSheet sheet = work.getSheetAt(3);
		
		
		
		
		
	}

}
