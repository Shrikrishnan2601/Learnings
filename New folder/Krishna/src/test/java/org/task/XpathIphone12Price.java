package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathIphone12Price {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone+12&crid=FQMZAA09L8LT&sprefix=iphone+12%2Caps%2C433&ref=nb_sb_noss_2");
		Thread.sleep(3000);
		WebElement txtPrice = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']//parent::a//parent::h2//parent::div//parent::div//following-sibling::div[@class='sg-row']//child::div//child::div//child::div//child::div//child::a//child::span[@class='a-price-whole'])[1]"));
		String price = txtPrice.getText();
		System.out.println(price);
		
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-05/04/2022&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458");
		Thread.sleep(3000);
		WebElement txtIndigo = driver.findElement(By.xpath("//p[text()='Popular Filters']//following-sibling::div//child::label[2]//child::div//child::span[2]//child::span[@class='filterName']"));
		System.out.println(txtIndigo.getText());
	}

}
