package blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.BaseClass;

public class Page2 extends BaseClass{
	
	
	public Page2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='btn btn-small'])[3]")
	private WebElement clkflight;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClkflight() {
		return clkflight;
	}

	public void page2() {
		sleep(3000);
		WebElement clkflight2 = getClkflight();
		clkflight2.click();
		
	}
}
