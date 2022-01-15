
package Lession16;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Test.java.url.Urls.BASE_URL;
import static Test.java.url.Urls.DYNAMIC_CONTROL_PAGE;

public class DynamicControlElementInScope {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            // Find the checkbox-example form
            WebElement checkboxExampleFormElem = driver.findElement(By.id("checkbox-example"));
            // Find the button in the checkbox-example form
            WebElement checkboxExampleFormBtnElem = checkboxExampleFormElem.findElement(By.cssSelector("button"));


            // Find the inputExample form
            WebElement inputExampleFormElem = driver.findElement(By.id("input-example"));
            // Find the button in the input-example form
            WebElement inputExampleFormBtnElem = inputExampleFormElem.findElement(By.cssSelector("button"));


            // Click on those buttons
            checkboxExampleFormBtnElem.click();
            inputExampleFormBtnElem.click();

            // Wait to see results
            Thread.sleep(2000);
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
