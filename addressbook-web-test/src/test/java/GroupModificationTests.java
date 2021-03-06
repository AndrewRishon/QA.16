import com.teran.qa16.TestBase;


    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class GroupModificationTests extends TestBase {

        @Test
        public void testGroupModification() {
            goToGroupPage();
            selectGroup();
            initGroupModification();
            


            wd.findElement(By.linkText("groups")).click();
            wd.findElement(By.name("selected[]")).click();
            wd.findElement(By.name("edit")).click();
            wd.findElement(By.name("group_name")).click();
            wd.findElement(By.name("group_name")).clear();
            wd.findElement(By.name("group_name")).sendKeys("modifiedTestGroupName1");

            wd.findElement(By.name("group_header")).click();
            wd.findElement(By.name("group_header")).clear();
            wd.findElement(By.name("group_header")).sendKeys("modifiedTestGroupHeader1");

            wd.findElement(By.name("group_footer")).click();
            wd.findElement(By.name("group_footer")).clear();
            wd.findElement(By.name("group_footer")).sendKeys("modifiedTestGroupFooter1");
            wd.findElement(By.name("update")).click();
            wd.findElement(By.linkText("group page")).click();
        }

        public void initGroupModification() {
            wd.findElement(By.name("edit")).click();
        }

        public void selectGroup() {

        }

        public void goToGroupPage() {
        }

    }
