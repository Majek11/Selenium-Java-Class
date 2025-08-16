package part2.com.saucedemo.tests.login;

import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyTT6%Rfd");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        assertTrue(actualMessage.contains("Epic sadface: Username and password do not match any user in this service"));
    }
}
