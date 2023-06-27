package test;

import Utils.PageElements;
import Utils.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.*;
import page.LoginPage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class LoginPageTest extends BaseTest {
    PageElements pageElements;
    LoginPage loginPage;

    //@Test(dataProvider = "data", dataProviderClass = param.class)String username, String password
    @Test
    public void testLoginWithAccount() throws IOException {
        /*pageElements = new PageElements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        pageElements.enterUsername(username);
        pageElements.enterPassword(password);
        pageElements.clickLoginButton();
        Assert.assertEquals(pageElements.getTitleHRM(),"OrangeHRM");*/
        pageElements = new PageElements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Properties obj = loadPropertiesFile();
        pageElements.enterUsername(obj.getProperty("username_Admin"));
        pageElements.enterPassword(obj.getProperty("password_Admin"));

        // take screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        FileUtils.copyFile(screenshot, new File("D:/Training_Selelium/seleniumstudy/OrangeHRM/src/test/java/org/example/"+driver.getTitle()+".png"));

        pageElements.clickLoginButton();
        Assert.assertEquals(pageElements.getTitleHRM(),"OrangeHRM");


    }
}
