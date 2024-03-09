package baseclass;

import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import filecutility.Readproperty;
import genaricutility.WebDriverUtility;
import listnerimplimentation.ListenerClass;
import objectrepository.HomePage;
import objectrepository.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

public class BaseClass extends ListenerClass {
	public WebDriver driver;
	public static WebDriver sdriver;

	// @Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openbrowser() {// String browser

		/*
		 * if(browser.equals("chrome")) { driver = new ChromeDriver();
		 * 
		 * 
		 * } else if(browser.equals("edge")) { driver = new EdgeDriver();
		 * 
		 * } else { driver = new ChromeDriver(); s }
		 */

		driver = new ChromeDriver();
		sdriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		Readproperty properties = new Readproperty();
		String url = properties.fetchproperty("url");
		driver.get(url);

		Reporter.log("browser opend sucessfuly and navigated to login page", true);

	}

	@BeforeMethod(alwaysRun = true)
	public void login() {
		Readproperty properties = new Readproperty();
		LoginPage loginPage = new LoginPage(driver);
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		
		String username = properties.fetchproperty("username");
		loginPage.getEmailTextField().sendKeys(username);
		
		String password = properties.fetchproperty("password");
		loginPage.getPasswordTextField().sendKeys(password);
		
		//driver.findElement(By.id("")).click();
		//loginPage.getLoginButton().click();
		webDriverUtility.clickOnElement(loginPage.getLoginButton());
		
		Reporter.log("logged in sucessfully", true);

	}

	@AfterMethod(alwaysRun = true)
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		HomePage homePage = new HomePage(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getSettingIcon())).click();
		//homePage.getSettingIcon().click();
		//homePage.getLogoutButton().click();
		Reporter.log("logged out sucessfully", true);
	}

	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		// driver.close();
	//	Reporter.log("browser closed sucessfullu", true);

	}
}
