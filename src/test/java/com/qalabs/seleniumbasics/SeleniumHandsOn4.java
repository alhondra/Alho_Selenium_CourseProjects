package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException{
        String browser="chrome";
        WebDriver driverAlho = WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.amazon.com.mx/");
        Thread.sleep(5000);
        driverAlho.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Selenium");
        driverAlho.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driverAlho.close();
    }
}
