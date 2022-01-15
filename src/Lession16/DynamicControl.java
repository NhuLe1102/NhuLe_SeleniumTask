package Lession16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Test.java.url.Urls.BASE_URL;
import static Test.java.url.Urls.DYNAMIC_CONTROL_PAGE;

public class DynamicControl {
    public static void main(String[] args) {
        try {
            WebDriver driver = null;
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));

            // Get list of button on the page
            List<WebElement> btnElems = driver.findElements(By.cssSelector("button"));
            final int REMOVE_SECTION_BTN_INDEX = 0;
            final int ENABLE_SECTION_BTN_INDEX = 1;

            btnElems.get(REMOVE_SECTION_BTN_INDEX).click();
            btnElems.get(ENABLE_SECTION_BTN_INDEX).click();

            System.out.println(btnElems.size());

            List<WebElement> taolaoElems = driver.findElements(By.className("taolao"));
            System.out.println(taolaoElems.isEmpty());

            if (taolaoElems.isEmpty())
                throw new RuntimeException("The List X is empty");


            for (WebElement taolaoElem : taolaoElems) {
                // Verification points related to taolaoElem
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
