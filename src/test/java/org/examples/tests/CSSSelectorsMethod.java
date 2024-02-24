package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSSelectorsMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#input-email")).sendKeys("krishnabambambhft5@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("sdfsdf324");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }
}
