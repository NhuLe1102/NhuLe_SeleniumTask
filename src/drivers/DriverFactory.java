package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver getChromeDriver(){
        String chromeDriverLocation;
        // cach 1
        //String currentProjectLocation = System.getProperty("user.dir");
        //chromeDriverLocation = OS.isFamilyMac()
              //  ? currentProjectLocation.concat("/drivers/chromedriver")
                //: currentProjectLocation.concat("\\src\\test\\resource\\drivers\\chromedriver.exe");
        // cach 2
        //chromeDriverLocation = "./drivers/chromedriver";

        // cach3
        chromeDriverLocation = "/Users/nhule/IdeaProjects/Test/drivers/chromedriver";


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito"); // truy cap an danh

        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
