package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        // Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(4000);
        // Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(4000);
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        //Verify the ‘Dashboard’ text is display
        driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
        Thread.sleep(4000);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}
