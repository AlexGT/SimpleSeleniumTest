/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleseleniumtest.pages;

/**
 *
 * @author alexb
 */
import org.openqa.selenium.*;

public class SearchPage {
    private final WebDriver driver;
    
    By findString = By.name("q");
    By searchButton = By.name("btnG");
    By resultLink = By.partialLinkText("Creating and running a simple");
    
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

//    public SearchPage() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void setSearchText(String searchString){
        driver.findElement(findString).sendKeys(searchString);
    }
    
    public void clickSearch(){
        driver.findElement(searchButton).click();
    }
    
    public void searchText(String searchString){
        this.setSearchText(searchString);
        this.clickSearch();
    }
    
    public void clickLink(){
        driver.findElement(resultLink).click();
    }
}
