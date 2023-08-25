package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityinvocationTest {
	@Test (priority=-1,invocationCount = 2)
	public void demo() {
Reporter.log("demo", true);
	}
@Test (priority=-2,invocationCount = -1)
public void demo1() {
Reporter.log("demo1", true);
}
@Test (priority=1,invocationCount = 6)
public void demo2() {
Reporter.log("demo2", true);
	}
@Test (invocationCount = 4)
public void demo3() {
Reporter.log("demo3", true);
}
}
