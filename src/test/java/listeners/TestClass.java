package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listenersimplimentationclass.class)
public class TestClass extends Baseclasses{
	 @Test
	 public void loginTest() {
		 driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.id( "username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.titleContains( "Enter Time-Track"));
		 
		 Assert.assertTrue(driver.getTitle().contains( "Enter timl-Track"));
	 }
	

}
