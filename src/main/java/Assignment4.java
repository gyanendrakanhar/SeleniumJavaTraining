import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("krishnabambambhft5@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("sdfsdf324");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

        if (driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).isEnabled()) {
            System.out.println("Logout link is present in the homepage");
        } else {
            System.out.println("Logout link is no present in the homepage");
        }

    }
}
