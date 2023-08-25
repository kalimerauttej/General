package section33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class shortcutreadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/harish.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue());
		wb.close();
		
	}

}
