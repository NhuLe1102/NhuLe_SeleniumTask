package Test.java.test.global;

import Test.java.models.pages.HomePage;
import Test.java.models.pages.RegisterPage;
import Test.java.url.Urls;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class HeaderTest implements Urls {

    public static void main(String[] args) {
        testHomepageHeader();
        testRegisterPageHeader();
    }

    private static void testRegisterPageHeader() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat(HOME_PAGE));

        try {
            HomePage homePage = new HomePage(driver);
            homePage.headerComp().searchInputElem().sendKeys("Laptop");
            homePage.headerComp().searchInputBtn().click();
            Thread.sleep(3000); // DEBUG PURPOSE ONLY
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void testHomepageHeader() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat(REGISTER_PAGE));

        try {
            RegisterPage registerPage = new RegisterPage(driver);
            registerPage.headerComp().searchInputElem().sendKeys("Laptop");
            registerPage.headerComp().searchInputBtn().click();
            Thread.sleep(3000); // DEBUG PURPOSE ONLY
        } catch (Exception ignored){

        }finally {
            driver.quit();
        }
    }
}