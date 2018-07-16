package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {
	private Properties properties;
	private final String propertyFilePath= "configuration//config.properties";
 
	
	public configFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getDriverPathForChrome(){
		String driverPath = properties.getProperty("driverPathForChrome");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Config.properties file.");		
	}
	public String getDriverPathForMozilla(){
		String driverPath = properties.getProperty("driverPathForMozilla");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Config.properties file.");		
	}
	public String getBrowserType()
	{
		String browserType = properties.getProperty("browserType");
		if(browserType!= null) return browserType;
		else throw new RuntimeException("browserType not specified in the Config.properties file.");		
		
	}
	
}
