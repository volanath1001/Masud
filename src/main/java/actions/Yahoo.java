package actions;

import org.openqa.selenium.WebDriver;

import element.HomePage;

public class Yahoo extends HomePage {
    public WebDriver driver=null;
	public Yahoo(WebDriver driver) {
		 this.driver=driver;
	}
   
	public void navigateToYahoo(){
		
		driver.get("https://login.yahoo.com/account/create?");
		
	}
	
	public Google navGoogle(){

		//driver.get("https://accounts.google.com/SignUp?"); // open in Google class
		
		return new Google(driver);
	}
}
