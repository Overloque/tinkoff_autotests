package guru.qa.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@Tag("loans")
@Feature("Проверка раздела 'Кредиты и ипотека'")
@Owner("Overloque")
public class CreditPageTests extends BaseTest {
    @Test
    @DisplayName("Проверка заполнения поля 'Цель кредита' при выборе значения из списка")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/loans")
    void checkCreditGoalOption() {
        step("Открытие страницы раздела 'Кредиты и ипотека'", () -> {
            creditPage.openPage();
        });
        step("Клик на поле с выпадающим списком целей кредита", () -> {
            creditPage.clickGoalsDropdown();
        });
        step("Выбор значения из списка", () -> {
            creditPage.chooseGoalOption(variables.goalsInput);
        });
        step("Проверка выбранного значения из списка в поле", () -> {
            creditPage.checkChosenOption(variables.goalsInput);
        });
    }

    @Test
    @DisplayName("Проверка наличия 3-х шагов по составлению заявки на кредит")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/loans")
    void checkVisibleSteps() {
        step("Открытие страницы раздела 'Кредиты и ипотека'", () -> {
            creditPage.openPage();
        });
        step("Проверка отображения 3-х шагов по составлению заявки на кредит", () -> {
            creditPage.checkStepsExist(variables.steps);
        });
    }
}
