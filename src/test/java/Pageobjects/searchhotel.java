package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class searchhotel {
public static WebDriver rDriver;
public searchhotel(WebDriver lDriver){
	
	rDriver =lDriver;
	PageFactory.initElements(lDriver, this);
	
	}

@FindBy (id="location")
WebElement location;
@FindBy (id="hotels")
WebElement hotel;
@FindBy(id="room_type")
WebElement room;
@FindBy (id="room_nos")
WebElement nos;
@FindBy (id="datepick_in")
WebElement in;
@FindBy (id="datepick_out")
WebElement out;
@FindBy(id="adult_room")
WebElement adroom;
@FindBy(id="child_room")
WebElement chroom;
@FindBy(id="Submit")
WebElement submit;

public void location (){
	WebElement loc = location;
    Select droup1 = new Select(loc);
    droup1.selectByIndex(2);
	
}

public void hotel(){
	WebElement ho = hotel;
    Select droup1 = new Select(hotel);
    droup1.selectByIndex(2);
	
}

public void roomtyps (){
	WebElement roomty = room;
    Select droup1 = new Select(room);
    droup1.selectByIndex(2);

}
	
public void nos(){
	WebElement nooff = nos;
    Select droup1 = new Select(nos);
    droup1.selectByIndex(2);
	
}

public void in(String indate){
	in.sendKeys(indate);
}

public void out(String outdate){
	out.sendKeys(outdate);
	
}
public void adult(){
	WebElement adul = adroom;
    Select droup1 = new Select(adroom);
    droup1.selectByIndex(2);
}

public void chaild (){
	WebElement chaild = chroom;
    Select droup1 = new Select(chroom);
    droup1.selectByIndex(2);
}
public void submit(){
	submit.click();
}




}
