package blazedemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.BaseClass;

public class Page3 extends BaseClass {
	

	public Page3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='inputName']")
	private WebElement txtName;

	@FindBy(xpath = "//input[@id='address']")
	private WebElement txtAddress;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement txtCity;

	@FindBy(xpath = "//input[@id='state']")
	private WebElement txtState;

	@FindBy(xpath = "//input[@id='zipCode']")
	private WebElement txtZipCode;

	@FindBy(xpath = "//select[@id='cardType']")
	private WebElement drpCard;

	@FindBy(xpath = "//input[@id='creditCardNumber']")
	private WebElement txtCreditCardNum;

	@FindBy(xpath = "//input[@id='creditCardMonth']")
	private WebElement txtCreditCardMonth;

	@FindBy(xpath = "//input[@id='creditCardYear']")
	private WebElement txtCreditCardYear;

	@FindBy(xpath = "//input[@id='nameOnCard']")
	private WebElement txtNameOnCard;

	@FindBy(xpath = "//input[@id='rememberMe']")
	private WebElement clkRemember;

	@FindBy(xpath = "//input[@value='Purchase Flight']")
	private WebElement clkPurchaseFlight;

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getDrpCard() {
		return drpCard;
	}

	public WebElement getTxtCreditCardNum() {
		return txtCreditCardNum;
	}

	public WebElement getTxtCreditCardMonth() {
		return txtCreditCardMonth;
	}

	public WebElement getTxtCreditCardYear() {
		return txtCreditCardYear;
	}

	public WebElement getTxtNameOnCard() {
		return txtNameOnCard;
	}

	public WebElement getClkRemember() {
		return clkRemember;
	}

	public WebElement getClkPurchaseFlight() {
		return clkPurchaseFlight;
	}

	public void page3() throws IOException {
		sleep(3000);
		WebElement txtName2 = getTxtName();
		String name = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 0);
		txtName2.sendKeys(name);

		WebElement txtAddress2 = getTxtAddress();
		String address = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 1);
		txtAddress2.sendKeys(address);

		WebElement txtCity2 = getTxtCity();
		String city = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 2);
		txtCity2.sendKeys(city);

		WebElement txtState2 = getTxtState();
		String state = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 3);
		txtState2.sendKeys(state);

		WebElement txtZipCode2 = getTxtZipCode();
		String zip = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 4);
		txtZipCode2.sendKeys(zip);

		WebElement drpCard2 = getDrpCard();
		String cardType = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 5);
		drpCard2.sendKeys(cardType);

		WebElement txtCreditCardNum2 = getTxtCreditCardNum();
		String cardNum = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 6);
		txtCreditCardNum2.sendKeys(cardNum);

		WebElement txtCreditCardMonth2 = getTxtCreditCardMonth();
		String cardMonth = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 7);
		txtCreditCardMonth2.sendKeys(cardMonth);

		WebElement txtCreditCardYear2 = getTxtCreditCardYear();
		String cardYear = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 8);
		txtCreditCardYear2.sendKeys(cardYear);

		WebElement txtNameOnCard2 = getTxtNameOnCard();
		String nameOnCard = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 9);
		txtNameOnCard2.sendKeys(nameOnCard);

		WebElement clkRemember2 = getClkRemember();
		clkRemember2.click();

		WebElement clkPurchaseFlight2 = getClkPurchaseFlight();
		clkPurchaseFlight2.click();

	}

}
