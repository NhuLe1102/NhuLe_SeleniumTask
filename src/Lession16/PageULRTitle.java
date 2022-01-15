package Lession16;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class PageULRTitle {
    public static void main(String[] args) throws InterruptedException {
        // class method | getChromeDriver | WebDriver
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // open target page | https://the-internet.herokuapp.com/login
            driver.get("https://the-internet.herokuapp.com/login");

            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());

        } finally {
            // Quit driver session
            driver.quit();
        }

    }
}
