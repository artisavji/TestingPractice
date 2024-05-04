import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
    //Particular FileUpload and ScrollDown Page using Action Class

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //For ScrollDown the page

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2000);

        /*JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true");*/

        WebElement fileInput=driver.findElement(By.xpath("//input[@name='picture']"));
        fileInput.sendKeys("C://Users//Admin//IdeaProjects//SeleniumPratice//Users//Admin//Pictures//Screenshots.png");
        Thread.sleep(1000);
        driver.quit();



    }
}
