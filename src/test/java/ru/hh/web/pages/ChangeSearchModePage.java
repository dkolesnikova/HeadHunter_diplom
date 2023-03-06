package ru.hh.web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ChangeSearchModePage {
    private SelenideElement changePageTitle = $(".action--x1p9SZ3icsnKRxJcF5kI");

    public ChangeSearchModePage checkChangePage (String textChangePageTitle) {
        step("Сheck that the page for employers has opened in a new window", () ->{
            changePageTitle.shouldHave(text(textChangePageTitle));
        });
        return this;
    }
}
