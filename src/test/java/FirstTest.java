import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.FirstPage;

import java.io.File;
import java.util.Set;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest{
    WebDriver driver;
    BrowserGetter browserGetter = new BrowserGetter();
    FirstPage page ;
    @BeforeAll
    void beforeAll() {
   //     driver = browserGetter.getChrome();
        driver = browserGetter.getDriver();
        page = PageFactory.initElements(driver,FirstPage.class);
    }

    @Test
    void firstTest() throws InterruptedException {
        driver.get("file://"+new File("src/test/resources/htmls/selectorsPage.html").getAbsolutePath());
        Thread.sleep(2000);
    }

    @Test
    void secondTest() throws InterruptedException {
        driver.get("file://"+new File("src/test/resources/htmls/interactions.html").getAbsolutePath());
        Thread.sleep(5000);
        page.checkbox.click();
        page.radio.click();
        page.checkbox.sendKeys(Keys.TAB);

        Select coffeeDropdown = new Select(page.coffee);
        coffeeDropdown.deselectAll();
        coffeeDropdown.selectByIndex(2);
        coffeeDropdown.selectByValue("1");
        for (WebElement webElement : coffeeDropdown.getOptions()){
            System.out.println(webElement.getText());
        }
        System.out.println(page.uncheckedCheckbox.getAttribute("src"));
        System.out.println(page.uncheckedCheckbox.getAttribute("id"));
        System.out.println(page.uncheckedCheckbox.getAttribute("name"));
    }

    @Test
    void testIframes() throws InterruptedException {
        driver.get("file://"+new File("src/test/resources/htmls/withIframes.html").getAbsolutePath());
        Thread.sleep(5000);
        driver.switchTo().frame("frameWithId");
        System.out.println(page.btnForFromId.getText());
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        System.out.println(page.btnForFromId2.getText());
        driver.switchTo().defaultContent();

        driver.switchTo().frame(page.iframe3);
        System.out.println(page.btnForFromId3.getText());
        driver.switchTo().defaultContent();
    }

    @Test
    void testCookies() throws InterruptedException {
        driver.get("https://www.example.com");
        driver.manage().addCookie(new Cookie("firstName","firstValue"));
        Set<Cookie> cookieSet =  driver.manage().getCookies();
        for(Cookie cookies: cookieSet){
            System.out.println(cookies);
            System.out.println("/////////////////////////////");
        }
        System.out.println(driver.manage().getCookieNamed("firstName").getValue());
        driver.manage().deleteCookieNamed("firstName");
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }
}
