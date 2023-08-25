package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test(retryAnalyzer=listeners.RetryImplementation.class)
	public void test1() {
		System.out.println("test1");
		Assert.fail();
	}

}
