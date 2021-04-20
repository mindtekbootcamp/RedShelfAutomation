package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RedShelfHomePage;
import pages.RedShelfSearchPage;
import utilities.Configuration;
import utilities.TestBase;

public class TestCase2 extends TestBase {

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

}
