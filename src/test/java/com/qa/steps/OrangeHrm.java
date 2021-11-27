package com.qa.steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {
		
		WebDriver driver;
		
		@Given("as a user we launch a particular url {string}")
		public void as_a_user_we_launch_a_particular_url(String url) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.get(url);
			
			driver.manage().window().maximize();
			
		}

		@When("as a user we send the username {string} and password {string}")
		public void as_a_user_we_send_the_username_and_password(String username , String password) {
	        
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			
			driver.findElement(By.id("txtPassword")).sendKeys(password);
		}
		
		@And("as a user we click the login button")
		public void as_a_user_we_click_the_login_button() {
			
			driver.findElement(By.id("btnLogin")).click();
			
		}
		
		@Then("as a user verifying the given title and url")
		public void as_a_user_verifying_the_given_title_and_url() {
			
			if(driver.getTitle().equals("OrangeHRM") && driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")){
				
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
				
			}
		}
	}


