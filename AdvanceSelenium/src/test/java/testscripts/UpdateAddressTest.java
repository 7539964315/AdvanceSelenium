package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import baseclass.BaseClass;
import genaricutility.WebDriverUtility;
import objectrepository.AddAdressPage;
import objectrepository.HomePage;
import objectrepository.MyProfilePage;

@Listeners(listnerimplimentation.ListenerClass.class)
public class UpdateAddressTest extends BaseClass {

	@Test()
	public void updateaddress() {
		AddAdressPage addAdressPage = new objectrepository.AddAdressPage(driver);
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		HomePage homePage = new HomePage(driver);
		MyProfilePage myProfilePage = new MyProfilePage(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getSettingIcon())).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getMyProfile())).click();

		webDriverUtility.clickOnElement(addAdressPage.getMyAddress());

		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(myProfilePage.getPencilIcon())).click();
		// webDriverUtility.clickOnElement(myProfilePage.getPencilIcon());

		// webDriverUtility.clickOnElement(myProfilePage.getPencilIcon());

		webDriverUtility.clickOnElement(addAdressPage.getHomeRb());
		webDriverUtility.sendText(addAdressPage.getNameTextField(), "karunanithi");

		webDriverUtility.sendText(addAdressPage.getHouseInfoTextField(), "no 1100");

		webDriverUtility.sendText(addAdressPage.getStreetInfo(), "mooversampet");
		webDriverUtility.sendText(addAdressPage.getLandMark(), "airtel showroom nearby");
		webDriverUtility.sendText(addAdressPage.getCountry(), "India");
		webDriverUtility.sendText(addAdressPage.getState(), "tamil nadu");
		webDriverUtility.sendText(addAdressPage.getCity(), "chennai");
		webDriverUtility.sendText(addAdressPage.getPinCode(), "600091");
		webDriverUtility.sendText(addAdressPage.getPhoneNumber(), "9876543210");
		driver.findElement(By.xpath("//button[text()='Update Address']"));

	}
}
