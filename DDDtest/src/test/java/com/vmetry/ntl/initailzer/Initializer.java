package com.vmetry.ntl.initailzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initializer {

	public static FileInputStream fis=null;
	public static Properties prop=null;
	
	public static WebDriver wd=null;
	public static void initalize() throws IOException{
		
		 fis=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vmetry"+File.separator+"ntl"+File.separator+"config"+File.separator+"env.properties"));
		 prop=new Properties();
		 prop.load(fis);
	
		 wd=new FirefoxDriver();
		 
	}
	
	
}
