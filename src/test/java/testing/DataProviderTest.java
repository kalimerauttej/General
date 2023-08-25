package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest {

		 @DataProvider

		public Object[][] data() {

		Object[][] obj = new Object [3] [3];

		obj [0][0] = "Hyd";
        obj [0] [1]= "Chennai";
		obj [0] [2]="7th-Aug";

		obj [1][0] = "Hyd";
		obj [1] [1]= "Bangalore";
		obj [1] [2]= "8th-Aug";

		obj [2] [0] = "Hyd";
		obj [2] [1]= "Delhi";
		obj [2] [2]="9th-Aug";
		


		return obj;
}

		@Test (dataProvider  = "data")

		public void bookTicketTest(String src , String dest , String date) {
			System.out.println("From: "+src+"\tTo: "+dest+"\tDate: "+date);
		}
}
