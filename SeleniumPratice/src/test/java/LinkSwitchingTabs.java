import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkSwitchingTabs {
    public static void main (String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement link1=driver.findElement(By.linkText("About"));
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        //control+click is the operation we perform to open link in the new tab
        //Action class provides all the methods to handle keyboard actions

        actions.keyDown(Keys.CONTROL).click().perform();
        Thread.sleep(3000);

        driver.close();


    }
}
