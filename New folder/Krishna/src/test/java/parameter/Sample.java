package parameter;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	WebDriver driver;
	@BeforeClass
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() {
	driver.get("https://blazedemo.com/");	
	Date d = new Date();
	System.out.println(d);
	}
	@Parameters("departure")
	@Test
	public void departure(String s) {
		WebElement element = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select a = new Select(element);
		a.selectByValue(s);
	}
}
 