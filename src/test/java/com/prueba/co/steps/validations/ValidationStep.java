package com.prueba.co.steps.validations;

import com.prueba.co.pages.validations.ValidationsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationsPage {

    @Step("Validar si el login fue exitoso")
    public boolean isLoginSuccessful(){
        try {
            return labelMakeAppointment.isDisplayed();
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Step("Validar mensaje de login fallido")
    public boolean isLoginFailedDisplayed(){

        try {
            return labelLoginFailed.isDisplayed();
        }  catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Step("Validar usuario cerro sesion correctamente")
    public boolean isUserLogoutSuccessful(){
        try {
            return labelLogin.isDisplayed();
        }  catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Step("Validar que la reserva de la cita realizó correctamente")
    public boolean isAppointmentConfirmationDisplayed(){
        try {
            return labelAppointmentConfirmation.isDisplayed();
        }  catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



}
