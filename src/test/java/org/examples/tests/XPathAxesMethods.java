package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathAxesMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='input-firstname']//following::input[1]")).sendKeys("Kumar");

        driver.findElement(By.xpath("//input[@value='Continue']//ancestor::div[1]/a")).click();

        driver.findElement(By.xpath("//input[@name='agree']//following-sibling::input")).click();

        driver.navigate().refresh();

        String login = driver.findElement(By.xpath("//a[text()='login page']//parent::p")).getText();
        System.out.println(login);

        driver.findElement(By.xpath("//div[@id='account-register']//descendant::input[4]")).sendKeys("dfds@gmail.com");
    }
}
