package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopmenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        //Click on computer Tab
        clickOnElement(By.className("sublist-toggle"));
        //This is from requirement
        String expectedMessage = "Computers";
        // Find the welcome text element and get the text
        clickOnElement(By.xpath("//div[@id='dialog-notifications-error']"));
        // Validate actual and expected message
        String actualMessage=getTextFromElement(By.xpath("//div[@id='dialog-notifications-error']"));
         Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    public void verifyUserShouldNavigateToElectronicPageSuccessfully(){
        //Click on Electronic Tab
        clickOnElement(By.className("sublist-toggle"));
        //This is from requirement
        String expectedMessage = "Electronics ";
        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    public void verifyUserShouldNavigateToApparelPageSuccessfully(){
        //Click on Apparel Tab
        clickOnElement(By.className("sublist-toggle"));
        //This is from requirement
        String expectedMessage = "Apparel ";
        // Find the Apparel text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]")) ;
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    public void verifyUserShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Click on Digitaldownloads Tab
        clickOnElement(By.className("sublist-toggle"));
        //This is from requirement
        String expectedMessage = "Digital downloads ";
        // Find the digital download text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    public void verifyUserShouldNavigateToBooksPageSuccessfully() {
        //Click on Books Tab
        clickOnElement(By.className("sublist-toggle"));
        //This is from requirement
        String expectedMessage = "Books";
        // Find the Books text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    public void verifyUserShouldNavigateToJewelryPageSuccessfully() {
        //Click on Jewelry Tab
        clickOnElement(By.className("sublist-toggle"));
        //This is from requirement
        String expectedMessage = "Jewelry ";
        // Find the Jewelry text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    public void verifyUserShouldNavigateToGiftCardsPageSuccessfully() {
        //Click on Gift Cards Tab
        clickOnElement(By.className("sublist-toggle"));
        //This is from requirement
        String expectedMessage = "Gift Cards ";
        // Find the Gift Cards text element and get the text
        String actualMessage =getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
