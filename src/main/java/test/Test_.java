package test;

import org.testng.annotations.Test;

import actions.Google;
import actions.Yahoo;
import base.Base;

public class Test_ extends Base {
	
	@Test
	public void yahoo() throws Throwable{
		Yahoo hp= new Yahoo(driver); 
		hp.navigateToYahoo();
		Thread.sleep(5000);
		Google google=hp.navGoogle();
		Thread.sleep(3000);
		//
		//google.navToFaceBoo();
		//hp.navGoogle().navToFaceBoo();
		
	}

	
	
}
