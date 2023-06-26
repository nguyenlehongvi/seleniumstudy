package Utils;

import org.testng.annotations.DataProvider;

public class param {
    @DataProvider(name = "data")
    Object[][] dataAcount() {
        return new Object[][]{{"Admin", "admin123"}};
    }
}
