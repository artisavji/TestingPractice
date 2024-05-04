import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassMultipleOption {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
        driver.manage().window().maximize();
        WebElement subject = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
        Select select = new Select(subject);
        select.selectByIndex(2);
        System.out.println(select.getOptions().get(2).getText());
        select.selectByVisibleText("Agile Methodology");
        select.deselectByVisibleText("Agile Methodology");
        select.selectByValue("msmanual");
        select.deselectByValue("msmanual");
        System.out.print(select.isMultiple());
        Thread.sleep(5000);
        List<WebElement> options = driver.findElements(By.xpath("//select[@name='multipleselect[]']/option"));
        for (WebElement option : options) {
            System.out.println(option.getText());
            if (option.getText().equals("Selenium") || option.getText().equals("Manual Testing")) {
                select.selectByVisibleText(option.getText());
            }
        }
        driver.quit();
    }
}


