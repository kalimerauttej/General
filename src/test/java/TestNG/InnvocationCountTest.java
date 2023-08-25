package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnvocationCountTest {
	@Test (invocationCount = 6)
	public void demo() {
Reporter.log("demo", true);
}
}