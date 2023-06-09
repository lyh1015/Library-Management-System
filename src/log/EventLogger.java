package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

public class EventLogger {

	FileHandler filehandler;
	PrintWriter fileout;
	LogManager logmanager;
	Logger logger;
	public EventLogger(String fileName) {
		try {
			logmanager=LogManager.getLogManager();
			logger=logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler=new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		    
		}catch(IOException e) {

		e.printStackTrace();
		}
	}
		public void log(String logMessage) {
			logger.info(logMessage);
		}
	

}
