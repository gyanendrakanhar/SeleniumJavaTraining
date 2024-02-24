package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathLocatorTextMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/cart");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
        if (driver.findElement(By.xpath("//span[text()='Shopping Cart']")).isDisplayed()) {
            System.out.println("Shopping Cart Page is displayed");
        } else {
            System.out.println("Shopping Cart Page is not displayed");
        }
    }
}
