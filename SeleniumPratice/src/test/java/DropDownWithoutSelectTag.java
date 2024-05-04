import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectTag {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        // select using button tag
        WebElement dev=driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
        //If you try to use select class for button it won't work
        // Select select=new Select(dev);
        // select.selectByVisibleText("Support");
        dev.click();
//        //to pause script inspect->sources->Event Listener Breakpoints->Mouse->auxiclick
//        webDriver.findElement(By.xpath("//li[@class='developers-dd-toggle']/a[@title='Support']")).click();
//        webDriver.close();
//    }


        driver.quit();
    }
}
