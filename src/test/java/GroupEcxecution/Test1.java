package GroupEcxecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

@Test(groups="smoke")
	
	public void demo() {
		Reporter.log("smoke", true);
}
@Test(groups="functional")

public void demo1() {
	Reporter.log("functional", true);
}
@Test(groups={"functional", "smoke"})

public void demo2() {
	Reporter.log("functional and smoke", true);
}
}
