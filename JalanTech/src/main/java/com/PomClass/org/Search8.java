package com.PomClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search8 {
	public static WebDriver driver;
	@FindBy(xpath="//a[.='Images']")
private WebElement imgs;
	public Search8(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
	}
	public WebElement getImgs() {
		return imgs;
	}
	public WebElement getShping() {
		return shping;
	}
	public WebElement getNews() {
		return news;
	}
	public WebElement getVideos() {
		return videos;
	}
	@FindBy(xpath="//a[.='Books']")
	private WebElement shping;
	@FindBy(xpath="//a[.='News']")
	private WebElement news;
	@FindBy(xpath="//a[.='Videos']")
	private WebElement videos;
}
