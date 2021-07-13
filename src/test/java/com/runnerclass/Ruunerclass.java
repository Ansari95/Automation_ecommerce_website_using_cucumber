package com.runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\automationpractice\\feature",glue="com\\stepdefinition",
				monochrome = true)

public class Ruunerclass {
	
	public static WebDriver driver;
	@BeforeClass
	public static void browserLanch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\firstProject\\driverfolder\\chromedriver.exe");
		driver = new ChromeDriver();
	
	}


}
