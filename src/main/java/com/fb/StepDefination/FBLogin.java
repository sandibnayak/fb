package com.fb.StepDefination;

import java.util.List;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;

public class FBLogin {
	@Given("User should in Login Home Page")
	public void user_should_in_Login_Home_Page() {
		System.out.println("Given Block");
	}

	@When("User have pass the user ID <user_id> and password<pass>")
	public void user_have_pass_the_user_ID_user_id_and_password_pass(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<String> d = dataTable.asList();
		System.out.println("When Block");
		System.out.println(dataTable);
		System.out.println("1st data" + d.get(0) + "2nd Data" + d.get(1));
	}

	@When("User need to click the login button")
	public void user_need_to_click_the_login_button() {
		System.out.println("And Block");
	}

	@Then("Need to check user in fb Home Page")
	public void need_to_check_user_in_fb_Home_Page() {
		System.out.println("Then Block");
	}

}
