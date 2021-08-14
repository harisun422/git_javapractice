package selenium_artifactid;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggers {
	
	 public static  Logger logger = LoggerFactory.getLogger(Loggers.class);
	 
	  public static void main(String[] args) {
		  String log4jConfPath = "log4j.properties";
		  PropertyConfigurator.configure(log4jConfPath);
	    logger.info("Hello World");
	    logger.warn("This is warning");
	    logger.debug("just debug message");
	    logger.info("fatal msg");
	    logger.debug("just debug message");
	    
	  }
}