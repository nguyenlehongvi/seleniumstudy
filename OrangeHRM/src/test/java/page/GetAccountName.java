package page;

import Utils.BaseTest;
import org.openqa.selenium.By;

public class GetAccountName extends BaseTest {
    private By name = By.xpath("//p[@class='oxd-userdropdown-name']");

    public void getAccount(){
        String getName = driver.findElement(name).getText();
        System.out.println(getName);
    }
}
