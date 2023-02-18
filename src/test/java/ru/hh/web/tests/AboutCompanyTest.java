package ru.hh.web.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.AboutCompanyPage;
import ru.hh.web.pages.MainPage;

public class AboutCompanyTest extends TestBase {
    MainPage mainPage = new MainPage();
    AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();

    String textAboutCompanyTitle = "О КОМПАНИИ";

    @Test
    @DisplayName("Проверка раздела 'О компании'")
    void checkAboutCompanyTest () {
        mainPage.openPage()
                .clickAboutCompany();
        aboutCompanyPage.checkAboutCompanyResult(textAboutCompanyTitle);
    }
}
