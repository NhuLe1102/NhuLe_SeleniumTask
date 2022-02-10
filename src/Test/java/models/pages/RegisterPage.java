package Test.java.models.pages;
import Test.java.models.component.global.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private final WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public HeaderComponent headerComp(){
        return new HeaderComponent(this.driver);
    }
}
