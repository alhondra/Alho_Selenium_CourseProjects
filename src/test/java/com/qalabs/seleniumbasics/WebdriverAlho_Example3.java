package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverAlho_Example3 {

    public static void main(String args[]) throws InterruptedException{
        String browser="chrome";
        WebDriver driverAlho = WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.google.com.mx");
        System.out.println("The current URL is: "+driverAlho.getCurrentUrl());
        Thread.sleep(5000);
        driverAlho.get("https://www.facebook.com");
        System.out.println("The current URL is: "+driverAlho.getCurrentUrl());
        Thread.sleep(5000);
        driverAlho.get("https://www.espn.com.mx");
        System.out.println("The current URL is "+driverAlho.getCurrentUrl());
        Thread.sleep(5000);
        driverAlho.navigate().back();
        driverAlho.navigate().back();
        System.out.println("After 2 back buttons the current URL is: "+driverAlho.getCurrentUrl());
        Thread.sleep(5000);
        driverAlho.navigate().forward();
        System.out.println("After 1 forward button clicked the current URL is: "+driverAlho.getCurrentUrl());
        Thread.sleep(5000);
        driverAlho.navigate().refresh();
        System.out.println("Page has been refreshed, the current URL is: "+driverAlho.getCurrentUrl());
        Thread.sleep(5000);
        driverAlho.quit();
    }
}
