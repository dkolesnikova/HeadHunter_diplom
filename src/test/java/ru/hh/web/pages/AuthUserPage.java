package ru.hh.web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthUserPage {
    SelenideElement
            loginButton = $x("//*[@href=\"/account/login?backurl=%2F&hhtmFrom=main\"]"),
            emailInput = $(".bloko-form-item");

    public AuthUserPage openAuthUserWindow() {
        loginButton.click();
        return this;
    }

    public AuthUserPage setEmail() {
        emailInput.setValue("dkolesnikova1999@bk.ru");

        return this;
    }
}
