package Test.java.api_learning;
import Test.java.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;


public class FormHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get("https://www.facebook.com/login");

        WebElement userName= driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginBnt = driver.findElement(By.id("loginbutton"));

        userName.sendKeys("nhu");
        password.sendKeys("123");
        loginBnt.click();
        Thread.sleep(4000);

        driver.quit();
    }
}
