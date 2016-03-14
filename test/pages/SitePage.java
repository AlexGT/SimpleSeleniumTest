/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author alexb
 */
public class SitePage extends BasePage{
    private final WebDriver driver;
    
    
    @FindBy (css = "h1")
    private WebElement headerLoc;
    
    public SitePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    
    public String getHeader(){
        WebElement header = getBaseElement(headerLoc);
        return header.getText();
    }
    
    public String getUrl(){
        return driver.getCurrentUrl().toLowerCase();
    }
    
}
