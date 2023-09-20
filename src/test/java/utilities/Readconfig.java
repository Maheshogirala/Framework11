package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
public static Properties pro;

	public Readconfig(){
		File f=new File("./Configuration/config.properties");
		try{
			FileInputStream f1= new FileInputStream(f);
			pro=new Properties();
			pro.load(f1);
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public String geturl(){
		String url=pro.getProperty("baseurl");
		return url;
	}
	
	
	
	
}
