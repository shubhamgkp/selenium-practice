package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {

	public static void takeLog(String classname, String message) {
		
		Logger log=Logger.getLogger(classname);
		DOMConfigurator.configure("./logs.xml");
		log.info(message);
		
	}
}
