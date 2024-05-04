import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

          //select single option using select class


public class SelectClassSingleOption {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
        driver.manage().window().maximize();
       // WebElement subject=driver.findElement(By.xpath("//select[@name='dropdown']"));
        WebElement subject1 =driver.findElement(By.xpath("//select[@name='dropdown']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", subject1);
        Select select=new Select(subject1);
        select.selectByIndex(2);
      Thread.sleep(3000);
        System.out.println(select.getOptions().get(2).getText());
        select.selectByVisibleText("Automation Testing");
        Thread.sleep(3000);
        System.out.println(select.getOptions().get(2).getText());
        select.selectByVisibleText("Automation Testing");
        Thread.sleep(3000);
        select.selectByValue("ddmanual");
        Thread.sleep(3000);
        System.out.print(select.isMultiple());

       driver.close();

    }
}