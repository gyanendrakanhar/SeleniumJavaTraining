package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OptionsMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        List<WebElement> options = select.getOptions();
        System.out.println("All options:");
        for (WebElement e: options){
            System.out.println(e.getText());
        }
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("\nFirst selected options:");
        System.out.println(firstSelectedOption.getText());

        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("\nAll selected options:");
        for (WebElement e: selectedOptions){
            System.out.println(e.getText());

        }
//        driver.manage().window().minimize();
    }
}
