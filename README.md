# Проект по автоматизации тестовых сценариев для сайта компании [Tinkoff](https://www.tinkoff.ru)
<p align="center"><a href="https://www.tinkoff.ru"><img src="images/logo/Tinkoff.png" align="center" width="600" height="300"  alt="Java"/></a></p>  

> Tinkoff - российский коммерческий банк, сфокусированный полностью на дистанционном обслуживании, не имеющий розничных отделений. Крупнейший в мире онлайн-банк по количеству клиентов.  

## :notebook: Содержание:

- [Стек технологий](#computer-стек-технологий)  
- [Тестовые сценарии](#clipboard-тестовые-сценарии)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Команда для запуска](#rocket-команда-для-запуска)
- [Allure отчет](#allure-отчет)
- [Интеграция с Allure TestOps](#img-srcimageslogoalluretestopssvg-width50-height50-интеграция-с-allure-testops)
- [Интеграция с Jira](#img-srcimageslogojirasvg-width50-height50-интеграция-с-jira)
- [Уведомления в Telegram чат с ботом](#img-srcimageslogotelegramsvg-width50-height50-уведомления-в-telegram-чат-с-ботом)
- [Видео запуска тестов в Selenoid](#img-srcimageslogoselenoidsvg-width50-height50-видео-запуска-тестов-в-selenoid)  

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

- :white_check_mark: Главная страница
    - :heavy_check_mark: Проверка появления списка подсказок в поисковой строке
    - :heavy_check_mark: Проверка элементов списка из меню на главной странице
- :white_check_mark: Раздел "Дебетовые карты"
    - :heavy_check_mark: Проверка заголовка раздела 'Дебетовые карты'
    - :heavy_check_mark: Проверка выбранной опции в фильтре карт при переходе в раздел
- :white_check_mark: Раздел "Кредиты и ипотека"
  - :heavy_check_mark: Проверка заполнения поля 'Цель кредита' при выборе значения из списка
  - :heavy_check_mark: Проверка наличия 3-х шагов по составлению заявки на кредит
- :white_check_mark: Раздел "Вклады"
    - :heavy_check_mark: Проверка сокрытия сообщения при нажатии на чекбокс
    - :heavy_check_mark: Проверка отображения информации при наведении на тултип

---

## <img src="images/logo/Jenkins.svg" width="50" height="50"/> Сборка в Jenkins

<p align="center">
<img src="images/screenshots/JenkinsScreenshot.jpg" alt="Jenkins Build" width="1000" height="300">
</p>

### Параметры сборки проекта

| Параметр        | Назначение                               |
|-----------------|------------------------------------------|
| SELENOID_URL    | Удаленный сервер для запуска тестов      |
| BROWSER         | Браузер для запуска                      |
| BROWSER_VERSION | Версия браузера                          |
| BROWSER_SIZE    | Разрешение экрана                        |
| COMMENT         | Комментарий                              |
| TASK            | Опция выбора запуска определённых тестов |

### Запуск тестов с параметрами в **Jenkins**

<p align="center">
<img src="images/screenshots/JenkinsLaunch.jpg" alt="Jenkins Launch" width="1000" height="400">
</p>

---

## :rocket: Команда для запуска

```bash
clean
${TASK}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
-DselenoidUrl=${SELENOID_LINK}
```

---

## <img src="images/logo/Allure.svg" width="50" height="50"/> Allure отчет

### Главная страница отчета

<p align="center">
<img src="images/screenshots/Allure-report.jpg" alt="Allure report" width="1000" height="350">
</p>

### Тест-кейсы

<p align="center">
<img src="images/screenshots/Allure-testCase.jpg" alt="Test Case" width="1000" height="350">
</p>

#### Содержание тест-кейсов

- :heavy_check_mark: Подробное описание шагов
- :heavy_check_mark: Тег
- :heavy_check_mark: Критичность теста
- :heavy_check_mark: Автор
- :heavy_check_mark: Ссылка на раздел сайта (для каждый тестов свой раздел)
- :heavy_check_mark: Последний скриншот для каждого теста 
- :heavy_check_mark: HTML разметка страницы
- :heavy_check_mark: Логи браузера
- :heavy_check_mark: Видео с прохождением теста

### Графики

<p align="center">
<img src="images/screenshots/Allure-graph.jpg" alt="Allure-graph" width="1000" height="400">
</p>

---

## <img src="images/logo/AllureTestOps.svg" width="50" height="50"/> Интеграция с Allure TestOps

### Dashboard

<p align="center">
<img src="images/screenshots/TestOps_dashboard.jpg" alt="TestOps dashboard" width="1000" height="400">
</p>

### Ручные и автоматизированные тест-кейсы

<p align="center">
<img src="images/screenshots/TestOps_testCases.jpg" alt="TestOps test cases" width="1000" height="400">
</p>

### Запуск автоматизированных тестов в **TestOps**

<p align="center">
<img src="images/screenshots/TestOps_launch.jpg" alt="TestOps launch" width="1000" height="400">
</p>

---

## <img src="images/logo/Jira.svg" width="50" height="50"/> Интеграция с Jira

### Задача в Jira

<p align="center">
<img src="images/screenshots/Jira.jpg" alt="TestOps launch" width="1000" height="400">
</p>

#### Содержание задачи

- :heavy_check_mark: Цель
- :heavy_check_mark: Задачи для выполнения
- :heavy_check_mark: Тест-кейсы из Allure TestOps
- :heavy_check_mark: Результат прогона тестов в Allure TestOps

---

## <img src="images/logo/Telegram.svg" width="50" height="50"/> Уведомления в Telegram чат с ботом

### Уведомление из переписки с чат ботом

<p align="center">
<img src="images/screenshots/Telegram.jpg" alt="TestOps launch" width="500" height="400">
</p>


#### Содержание уведомления в Telegram

- :heavy_check_mark: Окружение
- :heavy_check_mark: Комментарий
- :heavy_check_mark: Длительность прохождения тестов
- :heavy_check_mark: Общее количество сценариев
- :heavy_check_mark: Процент прохождения тестов
- :heavy_check_mark: Ссылка на Allure отчет

---

## <img src="images/logo/Selenoid.svg" width="50" height="50"/> Видео запуска тестов в Selenoid

<p align="center">
<img src="images/gifs/Selenide_video.gif" alt="TestOps launch" width="800" height="400">
</p>






