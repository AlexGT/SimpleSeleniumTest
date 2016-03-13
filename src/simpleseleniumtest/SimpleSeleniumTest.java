/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleseleniumtest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author alexb
 */
public class SimpleSeleniumTest {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("http://google.com.ua");
        driver.findElement(By.name("q"))
                .sendKeys("Simple Selenium Test");
        driver.findElement(By.name("btnG"))
                .click();
        String link = driver.findElement(By.partialLinkText("Creating and running a simple Selenium WebDriver test"))
                .getAttribute("href");
        driver.get(link);
        String header = driver.findElement(By.cssSelector("h1"))
                .getText();
        driver.close();
        
        System.out.println(link);
        System.out.println(header);
    }
    
}
