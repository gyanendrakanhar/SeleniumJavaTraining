package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.name("btnK"));
        if (element.isEnabled()) {
            System.out.println("Element is enabled");
        }
        else {
            System.out.println("Element is not enabled");
        }
    }
}
