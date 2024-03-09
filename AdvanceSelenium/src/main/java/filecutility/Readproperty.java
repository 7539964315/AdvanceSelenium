package filecutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {

	FileInputStream path;

	public String fetchproperty(String key) {
		try {
			path = new FileInputStream("./Data/shop.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties pobj = new Properties();
		try {
			pobj.load(path);
		} catch (IOException e) {
			e.printStackTrace();

		}
		String data = pobj.getProperty(key);

		return data;

		/*
		 * String url= pobj.getProperty("url"); 
		 *String username=pobj.getProperty("username"); 
		 *String password= pobj.getProperty("password");
		 */

	}
}
