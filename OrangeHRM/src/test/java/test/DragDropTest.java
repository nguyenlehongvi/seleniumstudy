package test;

import Utils.PageElements;
import Utils.BaseTest;
import Utils.param;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragDropTest extends BaseTest{
    PageElements pageElements;

    @Test(dataProvider = "data", dataProviderClass = param.class)
    public void DragDrop(String username, String password) {
        pageElements = new PageElements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageElements.enterUsername(username);
        pageElements.enterPassword(password);
        pageElements.clickLoginButton();
        pageElements.navToAdminButton();
        Assert.assertEquals(pageElements.verifyAdminPage(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

        /*pageElements.clickColor();

        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(By.xpath("//input[@type='range']")),driver.findElement(By.xpath(""))).build().perform();*/

    }
}
