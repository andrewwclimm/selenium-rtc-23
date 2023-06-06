import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }
}
