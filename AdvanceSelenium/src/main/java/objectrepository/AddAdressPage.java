package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAdressPage extends BasePage {

	public AddAdressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAddress;

	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAdress;

	@FindBy(name = "Home")
	private WebElement homeRb;

	@FindBy(name = "Name")
	private WebElement nameTextField;

	@FindBy(name = "House/Office Info")
	private WebElement houseInfoTextField;
	
	
	
	
	@FindBy(id = "Street Info")
	private WebElement streetInfo;

	@FindBy(id = "Landmark")
	private WebElement landMark;

	@FindBy(id = "Country")
	private WebElement country;

	@FindBy(name = "State")
	private WebElement state;
	

	@FindBy(name = "City")
	private WebElement city;
	

	@FindBy(name = "Pincode")
	private WebElement pinCode;
	
	@FindBy(name = "Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id = "addAddress")
	private WebElement addAdressButton;
	
	
	
	

	public WebElement getStreetInfo() {
		return streetInfo;
	}

	public WebElement getLandMark() {
		return landMark;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPinCode() {
		return pinCode;
	}
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}


	
	

	public WebElement getAddAdressButton() {
		return addAdressButton;
	}

	
	
	
	

	public WebElement getMyAddress() {
		return myAddress;
	}

	public WebElement getAddAdress() {
		return addAdress;
	}

	public WebElement getHomeRb() {
		return homeRb;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseInfoTextField() {
		return houseInfoTextField;
	}

}
