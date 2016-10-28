package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser {
	
	@Test
	public void start(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("email")).sendKeys("k@y.com");
		driver.close();
	}

}
