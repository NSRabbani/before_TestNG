package org.helpers;

public class File_reader_manager {

	private File_reader_manager() {

	}  
	
	public static File_reader_manager getinstancefrm() {

		File_reader_manager fr =new File_reader_manager();
		
		return fr;
	}
	
	
	public Configurator_file_reader getinstanceCR() throws Throwable {

		Configurator_file_reader cr = new Configurator_file_reader();
		
		return cr;
	}
	
}
