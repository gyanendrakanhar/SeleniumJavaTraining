package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
//        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        String text = driver.switchTo().alert().getText();
//        System.out.println(text);
//        driver.switchTo().alert().accept();
//        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.switchTo().alert().sendKeys("testers!");
        driver.switchTo().alert().accept();
    }
}
