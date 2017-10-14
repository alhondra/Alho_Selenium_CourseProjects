package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandsOn6 {

    public static void main(String[] args) throws InterruptedException{
        String browser="firefox";
        WebDriver driverAlho=WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.wikipedia.org/");
        Thread.sleep(2000);
        driverAlho.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Selenium"+Keys.ENTER);
        Thread.sleep(2000);
       // driverAlho.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Selenium"+Keys.ENTER);
        Thread.sleep(8000);
        driverAlho.close();
    }
}
