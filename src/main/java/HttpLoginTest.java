
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HttpLoginTest {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.xlinx.eu/login");

    WebElement emailInput = driver.findElement(By.name("email"));
    emailInput.sendKeys("ilko.krastev@prolope.net");

    WebElement passwordInput = driver.findElement(By.name("password"));
    passwordInput.sendKeys("11111111");

    passwordInput.submit();
  }
}



