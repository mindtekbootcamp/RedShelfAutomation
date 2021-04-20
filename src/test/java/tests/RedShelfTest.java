package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RedShelfHomePage;
import pages.RedShelfSearchPage;
import pages.RedShelfSearchlistPage;
import pages.RedshelfAppMainPage;
import utilities.Configuration;
import utilities.TestBase;

public class RedShelfTest extends TestBase {

    @Test
    public void InvalidBookName (){

        driver.get(Configuration.getProperty("RedShelfURL"));

        RedShelfHomePage redShelfHomePage = new RedShelfHomePage();

        redShelfHomePage.searchBar.sendKeys("@%$&*");
        redShelfHomePage.searchButton.click();

        String expected = "Oh No! Looks like we don't have the eBook you're searching for.";
        String actual = redShelfHomePage.searchMessage.getText();

        Assert.assertEquals(actual,expected);

    }

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
    public void PurpleCow (){

        driver.get(Configuration.getProperty("RedShelfURL"));

        String expected = "purple cow";

        RedShelfHomePage redShelfHomePage = new RedShelfHomePage();
        redShelfHomePage.searchBar.sendKeys("  "+expected+" ");
        redShelfHomePage.searchButton.click();

        RedShelfSearchPage redShelfSearchPage = new RedShelfSearchPage();
        String actual = redShelfSearchPage.results.getText();

        Assert.assertTrue(actual.contains(expected));

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
