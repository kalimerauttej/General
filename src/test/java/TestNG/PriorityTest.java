package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test()
	public void test1() {
		Reporter.log("test1", true);
	}
	@Test(priority = -2)
	public void test2() {
		Reporter.log("test2", true);
	}
	@Test(priority = 2)
	public void test3() {
		Reporter.log("test3", true);
	}
	@Test(priority = 3)
	public void test4() {
		Reporter.log("test4", true);
	}
	@Test(priority = -1)
	public void test5() {
		Reporter.log("test5", true);
	}

}
