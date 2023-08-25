package BatchEcxecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	public class Test1 {
		@Test
		
		public void demo() {
			Reporter.log("Hello World", true);
			
		}
		@Test
		public void demo1() {
			Reporter.log("Hello World1", true);
		}


	}


}
