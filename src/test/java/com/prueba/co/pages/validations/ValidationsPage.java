package com.prueba.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ValidationsPage extends PageObject {
    @FindBy(xpath = "//h2[text()='Make Appointment']")
    protected WebElementFacade labelMakeAppointment;

    @FindBy(xpath = "//p[@class='lead text-danger' and text()='Login failed! Please ensure the username and password are valid.']")
    protected WebElementFacade labelLoginFailed;

    @FindBy(xpath = "//a[text()='Login']")
    protected WebElementFacade labelLogin;

    @FindBy(xpath = "//h2[text()='Appointment Confirmation']")
    protected WebElementFacade labelAppointmentConfirmation;


}
