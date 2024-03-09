package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//@FindBy(xpath = "//*[name()='svg'and @data-testid='SettingsIcon']")
	
	@FindBy(xpath = "//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")
	private WebElement settingIcon;
	
	@FindBy(xpath = "//ul[@role='menu']/li[1]")
	private WebElement myProfile;
	
	@FindBy(xpath = "//ul[@role='menu']/li[7]")
	private WebElement logoutButton;
	
	public WebElement getSettingIcon() {
		return settingIcon;
	}
	public WebElement getMyProfile() {
		return myProfile;
	}
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	

}
