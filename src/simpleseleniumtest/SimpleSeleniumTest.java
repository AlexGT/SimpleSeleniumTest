/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleseleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import simpleseleniumtest.pages.SearchPage;
import simpleseleniumtest.pages.SitePage;

/**
 *
 * @author alexb
 */
public class SimpleSeleniumTest {

    /**
     * @param args the command line arguments
     */
    SitePage resultPage;
    SearchPage searchPage;
    
    
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("http://google.com.ua");
        driver.findElement(By.name("q"))
                .sendKeys("Simple Selenium Test");
        driver.findElement(By.name("btnG"))
                .click();
        Thread.sleep(1000);
        String link = driver.findElement(By.partialLinkText("Creating and running a simple Selenium WebDriver test"))
                .getAttribute("href");

        System.out.println(link);
    }
    
}
