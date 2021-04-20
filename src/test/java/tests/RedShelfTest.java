package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RedShelfSearchlistPage;
import pages.RedshelfAppMainPage;
import utilities.Configuration;
import utilities.TestBase;

public class RedShelfTest extends TestBase {

    @Test
    public void testCase3(){
        RedshelfAppMainPage redShelfAppMainPage = new RedshelfAppMainPage();
        RedShelfSearchlistPage redShelfSearchlistPage = new RedShelfSearchlistPage();

        driver.get(Configuration.getProperty("RedShelfURL"));
        String expectedBook = "Purple Cow";
        redShelfAppMainPage.searchBar.sendKeys(expectedBook);
        redShelfAppMainPage.searchButton.click();

        redShelfSearchlistPage.bookTitle.click();
        String isbnNUM = redShelfSearchlistPage.isbn.getText();

        redShelfAppMainPage.searchBar.sendKeys(isbnNUM);
        redShelfAppMainPage.searchButton.click();
        String actualBook = redShelfSearchlistPage.bookTitle.getText();
        System.out.println(actualBook);

        Assert.assertTrue(actualBook.contains(expectedBook));
    }

    @Test
    public void testCase5(){
        RedshelfAppMainPage redshelfAppMainPage = new RedshelfAppMainPage();
        RedShelfSearchlistPage redShelfSearchlistPage = new RedShelfSearchlistPage();
        String expectedName = "Seth Godin";

        driver.get(Configuration.getProperty("RedShelfURL"));
        redshelfAppMainPage.searchBar.sendKeys(expectedName);
        redshelfAppMainPage.searchButton.click();
        String actualName = redShelfSearchlistPage.authorName.getText();
        System.out.println(actualName);
        Assert.assertTrue(actualName.contains(expectedName));
    }
}
