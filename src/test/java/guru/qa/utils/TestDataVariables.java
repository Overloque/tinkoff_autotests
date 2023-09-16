package guru.qa.utils;

import java.util.List;

public class TestDataVariables {
    private final TestDataMethods testDataMethods = new TestDataMethods();
    public String
            searchInput = testDataMethods.getRandomCardType(),
            goalsInput = testDataMethods.getRandomCreditGoal();

    public List<String>
            menuPanel = List.of("Дебетовые карты", "Кредитные карты",
            "Кредиты", "Премиум", "Вклады", "Инвестиции", "Сим-карта",
            "Страхование", "Путешествия", "Бизнес"),
            steps = List.of("Оставьте заявку на кредит, ответим сразу, в день обращения",
                    "Получите деньги на карту Тинькофф. Если ее нет, доставим бесплатно, куда удобно",
                    "Тратьте деньги с карты или снимайте наличные без комиссии");
}
