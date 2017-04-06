
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class probnik {

    public WebDriver driver;
    public String baseUrl = "http://ukrposhta.ua/";

    public String login = "tmqa";
    public String password =  "240863";

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();

// 1. Логінимось з пустими полями
        logMarket(driver, "","");
//  Тут блок verification буде
        System.out.println("1. Помилка:Невірно задано ім'я користувача чи пароль. ");
// 2. Логінимось з вірним логіном та не вирнім паролем
        logMarket(driver, login, "111111");
//  Тут блок verification буде
        System.out.println("2. Помилка:Невірно задано ім'я користувача чи пароль. ");
// 3. Логінимось з вірними логіном та паролем
        logMarket( driver, login, password);
//  Тут блок verification буде
        System.out.println("Welcome - Вхід в Міні Маркет ");
        driver.quit();
    }
//  Блок логінації
    private void logMarket(WebDriver driver, String login, String password) {
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("МІНІ-МАРКЕТ")).click();
        driver.findElement(By.cssSelector("b")).click();
        driver.findElement(By.name("cust_login")).clear();
        driver.findElement(By.name("cust_login")).sendKeys(login);
        driver.findElement(By.name("cust_pwd")).clear();
        driver.findElement(By.name("cust_pwd")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    }
}