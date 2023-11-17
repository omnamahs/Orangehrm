package Testng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreder {
public static void main(String[] args) throws IOException {
	String filepath = "./seleniumpractice/src/test/java/Testng/dataa1.xlsx";
	XSSFWorkbook wb = new XSSFWorkbook("sheet");
	XSSFSheet sheet = wb.getSheet("sheet1");
	//System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	int rowcount = sheet.getPhysicalNumberOfRows();
	int colcount = sheet.getRow(0).getLastCellNum();
	Object[][] data = new Object[rowcount][colcount];
	for (int row = 0; row < rowcount; row++) {
		for (int col = 0; col< colcount; col++) {
			//System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
			data[row][col]=sheet.getRow(row).getCell(col).getStringCellValue();
	}
		}
	
	//return data;
}

public Object[][] getdata() {
	// TODO Auto-generated method stub
	return null;
}


}
