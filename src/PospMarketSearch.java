
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PospMarketSearch {

    public WebDriver driver;
    public String baseUrl = "http://ukrposhta.ua/";

    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("ПОСЛУГИ")).click();
        driver.findElement(By.linkText("ПОШТОВІ МАРКИ")).click();
        driver.findElement(By.cssSelector("img[alt=\"Марки\"]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Детальніше >>')])[2]")).click();
        System.out.println("Виконано пошук в Міні Маркет ");
        driver.quit();

    }

}





