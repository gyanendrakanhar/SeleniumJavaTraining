package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathSelectorLogicalMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("dsfdsfs");
        driver.findElement(By.id("input-password")).sendKeys("dfer323");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();

        driver.findElement(By.xpath("//a[@class='btn btn-primary' or @text='Continue']")).click();
    }
}
