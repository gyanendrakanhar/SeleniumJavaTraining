package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathSelectorContainsMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[contains(@href,'contact')])[1]")).click();
        if (driver.findElement(By.xpath("//textarea[contains(@id,'input-enquiry')]")).isDisplayed()) {
            System.out.println("Contact Us Page is displayed");
        } else {
            System.out.println("Contact Us Page is not displayed");
        }
    }
}
