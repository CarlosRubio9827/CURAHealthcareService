package com.prueba.co.steps.makeappointment;

import com.prueba.co.pages.makeAppointment.MakeAppointmentPage;
import net.thucydides.core.annotations.Step;

public class MakeAppointmentStep extends MakeAppointmentPage {


    @Step("User select facility")
    public void selectFacility(String facility) {
        try {

            switch (facility) {
                case "Tokio":
                    selectFacility.select().byValue("Tokyo CURA Healthcare Center");
                    break;
                case "HonkKong":
                    selectFacility.select().byValue("Hongkong CURA Healthcare Center");
                    break;
                case "Seoul":
                    selectFacility.select().byValue("Seoul CURA Healthcare Center");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Step("User select readmission")
    public void selectReadmission() {
        try {
            checkReadmission.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step("User select health care program")
    public void selectHealthCareProgram(String healthProgram) {
        try {
            switch (healthProgram) {
                case "Medicare":
                    inputHealthProgramMedicare.click();
                    break;
                case "Medicaid":
                    inputHealthProgramMedicaid.click();
                    break;
                case "None":
                    inputHealthProgramNone.click();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Step("User select visit date")
    public void selectVisitDate(String date) {
        try {
            dateVisitDate.sendKeys(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step("User add comments")
    public void addComments(String comments) {
        try {
            textareaComments.sendKeys(comments);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step("User send form")
    public void sendForm() {
        try {
            buttonSend.click();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
