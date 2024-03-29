package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);
        select.selectByValue("Mexico");
        select.selectByIndex(7);
        select.selectByIndex(3);
        select.selectByVisibleText("Germany");
        select.deselectByValue("Mexico");
        select.deselectByIndex(3);
        select.deselectByVisibleText("Germany");
        select.deselectAll();

    }
}
