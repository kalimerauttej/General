package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
@Test(enabled=false)
public void test() {
	Reporter.log("test",true); 
}
@Test
public void test1() {
	Reporter.log("test1",true); 
}
}
