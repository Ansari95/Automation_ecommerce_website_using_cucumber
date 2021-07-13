package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runnerclass.Ruunerclass;

import cucumber.api.java.en.*;
import cucumber.api.java.lu.a;

public class CreateAccoundStepdefinition {

	public static WebDriver driver = Ruunerclass.driver;

@When("^user click ratio button$")
public void user_click_ratio_button() throws Throwable {
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.name("id_gender")).click();
    
}

@When("^user send firstname as \"([^\"]*)\" and lastname as \"([^\"]*)\"$")
public void user_send_firstname_as_and_lastname_as(String arg1, String arg2) throws Throwable {

	driver.findElement(By.id("customer_firstname")).sendKeys(arg1);
	driver.findElement(By.id("customer_lastname")).sendKeys(arg2);
}


@When("^user set the password as \"([^\"]*)\"$")
public void user_set_the_password_as(String arg1) throws Throwable {
 driver.findElement(By.id("passwd")).sendKeys(arg1);
}

@When("^user set the dat of birth$")
public void user_set_the_dat_of_birth() throws Throwable {
	
	
 WebElement date = driver.findElement(By.id("days"));
   Select sc = new Select(date);
   sc.selectByValue("3");
   
   WebElement month = driver.findElement(By.id("months"));
   Select sc1 = new Select(month);
   sc1.selectByValue("3");
   
   WebElement years = driver.findElement(By.id("years"));
   Select sc2 = new Select(years);
   sc2.selectByValue("1996");
}

@When("^user click Sign up for our newsletter!$")
public void user_click_Sign_up_for_our_newsletter() throws Throwable {
	
	driver.findElement(By.id("newsletter")).click();
	
 
}

@When("^user click Receive special offers from our partners$")
public void user_click_Receive_special_offers_from_our_partners() throws Throwable {
  
	driver.findElement(By.id("optin")).click();
}

@When("^user enter first name \"([^\"]*)\" and lastname as \"([^\"]*)\"$")
public void user_enter_first_name_and_lastname_as(String arg1, String arg2) throws Throwable {
   
	driver.findElement(By.id("firstname")).sendKeys(arg1);
	driver.findElement(By.id("lastname")).sendKeys(arg2);
}

@When("^user enter company name as \"([^\"]*)\"$")
public void user_enter_company_name_as(String arg1) throws Throwable {
	
	driver.findElement(By.id("company")).sendKeys(arg1);
   
}

@When("^user enter address as \"([^\"]*)\"$")
public void user_enter_address_as(String arg1) throws Throwable {
   
	driver.findElement(By.id("address1")).sendKeys(arg1);
}

@When("^user enter addrss line(\\d+) \"([^\"]*)\"$")
public void user_enter_addrss_line(int arg1, String arg2) throws Throwable {
  
driver.findElement(By.id("address2")).sendKeys(arg2);
	
}

@When("^user enter city as \"([^\"]*)\"$")
public void user_enter_city_as(String arg1) throws Throwable {
  
	driver.findElement(By.id("city")).sendKeys(arg1);
}

@When("^user choose state$")
public void user_choose_state() throws Throwable {
    
	WebElement state = driver.findElement(By.id("id_state"));
	Select sc = new Select(state);
	sc.selectByValue("3");
}

@When("^user enter posta code as \"([^\"]*)\"$")
public void user_enter_posta_code_as(String arg1) throws Throwable {
   
	driver.findElement(By.id("postcode")).sendKeys(arg1);
}

@When("^user choose country$")
public void user_choose_country() throws Throwable {
   
	WebElement country = driver.findElement(By.id("id_country"));
	Select sc = new Select(country);
	sc.selectByValue("21");
}

@When("^user enter additiona information as \"([^\"]*)\"$")
public void user_enter_additiona_information_as(String arg1) throws Throwable {
  
	driver.findElement(By.id("other")).sendKeys(arg1);
}

@When("^enter mobile number as \"([^\"]*)\"$")
public void enter_mobile_number_as(String arg1) throws Throwable {
   
	driver.findElement(By.id("phone_mobile")).sendKeys(arg1);
}

@When("^user enter assign an address alias  as \"([^\"]*)\"$")
public void user_enter_assign_an_address_alias_as(String arg1) throws Throwable {
   
	driver.findElement(By.id("alias")).sendKeys(arg1);
}

@When("^user click register button$")
public void user_click_register_button() throws Throwable {
   
	driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
}

@Then("^user should be register succesfully$")
public void user_should_be_register_succesfully() throws Throwable {
 
	
}
	
	
}
