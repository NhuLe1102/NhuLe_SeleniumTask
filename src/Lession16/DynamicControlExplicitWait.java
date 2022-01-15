package Lession16;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Test.java.url.Urls.BASE_URL;
import static Test.java.url.Urls.DYNAMIC_CONTROL_PAGE;

public class DynamicControlExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));

            // Find the checkbox-example form
            WebElement checkboxExampleFormElem = driver.findElement(By.id("checkbox-example"));
            // Find the button in the checkbox-example form
            WebElement checkboxExampleFormBtnElem = checkboxExampleFormElem.findElement(By.cssSelector("button"));
            checkboxExampleFormBtnElem.click();

            //wait until check box disappeared
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
            //wait.until(ExpectedConditions.invisibilityOf(checkboxExampleFormElem.findElement(By.tagName("input"))));

            // Wait until msg appeared | Explicitly Wait | Strategy 02
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            WebElement checkboxMessageElement = checkboxExampleFormElem.findElement(By.id("message"));

            System.out.println(checkboxMessageElement.getText());

            // Find the inputExample form
            WebElement inputExampleFormElem = driver.findElement(By.id("input-example"));
            // Find the button in the input-example form
            WebElement inputExampleFormBtnElem = inputExampleFormElem.findElement(By.cssSelector("button"));
            inputExampleFormBtnElem.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-example input")));
            inputExampleFormElem.findElement(By.tagName("input")).sendKeys("TEO");

            Thread.sleep(3000);
            System.out.println(inputExampleFormBtnElem.getCssValue("background-color"));
            System.out.println(inputExampleFormBtnElem.getCssValue("border-bottom-color"));


        } catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
