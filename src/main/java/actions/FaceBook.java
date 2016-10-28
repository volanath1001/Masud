package actions;

import org.openqa.selenium.WebDriver;

public class FaceBook {
	public WebDriver driver=null;
	public FaceBook(WebDriver driver) {
		
		this.driver= driver;
		
		driver.get("http://www.facebook.com");
		
	}

}
