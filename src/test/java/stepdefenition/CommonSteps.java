package stepdefenition;

import org.openqa.selenium.logging.Logs;

import base.TestBase;
import reporting.Log;
import io.cucumber.java.en.Given;

public class CommonSteps extends TestBase{

	@Given("say hello!")
	public void say_hello() {
	    Log.log("Hello Everyone!. I hope every is doing well");
	}
	/*
	@Given("user title is <{string}>")
	public void user_title_is(String title) {
		homePage.getTitlevalidation(title);	
	}
	*/
}

