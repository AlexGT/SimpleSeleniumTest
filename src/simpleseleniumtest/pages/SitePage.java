/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleseleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author alexb
 */
public class SitePage {
    private final WebDriver driver;
    By verifyText = By.cssSelector("h1");
    
    public SitePage(WebDriver driver){
        this.driver = driver;
    }
    
    public String verifyHeader(){
        Boolean header = (new WebDriverWait(driver, 2))
          .until(ExpectedConditions.textToBePresentInElementLocated(verifyText, ""));
        return driver.findElement(verifyText).getText();
    }
    
    public String getUrl(){
        return driver.getCurrentUrl().toLowerCase();
    }
    
}
