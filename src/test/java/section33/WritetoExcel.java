package section33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritetoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream("./src/test/resources/harish.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("Sheet1");
		 Row r=sh.createRow(4);
		 
		 Cell c=r.createCell(0);
		 c.setCellValue("user2");
		 
		 FileOutputStream fos=new FileOutputStream("./src/test/resources/harish.xlsx");
		 wb.write(fos);
		 
		 wb.close();		 

	}

}
