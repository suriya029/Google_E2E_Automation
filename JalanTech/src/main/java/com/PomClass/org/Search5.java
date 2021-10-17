package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search5 {
	public static WebDriver driver;
@FindBy(xpath="//img[@title='Get Vaccinated. Wear a Mask. Save Lives.']")
private WebElement imgNav;
public Search5(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
}
public WebElement getImgNav() {
	return imgNav;
}
public WebElement getTextBox() {
	return textBox;
}
public WebElement getFellLuckyBtn() {
	return fellLuckyBtn;
}
@FindBy(name="q")
private WebElement textBox;
@FindBy(name="btnI")
private WebElement fellLuckyBtn;


}
