package ru.hh.web.pages;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static io.qameta.allure.Allure.step;

public class OpenMessengerPage {
    public OpenMessengerPage checkVKIconResult () {
        step("Switch to new page and check URL", () -> {
            switchTo().window(1);
            webdriver().shouldHave(url("https://vk.com/headhunter"));
        });
        return this;
    }
    public OpenMessengerPage checkDzenIconResult () {
        step("Switch to new page and check URL", () -> {
            switchTo().window(1);
            webdriver().shouldHave(url("https://dzen.ru/headhunter"));
        });
        return this;
    }
}
