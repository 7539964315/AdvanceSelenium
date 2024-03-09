package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import baseclass.BaseClass;
import filecutility.ReadExcel;
import genaricutility.WebDriverUtility;
import objectrepository.AddAdressPage;
import objectrepository.HomePage;
@Listeners(listnerimplimentation.ListenerClass.class)//package name. classname. class 

public class AddAdressTest<fetchSingleData> extends BaseClass{
@Test(groups = "smoke")
public void addaddress() {
	 AddAdressPage  addAdressPage = new objectrepository.AddAdressPage(driver); 
	 WebDriverUtility webDriverUtility=new WebDriverUtility();
		HomePage homePage = new HomePage(driver);
		ReadExcel readExcel = new ReadExcel();
		

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getSettingIcon())).click();	
		
		
		test.log(LogStatus.INFO,"settings icon clicked sucessfully");
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getMyProfile())).click();
		   webDriverUtility.clickOnElement(addAdressPage.getMyAddress());

		 WebElement myaddress =driver.findElement(By.xpath("//a[text()='my addresses']"));
		   Assert.assertEquals(myaddress.isDisplayed(), true);
		   
		webDriverUtility.clickOnElement(addAdressPage.getAddAdress());
		 WebElement addressform =driver.findElement(By.xpath("//a[text()='addressform']"));
		   Assert.assertEquals(addressform.isDisplayed(), true);
		   webDriverUtility.clickOnElement(addAdressPage.getHomeRb());
		//  String name = readExcel.fetchSingleData("add address", 0, 1);
		   webDriverUtility.sendText( addAdressPage.getNameTextField(), "name kumar");
		   
		   
		   webDriverUtility.sendText(addAdressPage.getHouseInfoTextField(),"2/303,ganthi street ");

		   webDriverUtility.sendText(addAdressPage.getStreetInfo(),"ganthi street");
		   webDriverUtility.sendText(addAdressPage.getLandMark(),"church");
		   webDriverUtility.sendText(addAdressPage.getCountry(),"India");
		   webDriverUtility.sendText(addAdressPage.getState(),"tamil nadu");
		   webDriverUtility.sendText(addAdressPage.getCity(),"chennai");
		   webDriverUtility.sendText(addAdressPage.getPinCode(),"600044");
		   webDriverUtility.sendText(addAdressPage.getPhoneNumber(),"1234567890");
		//	Actions actions=new Actions(driver);
			//actions. keyDown(Keys.PAGE_DOWN). build(). perform();
			
		   addAdressPage.getAddAdressButton().click();
			
//			//WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.elementToBeClickable()).click();	
			
		
		  
	//driver.findElement(By.xpath("//div[text()='My Addresses']"));
		//Reporter.log("my address is displayed",true);
	//WebElement addadress=driver.findElement(By.xpath("//button[text()='Add Address']"));
	//addadress.click();
		//Reporter.log("addressform is displayed",true);
	   
	  // addAdressPage.getHomeRb().click(); pom
		//driver.findElement(By.name("Home")).click();
	//driver.findElement(By.name("Name")).sendKeys("samjay kumar");
	//driver.findElement(By.name("House/Office Info")).sendKeys("mooversampet");
	//driver.findElement(By.id("Street Info")).sendKeys("8th street");
	//driver.findElement(By.id("Landmark")).sendKeys("near airtel showroom");
	//driver.findElement(By.id("Country")).sendKeys("India");
//	WebElement country= driver.findElement(By.id("Country"));
	//driver.findElement(By.name("State")).sendKeys("tamil nadu");
	//driver.findElement(By.name("City")).sendKeys("chennai");
	/*
	 * Select slt = new Select(country); slt.selectByVisibleText("India");
	 * WebElement state=driver.findElement(By.name("State")); Select slt1 = new
	 * Select(state); slt.selectByVisibleText("Tamil Nadu"); WebElement
	 * city=driver.findElement(By.name("City")); Select slt2 = new Select(city);
	 * slt.selectByVisibleText("Chennai");
	 */
//	driver.findElement(By.name("Pincode")).sendKeys("600091");
	//driver.findElement(By.name("Phone Number")).sendKeys("098765432");
	//driver.findElement(By.id("btnDisabled")).click();

	//Reporter.log("address added succesfully",true);
}
}
