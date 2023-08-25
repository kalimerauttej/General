package GroupEcxecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

@Test(groups="regression")
	
	public void demo() {
		Reporter.log("regression", true);
}
@Test(groups="functional")

public void demo1() {
	Reporter.log("functional", true);
}
@Test(groups={"functional", "regression"})

public void demo2() {
	Reporter.log("functional and regression", true);
}
}

