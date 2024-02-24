package org.examples.tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        Point point = driver.manage().window().getPosition();
//        System.out.println(point.x);
//        System.out.println(point.y);
//        Point point1 = new Point(300, 600);
//        driver.manage().window().setPosition(point1);
        Dimension dimension = new Dimension(300, 500);
        driver.manage().window().setSize(dimension);
    }
}
