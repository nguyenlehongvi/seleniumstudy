package page;
import Utils.BaseTest;
import org.openqa.selenium.By;
public class NavigateAdminPage extends BaseTest {
    private By lbAdmin = (By.xpath("//span[text()='Admin']"));

    public void Navigate(){
        driver.findElement(lbAdmin).click();
    }
}
