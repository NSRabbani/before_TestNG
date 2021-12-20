package org.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_reader {

	static Properties p;
	
	public Configuration_reader() throws Throwable {

		File f = new File("D:\\Selenium\\Workspace\\MiniProjectAddactin\\src\\main\\java\\org\\property\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		 
		 p.load(fis);
		 
	}
	
	public  String geturl()  {

		String url = p.getProperty("url");
		
		return url;
	}
	
	public String getdatein() {

		String dti = p.getProperty("datein");
		
		return dti;
		
	}
	
	public String getdateout() {
		
		String dto = p.getProperty("dateout");
		
		return dto;

	}
	public String username() {

		String string = p.getProperty("username");
		
		return string;
		
	}public String password() {

		String string = p.getProperty("password");
		
		return string;
		
	}public String fname() {

		String string = p.getProperty("fname");
		
		return string;
	}public String lname() {

		
		String string = p.getProperty("lname");
		
		return string;
	}public String cardno() {

		String string = p.getProperty("cardno");
		
		return string;
	}public String ccvno() {

		String string = p.getProperty("ccvno");
		
		return string;
	}public String addres() {

		String string = p.getProperty("address");
		
		return string;
		
	}



}
