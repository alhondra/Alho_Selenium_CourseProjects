package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn3 {
    public static void main(String[] args) throws InterruptedException{
        String browser="chrome";
        WebDriver driverAlho=WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.facebook.com");
        Thread.sleep(3000);
        driverAlho.findElement(By.xpath("//*[@id=\"email\"]"));
        driverAlho.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("alhondra_g@hotmail.com");
        driverAlho.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ch1pinque");
        driverAlho.findElement(By.xpath("//*[@id='u_0_5']")).click();
        Thread.sleep(5000);
        driverAlho.findElement(By.xpath("//*[@id='u_j_2']/input[2]")).sendKeys("q");
        Thread.sleep(2000);
        //driverAlho.findElement(By.xpath("//*[@id='u_j_2']/input[2]")).click();
        //driverAlho.close();
    }
}
