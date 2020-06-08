package com.helpcrunch;
import org.junit.*;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.switchTo().frame("helpcrunch-iframe");
        WebElement input = driver.findElement(By.id("helpcrunchChatTextarea"));
        input.clear();
        input.sendKeys("Hello qa test");
        WebElement confirmbutton = driver.findElement(By.className("helpcrunch-chat-send-btn-wrap"));
        confirmbutton.click();
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Dmytro");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("dima-kiev_ua@ukr.net");
        WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"ltr\"]/div[2]/div[2]/div[4]/form/div[5]"));
        continuebutton.click();

        System.out.println("Test completed");


        driver.quit();

    }

}





