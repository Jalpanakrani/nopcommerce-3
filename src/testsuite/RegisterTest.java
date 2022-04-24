package testsuite;

import javafx.scene.control.PasswordField;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){

        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        // Find Register link and click on Register link
        clickOnElement(By.className("ico-register"));
        //This is from requirement
        String expectedMessage = "Register";
        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[contains(text(),'Register')]')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    public void verifyUserShouldRegisterAccountSuccessfully(){
        // Find Register link and click on Register link
        clickOnElement(By.className("ico-register"));
        // click on gender radio button
        clickOnElement(By.xpath("//label[contains(text(),'Gender:')]"));
        // Enter First Name
        clickOnElement(By.id("FirstName"));
        //  FirstName Field
        sendTextToElement(By.id("FirstName"),"swaminarayan");
        // Enter Last Name
        clickOnElement(By.name("LastName"));
        //  LastName Field
        sendTextToElement(By.className("LastName"),"Nilkanth");
        // Select day month and year
        clickOnElement(By.id("DateOfBirthDay"));
        //  dayMonthYear Field
        sendTextToElement(By.id("DateOfBirthDay"),"30");
        // Enter Email Address
        clickOnElement(By.id("Email"));
        //  Email address Field
        sendTextToElement(By.id("Email"),"nakranijalpa222@yahoo.com");
        // Click on Password
        clickOnElement(By.id("Password"));
        //  Password Field
        sendTextToElement(By.id("Password"),"patel123");
        // Click on ConfirmPassword
        clickOnElement(By.id("Password"));
        //  ConfirmPassword Field
        sendTextToElement(By.id("Password"),"patel123");
        // Click on REGISTERBUTTOn
        clickOnElement(By.id("register-button"));
        //This is from requirement
        String expectedMessage = "REGISTER";
        // Find the REGISTER element and get the text
        String actualMessage = getTextFromElement(By.xpath("//button[@id='register-button']"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}

