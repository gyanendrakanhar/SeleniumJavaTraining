package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class isDisplayedMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));

        if (driver.findElement(By.name("newsletter")).isDisplayed()) {
            if (!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()) {
                driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
            }
        }
        if (driver.findElement(By.name("agree")).isEnabled()) {
            driver.findElement(By.name("agree")).click();
        }
    }
}
