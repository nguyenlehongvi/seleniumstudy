package test;

import common.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class OpenBrowserTest extends TestBase {
    TestBase testBase;
    private String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Test
    public void Open() {
        testBase = new TestBase();
        testBase.openUrl();
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }
}
