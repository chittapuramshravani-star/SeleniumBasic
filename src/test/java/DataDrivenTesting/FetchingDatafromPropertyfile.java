package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchingDatafromPropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//convert physical file to java object
		FileInputStream fis=new FileInputStream("./data.properties");
		
		//create an object of properties
		Properties p=new Properties();
		
		//load the properties obj
		p.load(fis);
		
		//fetch the data from prop obj
		String data=p.getProperty("browser");
System.out.println(data);
	}

}
