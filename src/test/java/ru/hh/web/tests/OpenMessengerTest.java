package ru.hh.web.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.MainPage;
import ru.hh.web.pages.OpenMessengerPage;

@Tag("UI")
public class OpenMessengerTest extends TestBase{
    MainPage mainPage = new MainPage();
    OpenMessengerPage openMessengerPage = new OpenMessengerPage();

    @Test
    @DisplayName("Проверка открытия страницы ВК")
    void checkOpeningVKTest() {
        mainPage.openPage()
                .clickVKIcon();
        openMessengerPage.checkVKIconResult();
    }
    @Test
    @DisplayName("Проверка открытия страницы Дзен")
    void checkOpeningDzenTests () {
        mainPage.openPage()
                .clickDzenIcon();
        openMessengerPage.checkDzenIconResult();
    }
    @Test
    @DisplayName("Проверка открытия страницы Телеграм")
    void checkOpeningTelegramTests () {
        mainPage.openPage()
                .clickTelegramIcon();
        openMessengerPage.checkTelegramIconResult();
    }
}
