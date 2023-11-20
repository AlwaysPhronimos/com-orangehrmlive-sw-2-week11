package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {

        // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).click();
        Thread.sleep(4000);


        // Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(4000);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
