import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        //Action class, Keyboard action
        // Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Maximize Browser
        driver.manage().window().maximize();
        // Navigate to URL
     //driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions action=new Actions(driver);
        /*action.sendKeys(Keys.ENTER).perform();
       action.sendKeys(Keys.BACK_SPACE).perform();*/
        Thread.sleep(3000);
        // Right Click
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/async-promise.html");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        //Locate element to perform right click operation
        WebElement rightclickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        act.contextClick(rightclickBtn).perform();
        Thread.sleep(3000);
      //  act.doubleClick(rightclickBtn).perform();
       // Thread.sleep(3000);

        driver.quit();
    }
}
