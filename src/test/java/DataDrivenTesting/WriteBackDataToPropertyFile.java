package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//convert physical file to java object
				FileInputStream fis=new FileInputStream("./data.properties");
				
				//create an object of properties
				Properties p=new Properties();
				
				//load the properties obj
				p.load(fis);
				
				//write data to prop obj to add data to propertyfile
				p.put("subject","selenium");
				
				//after adding we have to convert to javaobject by using fileoutputstream
				FileOutputStream fos=new FileOutputStream("./data.properties");
				//to save propertyfile after updating we should use store()
				p.store(fos,"updated subject");
	}

}
