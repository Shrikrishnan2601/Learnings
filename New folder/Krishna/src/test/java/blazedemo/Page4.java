package blazedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.BaseClass;

public class Page4 extends BaseClass{
	

	public Page4() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='1648118967214']")
	private WebElement txtId;

	public WebElement getTxtTable() {
		return txtId;
	}
	public void page4() throws IOException {
		sleep(3000);
		WebElement txtTable2 = getTxtTable();
		String text = txtTable2.getText();
		System.out.println(text);
		File file = new File("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("flight");
		Row row = sheet.createRow(5);
		Cell cell = row.createCell(5);
		cell.setCellValue(text);
//		setDataToExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx", "Sheet1", 5, 5, text);
	}

}
