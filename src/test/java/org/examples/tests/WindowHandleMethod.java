package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowHandleMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//*[@id='newWindowsBtn']")).click();

        Set<String> handles = driver.getWindowHandles();
        for (String handle: handles) {
            if (!mainWindow.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello tester!");
    }
}
