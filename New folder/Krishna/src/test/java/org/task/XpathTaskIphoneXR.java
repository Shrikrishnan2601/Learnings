package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTaskIphoneXR {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone+xr&crid=GIDE0BYX4OI0&sprefix=iphone+xr+%2Caps%2C478&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txtTmrw = driver.findElement(By.xpath("(//span[text()='Apple iPhone XR (128GB) - Coral']//parent::a//parent::h2//parent::div//following-sibling::div//following-sibling::div//child::div//child::div//child::div//following-sibling::div//child::div//child::div//child::span[@class='a-color-base a-text-bold'])[1]"));
		String text = txtTmrw.getText();
		System.out.println(text);

	}

}
