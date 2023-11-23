package com.prueba.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//a[@id='btn-make-appointment']")
    protected WebElementFacade buttonMakeAppointment;

    @FindBy(xpath = "//input[@id='txt-username']")
    protected WebElementFacade inputUsername;

    @FindBy(xpath = "//input[@id='txt-password']")
    protected WebElementFacade inputPassword;

    @FindBy(xpath = "//button[@id='btn-login']")
    protected WebElementFacade buttonSubmit;


}
