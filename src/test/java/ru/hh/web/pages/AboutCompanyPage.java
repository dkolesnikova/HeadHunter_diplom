package ru.hh.web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AboutCompanyPage {
    private SelenideElement aboutCompanyPageTitle = $(".promo-page-h2");

    public AboutCompanyPage checkAboutCompanyResult (String textAboutCompanyTitle) {
        step ("Check the correctness of the opened page", ()-> {
            aboutCompanyPageTitle.shouldHave(text(textAboutCompanyTitle));
        });
        return this;
    }
}
