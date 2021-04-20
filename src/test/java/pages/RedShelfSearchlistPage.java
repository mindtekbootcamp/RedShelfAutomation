package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfSearchlistPage {

    public RedShelfSearchlistPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@data-id='707568']//a[@class='title text-book-title']")
    public WebElement bookTitle;

    @FindBy(xpath = "//span[@class='significant-isbn']")
    public WebElement isbn;

    @FindBy(xpath = "//div[@data-id='521026']//a[@class='title text-book-title']")
    public WebElement authorName;
}
