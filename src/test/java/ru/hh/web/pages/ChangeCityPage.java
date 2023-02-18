package ru.hh.web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ChangeCityPage {
    private SelenideElement cityPageTitle = $(".bloko-link_disable-visited");

    public ChangeCityPage checkChangeCity () {
        step("Change state ", ()->{
            cityPageTitle.pressEnter();
        });
        return this;
    }
}
