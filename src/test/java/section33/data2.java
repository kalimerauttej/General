package section33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data2 {

	public static void main(String[] args) throws IOException {
		 FileInputStream fis=new FileInputStream("./src/test/resources/harish.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 
		 DataFormatter df = new DataFormatter();
		 
		 String data=df.formatCellValue(wb.getSheet("Sheet1").getRow(3).getCell(1));
		 System.out.println(data);
		 
		 wb.close();
		 
		 

	}

}

