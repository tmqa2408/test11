
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rozetka {

        public WebDriver driver;
        public String baseUrl = "http://rozetka.com.ua/";

        @Test
        public void main() {

            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
            driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get(baseUrl + "/");
            driver.findElement(By.linkText("войдите в личный кабинет")).click();
            driver.findElement(By.name("login")).clear();
            driver.findElement(By.name("login")).sendKeys("tretinik@ukr.net");
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys("111111");
            driver.findElement(By.name("auth_submit")).click();

            System.out.println("Введен неверный пароль!");

            driver.get(baseUrl + "/");
            driver.findElement(By.linkText("войдите в личный кабинет")).click();
            driver.findElement(By.name("login")).clear();
            driver.findElement(By.name("login")).sendKeys("tretinik@ukr.net");
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys("240863");
            driver.findElement(By.name("auth_submit")).click();

            System.out.println("Вход в интернет-магазин - OK!");

        }
}

