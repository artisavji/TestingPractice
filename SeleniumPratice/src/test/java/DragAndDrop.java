import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        // Launch the Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        // Hit the Url
        driver.get("https://practice.expandtesting.com/drag-and-drop");
        //Import Action class
        Actions action = new Actions(driver);
        WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
        Thread.sleep(2000);

        //User Action object to perform drag and drop
       // action.dragAndDrop(src, target).perform();
        //Thread.sleep(2000);

        //2nd Way Use Action click and hold and release method
        Thread.sleep(2000);
        action.clickAndHold(src).release(target).perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
