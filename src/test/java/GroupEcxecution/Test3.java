package GroupEcxecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

@Test(groups="smoke")
	
	public void demo() {
		Reporter.log("smoke", true);
}
@Test(groups="regression")

public void demo1() {
	Reporter.log("regression", true);
}
@Test(groups={"regression", "smoke"})

public void demo2() {
	Reporter.log("regression and smoke", true);
}
}


