package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //find login link and click on Login link
        clickOnElement(By.linkText("Log in"));
        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //find the welcome,please Sign In text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        //validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {
        //find login link and click on Login link
        clickOnElement(By.linkText("Log in"));
        //Enter valid username
        clickOnElement(By.id("Email"));
        //sending field valid username
        sendTextToElement(By.id("Email"),"nakranijalpa222@yahoo.com");
        // Find the invalid password field element
        clickOnElement(By.name("Password"));
        //     Sending invalid Password to password field element
        sendTextToElement(By.name("Password"),"jalpa123");

        //Find the login button and click on it
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
        //This is from requirement
        String expectedMessage = "Log out";

        //find the log out text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!"));
        //validate actual and expected message
    }
    @Test
    public void verifyTheErrorMessage() {
        //find login link and click on Login link
        clickOnElement(By.linkText("Log in"));
        //Enter invalid username
        clickOnElement(By.id("Email"));
        //sending field invalid username
        sendTextToElement(By.id("Email"),"nakranijalpa222@yahoo.com");
        // Find the invalid password field element
        clickOnElement(By.name("Password"));
        //     Sending invalid Password to password field element
        sendTextToElement(By.name("Password"),"jalpa");
        //Find the login button and click on it
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
        //This is from requirement
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again." +
                "No customer account found";
        //find the welcome,please Sign In text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        //validate actual and expected message
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
