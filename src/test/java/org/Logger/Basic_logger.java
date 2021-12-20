package org.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Basic_logger {

	static Logger log = Logger.getLogger(Basic_logger.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debugging");
		log.info("information");
		log.error("Error");
		log.warn("warning");
	log.fatal("fetal");
	
	}
	
}
