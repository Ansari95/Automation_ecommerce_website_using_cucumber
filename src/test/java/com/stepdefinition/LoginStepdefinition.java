package com.stepdefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runnerclass.Ruunerclass;

import cucumber.api.java.en.*;

public class LoginStepdefinition {

	public static WebDriver driver = Ruunerclass.driver;
	
	

@Given("^user enter url of automation website$")
public void user_enter_url_of_automation_website() throws Throwable {
    
	
	driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	
}

@When("^user click sign in buttton$")
public void user_click_sign_in_buttton() throws Throwable {
   
	driver.findElement(By.xpath("(//a[@title='Log in to your customer account'])")).click();

}


@When("^user enter as email id \"([^\"]*)\"$")
public void user_enter_as_email_id(String arg1) throws Throwable {
	
	driver.findElement(By.id("email_create")).sendKeys(arg1);
    
}

@When("^user click creat account button$")
public void user_click_creat_account_button() throws Throwable {
	
    driver.findElement(By.xpath("//i[@class='icon-user left']")).click();

}
}