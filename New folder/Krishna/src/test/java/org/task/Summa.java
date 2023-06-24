package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Summa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hmh5l8jr5_e&adgrpid=61764313147&hvpone=&hvptwo=&hvadid=486381533661&hvpos=&hvnetw=g&hvrand=3979800592726052790&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007804&hvtargid=kwd-327061083&hydadcr=14455_2154377&gclid=Cj0KCQjw3v6SBhCsARIsACyrRAlZ4z5vg6Zf0MaFMVpuljLI5E9vNsWYuGgkO84kubObvLM3Ub6p9i8aAiVLEALw_wcB");
		driver.manage().window().maximize();
		
	}

}
