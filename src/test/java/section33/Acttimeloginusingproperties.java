package section33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acttimeloginusingproperties {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getData("url"));
		
		long time = Long.parseLong(getData("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("username")).sendKeys(getData("user1"));
		driver.findElement(By.name("pwd")).sendKeys(getData("pwd1"));
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

	private static String getData(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
	

