package StepDefinition;

import org.apache.log4j.Logger;

public class Log4jTrial {

	public static void main(String[] args) {
		
		final Logger logger1 = Logger.getLogger(Log4jTrial.class);
		//BasicConfigurator.configure();
		
		logger1.warn("First Log Message"+logger1);
		logger1.fatal("Object not found");

	}

}
