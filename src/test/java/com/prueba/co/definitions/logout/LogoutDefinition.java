package com.prueba.co.definitions.logout;

import com.prueba.co.steps.logout.LogoutStep;
import com.prueba.co.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LogoutDefinition {

    @Steps(shared = true)
    LogoutStep logout;

    @Steps(shared = true)
    ValidationStep validation;

    @Given("el usuario esta autenticado")
    public void isUsuarioAtenticado(){
        Assert.assertTrue(validation.isLoginSuccessful());
    }

    @When("the user logs out")
    public void userLogsOut(){
        logout.clickMenuHamburguer();
        logout.clickLogout();
    }

    @Then("the system displays the login page")
    public void systemDisplaysLoginPage(){
        logout.clickMenuHamburguer();
        Assert.assertTrue(validation.isUserLogoutSuccessful());
    }


}
