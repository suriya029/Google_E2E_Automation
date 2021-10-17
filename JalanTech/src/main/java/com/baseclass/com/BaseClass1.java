package com.baseclass.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;

		public static WebDriver browserLaunch(String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver",
					//"C:\\Users\\suriyamz\\eclipse-workspace\\AdactinCucumber.org\\driver2\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Msedge")) {
//			System.setProperty("webdriver.edge.driver",
//					"C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\msedgedriver.exe");
            WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser name");
		}
		return driver;
	}
		
	public static void launchWebsite(String y) {
		driver.get(y);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void InputValues(WebElement a, String b) {
		a.sendKeys(b);
	}

	public static void ClickOnElement(WebElement a) {
		a.click();
	}

	public static void PrintTextFromElement(WebElement v) {
		String text = v.getText();
		System.out.println(text);
	}

	public static void SelDropInt(WebElement c, int y) {
		Select a = new Select(c);
		a.selectByIndex(y);
	}

	public static void SelByVal(WebElement v, String l) {
		Select d = new Select(v);
		d.selectByValue(l);
	}

	public static void moveCursor(WebElement p) {
		Actions a = new Actions(driver);
		a.moveToElement(p).perform();
	}

	public static void rightClick(WebElement l) {
		Actions a = new Actions(driver);
		a.moveToElement(l).perform();
	}

	public static void waitforLoad(int a) throws Throwable {
		driver.manage().timeouts().wait(a);
	}

	public static void Thslp(int a) throws InterruptedException {
		Thread.sleep(a);

	}

	public static void GoBack() {
		driver.navigate().back();
	}

	public static void PrintTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void clrText(WebElement a) {
		a.clear();
	}
public static void screenShot(String Filename) throws Throwable {
	TakesScreenshot ss = (TakesScreenshot) driver;
	File f = ss.getScreenshotAs(OutputType.FILE);
	File dest = new File(System.getProperty("user.dir")+"/ScreenShot/"+Filename+".png");
	FileUtils.copyFileToDirectory(f, dest);
}
}
