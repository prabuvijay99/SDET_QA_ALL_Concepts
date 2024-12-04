package Day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readProperties {

	public static void main(String[] args) throws IOException {
		// location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//testdata//config.properties");
		
		//create obj for properties
		Properties prop=new Properties();
		// load the file		
		prop.load(file);
		
		
		//reading data from properties file
		String url = prop.getProperty("appurl");
		String email = prop.getProperty("email");
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		
		System.out.println(url+" "+email+" "+user+" "+pass);

	}

}
