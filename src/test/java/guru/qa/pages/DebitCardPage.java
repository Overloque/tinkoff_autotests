package guru.qa.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DebitCardPage {
    private final SelenideElement
            title = $("h1[data-schema-path='title']");

    private final ElementsCollection filterCards = $$("[data-qa-type='uikit/filterButton']");

    public DebitCardPage openPage() {
        open("/cards/debit-cards");

        return this;
    }

    public DebitCardPage checkFilterValue() {
        filterCards.findBy(text("Все карты")).shouldHave(attribute("data-selected", "true"));

        return this;
    }

    public DebitCardPage checkTitlePage() {
        title.shouldHave(text("Дебетовые карты"));

        return this;
    }
}
