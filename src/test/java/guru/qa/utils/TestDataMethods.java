package guru.qa.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataMethods {
    private final Faker faker = new Faker(new Locale("ru"));

    public String getRandomCardType() {
        return faker.business().creditCardType();
    }

    public String getRandomCreditGoal() {
        String[] goals = {"Ремонт", "Покупка недвижимости", "Покупка автомобиля",
                "Погашение кредитов", "Развитие бизнеса", "Лечение",
                "Погашение долгов (не кредиты)", "Путешествие", "Иное", "Пока не определился"};

        return faker.options().option(goals);
    }
}
