package common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class TestBase {
    public static WebDriver driver;
    public void openUrl() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void tearDown(WebDriver driver) {
        driver.close();
        driver.quit();
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}

