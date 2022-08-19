package homework6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AvitoTestRefactoring {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    private final static String AVITO_BASE_URL = "https://avito.ru";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(AVITO_BASE_URL);
    }

    @Test
    void numberOfOffersTest() throws InterruptedException {
        webDriverWait.until(ExpectedConditions.visibilityOf(new MainPage(driver).transportSectionLink));
        new MainPage(driver).transportSectionLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(new TransportPage(driver).LadaSectionLink));
        new TransportPage(driver).LadaSectionLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(new LadaPage(driver).PrioraSectionLink));
        new LadaPage(driver).PrioraSectionLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(new PrioraPage(driver).PrioraOffersNumber));
        String quantity = new PrioraPage(driver).PrioraOffersNumber.getText();

        Assumptions.assumeTrue(Integer.parseInt(quantity)>0);

        System.out.println("Количество объявлений в рубрике = " + quantity);
        Thread.sleep(5000);

    }
    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}
