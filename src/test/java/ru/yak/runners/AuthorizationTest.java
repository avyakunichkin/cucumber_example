package ru.yak.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import ru.yak.model.Auth;
import ru.yak.model.Properties;

import java.util.Map;

import static com.codeborne.selenide.Configuration.reportsFolder;
import static com.codeborne.selenide.Configuration.timeout;
import static ru.yak.model.Properties.getProps;
import static ru.yak.model.User.getUsers;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/resources/ru/yak/features",
        glue = "ru/yak/steps"
)
public class AuthorizationTest {

    private static Map<String, Auth> users;
    private static Properties props;
    public static String BASE_URL;

    @BeforeClass
    static public void setupTimeout() {
        timeout = 10000;
        reportsFolder = "target/build/";
        users = getUsers();
        props = getProps();
        BASE_URL = props.getBaseUrl();
    }

    public static Auth getAuth(String user){
        return users.get(user);
    }
}