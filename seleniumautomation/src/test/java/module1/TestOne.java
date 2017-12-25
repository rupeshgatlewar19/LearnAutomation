package module1;

import module1.lib.Module1Lib;
import org.testng.annotations.Test;

/**
 * Created by Rupesh Kumar on 12/11/2017.
 */
public class TestOne extends Module1Lib {

    @Test
    public void methodOne() {
        System.out.println("This is method one");
        System.out.println(System.getProperty("url"));
        System.out.println(System.getProperty("environment"));
	Assert.assertTrue(false);
    }

}
