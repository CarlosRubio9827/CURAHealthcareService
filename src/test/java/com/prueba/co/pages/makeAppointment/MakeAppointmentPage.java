package com.prueba.co.pages.makeAppointment;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MakeAppointmentPage extends PageObject {

    @FindBy(xpath = "//select[@id='combo_facility']")
    protected WebElementFacade selectFacility;

    @FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
    protected WebElementFacade checkReadmission;


    @FindBy(xpath = "//input[@id='radio_program_medicare']")
    protected WebElementFacade inputHealthProgramMedicare;

    @FindBy(xpath = "//input[@id='radio_program_medicaid']")
    protected WebElementFacade inputHealthProgramMedicaid;

    @FindBy(xpath = "//input[@id='radio_program_none']")
    protected WebElementFacade inputHealthProgramNone;


    @FindBy(xpath = "//input[@id='txt_visit_date']")
    protected WebElementFacade dateVisitDate;

    @FindBy(xpath = "//textarea[@id='txt_comment']")
    protected WebElementFacade textareaComments;


    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    protected WebElementFacade buttonSend;

}
