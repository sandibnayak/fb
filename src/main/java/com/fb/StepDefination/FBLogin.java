package com.fb.StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FBLogin {
	static WebDriver driver;

	@Given("User should in Login Home Page")
	public WebDriver user_should_in_Login_Home_Page() {
		System.out.println("Given Block");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SANDIB KUMAR NAYAK\\eclipse-workspace\\CucumberClass\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		return driver;
		
	}

	@When("User have pass the user id and password")
	public void user_have_pass_the_user_ID_user_id_and_password_pass() {
		System.out.println("When Block");
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("pass");

	}

	@When("User need to click the login button")
	public void user_need_to_click_the_login_button() {
		System.out.println("And Block");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
	}

	@Then("Need to check user in fb Home Page")
	public void need_to_check_user_in_fb_Home_Page() throws InterruptedException {
		System.out.println("Then Block");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		WebElement df = driver.findElement(By.xpath("//span[text()=\"Log in to Facebook\"]"));
		String rt = df.getText();
		String r="Log in to Facebook";
		System.out.println(rt);
	}

}
