package guru.qa.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CreditPage {
    SelenideElement
            creditGoalOptionsInput = $("[data-qa-type='uikit/select.dropdown']"),
            creditGoalWrapper = $("[data-qa-type='uikit/select.dropdown.list']");

    ElementsCollection stepsInfo = $$("[role='contentinfo']");

    public CreditPage openPage() {
        open("/loans");

        return this;
    }

    public CreditPage clickGoalsDropdown() {
        creditGoalOptionsInput.click();

        return this;
    }

    public CreditPage chooseGoalOption(String value) {
        creditGoalWrapper.$(byText(value)).click();

        return this;
    }

    public CreditPage checkStepsExist(List<String> steps) {
        for (String step : steps) {
            stepsInfo.findBy(text(step)).shouldBe(visible);
        }

        return this;
    }

    public CreditPage checkChosenOption(String value) {
        creditGoalOptionsInput.shouldHave(text(value));

        return this;
    }
}
