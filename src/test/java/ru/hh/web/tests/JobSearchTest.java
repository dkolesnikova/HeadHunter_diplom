package ru.hh.web.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.JobSearchPage;
import ru.hh.web.pages.MainPage;

public class JobSearchTest extends TestBase {
    MainPage mainPage = new MainPage();
    JobSearchPage jobSearchPage = new JobSearchPage();

    String textJobTitle = "QA инженер";

    @Test
    @DisplayName("Проверка поиска вакансии")
    void checkJobSearchTest () {
        mainPage.openPage()
                .clickFindJob();
        jobSearchPage.checkFindJob(textJobTitle);
    }
}