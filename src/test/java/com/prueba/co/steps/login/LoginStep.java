package com.prueba.co.steps.login;

import com.prueba.co.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Click on Make Appointment")
    public void clickAppointment(){
        try {
            buttonMakeAppointment.click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Step("Enter Username: {0}")
    public void enterUsername(String userName){
        try {
            inputUsername.sendKeys(userName);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Step("Enter Password: {0}")
    public void enterPassword(String password){
        try {
            inputPassword.sendKeys(password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Step("Submit Form")
    public void submitForm(){
        try {
            buttonSubmit.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
