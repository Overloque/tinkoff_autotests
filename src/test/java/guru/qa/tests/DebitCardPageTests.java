package guru.qa.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@Tag("debit")
@Feature("Проверка раздела 'Дебетовые карты'")
@Owner("Overloque")
public class DebitCardPageTests extends BaseTest {
    @Test
    @DisplayName("Проверка заголовка раздела 'Дебетовые карты'")
    @Severity(SeverityLevel.MINOR)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/cards/debit-cards")
    void checkTitle() {
        step("Открытие страницы раздела 'Дебетовые карты'", () -> {
           debitCardPage.openPage();
        });
        step("Проверка заголовка страницы раздела 'Дебетовые карты'", () -> {
            debitCardPage.checkTitlePage();
        });
    }

    @Test
    @DisplayName("Проверка, что в фильтре карт изначально при переходе в раздел выбрано 'Все карты'")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/cards/debit-cards")
    void checkFocusedOption() {
        step("Открытие страницы раздела 'Дебетовые карты'", () -> {
            debitCardPage.openPage();
        });
        step("Проверка, что изначально выбрана опция 'Все карты''", () -> {
            debitCardPage.checkFilterValue();
        });
    }
}
