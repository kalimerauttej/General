package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	@Listeners(listeners.Listenersimplementation.class)
	public class test1  extends BaseClass{
		@Test
		public void test2() {
			System.out.println("Test1");
			
		}
	}

