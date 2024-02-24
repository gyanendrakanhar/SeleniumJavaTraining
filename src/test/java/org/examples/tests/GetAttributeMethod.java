package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttributeMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        String value = driver.findElement(By.name("btnK")).getAttribute("data-ved");
        System.out.println(value);
    }
}
