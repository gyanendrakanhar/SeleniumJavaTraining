package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",btnLogin);

//        js.executeScript("alert('Welcome to Selenium Training');");

        String title = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page is: " + title);
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("Title of the page is: " + url);

        js.executeScript("window.scrollBy(0,600)");
    }
}
