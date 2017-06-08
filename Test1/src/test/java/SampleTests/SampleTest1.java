package SampleTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utility.Base;

/**
 * Created by Zahid on 6/6/2017.
 */
public class SampleTest1 extends Base {

    @Test
    public void myTest1() throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='flexid_1']/a")).click();
        Thread.sleep(5000);
    }
}
