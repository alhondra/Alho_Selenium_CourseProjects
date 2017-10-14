package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class SeleniumHandsOn5 {

    public static void main(String[] args) throws InterruptedException{
        String browser="firefox";
        WebDriver driverAlho = WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.facebook.com");
        driverAlho.findElement(By.xpath("//*[@id=\"email\"]"));
        driverAlho.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("juan.tester.123@gmail.com");
        driverAlho.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("tester123");
        driverAlho.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driverAlho.findElement(By.name("q")).sendKeys("QA Minds Lab");
        driverAlho.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driverAlho.findElement(By.xpath("//div[text()='QA Minds Lab']")).click();
        Thread.sleep(10000);
        driverAlho.findElement(By.xpath("//*[@name='xh;pc_message_text']")).sendKeys("hola");
        Thread.sleep(5000);
        //driverAlho.findElement(By.xpath("//*[@name='xhpc_message_text']")).sendKeys(Keys.ENTER);
        driverAlho.findElement(By.xpath("//button[@data-testid='react-composer-post-button']")).click();
        Thread.sleep(5000);
        driverAlho.close();

    }
}
