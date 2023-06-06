import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest extends BrowserGetter{
    WebDriver driver;
    BrowserGetter browserGetter = new BrowserGetter();
    @BeforeAll
    void beforeAll() {
        driver = browserGetter.getChrome();
    }

    @Test
    void firstTest() {
        System.out.println("some");
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }
}
