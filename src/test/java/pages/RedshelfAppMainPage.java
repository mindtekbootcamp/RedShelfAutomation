package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedshelfAppMainPage {

    public RedshelfAppMainPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-catalog-navbar")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@class='rs-navbar-search-button']")
    public WebElement searchButton;

}
