import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        String id_FirstName = "input-firstname";
        String id_LastName = "input-lastname";
        String id_Email = "input-email";
        String id_Telephone = "input-telephone";
        String id_Password = "input-password";
        String id_ConfirmPwd = "input-confirm";
        String xpath_Newsletter = "(//input[@name='newsletter'])[1]";
        String name_Agree = "agree";
        String xpath_Continue = "//input[@value='Continue']";
        String xpath_Text = "//div[@id='content']//p";

        driver.findElement(By.id(id_FirstName)).sendKeys("Gyana");
        driver.findElement(By.id(id_LastName)).sendKeys("Krishna");
        driver.findElement(By.id(id_Email)).sendKeys("krishnabambambhft5@gmail.com");
        driver.findElement(By.id(id_Telephone)).sendKeys("84839384");
        driver.findElement(By.id(id_Password)).sendKeys("sdfsdf324");
        driver.findElement(By.id(id_ConfirmPwd)).sendKeys("sdfsdf324");

        if (driver.findElement(By.xpath(xpath_Newsletter)).isDisplayed()) {
            if (!driver.findElement(By.xpath(xpath_Newsletter)).isSelected()) {
                driver.findElement(By.xpath(xpath_Newsletter)).click();
            }
        }

        if (driver.findElement(By.name(name_Agree)).isEnabled()) {
            driver.findElement(By.name(name_Agree)).click();
        }

        driver.findElement(By.xpath(xpath_Continue)).click();

        String text = driver.findElement(By.xpath(xpath_Text)).getText();
        if (text.equals("Congratulations! Your new account has been successfully created!")) {
            System.out.println("Expected Text matches Actual Text \n " + text);
        }
        else {
            System.out.println("Expected Text doesn't match Actual Text");
        }
    }
}
