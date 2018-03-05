import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class test {

    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/binary/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.pl");

        WebElement searcher = driver.findElement(By.id("lst-ib"));
        searcher.sendKeys("test");

        searcher.sendKeys(Keys.RETURN);

    }

}
