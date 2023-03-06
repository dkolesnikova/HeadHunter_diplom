package ru.hh.web.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class JobSearchPage {
    SelenideElement jobTitle = $(".bloko-header-section-3");

    public JobSearchPage checkFindJob (String textJobTitle) {
        step("Check the correctness of the search", ()-> {
            jobTitle.shouldHave(text(textJobTitle));
        });
        return this;
    }
}
