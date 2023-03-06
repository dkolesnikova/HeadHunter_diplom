package ru.hh.web.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.ChangeSearchModePage;
import ru.hh.web.pages.MainPage;

public class ChangeSearchModeTest extends TestBase {
    MainPage mainPage = new MainPage();
    ChangeSearchModePage changeSearchModePage = new ChangeSearchModePage();
    String textChangePageTitle = "Разместить вакансию";
    @Tag("UI")
    @Test
    @DisplayName("Проверка изменения страницы соискателям на страницу для работодателей")
    void checkChangePageTest() {
        mainPage.openPage()
                .clickEmployersButton();
        changeSearchModePage.checkChangePage(textChangePageTitle);
    }
}
