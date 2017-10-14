package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverAlho_Example1 {

    public static void main(String[] args) throws InterruptedException{
        String browser="firefox";
        WebDriver driverAlho=WebDriverFactory.getDriver(browser);
        driverAlho.get("https://google.com.mx");
        Thread.sleep(5000);
        driverAlho.close();
        //driverAlho.wait(5000);
        //System.out.println(driverAlho.getCurrentUrl());

    }

}
