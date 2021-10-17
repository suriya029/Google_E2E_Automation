package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search7 {
	public static WebDriver driver;
	@FindBy(xpath="//a[.='Sign in']")
	private WebElement signIn;
	
	public Search7(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
	}

	public WebElement getSignIn() {
		return signIn;
	}


}
