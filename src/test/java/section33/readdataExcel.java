package section33;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdataExcel {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\selenium\\Seleniumpractise\\src\\test\\resources\\harish.xlsx");
		
     FileInputStream fis=new FileInputStream(file);
		
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sh=wb.getSheetAt(0);
     
//    String s= sh.getRow(0).getCell(0).getStringCellValue();
//	System.out.println(s);	
     
     
     int rowcount=sh.getPhysicalNumberOfRows();
     
     for (int i = 0; i < rowcount; i++) {
    	 XSSFRow row=sh.getRow(i);
    	 
    	 int cellcount=row.getPhysicalNumberOfCells();
    	 for (int j = 0; j <cellcount; j++) {
    		 XSSFCell cell=row.getCell(j);
//   		 String cellvalue=(getCellValue(cell));
//   		 System.out.print("||"+cellvalue);
		
    	 System.out.println("||"+cell);
    	 }
		
	}
	
	wb.close();
	fis.close();
	}
}
	/*public static String getCellValue( XSSFCell cell) {
		
		switch (cell.getCellType()) {
		case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		default:
		return cell.getStringCellValue();
		
	}
	}
}*/
	 

