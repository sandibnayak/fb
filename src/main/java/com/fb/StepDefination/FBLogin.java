package com.fb.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FBLogin {
	static WebDriver driver;

	@Given("User should in Login Home Page")
	public void user_should_in_Login_Home_Page() {
		System.out.println("Given Block");
		System.setProperty("wedriver.chrome.driver",
				"C:\\Users\\SANDIB KUMAR NAYAK\\eclipse-workspace\\CucumberClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User have pass the user id and password")
	public void user_have_pass_the_user_ID_user_id_and_password_pass() {
		System.out.println("When Block");
		driver.findElement(By.name("email")).sendKeys("abcd");
		driver.findElement(By.name("pass")).sendKeys("pass");

	}

	@When("User need to click the login button")
	public void user_need_to_click_the_login_button() {
		System.out.println("And Block");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
	}

	@Then("Need to check user in fb Home Page")
	public void need_to_check_user_in_fb_Home_Page() {
		System.out.println("Then Block");
		String rt = driver.findElement(By.xpath("//span[text()=\"Log in to Facebook\"]")).getText();
	Assert.assertEquals("Log in to Facebook", rt);
	}

}
