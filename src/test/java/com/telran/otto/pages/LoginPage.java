package com.telran.otto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static By formHeader = By.cssSelector("[data-qa='user_login_form_headline']");
    private static By emailInput = By.cssSelector("[data-qa='user_login_email']");
    private static By passwordInput = By.cssSelector("[data-qa='user_login_password']");
    private static By buttonSubmit = By.cssSelector("[data-qa='user_dialog_submit_button']");
    private static String username = "04scouter.scrawl@icloud.com";
    private static String password = "sumcap-7jYqko-sibjid";
    public SelenideElement formIsShown() {
        return $(formHeader);
    }
    public void validAuth() {
        $(emailInput).val(username);
        $(passwordInput).val(password);
    }
    public void submit() {
        $(buttonSubmit).click();
    }
}
