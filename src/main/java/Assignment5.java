import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assignment5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("krishnabambambhft5@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("sdfsdf324");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        WebElement Laptop_Menu = driver.findElement(By.xpath("(//a[text()='Laptops & Notebooks'])"));
        WebElement Show_all = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Laptop_Menu).click(Show_all).build().perform();

        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();

        String item1 = driver.findElement(By.xpath("(//a[contains(@href,'product_id=44')])[4]")).getText();
        String item2 = driver.findElement(By.xpath("(//a[contains(@href,'product_id=45')])[4]")).getText();
        if (item1.equals("MacBook Air")) {
            System.out.println("Macbook Air is added to Cart");
        } else {
            System.out.println("Macbook Air not added to Cart");
        }
        if (item2.equals("MacBook Pro")) {
            System.out.println("MacBook Pro is added to Cart");
        } else {
            System.out.println("MacBook Pro is not added to Cart");
        }

        String price = driver.findElement(By.xpath("(//table[@class='table table-bordered'])[3]//tr[1]//td[2]")).getText();
        if (price.equals("$3,000.00")) {
            System.out.println("Price is correct");
        } else {
            System.out.println("Price is incorrect");
        }
        driver.findElement(By.xpath("//a[text()='Checkout']")).click();

        driver.quit();
    }
}
