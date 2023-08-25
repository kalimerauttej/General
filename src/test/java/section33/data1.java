package section33;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class data1 {


			public static void main(String[] args) throws IOException {
			      FileInputStream Fis=new FileInputStream("./src/test/resources/data.properties");
			      
			      Properties property=new Properties();
			      property.load(Fis);
			      
			      System.out.println(property.get("url"));
			      System.out.println(property.get("browser"));

			}

		}



