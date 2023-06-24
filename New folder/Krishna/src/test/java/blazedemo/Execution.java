package blazedemo;

import java.io.IOException;

import org.task.BaseClass;

public class Execution extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException {
		launchChrome();
		getUrl("https://blazedemo.com/");
		maximize();
		
		
		Page1 page4= new Page1();
		String depa = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 0);
		String dest = getDataFromExcel("D:\\Krishna\\JAVA\\Krishna\\ExcelFiles\\flight.xlsx",0, 1);
		//sleep(3000);
		
//	
		page4.loginPage(depa,dest );
		Page2 p2 = new Page2();
		Page3 p3 = new Page3();
		Page4 p4 = new Page4();
		p2.page2();
		p3.page3();
		p4.page4();
	}
}
