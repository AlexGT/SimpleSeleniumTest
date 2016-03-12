/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleseleniumtest.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author alexb
 */
public class SitePage {
    private final WebDriver driver;
    By verifyText = By.cssSelector("h1");
    
    public SitePage(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    
    public String verifyText(){
        return driver.findElement(verifyText).getText();
    }
    
    public String getUrl(){
        return driver.getCurrentUrl().toLowerCase();
    }
    
}
