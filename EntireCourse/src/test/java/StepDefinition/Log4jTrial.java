package StepDefinition;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jTrial {

	public static void main(String[] args) {
		
		final Logger logger1 = Logger.getLogger(Log4jTrial.class);
		//BasicConfigurator.configure();
		
		logger1.warn(logger1);
		System.out.println("ONe");

	}

}
