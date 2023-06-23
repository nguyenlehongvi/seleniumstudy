package test;

import common.TestBase;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginPageTest extends TestBase {
    LoginPage login;
    @DataProvider(name = "data")
    public Object[][] testLogin()  {
        return new Object[][]{{"Admin", "admin123"}};
    }
    @Test(dataProvider = "data")
    public void loginTest(String username, String password) throws InterruptedException {
        login = new LoginPage();
        login.login(username,password);
        Assert.assertTrue(login.isLogoDisplay());

    }
}
