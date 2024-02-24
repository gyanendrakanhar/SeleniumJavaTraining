import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstScript {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.equals("Google"))
        {
            System.out.println("Title is correct");
        }
        else{
            System.out.println("Title is incorrect");
        }
        driver.quit();
        //String signinbutton = "//*[@id=\"gb\"]/div/div[2]/a";
    }
}
