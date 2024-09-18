import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    /*
        Открыть форму авторизации
        https://qa.guru/cms/system/login
        Ввести адрес электронной почты
        Ввести пароль
        Нажать кнопку "Войти"
        Нажать на кнопку "Личный кабинет"
        Проверить успешную авторизацию
    */

    @Test
    void successfulLoginTest() {
        open("https://qa.guru/cms/system/login");
    }

    @Test
    void unsuccessfulLoginTest() {

    }
}
