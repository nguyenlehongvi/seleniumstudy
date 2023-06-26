package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriverWait wait;
    WebDriver driver;

    private static By txtUsername = (By.name("username"));
    private static By txtPassword = (By.name("password"));
    private static By btnSubmit = By.xpath("//button[@type='submit']");
    private By logoIcon = By.xpath("//div[@class='oxd-brand-banner']");

    public void login(String username, String password){
        driver.findElement(txtUsername).sendKeys(username);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnSubmit).click();
    }
    public boolean isLogoDisplay(){
        return driver.findElement(logoIcon).isDisplayed();
    }
}
