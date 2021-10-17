package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search1 {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='q']")
			private WebElement SearchText;
	public Search1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSearchText() {
		return SearchText;
	}
	@FindBy(name="btnK")
	private WebElement GsearchButn;
	public WebElement getGsearchButn() {
		return GsearchButn;
	}

}
