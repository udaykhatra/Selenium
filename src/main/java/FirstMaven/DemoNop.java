package FirstMaven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import org.junit.Test;


public class DemoNop extends Utils {
    @Test(priority=1)
    public static void openbrowser (){
        BasePage bp = new BasePage();
        bp.openURL("https://demo.nopcommerce.com/");

    }
//    @AfterClass
//    public static void closebrowser (){
//        driver.quit();
//    }
    @Test(priority=2)
    public  void registration (){
        click(By.xpath("//a[@class=\"ico-register\"]"));
        click(By.id("gender-male"));
        datainput(By.id("FirstName"),"Uday");
        datainput(By.id("LastName"),"Khatra");
        dropdown(By.name("DateOfBirthDay"), "5");
        dropdown(By.name("DateOfBirthMonth"), "January");
        dropdown(By.name("DateOfBirthYear"),"1985");
        email(By.id("Email"),"udaykhatra");
        datainput(By.id("Company"),"Basilico");
        click(By.id("Newsletter"));
        datainput(By.id("Password"),"Uday3185");
        datainput(By.id("ConfirmPassword"),"Uday3185");
        click(By.id("register-button"));
        gettext(By.className("result"));
        compare("Your registration completed");
        driver.quit();
    }
    @Test(priority=3)
    public void registerfriendemail (){
        openbrowser();
        click(By.xpath("//a[@class=\"ico-register\"]"));
        click(By.id("gender-male"));
        datainput(By.id("FirstName"),"Uday");
        datainput(By.id("LastName"),"Khatra");
        dropdown(By.name("DateOfBirthDay"), "5");
        dropdown(By.name("DateOfBirthMonth"), "January");
        dropdown(By.name("DateOfBirthYear"),"1985");
        email(By.id("Email"),"udaykhatra");
        datainput(By.id("Company"),"Basilico");
        click(By.id("Newsletter"));
        datainput(By.id("Password"),"Uday3185");
        datainput(By.id("ConfirmPassword"),"Uday3185");
        click(By.id("register-button"));
        click(By.xpath("//div[6]/div[2]/ul[1]/li[1]/a"));
        click(By.xpath("//div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));
        click(By.xpath("//div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]"));
        click(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[10]/div[3]/input"));
        datainput(By.id("FriendEmail"),"udaykhatra@gmail.com");
        datainput(By.id("PersonalMessage"),"please have a look i have find for you");
        click(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/input"));
        gettext(By.className("result"));
        compare("Your message has been sent.");
        click(By.xpath("//div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        driver.quit();
    }
    @Test(priority=4)
    public void unregisterfriendemail () {
        openbrowser();
        click(By.xpath("//div[6]/div[2]/ul[1]/li[1]/a"));
        click(By.xpath("//div/a[@title=\"Show products in category Desktops\"]"));
        click(By.xpath("//div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]"));
        click(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[10]/div[3]/input"));
        email(By.id("FriendEmail"), "udaykhatra");
        datainput(By.id("YourEmailAddress"), "udayk@yahoo.com");
        datainput(By.id("PersonalMessage"), "i have find one");
        click(By.xpath("//div[6]/div[3]/div/div/div/div[2]/form/div[2]/input"));
        gettext(By.xpath("//div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li"));
        compare("Only registered customers can use email a friend feature");
        driver.quit();
    }
    @Test(priority=5)
    public void acceptterms (){
        openbrowser();
        click(By.xpath("//div[6]/div[2]/ul[1]/li[1]/a"));
        click(By.xpath("//div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/h2/a"));
        click(By.xpath("//div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]"));
        click(By.id("product_attribute_3_7"));
        click(By.id("add-to-cart-button-1"));
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//li[@id=\"topcartlink\"]/a/span[1]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*[@id=\"termsofservice\"]"));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.id("checkout"));
        driver.quit();
    }
    @Test(priority=6)
    public void buyproducts (){
        openbrowser();
        click(By.xpath("//a[@class=\"ico-register\"]"));
        click(By.id("gender-male"));
        datainput(By.id("FirstName"),"Uday");
        datainput(By.id("LastName"),"Khatra");
        dropdown(By.name("DateOfBirthDay"), "5");
        dropdown(By.name("DateOfBirthMonth"), "January");
        dropdown(By.name("DateOfBirthYear"),"1985");
        email(By.id("Email"),"udaykhatra");
        datainput(By.id("Company"),"Basilico");
        click(By.id("Newsletter"));
        datainput(By.id("Password"),"Uday3185");
        datainput(By.id("ConfirmPassword"),"Uday3185");
        click(By.id("register-button"));

        click(By.xpath("//div[6]/div[2]/ul[1]/li[1]/a"));
        click(By.xpath("//div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/h2/a"));
        click(By.xpath("//div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]"));
        click(By.id("product_attribute_3_7"));
        click(By.id("add-to-cart-button-1"));
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//li[@id=\"topcartlink\"]/a/span[1]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*[@id=\"termsofservice\"]"));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.id("checkout"));

        dropdown(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        datainput(By.id("BillingNewAddress_City"),"London");
        datainput(By.id("BillingNewAddress_Address1"),"19 oaklands court");
        datainput(By.name("BillingNewAddress.ZipPostalCode"),"HA0 2EL");
        datainput(By.id("BillingNewAddress_PhoneNumber"),"07947316328");
        click(By.xpath("//div[@id=\"billing-buttons-container\"]/input"));
        click(By.xpath("//div[@id=\"shipping-method-buttons-container\"]/input"));
        click(By.xpath("//div[@id=\"payment-method-buttons-container\"]/input"));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@id=\"payment-info-buttons-container\"]/input"));
        click(By.xpath("//div[@id=\"confirm-order-buttons-container\"]/input"));
        gettext(By.xpath("//div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"));
        compare("Your order has been successfully processed!");
        driver.quit();


    }
    @Test(priority=7)
    public void pricehightolow(){
        openbrowser();
        click(By.xpath("//div[6]/div[2]/ul[1]/li[7]/a"));
        dropdown(By.id("products-orderby"),"Price: High to Low");

    }

}

