import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        WebElement radioButton= driver.findElement(By.xpath("//input[@value='Option 2']"));
      System.out.println(radioButton.isSelected());//before click want to check is selcted or not
        radioButton.click();
      //  System.out.println(radioButton.isSelected());  //after click want to check is selcted or not
        List<WebElement>radiolist;
        radiolist=driver.findElements(By.xpath("//input[@type='radio']")); //get all radioButton in 1 list
        for (WebElement radioButton1:radiolist)
        {
            System.out.println(radioButton1.getAttribute("value"));// Fetch all attribute of "value"
            if (!radioButton1.isSelected())
            {
                radioButton1.click();
                Thread.sleep(2000);
            }
        }

        driver.close();
    }
}
