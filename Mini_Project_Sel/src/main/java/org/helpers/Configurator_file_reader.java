package org.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configurator_file_reader {

	static Properties p;

	public Configurator_file_reader() throws Throwable {
		// TODO Auto-generated constructor stub

		File f = new File(
				"D:\\Selenium\\Workspace\\Mini_Project_Sel\\src\\main\\java\\org\\property\\configurator.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String url() {

		String string = p.getProperty("url");
		
		return string;
	}public String username() {

		String string = p.getProperty("username");
		
		return string;
		
	}public String password() {

		String string = p.getProperty("password");
		
		return string;
		
	}public String message() {

		String property = p.getProperty("message");
		
		return property;
		
	}
	
}
