package com.prueba.co.definitions.login;

import com.prueba.co.steps.login.LoginStep;
import com.prueba.co.steps.validations.ValidationStep;
import com.prueba.co.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDefinition {

    @Steps(shared = true)
    WebSite webSite;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validation;

    @Given("the user navigates to the website")
    public void userNavigatesToWebsite(){
        webSite.navigateTo("https://katalon-demo-cura.herokuapp.com/");
    }


    @And("clicks on Make Appointment")
    public void userClicksOnMakeAppointment(){
        login.clickAppointment();
    }


    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        login.enterUsername("John Doe");
        login.enterPassword("ThisIsNotAPassword");
        login.submitForm();
    }

    @Then("the system should display the appointment form")
    public void systemShouldDisplayAppointmentForm() {
        Assert.assertTrue(validation.isLoginSuccessful());
    }

    @When("the user enters invalid credentials")
    public void userEntersInvalidCredentials(){
        login.enterUsername("John Fail");
        login.enterPassword("ThisIsNotAPassword");
        login.submitForm();
    }

    @Then("the system displays an error message")
    public void systemDisplaysErrorMessage() {
        Assert.assertTrue(validation.isLoginFailedDisplayed());
    }

}
