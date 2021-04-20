package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RedShelfAppMainPage;
import pages.RedShelfSearchPage;
import utilities.Configuration;
import utilities.TestBase;

public class RedShelfTest extends TestBase {


    @Test
    public void testCase1() {

        RedShelfAppMainPage redShelfAppMainPage = new RedShelfAppMainPage();
        RedShelfSearchPage redShelfSearchPage = new RedShelfSearchPage();
        driver.get(Configuration.getProperty("RedShelfURL"));

        String expectedBook = "Purple Cow";
        redShelfAppMainPage.searchBar.sendKeys(expectedBook);
        redShelfAppMainPage.searchButton.click();
        String actualBook = redShelfSearchPage.bookTitle.getText();
        Assert.assertTrue(actualBook.contains(expectedBook));




    }

}
