/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;
import pages.SearchPage;
import pages.SitePage;

/**
 *
 * @author alexb
 */
public class TestGoogleSearch extends BaseTest{
    
    @Test
    public void testSearch() throws InterruptedException{
        searchPage = new SearchPage(driver);
        searchPage.searchText("Simple Selenium Test");
        
        resultPage = new SitePage(driver);
        Assert.assertEquals("Creating and running a simple Selenium WebDriver test", resultPage.getHeader());
        System.out.println(resultPage.getHeader());
        System.out.println(resultPage.getUrl());
    }
}