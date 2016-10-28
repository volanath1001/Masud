package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Base {

    //yahoo=https://login.yahoo.com/account/create?.lang=en-US&.intl=us&.src=fpctx&.done=https%3A%2F%2Fwww.yahoo.com&specId=yidReg&altreg=0
    //gmail=https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en
    //facebook
	
	public WebDriver driver=null;
	
	@BeforeMethod
	public void start(){
		driver= new FirefoxDriver();
	}

}
