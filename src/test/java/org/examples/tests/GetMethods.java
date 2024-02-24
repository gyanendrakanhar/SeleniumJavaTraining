package org.examples.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String source = driver.getPageSource();

        System.out.println(url + " " + title + " " + source);

        if(source.contains("return"))
        {
            System.out.println("The text is present in the source.");
        }
        else
        {
            System.out.println("The text is not present in the source.");
        }
        driver.get("https://naukri.com");
        driver.quit();
    }
}
