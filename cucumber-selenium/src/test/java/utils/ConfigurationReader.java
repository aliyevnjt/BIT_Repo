package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

	static InputStream input;
	static Properties prop;
	
	static {
		try {
			input = new FileInputStream("Configs/configuration.properties");
			prop = new Properties();
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String str) {
		
		return prop.getProperty(str);
	}
}
