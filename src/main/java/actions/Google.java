package actions;

import org.openqa.selenium.WebDriver;

public class Google {
	public WebDriver driver=null;
	public Google(WebDriver driver) {
		this.driver= driver;
		//driver.get("https://accounts.google.com/SignUp?");
		driver.get("https://mail.google.com/mail/u/0/#inbox");

		
	}
	
	public FaceBook navToFaceBoo(){
		//driver.get("http://www.facebook.com"); // open in FaceBook Class
		return new FaceBook(driver);
		
	}

}
