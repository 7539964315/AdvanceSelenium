package demo ;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseclass.BaseClass;

//@Listeners(listnerimplimentation.ListenerClass.class)
public class sample extends BaseClass {
	
	@Test
	public void sample1() {
		Assert.fail();
		Reporter.log("dummy is done",true);
		
	}

}
