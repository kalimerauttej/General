package section33;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimePom {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	
	PomActitime loginpage=new PomActitime();
	
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	if(loginpage.getLogo().isDisplayed())
		System.out.println("logo Displayed");
	else
		System.out.println("logo not found");
	
	loginpage.setUsername("admin");
	loginpage.setPassword("manager");
	loginpage.clickKeepMeLoggedInCheckbox();
	loginpage.clickLoginButton();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	try {
		wait.until(ExpectedConditions.titleContains("Enter Time-Trace"));
		System.out.println();
	}catch(Exception e) {
		System.out.println("TextFailed");
	}
	driver.quit();
	}

}
