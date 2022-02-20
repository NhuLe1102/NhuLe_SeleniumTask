package Test.java.models.pages;
import Test.java.models.component.global.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public HeaderComponent headerComp(){
        return findComponent(HeaderComponent.class, driver);
    }

}