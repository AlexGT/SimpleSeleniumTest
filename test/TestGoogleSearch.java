/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import simpleseleniumtest.pages.SearchPage;
import simpleseleniumtest.pages.SitePage;

/**
 *
 * @author alexb
 */
public class TestGoogleSearch {
    WebDriver driver;
    SitePage resultPage;
    SearchPage searchPage;
    
    
    @Before
    public void openPage(){
        driver = new FirefoxDriver();
        driver.get("http://google.com.ua");
    }
    
    @Test
    public void testSearch() throws InterruptedException{
        searchPage = new SearchPage(driver);
        searchPage.searchText("Simple Selenium Test");
        searchPage.clickLink();
        
        resultPage = new SitePage(driver);
        Assert.assertEquals("Creating and running a simple Selenium WebDriver test", resultPage.verifyText());
        System.out.println(resultPage.verifyText());
    }
}
