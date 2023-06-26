package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected static WebDriver driver;
    protected WebDriverWait wait;
    public String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    public String driverPath = "D://chromedriver.exe";

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void openUrl() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public static Properties loadPropertiesFile() throws IOException {
        Properties obj = new Properties();
        FileInputStream objfile = new FileInputStream(System.getProperty("D:\\Training Selelium\\seleniumstudy\\OrangeHRM\\src\\test\\java\\org\\example\\config.properties"));
        obj.load(objfile);
        return obj;
    }
}
