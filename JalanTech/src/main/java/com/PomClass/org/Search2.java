package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search2 {
	public static WebDriver driver;
	
	@FindBy(name="btnK")
	private WebElement GsearchButn;
	@FindBy(xpath="//input[@name='q']")
	private WebElement SearchText;

	public WebElement getSearchText() {
		return SearchText;
	}

	public Search2(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
	}

	public WebElement getGsearchButn() {
		return GsearchButn;
	}

}
