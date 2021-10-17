package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search3 {
public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='btnK']")
	private WebElement GsearchButn;

@FindBy(id="fprs")
private WebElement prtText;

	public WebElement getPrtText() {
	return prtText;
}



	public Search3(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
	}



	public WebElement getGsearchButn() {
		return GsearchButn;
	}
}
