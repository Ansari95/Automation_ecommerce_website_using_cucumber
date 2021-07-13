package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.runnerclass.Ruunerclass;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class ChooseDressandPlacedOrder {

	public static WebDriver driver = Ruunerclass.driver;
	
			
			@When("^user go to women section$")
			public void user_go_to_women_section() throws Throwable {
				
				WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])"));
				Actions ac = new Actions(driver);
				ac.moveToElement(women).build().perform();
				}
			   
			@When("^user choose t shirt$")
			public void user_choose_t_shirt() throws Throwable {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])"));
				Actions ac = new Actions(driver);
				ac.moveToElement(tshirt).click().build().perform();
				
			}

			@When("^user click add to card$")
			public void user_click_add_to_card() throws Throwable {
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.linkText("Add to cart")).click();
			}

			@When("^user click proceed to checkout$")
			public void user_click_proceed_to_checkout() throws Throwable {
				driver.findElement(By.xpath("(//span[@class='cross'])")).click();
				driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]")).click();
				driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
			  
			}

			@When("^user click proceed to sinin$")
			public void user_click_proceed_to_sinin() throws Throwable {
			  
				
				
			}

			@When("^user click proceed to Address$")
			public void user_click_proceed_to_Address() throws Throwable {
			 
				driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();
			}

			@When("^user click proceed to shipping and agree terms and conditions$")
			public void user_click_proceed_to_shipping_and_agree_terms_and_conditions() throws Throwable {
			   
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
				driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
			}

			@When("^user click proceed to payment$")
			public void user_click_proceed_to_payment() throws Throwable {
			    
				driver.findElement(By.xpath("(//a[@class='cheque'])")).click();
			}

			@When("^user confirm the order$")
			public void user_confirm_the_order() throws Throwable {
			
				driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
			}

			@Then("^user should be order$")
			public void user_should_be_order() throws Throwable {
			 
				WebElement ordersucess = driver.findElement(By.xpath("(//p[@class='alert alert-success'])"));
				String text = ordersucess.getText();
				
				System.out.println(text);
				
				Assert.assertEquals(text,"Your order on My Store is complete.");
				
				if(text.equals("Your order on My Store is complete.")) {
					
					System.out.println("order sucessfull");
				}
				
			}


	
}
