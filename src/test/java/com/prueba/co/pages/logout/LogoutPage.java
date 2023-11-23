package com.prueba.co.pages.logout;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogoutPage extends PageObject {

    @FindBy(xpath = "//a[@id='menu-toggle']")
    protected WebElementFacade buttonMenu;

    @FindBy(xpath = "//a[text()='Logout']")
    protected WebElementFacade buttonLogout;

}
