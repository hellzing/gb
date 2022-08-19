package homework6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransportPage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    public TransportPage(WebDriver driver){
        this.driver=driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//div[contains(@data-marker, 'popular-rubricator')]" +
        "//a[contains(@title,'ВАЗ (LADA)')]")
    public WebElement LadaSectionLink;

}
