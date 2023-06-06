import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import java.io.File;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest{
    WebDriver driver;
    BrowserGetter browserGetter = new BrowserGetter();
    @BeforeAll
    void beforeAll() {
   //     driver = browserGetter.getChrome();
        driver = browserGetter.getDriver();
    }

    @Test
    void firstTest() throws InterruptedException {
        driver.get("file://"+new File("src/test/resources/htmls/selectorsPage.html").getAbsolutePath());
        Thread.sleep(5000);
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }
}
