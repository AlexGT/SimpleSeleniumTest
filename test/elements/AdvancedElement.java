package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by plowlash on 14.03.2016.
 */
public class AdvancedElement {
    protected WebElement proxyElement;
    protected WebDriver activeDriver;

    public AdvancedElement(WebElement parentEl, WebDriver driver){
        this.activeDriver = driver;
        proxyElement = parentEl;
    }

    public WebElement getBaseWebElement() {
        (new WebDriverWait(activeDriver, 2))
                .until(ExpectedConditions.elementToBeClickable(proxyElement));
        
        return proxyElement;
    }
}
