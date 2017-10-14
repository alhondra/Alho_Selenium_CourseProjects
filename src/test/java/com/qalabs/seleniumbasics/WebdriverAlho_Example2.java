package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class WebdriverAlho_Example2 {

    public static void main(String[] args) throws InterruptedException {
        String browser=("firefox");
        WebDriver driverAlho = WebDriverFactory.getDriver(browser);
        driverAlho.get("https://google.com.mx");
        String title = driverAlho.getTitle();
        String url = driverAlho.getCurrentUrl();
        String source=driverAlho.getPageSource();
        Thread.sleep(1000);
        driverAlho.close();
        System.out.println("The page title is: "+title);
        Thread.sleep(1000);
        System.out.println("The URL is:"+ url);
        Thread.sleep(5000);
        System.out.println("The Page Source is:");
        Thread.sleep(1000);
        System.out.println(source);
        Thread.sleep(1000);
        System.out.println(" ... Gracias");

    }
}
