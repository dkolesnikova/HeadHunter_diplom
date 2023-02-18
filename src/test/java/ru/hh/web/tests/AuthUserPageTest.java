package ru.hh.web.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.AuthUserPage;

import static io.qameta.allure.Allure.step;

@Tag("UITest")
public class AuthUserPageTest extends TestBase {

    static AuthUserPage authUserPage = new AuthUserPage ();

    @Test
    @DisplayName("Авторизация пользователя (вход в личный кабинет)")
    void testAuthUser () {
        step("Открываем главную страницу", () -> {
            authUserPage.openAuthUserWindow();
        });
        step("Вводим email пользователя", () -> {
            authUserPage.setEmail();
        });
        }
    }



