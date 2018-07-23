

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Trello {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testTrello() throws Exception {

        openSite();




        driver.findElement(By.xpath("//*[@href='/signup']")).click();
        fillNameField("name");
        fillNameField("email");
        fillPasswordField("name", "Andrew");


        driver.findElement(By.linkText("Sign Up – It’s Free.")).click();


        fillPasswordField("email", "andrij");
        fillPasswordField("password");
        fillNameField("password");
        fillPasswordField("password", "qwerty12345");
    }

    public void fillPasswordField(String password, String qwerty12345) {
        fillEmailField(password, qwerty12345);
    }

    public void fillNameField(String name) {
        driver.findElement(By.id(name)).clear();
    }

    public void fillPasswordField(String password) {
        driver.findElement(By.id(password)).click();
    }

    public void fillEmailField(String email, String andrij) {
        driver.findElement(By.id(email)).sendKeys(andrij);
    }

    private void openSite() {
        driver.get("https://trello.com/");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }


    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

        }



