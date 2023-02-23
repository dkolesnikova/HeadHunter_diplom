package ru.hh.web.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import ru.hh.config.WebDriverProvider;
import ru.hh.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.hh.web.pages.ChangeCityPage;


import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    @BeforeAll
    static void setUp() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListener() {
        open(baseUrl);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
