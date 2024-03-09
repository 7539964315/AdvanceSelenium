package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaseClass;

public class DeleteAddressTest extends BaseClass {
	
		@Test(groups = "smoke")
		public void deleteaddress() {
			
			WebElement deletebtn =	driver.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/section/div/div[2]/div/div[2]/div/button/span[1]/svg"));
			deletebtn.click();
			driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMedium MuiButton-textSizeMedium  css-1ap6el4']")).click();
			
			
			Reporter.log("address deleted succesfully",true);
		}
		}

