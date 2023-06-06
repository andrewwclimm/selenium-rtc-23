package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FirstPage {

    @FindBy(className="w3-btn") public WebElement elementWithClass;
    @FindBy(css=".w3-btn.w3-padding.w3-border.w3-sand") public WebElement elementWithManyClasses;
    @FindBy(tagName="h2") public WebElement elementWithTagName;
    @FindBy(css="[width='189']") public WebElement imageWithWidth;
    @FindBy(css="[src*='1878']") public WebElement imageWithSrc;

    @FindBy(css="[type=\"checkbox\"]") public WebElement checkbox;
    @FindBy(css="[type=\"radio\"]") public WebElement radio;

    @FindBy(css="[name='coffee']") public WebElement coffee;

    @FindBy(css="h5") public WebElement h5Element;
    @FindBy(id="idModuleImage") public WebElement getAttributeElement;

    @FindBy(css="[name = \"checkedCheckbox\"]") public WebElement uncheckedCheckbox;

    @FindBy(id="btnForFrameWithId") public WebElement btnForFromId;

    @FindBy(id="btnForFrameWithIndex") public WebElement btnForFromId2;

    @FindBy(css="[src=\"forFrameAsWebElement.html\"]") public WebElement iframe3;

    @FindBy(id="btnForFrameAsWebElement") public WebElement btnForFromId3;
    @FindBy(css="a") public List<WebElement> listOfPages;

}
