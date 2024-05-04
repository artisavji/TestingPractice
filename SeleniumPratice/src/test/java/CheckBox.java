import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//23 April

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
      //  driver.quit();
        driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='checkbox2']")).isSelected();
        Thread.sleep(2000);
        List<WebElement>checkboxlist;
        checkboxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement checkbox:checkboxlist) {
            if (!checkbox.isSelected())
                checkbox.click();
        }
        Thread.sleep(2000);
        driver.quit();

      }
     }
