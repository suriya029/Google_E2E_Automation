package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search6 {
	public static WebDriver driver;
	@FindBy(xpath="//a[.='Gmail'][1]")
	private WebElement gmail;
	public Search6(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getGmail() {
		return gmail;
	}
}
