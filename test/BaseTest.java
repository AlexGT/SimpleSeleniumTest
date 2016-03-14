
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.SearchPage;
import pages.SitePage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a_belchikov
 */
public class BaseTest {
    protected WebDriver driver;
    protected SearchPage searchPage;
    protected SitePage resultPage;
    
    @Before
    public void initDriver(){
        driver = new FirefoxDriver();
        searchPage = new SearchPage(driver);
        resultPage = new SitePage(driver);
        driver.get("http://google.com.ua");
    }
    
    @After
    public void tearDown(){
    driver.close();
    driver.quit();
    }
}
