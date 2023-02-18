package ru.hh.web.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.ChangeCityPage;
import ru.hh.web.pages.MainPage;

public class ChangeCityTest extends TestBase{
    MainPage mainPage = new MainPage();
    ChangeCityPage changeCityPage = new ChangeCityPage();

    @Test
    @DisplayName("Изменение города")
    void checkChangeCityTest (){
        mainPage.openPage()
                .clickStateButton();
        changeCityPage.checkChangeCity();
    }

}
