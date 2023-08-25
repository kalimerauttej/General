package section33;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mobilecount {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\OneDrive\\Desktop\\selenium folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		   driver.findElement(By.className("_3704LK")).sendKeys("mobiles");
	        driver.findElement(By.className("L0Z3Pu")).click();
	        
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("linkcounts"+linkscount);
		for (int i = 0; i <=linkscount; i++) {
//			System.out.println(driver.findElements(By.tagName("div")).get(i).getText());
		linkscount=links.size()+i;
		System.out.println(linkscount);
		linkscount++;
	driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
  		}

}
