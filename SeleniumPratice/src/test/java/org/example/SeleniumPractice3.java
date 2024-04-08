package org.example;
// 17 April Assign:-Launch SpurQ URL using @Test

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumPractice3 {
    public static WebDriver driver;

    @BeforeTest
    public static void setup() {

        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.navigate().to("https://spurquest.com/");
        driver.manage().window().maximize();//move to next url
    }

    @Test
    public static void test() throws InterruptedException {
        String tittle = driver.getTitle();
        System.out.println("Tittle :"+tittle);

        String URL=driver.getCurrentUrl();
        System.out.println("URL:"+URL);
        driver.findElement(By.xpath("//ul[@id='menu-primary-menu']//li//a[@href='#']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//ul[@id='menu-primary-menu']//ul//li//a[@href='https://spurquest.com/'])[1]")).click();

    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }
}

