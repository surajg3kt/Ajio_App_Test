package propertyReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyReaderClass 
{
	public static Properties prop;
	
   public static Properties propertyRead() throws FileNotFoundException
   {
	   File file=new File("./src/main/resources/files/login.properties");
		FileInputStream fis=new FileInputStream(file);
		 prop = new Properties();
		 
		 try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
   }
}
