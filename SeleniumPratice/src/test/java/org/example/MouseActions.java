package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.internal.FactoryMethod;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //locate the element to hover over
        WebElement desktop=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][normalize-space()='Desktops']"));
        WebElement mac=driver.findElement(By.xpath("*//a[normalize-space()='Mac (1)']"));
        //Using action class we will perform mousehover action
        Actions act= new Actions(driver);
        //act.moveToElement(desktop).perform();// 1St way
        act.moveToElement(desktop).moveToElement(mac).click().perform(); //2nd way
        Thread.sleep(3000);
        act.moveToElement(mac).click().perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
