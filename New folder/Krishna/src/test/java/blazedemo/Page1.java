package blazedemo;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.BaseClass;

public class Page1 extends BaseClass{
	

	public Page1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement drpdepa;
	
	@FindBy (xpath="//select[@name='toPort']")
	private WebElement drpdest;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement btnFli;

	public WebElement getDrpdepa() {
		return drpdepa;
	}

	public WebElement getDrpdest() {
		return drpdest;
	}

	public WebElement getBtnFli() {
		return btnFli;
	}
	
	public void loginPage(String depa, String dest) throws IOException {
		WebElement drpdepa2 = getDrpdepa();
		selectText(drpdepa2, depa);
		WebElement drpdest2 = getDrpdest();
		selectText(drpdest2, dest);
		WebElement btnFli2 = getBtnFli();
		btnFli2.click();
}	
}
