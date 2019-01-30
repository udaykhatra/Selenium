package FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BasePage extends Utils {

    public static void openURL(String URL){
        System.setProperty("webdriver.chrome.driver","src/BrowserDriver/chromedriver.exe");
        driver  = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().fullscreen();

    }

    public void hrm() {

        datainput(By.id("txtUsername"),"Admin");
        datainput(By.id("txtPassword"),"admin123");
        click(By.id ("btnLogin"));
        gettext(By.id("welcome"));
        compare("Welcome Admin");

        driver.quit();
    }
}

