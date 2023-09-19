package guru.qa.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
            searchInput = $("[data-qa-type='uikit/inputAutocomplete.value.input']"),
            autocompletePopover = $("[data-qa-type='uikit/popover.popoverBlock']");

    private final ElementsCollection menuPanel = $$("[data-test='panel slides']");

    public MainPage openPage() {
        open("/");
        return this;
    }

    public MainPage typeText(String value) {
        searchInput.setValue(value);

        return this;
    }

    public MainPage checkMenuPanelExist(List<String> menu) {
        for (String menuElement : menu) {
            menuPanel.findBy(text(menuElement)).should(exist);
        }

        return this;
    }

    public MainPage checkTipsExist() {
        autocompletePopover.shouldBe(visible);

        return this;
    }
}
