package ru.yak.pages;

import static ru.yak.runners.AuthorizationTest.BASE_URL;

public class MainPage extends AbstractPage {

    @NameOfElement("Меню")
    String menu = "[class^=User-button___]";

    @NameOfElement("Блок меню")
    String menuBlock = "[class^=Dropdown-content__body___] a";

    @NameOfElement("Сотрудники")
    String employees = "a[href='/employees/']";

    @NameOfElement("Компании")
    String companies = "a[href='/companies/']";

    @NameOfElement("Вакансии")
    String vacancies = "[href='/vacancies'] > span";

    @NameOfElement("Управление API")
    String api = "a[href='/api_management/']";

    @NameOfElement("главная страница")
    String mainPage = BASE_URL;
}
