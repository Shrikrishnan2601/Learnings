package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinAutoFull {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/SearchHotel.php");
			WebElement user = driver.findElement(By.name("username"));
			user.sendKeys("manoj61988");
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("Krish@61988");
			WebElement login = driver.findElement(By.name("login"));
			login.click();
		    WebElement location = driver.findElement(By.id("location"));
		    WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
			Select s = new Select(location);
			s.selectByIndex(5);
			Select s1 = new Select(hotel);
			s1.selectByIndex(3);
			WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
			Select s2 = new Select(roomtype);
			s2.selectByIndex(1);
			WebElement no = driver.findElement(By.xpath("//select[@id='room_nos']"));
			Select s3 = new Select(roomtype);
			s3.selectByIndex(3);
			WebElement check = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
			check.sendKeys("18/03/2022");
			WebElement out = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
			out.sendKeys("19/03/2022");
			WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
			Select s4 = new Select(adults);
			s4.selectByIndex(3);
			WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));
			Select s5 = new Select(children);
			s5.selectByIndex(4);
			WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
			search.click();
			WebElement clkradio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
			clkradio.click();
			WebElement continue2 = driver.findElement(By.xpath("//input[@id='continue']"));
			continue2.click();
			WebElement frstname = driver.findElement(By.xpath("//input[@id='first_name']"));
			frstname.sendKeys("Shri");
			WebElement lstname = driver.findElement(By.xpath("//input[@id='last_name']"));
			lstname.sendKeys("krsihnan");
			WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
			address.sendKeys("Pondy");
			WebElement card = driver.findElement(By.xpath("//input[@id='cc_num']"));
			card.sendKeys("1234567891011121");
			WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
			Select s6 = new Select(cardtype);
			s6.selectByIndex(3);
			WebElement exmnth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
			Select s7 = new Select(exmnth);
			s7.selectByIndex(3);
			WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
			Select s8 = new Select(year);
			s8.selectByIndex(3);
			WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
			cvv.sendKeys("0811");
			WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
			book.click();
			Thread.sleep(5000);
			WebElement id = driver.findElement(By.xpath("//input[@id='order_no']"));
			Thread.sleep(4000);
			String attribute = id.getAttribute("value");
			System.out.println(attribute);
			//driver.quit();
	}
}
