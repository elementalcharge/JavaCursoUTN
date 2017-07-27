package tp2.modelo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

	private static PropertiesUtils instance;
	private Properties properties;
	
	private PropertiesUtils(){
		load();
	}
	
	private void load() {
		properties = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("application.properties");
			properties.load(file);
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo application.properties");
		} catch (IOException e) {
			System.out.println("No se pudo cargar el archivo application.properties");
		}
	}

	public static PropertiesUtils getInstance(){
		if(instance == null){
			instance = new PropertiesUtils();
		}
		return instance;
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
