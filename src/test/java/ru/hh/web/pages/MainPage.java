package ru.hh.web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPage {
    private SelenideElement
            aboutCompanyLink = $x("//*[@href=\"/article/28?from=footer_new\"]"),
            vkIcon = $(".bloko-social-icon_vk"),
            dzenIcon  = $(".bloko-social-icon_dzen"),
            telegramIcon = $(".bloko-social-icon_telegram"),
            searchField = $(".bloko-input-text"),
            stateButton = $(".supernova-navi-item_area-switcher-button"),
            employersButton = $(".supernova-link_dimmed");

    public MainPage openPage() {
        step("Открытие главной страницы Headhunter", ()-> {
           open("https://spb.hh.ru/");
        });
        return this;
    }
    public MainPage clickAboutCompany() {
        step ("Click on the field About company", ()-> {
            aboutCompanyLink.click();
        });
        return this;
    }
    public MainPage clickVKIcon () {
        step("Click on VK icon", () -> {
            vkIcon.click();
        });
        return this;
    }
    public MainPage clickDzenIcon () {
        step("Click on Dzen icon", () -> {
            dzenIcon.click();
        });
        return this;
    }
    public MainPage clickTelegramIcon () {
        step("Click on Telegram icon", () -> {
            telegramIcon.click();
        });
        return this;
    }
    public MainPage clickFindJob () {
        step("Click on the search field and find a job", ()-> {
            searchField.setValue("QA инженер").pressEnter();
        });
        return this;
    }
    public MainPage clickStateButton () {
        step("Click on the button Saint-Petersburg", () -> {
            stateButton.click();
        });
        return this;
    }
    public MainPage clickEmployersButton () {
        step("Click on the button employers", () ->{
            employersButton.click();
        });
        return this;
    }
}
