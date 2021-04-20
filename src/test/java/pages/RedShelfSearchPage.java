package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfSearchPage {

    public RedShelfSearchPage (){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    @FindBy (xpath = "//div[@id='search-results-header']//h1")
    public WebElement results;
}
