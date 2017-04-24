
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PostMarket1 {

    public WebDriver driver;
    public String baseUrl = "http://ukrposhta.ua/";

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("МІНІ-МАРКЕТ")).click();
        driver.findElement(By.cssSelector("b")).click();
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

        driver.quit();
    }
}
