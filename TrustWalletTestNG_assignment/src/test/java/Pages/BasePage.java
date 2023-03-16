package Pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Data
@AllArgsConstructor
public class BasePage {

    public ChromeDriver driver;
    public WebDriverWait wait;
    private By Wallet = By.cssSelector("div .css-1a15pbm label:nth-child(1)");
    private By History = By.cssSelector("div .css-1a15pbm label:nth-child(2)");
    private By Settings = By.cssSelector("div .css-1a15pbm label:nth-child(3)");

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public BasePage click(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
        return this;
    }

    public void sendKeys(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys(text);
    }
}
