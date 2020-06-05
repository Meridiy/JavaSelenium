package com.helpcrunch;
import org.junit.*;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class FirstTest {
    @Test
    public void firsttest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Test started");
        driver.manage().window().maximize();
        driver.get("https://helpcrunch.com/ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.cssSelector("body > div.helpcrunch-iframe-wrapper > iframe"));
        element.click();
        System.out.println("clicked!");
        WebElement element2 = driver.findElement(By.cssSelector("body > div.helpcrunch-iframe-wrapper"));
        element2.isDisplayed();
        System.out.println("founded!");
        System.out.println("Test completed");

        driver.quit();

    }

}





