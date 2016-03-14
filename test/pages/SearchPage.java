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

public class SearchPage extends BasePage {
    private final WebDriver driver;

    @FindBy(name = "q")
    private WebElement findString;
    
    @FindBy (name = "btnG")
    private WebElement searchButton;
    
    @FindBy (partialLinkText = "Creating and running a simple")
    private WebElement resultLink;
    
    public SearchPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    
    public void setSearchText(String searchString){
        WebElement inputString = getBaseElement(findString) ;
        inputString.sendKeys(searchString);
    }
    
    public void clickSearch(){
        WebElement searchOk = getBaseElement(searchButton);
        searchOk.click();
    }
    
    public void clickLink(){
        WebElement result = getBaseElement(resultLink);
        result.click();
    }
    
    public void searchText(String searchString){
        this.setSearchText(searchString);
        this.clickSearch();
        this.clickLink();
    }
    
}
