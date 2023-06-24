package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver driver;
	 public static Actions actions;
	 public static Alert alert;
	 public static Robot robot;
	 public static TakesScreenshot screenShot;
	 public static JavascriptExecutor executor;
	 
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void launchSafari() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
	}

	public static void launchIe() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void sleep(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void setChrome(String path) {
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}

	public static void setIe(String path) {
		System.setProperty("webdriver.ie.driver", path);
		driver = new InternetExplorerDriver();
	}

	public static void setFireFox(String path) {
		System.setProperty("webdriver.firefox.driver", path);
		driver = new FirefoxDriver();
	}

	public static void setEdge(String path) {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
	}

	public static void setSafari(String path) {
		System.setProperty("webdriver.safari.driver", path);
		driver = new SafariDriver();
	}

	public static WebElement idLocator(String idvalue) {
		WebElement element = driver.findElement(By.id(idvalue));
		return element;
	}

	public static WebElement nameLocator(String namevalue) {
		WebElement element = driver.findElement(By.name(namevalue));
		return element;
	}

	public static WebElement classLocator(String classvalue) {
		WebElement element = driver.findElement(By.className(classvalue));
		return element;
	}

	public static WebElement xpathLocator(String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		return element;
	}

	public static void idSend(String idvalue, String text) {
		WebElement element = driver.findElement(By.id(idvalue));
		element.sendKeys(text);
	}

	public static void nameSend(String namevalue, String text) {
		WebElement element = driver.findElement(By.name(namevalue));
		element.sendKeys(text);
	}

	public static void classSend(String Classvalue, String text) {
		WebElement element = driver.findElement(By.className(Classvalue));
		element.sendKeys(text);
	}

	public static void xpathSend(String xpathvalue, String text) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		element.sendKeys(text);
	}

	public static void idClick(String idvalue) {
		WebElement element = driver.findElement(By.id(idvalue));
		element.click();
	}

	public static void nameClick(String namevalue) {
		WebElement element = driver.findElement(By.name(namevalue));
		element.click();
	}

	public static void classClick(String classvalue) {
		WebElement element = driver.findElement(By.className(classvalue));
		element.click();
	}

	public static void xpathClick(String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		element.click();
	}

	public static void mouseOverAction(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public static void dragDrop(WebElement source, WebElement target) {
		actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public static void rightClick(WebElement element) {
		actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public static void doubleClick(WebElement element) {
		actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public static void alertOk() {
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alertCancel() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void sendkeys(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static String textGet(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String attributeGet(WebElement element) {
		String attribute = element.getAttribute("value");
		 System.out.println(attribute);
		return attribute;}

	public static void pressEnter() {
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public static void screenshot(String desPath) {
		screenShot = (TakesScreenshot) driver;
		File s = screenShot.getScreenshotAs(OutputType.FILE);
		File d = new File(desPath + ".png");
		try {
			FileUtils.copyFile(s, d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void screenshotElement(WebElement element, String desPath) {
		File s = element.getScreenshotAs(OutputType.FILE);
		File d = new File(desPath);
		try {
			FileUtils.copyFile(s, d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void jsSet(WebElement element, String text) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','"+text+"')", element);
	}

	public static Object jsGet(WebElement element) {
		executor = (JavascriptExecutor) driver;
		Object script = executor.executeScript("return arguments[0].getAttribute('value')", element);
		return script;
	}

	public static void jsClick(WebElement element) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	public static void jsScrollUp(WebElement element) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jsScrollDown(WebElement element) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void selectText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectValue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}

	public static void selectIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static List<WebElement> drpGetOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public static List<WebElement> drpGetAllSelOpt(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public static WebElement firstSelectedopt(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public static boolean isMultipledrp(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public static void deselectValue(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByValue(text);
	}

	public static void deselectIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public static void deselectText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public static void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public static void switchFrameindex(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchFramenameid(String name) {
		driver.switchTo().frame(name);
	}

	public static void switchFrameElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchPreviousFrame() {
		driver.switchTo().parentFrame();
	}

	public static void switchWindowfromFrame() {
		driver.switchTo().defaultContent();
	}

	public static void secondWindow() {
		String string = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String string2 : handles) {
			if (!(string.equals(string2))) {
				driver.switchTo().window(string2);
			}

		}
	}

	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static String getDataFromExcel(String path, int rowNo, int cellNo)throws IOException {
		File file = new File (path);
				FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType cellType = cell.getCellType();
		String value = "";
		switch(cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)){
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
				value= format.format(dateCellValue);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal decimal = BigDecimal.valueOf(numericCellValue);
				value = decimal.toString();
				
			}default:
				System.out.println("Invalid Sheet Name");
				
		}
		return value;
		
	}
	public static void setDataToExcel (String path, String sheetName, int rowNo, int cellNo, String data) throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.createSheet(sheetName);
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		stream.close();
		FileOutputStream out = new FileOutputStream(file); 
		workbook.write(out);
		out.close();
	}
	public static void appendDataToExcel(String path, String sheetName, int rowNo, int cellNo, String data) throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		stream.close();
		FileOutputStream out = new FileOutputStream(file, true);
		workbook.write(out);
		out.close();
//		FileWriter f = new FileWriter(file, true);
//		BufferedWriter b = new BufferedWriter(f);
//		PrintWriter p = new PrintWriter(b);
//		p.print(data);
	}
}
