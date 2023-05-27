package stepdefenition;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Autosteps extends TestBase{
	
	@Given("user title is <{string}>")
	public void user_title_is(String title) {
		homePage.getTitlevalidation(title);
	    
	}

	@Given("user clicks product")
	public void user_clicks_product() {
		homePage.productClick();
	    
	}

	@When("user insert zipcode <{string}>")
	public void user_insert_zipcode(String zipcode) {
		homePage.insertZipcodeclick(zipcode);
	    
	}

	@When("user clicks startAquote")
	public void user_clicks_start_aquote() {
		homePage.startAquoteClick();
	    
	}

	@Then("user is in personalPricePlan")
	public void user_is_in_personal_price_plan() {
		personalPricePlan.quoteTileValidation();
	}

	@When("user insert firstName <{string}>")
	public void user_insert_first_name(String firstName) {
		personalPricePlan.insertFirstName(firstName);
	   
	}

	@When("user insert middleName <{string}>")
	public void user_insert_middle_name(String middleName) {
		personalPricePlan.insertMiddleName(middleName);
	    
	}

	@When("user insert lastName <{string}>")
	public void user_insert_last_name(String lastName) {
		personalPricePlan.insertLastName(lastName);

	    
	}

	@When("user selects suffic <{string}>")
	public void user_selects_suffic(String suffix) {
		personalPricePlan.selectSuffix(suffix);

	    
	}

	@When("user insert address <{string}>")
	public void user_insert_address(String address) {
		personalPricePlan.insertAddress(address);	

	    
	}

	@When("user insert apartment <{string}>")
	public void user_insert_apartment(String apartment) {
		personalPricePlan.insertAparment(apartment);

	   
	}
	@When("user insert dateOfBirth <{string}>")
	public void user_insert_date_of_birth(String birthday) {
		personalPricePlan.insertDateOfBirth(birthday);

	   
	}


}
