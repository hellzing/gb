package com.geekbrains.lesson5.homework5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class AvitoTest {
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
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(@href,'transport')]")));
        WebElement transportSection = driver.findElement(By.xpath("//a[contains(@href,'transport')]"));
        transportSection.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@data-marker, 'popular-rubricator')]" +
                        "//a[contains(@title,'ВАЗ (LADA)')]")));
        driver.findElement(By.xpath("//div[contains(@data-marker, 'popular-rubricator')]" +
                "//a[contains(@title,'ВАЗ (LADA)')]")).click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.linkText("Priora")));
        driver.findElement(By.linkText("Priora")).click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("span[contains(@data-marker, 'page-title/count')]")));

        String quantity = driver.findElement(By.xpath("span[contains(@data-marker, 'page-title/count')]"))
                .getText();
        Assumptions.assumeTrue(Integer.parseInt(quantity)>0);

        System.out.println("Количество объявлений в рубрике = " + quantity);
        Thread.sleep(5000);

    }
    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}
