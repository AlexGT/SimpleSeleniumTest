/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

/**
 *
 * @author alexb
 */
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    private final WebDriver driver;
    
    @FindBy (name = "q")
    private WebElement findString;
    
    @FindBy (name = "btnG")
    private WebElement searchButton;
    
    @FindBy (partialLinkText = "Creating and running a simple")
    WebElement resultLink;
    
    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void setSearchText(String searchString){
        WebElement inputString = (new WebDriverWait(driver, 2))
          .until(ExpectedConditions.elementToBeClickable(findString));
        inputString.sendKeys(searchString);
    }
    
    public void clickSearch(){
        WebElement searchOk = (new WebDriverWait(driver, 2))
          .until(ExpectedConditions.elementToBeClickable(searchButton));
        searchOk.click();
    }
    
    public void clickLink(){
        WebElement result = (new WebDriverWait(driver, 2))
          .until(ExpectedConditions.elementToBeClickable(resultLink));
        result.click();
    }
    
    public void searchText(String searchString){
        this.setSearchText(searchString);
        this.clickSearch();
        this.clickLink();
    }
    
}
