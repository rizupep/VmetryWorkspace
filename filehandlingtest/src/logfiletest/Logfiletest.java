package logfiletest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logfiletest {
public static Logger log =LoggerFactory.getLogger(Logfiletest.class);//logger has to be created above the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PropertyConfigurator.configure("D:\\selenium\\filehandlingtest\\lib\\log4j.properties");
		log.info("i am info2");
		//log.info("i am info1");
		//log.error("i am error 1");
		log.error("i am error 2");
	}

}
