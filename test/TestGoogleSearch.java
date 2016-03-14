/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;

/**
 *
 * @author alexb
 */
public class TestGoogleSearch extends BaseTest{
    
    @Test
    public void testSearch() throws InterruptedException{
        searchPage.searchText("Simple Selenium Test");
        
        Assert.assertEquals("Creating and running a simple Selenium WebDriver test", resultPage.getHeader());
        System.out.println(resultPage.getHeader());
        System.out.println(resultPage.getUrl());
    }
}