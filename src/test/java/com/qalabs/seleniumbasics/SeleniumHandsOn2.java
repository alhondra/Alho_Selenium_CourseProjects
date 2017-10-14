package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn2 {

    public static void main(String[] args) throws InterruptedException{
        String browser="chrome";
        WebDriver driverAlho= WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.google.com/");
        driverAlho.findElement(By.id("lst-ib"));
        System.out.println("Encontre el elemento lst-ib");
        driverAlho.findElement(By.id("lst-ib")).sendKeys("Selenium");
        driverAlho.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
        Thread.sleep(5000);
        driverAlho.close();
    }
}
