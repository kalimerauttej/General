package section33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadfromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/harish.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet("Sheet1");
		
		Row r1=sh.getRow(2);
		Row r2=sh.getRow(3);
		
		Cell c1=r1.getCell(1);
		Cell c2=r2.getCell(1);
		
		System.out.println(c1.getStringCellValue());
		System.out.println(c2.getNumericCellValue());

	}

}
