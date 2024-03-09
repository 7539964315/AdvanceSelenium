package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
 @Test(priority = 1)
	public void  openbrowser() {
		Reporter.log("Browser Opened",true);
	}
	@Test
public void register() {
	Reporter.log("register");
	}
	//@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("loggedin succesfully");
	}
}
