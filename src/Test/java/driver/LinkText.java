package Test.java.driver;

import javafx.scene.control.Hyperlink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkText {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get("https://stackoverflow.com/questions/27630190/python-selenium-incognito-private-mode");
            WebElement linkTest = driver.findElement(By.linkText("Python - Start firefox with Selenium in private mode"));
            String linktest = linkTest.getText();
            String linkhref = linkTest.getAttribute("href");
            HyperLink hyperlink = new HyperLink(linktest, linkhref);
            System.out.println(hyperlink.text());
            System.out.println(hyperlink.link());
            

        }finally {
            driver.quit();
        }

    }
    public static class HyperLink{
        private String link;
        private String text;

        public HyperLink(String link, String text){
            this.link = link;
            this.text = text;
        }
        public String link(){
            return link;
        }
        public String text(){
            return text;
        }
    }
}
