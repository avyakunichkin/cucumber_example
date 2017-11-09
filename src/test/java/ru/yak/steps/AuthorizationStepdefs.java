package ru.yak.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java8.En;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static ru.yak.runners.AuthorizationTest.BASE_URL;
import static ru.yak.runners.AuthorizationTest.getAuth;

public class AuthorizationStepdefs extends AbstractSteps implements En {

    public AuthorizationStepdefs() {

        Then("^пункт \"([^\"]*)\" должен быть виден в меню$", (String css) -> {
            $(main.get("Меню")).click();
            $(main.get(css)).shouldBe(visible);
        });

        Given("^открыта \"([^\"]*)\"$", (String mainPage) ->
                Selenide.open(main.get(mainPage)));

        Then("^в меню количество элементов: (\\d+)$", (Integer count) -> {
            $(main.get("Меню")).click();
            $$(main.get("Блок меню")).shouldHaveSize(count);
        });
        When("^вводим емейл роли <([^\"]*)>$", (String user) -> {
            $("[name = email]").sendKeys(getAuth(user).getEmail());
        });
        When("^вводим пароль роли <([^\"]*)>$", (String user) -> {
            $("[name = passw]").sendKeys(getAuth(user).getPassw());
        });
        When("^нажимаем кнопку \"([^\"]*)\"$", (String buttonLogin) -> {
            $(login.get(buttonLogin)).click();
        });
    }

    @After
    public void clearData(){
        open(BASE_URL + "logout");
    }
}
