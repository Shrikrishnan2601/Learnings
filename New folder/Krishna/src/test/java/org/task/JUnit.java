package org.task;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class JUnit extends BaseClass {
	@Rule
	public TestName testName = new TestName();

	@BeforeClass
	public static void launchUrl() {
		launchChrome();
		getUrl("https://adactinhotelapp.com/");
		maximize();
		sleep(3000);
	}

	@Before
	public void time() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void Tc001() {
		xpathSend("//input[@id='username']", "manoj61988");
		xpathSend("//input[@id='password']", "Krish@61988");
		// xpathClick("//input[@id='login']");
		sleep(3000);
	}

	@Test
	public void Tc002() {
		xpathClick("//input[@id='login']");
	}

	@Test
	public void Tc003() throws IOException {
		String dataFromExcel = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 1);
		xpathSend("//select[@id='location']", dataFromExcel);
		String dataFromExcel1 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 2);
		xpathSend("//select[@id='hotels']", dataFromExcel1);
		String dataFromExcel2 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 3);
		xpathSend("//select[@id='room_type']", dataFromExcel2);
		String dataFromExcel3 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 4);
		xpathSend("//select[@id='room_nos']", dataFromExcel3);
		// String dataFromExcel4 = a.getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 5);
		xpathSend("//input[@value='23/03/2022']", "23/03/2022");
		// String dataFromExcel5 = a.getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 6);
		xpathSend("//input[@value='24/03/2022']", "24/03/2022");
		String dataFromExcel6 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 7);
		xpathSend("//select[@id='adult_room']", dataFromExcel6);
		String dataFromExcel7 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 8);
		xpathSend("//select[@id='child_room']", dataFromExcel7);
		// xpathClick("//input[@id='Submit']");
		sleep(3000);
	}

	@Test
	public void Tc004() {
		xpathClick("//input[@id='Submit']");
	}

	@Test
	public void Tc005() {
		xpathClick("//input[@id='radiobutton_0']");
		// xpathClick("//input[@id='continue']");
		sleep(3000);
	}

	@Test
	public void Tc006() {
		xpathClick("//input[@id='continue']");
	}

	@Test
	public void Tc007() throws IOException {
		String dataFromExcel8 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 9);
		xpathSend("//input[@id='first_name']", dataFromExcel8);
		String dataFromExcel9 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 10);
		xpathSend("//input[@id='last_name']", dataFromExcel9);
		String dataFromExcel10 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 12);
		xpathSend("//input[@id='cc_num']", dataFromExcel10);
		String dataFromExcel11 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 13);
		xpathSend("//input[@id='cc_cvv']", dataFromExcel11);
		String dataFromExcel12 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 11);
		xpathSend("//textarea[@id='address']", dataFromExcel12);
		String dataFromExcel13 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 14);
		xpathSend("//select[@id='cc_type']", dataFromExcel13);
		String dataFromExcel14 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 15);
		xpathSend("//select[@id='cc_exp_month']", dataFromExcel14);
		String dataFromExcel15 = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\adascr1.xlsx",1, 16);
		xpathSend("//select[@id='cc_exp_year']", dataFromExcel15);
		// xpathClick("//input[@id='book_now']");
		sleep(8000);
	}

	@Test
	public void Tc008() {
		xpathClick("//input[@id='book_now']");
	}

	@After
	public void after() {
		Date date = new Date();
		System.out.println(date);
		String methodName = testName.getMethodName();
		screenshot("D:\\Krishna\\JAVA\\Krishna\\ScreenShots\\" + methodName);
	}

	@AfterClass
	public static void afterClass() {
		// driver.close();
	}

}
