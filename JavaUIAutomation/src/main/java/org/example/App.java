package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://avito.ru");
        WebElement searchForm = driver.findElement(By.className("input-input-Zpzc1"));
        searchForm.sendKeys("Lada");
        driver.findElement(By.cssSelector(".button-default-_Uj_C")).click();
        driver.findElement(By.linkText("Priora")).click();
        String quantity = driver.findElement(By.className("page-title-count-wQ7pG")).getText();
        Thread.sleep(5000);
        System.out.println("Количество объявлений в рубрике = " + quantity);
        driver.quit();
    }
}
