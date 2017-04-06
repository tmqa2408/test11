
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testRoz {

    public WebDriver driver;
    public String baseUrl = "http://rozetka.com.ua/";

    public String email = "tretinik@ukr.net";
    public String pass =  "240863";

    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        log(driver, email,"111111");
        System.out.println("Введен неверный пароль!");
        log(driver, email, pass);
        System.out.println("Вход в интернет-магазин - OK!");
    }
// блок  login
    public void log (WebDriver driver, String email, String pass){
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("войдите в личный кабинет")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys(email);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.name("auth_submit")).click();
    }
}

