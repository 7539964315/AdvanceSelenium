package demo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseclass.BaseClass;
@Listeners(listnerimplimentation.ListenerClass.class)
public class Alpha  extends BaseClass { 
	@Test
  public void logintest() {  
		
		
		
		
		test.log(LogStatus.INFO,"navigated to weilcome page");
		
		test.log(LogStatus.INFO, "clicked on login button");
		org.testng.Assert.fail();
		
		test.log(LogStatus.INFO, "entered the username and password amd clicked");
		
		test.log(LogStatus.PASS, "login page is displayed hence tc is passed");
		
	}
  
}

	

