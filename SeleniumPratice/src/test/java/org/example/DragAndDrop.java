package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/drag-and-drop");
        driver.manage().window().maximize();
        //Import Action class
        Actions actions=new Actions(driver);
        WebElement src=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b'])"));
        //  User action object to perform drag & drop
       actions.dragAndDrop(src,target).perform();
       Thread.sleep(3000);
       //close the Browser
        driver.quit();
    }
}
