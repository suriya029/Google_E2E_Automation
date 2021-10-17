package com.runner.com;

import java.sql.Driver;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featureCucum\\org", glue = "com.stepdefinition.com", 
plugin = {"pretty","html:google_e2e_report"} )
public class RunnerClass {

public static WebDriver driver;
@BeforeClass
public static void brow() {
driver = BaseClass1.browserLaunch("Chrome");

	
}


}
