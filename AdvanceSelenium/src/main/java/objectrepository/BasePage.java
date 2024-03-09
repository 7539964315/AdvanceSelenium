package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {   
	
	
	
	 public BasePage(WebDriver driver){//this is constructor
		PageFactory.initElements(driver, this);
	}
	

}
