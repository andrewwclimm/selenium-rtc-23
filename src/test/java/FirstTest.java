import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.FirstPage;

import java.io.File;


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
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }
}
