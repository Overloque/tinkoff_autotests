package guru.qa.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@Tag("main")
@Feature("Проверка главной страницы")
@Owner("Overloque")
public class MainPageTests extends BaseTest {
    @Test
    @DisplayName("Проверка появления списка подсказок в поисковой строке по сгенерированному значению")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru")
    void checkSearchTips() {
        step("Открытие главной страницы сайта", () -> {
            mainPage.openPage();
        });
        step("Заполнение поисковой строки сгенерированным значением", () -> {
            mainPage.typeText(variables.searchInput);
        });
        step("Проверка появившегося списка подсказок по запросу", () -> {
            mainPage.checkTipsExist();
        });
    }
    @Test
    @DisplayName("Проверка элементов списка из меню на главной странице")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru")
    void checkEmptyField() {
        step("Открытие главной страницы сайта", () -> {
            mainPage.openPage();
        });
        step("Проверка существования элементов из списка", () -> {
            mainPage.checkMenuPanelExist(variables.menuPanel);
        });
    }
}
