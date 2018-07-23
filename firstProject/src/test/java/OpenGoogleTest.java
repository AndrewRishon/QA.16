import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGoogleTest {
    WebDriver driver;
@BeforeMethod


    public void setUp() {
        driver = new ChromeDriver();

    }
    @Test
    public void siteOpeningTest(){
        driver.get("https://www.google.com/?hl=ru");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}


