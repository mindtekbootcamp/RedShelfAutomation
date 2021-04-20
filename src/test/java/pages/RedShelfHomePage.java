package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfHomePage {

    public RedShelfHomePage() {

        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "search-catalog-navbar")
    public WebElement searchBar;


    @FindBy (xpath = "//span[@class='rs-navbar-search-button-label']")
    public WebElement searchButton;

    @FindBy (xpath = "//h1[@class='text-center']")
    public WebElement searchMessage;
}
