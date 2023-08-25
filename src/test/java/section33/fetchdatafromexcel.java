package section33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fetchdatafromexcel {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(("url"));
		
		long time=Long.parseLong(("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("username")).sendKeys(("user1"));
		driver.findElement(By.name("pwd")).sendKeys(("pwd1"));
		driver.findElement(By.id("loginbutton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		try {
			wait.until(ExpectedConditions.titleContains("Enter Time-track"));
			System.out.println("Test passed");
		}
		catch(Exception e) {
			System.out.println("Test failed");
			
		}
			driver.quit();
	}
	public static Map<String,String> getdata() {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("./src/test/resources/harish.xlsx");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook wb=null;
		try {
			wb=WorkbookFactory.create(fis);
		}catch(Exception e) {
		e.printStackTrace();
	}
		Sheet sh=wb.getSheet("Sheet1");
		
		Map<String,String>map=new HashMap<String,String>();
		DataFormatter df=new DataFormatter();
		
		for (int i = 0; i <=sh.getLastRowNum(); i++) {
			String key=df.formatCellValue(sh.getRow(i).getCell(0));
			String value=df.formatCellValue(sh.getRow(i).getCell(1));
			map.put(key, value);
		}
		System.out.println(map);
		try {
			wb.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return map;
			
		}
		
		
		

}
