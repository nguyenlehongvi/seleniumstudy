package page;

import common.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.OpenBrowserTest;
public class LoginPage extends TestBase {
    public static WebDriver driver;
    OpenBrowserTest openBrowser;
    WebDriverWait wait;
    public By txtUsername = (By.name("username"));
    public By txtPassword = (By.name("password"));
    public By btnSubmit = By.xpath("//button[@type='submit']");
    public By logoIcon = By.xpath("//div[@class='oxd-brand-banner']");

    public void login(String username, String password){
        driver.findElement(txtUsername).sendKeys(username);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnSubmit).click();

    }
    public boolean isLogoDisplay(){
        return driver.findElement(logoIcon).isDisplayed();
    }
}
