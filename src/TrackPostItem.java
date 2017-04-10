
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrackPostItem {

    public WebDriver driver;
    public String baseUrl = "http://ukrposhta.ua/";

    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("ВІДСТЕЖИТИ")).click();
        driver.findElement(By.linkText("формою пошуку")).click();
        driver.findElement(By.id("ctl00_centerContent_txtBarcode")).clear();
        driver.findElement(By.id("ctl00_centerContent_txtBarcode")).sendKeys("1234567890123");
        driver.findElement(By.id("ctl00_centerContent_btnFindBarcodeInfo")).click();

        driver.quit();

    }

}

