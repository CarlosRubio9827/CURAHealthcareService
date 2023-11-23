package com.prueba.co.steps.logout;

import com.prueba.co.pages.logout.LogoutPage;
import net.thucydides.core.annotations.Step;

public class LogoutStep extends LogoutPage {

    @Step("Click on the hamburger menu")
    public void clickMenuHamburguer() {
        try {
            buttonMenu.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step("Click on Logout")
    public void clickLogout() {
        try {
            buttonLogout.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
