# Проект по автоматизации тестовых сценариев для сайта компании [Tinkoff](https://www.tinkoff.ru)
<p align="center"><a href="https://www.tinkoff.ru"><img src="images/logo/Tinkoff.png" align="center" width="600" height="300"  alt="Java"/></a></p>  

> Tinkoff - российский коммерческий банк, сфокусированный полностью на дистанционном обслуживании, не имеющий розничных отделений. Крупнейший в мире онлайн-банк по количеству клиентов.  

## :notebook: Содержание:

---

- [Стек технологий](#computer-стек-технологий)  
- [Тестовые сценарии](#clipboard-тестовые-сценарии)
- [Сборка в Jenkins]()
- [Запуск автотестов]()
- [Allure отчет]()
- [Интеграция с Allure TestOps]()
- [Интеграция с Jira]()
- [Уведомления в Telegram чат с ботом]()
- [Видео запуска тестов в Selenoid]()  

---
## :computer: Стек технологий
<p align="center">
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"/></a>
<a href="https://www.github.com/"><img src="images/logo/Github.svg" width="50" height="50"/></a>
<a href="https://www.gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"/></a>
<a href="https://www.junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"/></a>
<a href="https://www.selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"/></a>
<a href="https://www.aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"/></a>
<a href="https://www.qameta.io/"><img src="images/logo/AllureTestOps.svg" width="50" height="50"/></a>
<a href="https://www.atlassian.com/software/jira"><img src="images/logo/Jira.svg" width="50" height="50"/></a>
<a href="https://www.telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"/></a>
</p>

---

## :clipboard: Тестовые сценарии

---

- :white_check_mark: Главная страница
    - Проверка появления списка подсказок в поисковой строке
    - Проверка элементов списка из меню на главной странице
- :white_check_mark: Раздел "Дебетовые карты"
    - Проверка заголовка раздела 'Дебетовые карты'
    - Проверка выбранной опции в фильтре карт при переходе в раздел
- :white_check_mark: Раздел "Кредиты и ипотека"
  - Проверка заполнения поля 'Цель кредита' при выборе значения из списка
  - Проверка наличия 3-х шагов по составлению заявки на кредит
- :white_check_mark: Раздел "Вклады"
    - Проверка сокрытия сообщения при нажатии на чекбокс
    - Проверка отображения информации при наведении на тултип
---
