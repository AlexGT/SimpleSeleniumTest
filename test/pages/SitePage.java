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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author alexb
 */
public class SitePage {
    private final WebDriver driver;
    
    @CacheLookup
    @FindBy (css = "h1")
    private WebElement headerLoc;
    
    public SitePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public String getHeader(){
        WebElement header = (new WebDriverWait(driver, 10))
          .until(ExpectedConditions.elementToBeClickable(headerLoc));
        return header.getText();
    }
    
    public String getUrl(){
        return driver.getCurrentUrl().toLowerCase();
    }
    
}
