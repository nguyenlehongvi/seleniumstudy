package test;

import Utils.PageElements;
import Utils.BaseTest;
import Utils.param;
import org.testng.Assert;
import org.testng.annotations.*;
import page.LoginPage;

import java.io.IOException;
import java.util.Properties;

public class LoginPageTest extends BaseTest {
    PageElements pageElements;
    LoginPage loginPage;

    //@Test(dataProvider = "data", dataProviderClass = param.class) String username, String password
    @Test
    public void testLoginWithAccount() throws IOException {
        /*pageElements = new PageElements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        pageElements.enterUsername(username);
        pageElements.enterPassword(password);
        pageElements.clickLoginButton();
        Assert.assertEquals(pageElements.getTitleHRM(),"OrangeHRM");*/
        //pageElements = new PageElements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Properties obj = loadPropertiesFile();
        loginPage = new LoginPage();
        loginPage.login(obj.getProperty("username_Admin"), obj.getProperty("password_Admin"));
        Assert.assertEquals(pageElements.getTitleHRM(),"OrangeHRM");
    }
}
