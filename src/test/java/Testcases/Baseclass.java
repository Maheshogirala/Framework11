package Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readconfig;

public class Baseclass {

	
	Readconfig rc=new Readconfig();
	public String baseurl = rc.geturl();
	public String username = "mahesh23456";
	public String password = "India@123";
	public WebDriver dr;
public String indate = "05/09/2023";
public String outdate = "06/09/2023";
public static Logger log ;


	@BeforeClass
	public void openapplication(){
		System.setProperty("webdriver.chrome.driver", "./Driver's/chromedriver.exe");
		
		dr= new ChromeDriver();

		dr.get(baseurl);
		log = Logger.getLogger("framework");
		PropertyConfigurator.configure("log4j.properties");
	}

	
	
//	@AfterClass
//	public void closeapplication(){
//		dr.close();

	//}


}
