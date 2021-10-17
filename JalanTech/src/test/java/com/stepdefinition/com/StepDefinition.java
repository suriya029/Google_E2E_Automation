package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.PomClass.org.Search1;
import com.PomClass.org.Search2;
import com.PomClass.org.Search3;
import com.PomClass.org.Search4;
import com.PomClass.org.Search5;
import com.PomClass.org.Search6;
import com.PomClass.org.Search7;
import com.PomClass.org.Search8;
import com.baseclass.com.BaseClass1;
import com.runner.com.RunnerClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass1{
	public static WebDriver driver = RunnerClass.driver;
	
	BaseClass1 b = new BaseClass1();
	Search1 s = new Search1(driver);
	Search2 s2 = new Search2(driver);
	Search3 s3 = new Search3(driver);
	Search4 s4 = new Search4(driver);
	Search5 s5 = new Search5(driver);
	Search6 s6 = new Search6(driver);
	Search7 s7 = new Search7(driver);
	Search8 s8 = new Search8(driver);
	@Given("^User has to navigate to google site$")
	public void user_has_to_navigate_to_google_site() throws Throwable {
	  launchWebsite("https://www.google.co.in/");
	  maxBrowser();
	 
	}

	@When("^user has to click the text box$")
	public void user_has_to_click_the_text_box() throws Throwable {
	    ClickOnElement(s.getSearchText());
	    Thslp(3000);
	}
	

	@When("^User has to enter any text$")
	public void user_has_to_enter_any_text() throws Throwable {
	    InputValues(s.getSearchText(), "hello");
	    Thslp(3000);
	}
	
	@When("^User has to enter any special characters$")
	public void user_has_to_enter_any_special_characters() throws Throwable {
	 InputValues(s.getSearchText(), "!#$%&'(@)*+,- ");

	}
	

@When("^User has to enter a text in search box$")
public void user_has_to_enter_a_text_in_search_box() throws Throwable {
    InputValues(s2.getSearchText(), "youtube");
    Thslp(1000);
}

@When("^User has to click on the 'Search' button$")
public void user_has_to_click_on_the_Search_button1() throws Throwable {
    ClickOnElement(s2.getGsearchButn());
}
@Then("^Searched relevant results must be returned$")
public void searched_relevant_results_must_be_returned() throws Throwable {
    PrintTitle();
}
@Given("^User has to navigate back to google site$")
public void user_has_to_navigate_back_to_google_site() throws Throwable {
    GoBack();
}

@When("^User has to enter a misspelt text in search box$")
public void user_has_to_enter_a_misspelt_text_in_search_box() throws Throwable {
    InputValues(s2.getSearchText(), "Amazno");
    Thslp(1000);
}

@When("^User has to click on the 'Search' button\\.$")
public void user_has_to_click_on_the_Search_button11() throws Throwable {
    ClickOnElement(s3.getGsearchButn());
}

@Then("^Searched corrected results must be returned$")
public void searched_corrected_results_must_be_returned() throws Throwable {
  System.out.println();
	PrintTextFromElement(s3.getPrtText());
  Thslp(1000);
}
@Given("^User has to enter an invalid keyword$")
public void user_has_to_enter_an_invalid_keyword() throws Throwable {
  clrText(s4.getSearText());
  Thslp(1000);
	InputValues(s4.getSearText(), "dwtedwtyedvytwefvgs"); 
}

@When("^User has to click on the 'Search ' button$")
public void user_has_to_click_on_the_Search_button() throws Throwable {
    ClickOnElement(s4.getSearBtn());
}

@Then("^'No result found' page must be displayed$")
public void no_result_found_page_must_be_displayed() throws Throwable {
   System.out.println();
	PrintTextFromElement(s4.getResOtp());
}
@Given("^User has to click on 'Google' logo to navigate to main page$")
public void user_has_to_click_on_Google_logo_to_navigate_to_main_page() throws Throwable {
    ClickOnElement(s5.getImgNav());
    Thslp(1000);
}
@When("^User has to enter a valod text in search bar$")
public void user_has_to_enter_a_valod_text_in_search_bar() throws Throwable {
    InputValues(s5.getTextBox(), "Amazon");
}

@Then("^User has to tap 'I’m feeling Lucky' button$")
public void user_has_to_tap_I_m_feeling_Lucky_button() throws Throwable {
    Thslp(1000);
	ClickOnElement(s5.getFellLuckyBtn());
}

@And("^verify whether desired page is displayed$")
public void verify_whether_desired_page_is_displayed() throws Throwable {
    System.out.println();
	PrintTitle();
}

@Given("^User must be at 'Google home page'$")
public void user_must_be_at_Google_home_page() throws Throwable {
GoBack();
}

@When("^User must tap in 'Gmail' text$")
public void user_must_tap_in_Gmail_text() throws Throwable {
    ClickOnElement(s6.getGmail());
}

@Then("^verify whether user in in gmail site$")
public void verify_whether_user_in_in_gmail_site() throws Throwable {
   System.out.println();
	PrintTitle();
}

@Given("^User must be at 'Google homepage'$")
public void user_must_be_at_Google_homepage() throws Throwable {
   GoBack();
}

@When("^User must tap in 'Sign-in' text$")
public void user_must_tap_in_Sign_in_text() throws Throwable {
    ClickOnElement(s7.getSignIn());
}

@Then("^verify whether user in in 'Sign-in' page$")
public void verify_whether_user_in_in_Sign_in_page() throws Throwable {
    System.out.println();
    PrintTitle();
}
@Given("^User must be in google homepage\\.$")
public void user_must_be_in_google_homepage() throws Throwable {
    GoBack();
}

@When("^User must enter any search string$")
public void user_must_enter_any_search_string() throws Throwable {
	InputValues(s2.getSearchText(), "Smiley");
	Thslp(1000);
}

@When("^User must press search tab$")
public void user_must_press_search_tab() throws Throwable {
	ClickOnElement(s3.getGsearchButn());
	Thslp(1000);
}

@When("^User must tap 'Images' tab$")
public void user_must_tap_Images_tab() throws Throwable {
    ClickOnElement(s8.getImgs());
    Thslp(1000);
}

@When("^User must tap 'Shopping' tab$")
public void user_must_tap_Shopping_tab() throws Throwable {
   ClickOnElement(s8.getShping());
   Thslp(1000);
}

@When("^User must tap 'News' tab$")
public void user_must_tap_News_tab() throws Throwable {
    
    ClickOnElement(s8.getNews());
    Thslp(1000);
}

@Then("^User must tap 'Videos' tab$")
public void user_must_tap_Videos_tab() throws Throwable {
	ClickOnElement(s8.getVideos());
	Thslp(1000);
}





}
