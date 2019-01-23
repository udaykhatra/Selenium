package FirstMaven;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BasePage {


    @Test
    public void hrm() {


        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","src/BrowserDriver/chromedriver.exe");
        driver  = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().fullscreen();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        String expectedresult = "Welcome Admin";
        String actualresult = driver.findElement(By.id("welcome")).getText();
        Assert.assertEquals("testpass",expectedresult, actualresult );
        driver.quit();
    }
}

