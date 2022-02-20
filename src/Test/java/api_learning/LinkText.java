package Test.java.api_learning;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkText {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get("https://the-internet.herokuapp.com/login");
            WebElement poweredByLinkTextElem = driver.findElement(By.partialLinkText("Elemental"));
            String linktest = poweredByLinkTextElem.getText();
            String linkhref = poweredByLinkTextElem.getAttribute("href");
            HyperLink hyperlink = new HyperLink(linktest, linkhref);

            System.out.println(hyperlink.text());
            System.out.println(hyperlink.link());
            //test

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
