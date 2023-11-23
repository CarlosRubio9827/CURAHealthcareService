package com.prueba.co.definitions.makeAppointment;

import com.prueba.co.steps.makeappointment.MakeAppointmentStep;
import com.prueba.co.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class MakeAppointmentDefinition {

    @Steps(shared = true)
    MakeAppointmentStep makeAppointmentStep;


    @Steps(shared = true)
    ValidationStep validationStep;

    @Steps(shared = true)
    ValidationStep validation;
    @And("the user selects the facility {string}")
    public void selectFacilityDef(String facility) {
        makeAppointmentStep.selectFacility(facility);
    }

    @And("selects the healthcare program {string}")
    public void selectHealthcareProgramDef(String healthcareProgram) {
        makeAppointmentStep.selectHealthCareProgram(healthcareProgram);
    }

    @And("selects hospital readmission")
    public void selectReadmissionDef() {
        makeAppointmentStep.selectReadmission();
    }

    @And("selects the visit date {string}")
    public void selectVisitDateDef(String visitDate) {
        makeAppointmentStep.selectVisitDate(visitDate);
    }


    @And("adds comments {string}")
    public void addCommentsDef(String comments) {
        makeAppointmentStep.addComments(comments);
    }

    @And("clicks the submit button")
    public void clicSendForm() {
        makeAppointmentStep.sendForm();
    }


    @Then("the system displays the appointment confirmation")
    public void isDisplayeAppointmentConfirmation() {
        Assert.assertTrue(validationStep.isAppointmentConfirmationDisplayed());
    }
}
