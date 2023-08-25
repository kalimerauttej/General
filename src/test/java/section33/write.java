package section33;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class write {

	public static void main(String[] args) throws IOException {
	      FileInputStream Fis=new FileInputStream("./src/test/resources/data.properties");
	      
	      Properties property=new Properties();
	      property.load(Fis);
	      
	      
	     property.put("user" ,"trainee");
	     property.put("pwd", "trainee");
	     
	     FileOutputStream fos= new FileOutputStream("./src/test/resources/data.properties");
	     property.store(fos, "updated sucessfully");
	}
	

}

  


