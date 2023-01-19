package ca.rpra.automation.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	
	Properties props;
	public ReadProperties() {
		String resourceName = "src/main/java/resources/config.properties";		
		props = new Properties();
		try {
			InputStream resourceStream = new FileInputStream(resourceName);
			props.load(resourceStream);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		    
		}
	}
	
	public String getValue(String key) {
		
		return props.getProperty(key);
	}

}
