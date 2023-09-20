package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public static WebDriver rdriver;
	public Loginpage(WebDriver Ldriver){
		
		rdriver=Ldriver;
	PageFactory.initElements(Ldriver, this);	
	
	}
	
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	
	
	
	
	public void setusername(String uname){
		user.sendKeys(uname);
		
	}
	
	public void setpassword(String pass){
		password.sendKeys(pass);
		
	}
	
	public void clickbutton(){
	login.click();

		
	}
	
}
