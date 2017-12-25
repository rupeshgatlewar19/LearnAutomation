package accelarators;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Rupesh Kumar on 12/11/2017.
 */
public class TestEngine {

    public WebDriver driver;

    @BeforeMethod
    public void start() {
        System.out.println("This is start method");
    }

    @AfterMethod
    public void finish() {
        System.out.println("This is finish method");
    }
}
