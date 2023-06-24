package org.task;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelWriteDemo {

	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement txtSkills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select(txtSkills);
		List<WebElement> options = s.getOptions();
		for (int i=0; i<options.size(); i++) {
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			WebElement element = options.get(i);
			
		}

	}

}
