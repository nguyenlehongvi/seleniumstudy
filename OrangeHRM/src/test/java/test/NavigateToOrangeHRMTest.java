package test;

import Utils.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class NavigateToOrangeHRMTest extends BaseTest {
    @Test
    public void testOpenBrowserAndNavigate() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
