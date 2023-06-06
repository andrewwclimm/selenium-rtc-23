import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class FirstTest extends BrowserGetter{
    WebDriver driver;
    BrowserGetter browserGetter = new BrowserGetter();
    @BeforeAll
    void beforeAll() {
        driver = browserGetter.getChrome();
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }
}
