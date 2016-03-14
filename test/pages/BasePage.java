package pages;

import elements.AdvancedElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by plowlash on 14.03.2016.
 */
public class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getBaseElement(WebElement e){
        AdvancedElement element = new AdvancedElement(e,this.driver);
        return element.getBaseWebElement();
    }
}
