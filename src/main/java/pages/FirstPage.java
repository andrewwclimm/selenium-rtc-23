package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {

    @FindBy(className = "w3-btn") public WebElement elementWithClass;
    @FindBy(css = ".w3-btn.w3-padding.w3-border.w3-sand") public WebElement elementWithManyClasses;
    @FindBy(tagName = "h2") public WebElement elementWithTagName;
    @FindBy(css = "[width='189']") public WebElement imageWithWidth;
    @FindBy(css = "[src*='1878']") public WebElement imageWithSrc;

    @FindBy(css = "[type=\"checkbox\"]") public WebElement checkbox;
    @FindBy(css = "[type=\"radio\"]") public WebElement radio;

    @FindBy(css= "[name = 'coffee']") public WebElement coffee;

}
