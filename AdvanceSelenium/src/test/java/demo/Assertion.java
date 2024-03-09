package demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void hardassert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.partialLinkText("Log in")).click();
		
		WebElement aboutlogin = driver.findElement(By.tagName("h2"));
		Assert.assertEquals(aboutlogin.isDisplayed(),true);
		Assert.assertEquals(driver.getTitle().contains("Login"), true);
		Reporter.log("login page is displayed",true);
		driver.quit();
		
	}

}
