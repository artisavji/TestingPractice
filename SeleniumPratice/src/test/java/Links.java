import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        //To click on link using whole Text
      /*  WebElement link1 = driver.findElement(By.linkText("About"));
        link1.click();
        Thread.sleep(2000);*/
        //To click on link using some part of Text
       /* WebElement link2 = driver.findElement(By.partialLinkText("Abou"));
        link2.click();
        Thread.sleep(2000);*/
        //Access all links and need all links to store in list
        List<WebElement> alllinks;
        //to find multiple elements in list use findElements&use method tagname bcz links identify using anchor tag so use tagname method
        alllinks = driver.findElements(By.tagName("a"));
        System.out.println("alllinks");
        for (WebElement link : alllinks) {
            /*System.out.println(link.getText());// getText =Fetch all text on webpage
            System.out.println(link.getAttribute("href")); //getAttribute=Fetch all links on Webpage*/
            try {
                if (link.getText().equals("About"))  //want to check "about" link in all links then click on about link use only these single line
                {
                    link.click();
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
            }
        }
        driver.close();

    }
}
