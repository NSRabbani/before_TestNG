package org.helpers;

public class File_reader_manager {

	
	private File_reader_manager() {
		
	}
	
	
	public static File_reader_manager getinstanceFrm() {

		File_reader_manager frm = new File_reader_manager();
		
		return frm;
		
	}
	
	public Configuration_reader getinstanceCR() throws Throwable {

		Configuration_reader cr = new Configuration_reader();
		
		return cr;
		
	}
	
	
	
}
