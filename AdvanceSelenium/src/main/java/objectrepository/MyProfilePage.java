package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BasePage {
	public MyProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getPencilIcon() {
		return pencilIcon;
	}

	@FindBy(xpath = "//*[name()='svg'and@id='editaddress_fl']")
private WebElement pencilIcon;

	
	@FindBy(xpath = "//*[name()='svg'and@data-testid='DeleteIcon']")
	private WebElement deleteIcon;
}
