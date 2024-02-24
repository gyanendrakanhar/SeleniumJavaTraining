package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathSelectorStartsWithMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        if (driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).isDisplayed()) {
            System.out.println("Element is displayed on the page");
        }
        driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).click();
    }
}
