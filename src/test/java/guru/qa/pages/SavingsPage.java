package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SavingsPage {
    SelenideElement
            checkBoxText = $("[name='has_debit_card']"),
            messageBlockText = $("[data-field-name='has_debit_card']"),
            tooltip = $("[data-qa-type='uikit/tooltip']"),
            modalInfo = $("[data-qa-type='uikit/tooltip.bubble.content']");

    public SavingsPage openPage() {
        open("/savings/deposit");

        return this;
    }

    public SavingsPage clickCheckbox() {
        checkBoxText.click();

        return this;
    }

    public SavingsPage hoverTooltip() {
        tooltip.hover();

        return this;
    }

    public SavingsPage checkModalExist() {
        modalInfo.shouldBe(visible);

        return this;
    }
    public SavingsPage checkMessageDisappear() {
        messageBlockText.$(byText("При открытии вклада бесплатно выпускаем дебетовую карту Tinkoff Black"))
                .shouldNot(exist);

        return this;
    }
}
