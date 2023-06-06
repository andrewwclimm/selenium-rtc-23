package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {

//    @FindBy(id = "idModuleImage") public WebElement elementWithId;
//    @FindBy(css ="#idModuleImage") public WebElement elementWithCSS;
    @FindBy(className = "w3-btn") public WebElement elementWithClass;
    @FindBy(css = ".w3-btn.w3-padding.w3-border.w3-sand") public WebElement elementWithManyClasses;
    @FindBy(tagName = "h2") public WebElement elementWithTagName;
}
