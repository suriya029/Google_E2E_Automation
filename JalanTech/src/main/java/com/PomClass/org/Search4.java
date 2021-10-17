package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search4 {
	public static WebDriver driver;
	@FindBy(name="q")
	private WebElement searText;

	public Search4(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver2, this);

	}

	public WebElement getSearText() {
		return searText;
	}

	public WebElement getSearBtn() {
		return searBtn;
	}

	public WebElement getResOtp() {
		return resOtp;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement searBtn;
	
	@FindBy(xpath="//div[@id='res']")
	private WebElement resOtp;
}
