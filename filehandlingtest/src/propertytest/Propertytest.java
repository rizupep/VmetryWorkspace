package propertytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Propertytest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f=new File("D:\\selenium\\filehandlingtest\\file\\Test.properties");
        FileInputStream fis=new FileInputStream(f);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println (prop.getProperty("domain"));
        
        Enumeration e= prop.keys();

        while (e.hasMoreElements()){
        	String key = (String) e.nextElement();
        	System.out.println(key+"----"+prop.get(key));
        	
        }
	}

}
