package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WebdriverAlho_Example4 {
    public static void main(String[] args) throws InterruptedException {
        String browser = "chrome";
        WebDriver driverAlho = WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.youtube.com/");
        driverAlho.findElement(By.id("search-container"));
        if (driverAlho.findElement(By.id("search-container")).isEnabled())
            System.out.println("Se encontro el elemento " + driverAlho.findElement(By.id("search-container")).toString());
        driverAlho.findElement(By.id("search-container")).sendKeys("Selenium");
        driverAlho.findElement(By.id("search-icon-legacy"));
        driverAlho.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(5000);
        driverAlho.close();
    }
}
