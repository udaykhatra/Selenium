package FirstMaven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    static String actualresult;
    public static WebDriver driver;


    public static void datainput(By by, String data) {
        driver.findElement(by).sendKeys(data);

    }

    public static void click(By by) {
        driver.findElement(by).click();

    }

    public static void gettext(By by) {
        actualresult = driver.findElement(by).getText();

    }

    public static void compare(String expectedresult) {
        Assert.assertEquals("testpass", expectedresult, actualresult);

    }

    public static void dropdown(By by, String data) {
        Select dob = new Select(driver.findElement(by));
        dob.selectByVisibleText(data);

    }

    public static void email (By by, String data) {
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat dateTime;
        dateTime = new SimpleDateFormat("yyyyMMddhhmmss");
        String random = dateTime.format(today);
        driver.findElement(by).sendKeys(data+"+"+random+"@gmail.com");
    }

}

