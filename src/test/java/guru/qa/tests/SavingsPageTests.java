package guru.qa.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@Tag("savings")
@Feature("Проверка раздела 'Вклады'")
@Owner("Overloque")
public class SavingsPageTests extends BaseTest {
    @Test
    @DisplayName("Проверка сокрытия сообщения при нажатии на чекбокс")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/savings/deposit")
    void checkCheckboxMessageDisappear() {
        step("Открытие страницы раздела 'Вклады'", () -> {
            savingsPage.openPage();
        });
        step("Клик по чекбоксу 'У меня есть дебетовая карта Tinkoff'", () -> {
            savingsPage.clickCheckbox();
        });
        step("Проверка, что сообщение снизу чекбокса пропало", () -> {
            savingsPage.checkMessageDisappear();
        });
    }

    @Test
    @DisplayName("Проверка отображения информации при наведении на тултип")
    @Severity(SeverityLevel.MINOR)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/savings/deposit")
    void checkTextAfterSlider() {
        step("Открытие страницы раздела 'Вклады'", () -> {
            savingsPage.openPage();
        });
        step("Наведение курсора на тултип", () -> {
            savingsPage.hoverTooltip();
        });
        step("Проверка отображения информации при наведенном на тултип курсоре", () -> {
            savingsPage.checkModalExist();
        });
    }
}
