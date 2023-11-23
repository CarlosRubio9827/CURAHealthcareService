package com.prueba.co.utilities.website;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class WebSite {

    @Steps(shared=true)
    PageObject test;

    @Step("Navegar al sitio Web")
    public void navigateTo(String url){
        test.setDefaultBaseUrl(url);
        test.open();
    }

}
