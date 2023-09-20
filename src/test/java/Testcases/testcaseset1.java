package Testcases;

import org.testng.annotations.Test;

import Pageobjects.Loginpage;
import Pageobjects.searchhotel;

public class testcaseset1 extends Baseclass {
@Test (priority=1)
	public void testsuit(){
		
//		dr.get(baseurl);
		Loginpage lp = new Loginpage(dr);
		
		lp.setusername(username);
		lp.setpassword(password);
		lp.clickbutton();
	}
@Test (priority=2)
public void searchhotel22() throws InterruptedException{
	
	searchhotel sh=new searchhotel(dr);
	sh.location();
	Thread.sleep(1000);
	sh.hotel();
	log.info("Hotel is selected");
	sh.roomtyps();
	log.info("roomtype is selected");
	sh.nos();
	log.info("Hotel is selected");
	sh.in(indate);
	sh.out(outdate);
	sh.adult();
	sh.chaild();
	sh.submit();
	
	
}



}
