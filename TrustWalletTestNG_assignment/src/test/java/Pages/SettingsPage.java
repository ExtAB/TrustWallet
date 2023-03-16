package Pages;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SettingsPage extends BasePage {

    By wallet = By.cssSelector("div.css-q8297i div div button:nth-child(1) div.css-vq1xhi p");

    By network = By.cssSelector("div.css-q8297i div div button:nth-child(2) div.css-vq1xhi p");
    By connect_dApps = By.cssSelector("div.css-q8297i div div button:nth-child(3) div.css-vq1xhi div");

    By language = By.cssSelector("div.css-q8297i div div button:nth-child(4) div.css-vq1xhi div");

    By colorMode = By.cssSelector("div.css-q8297i div div button:nth-child(5) div.css-vq1xhi div");

    By setAsDefaultWallet = By.cssSelector("div.css-q8297i div div button:nth-child(6) div.css-vq1xhi div");

    By shareProductAnalytics = By.cssSelector("div.css-q8297i div div button:nth-child(7) div.css-vq1xhi div");

    By viewSecretPhrase = By.cssSelector("div.css-q8297i div div button:nth-child(8) div.css-vq1xhi div");

    By developerSettings = By.cssSelector("div.css-q8297i div div button:nth-child(9) div.css-vq1xhi div");

    By blocked_dApps = By.cssSelector("div.css-q8297i div div button:nth-child(10) div.css-vq1xhi div");

    By helpAndSupport = By.cssSelector("div.css-q8297i div div button:nth-child(11) div.css-vq1xhi div");

    By lock = By.cssSelector("div.css-q8297i div div button:nth-child(13) div.css-vq1xhi div");

    public SettingsPage(ChromeDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfWallets() {
        return driver.findElement(By.cssSelector("div ul li")).findElements(By.cssSelector("button"));
    }

    public List<WebElement> getListOfNetworks() {
        return null;
    }

    public void changeLanguageTo(String desiredLanguage) {
        //[add impementation for future tests]
    }

    public void checkConnectedDApps() {
        //[add impementation for future tests]
    }


    public void changeColorModeTo(String desiredColor) {
        //[add impementation for future tests]
    }

    public void showSecretPhrase() {
        //[add impementation for future tests]
    }

    public void downloadSecretPhrase() {
        //[add impementation for future tests]
    }

    public void lockWallet() {
        driver.findElement(lock).click();
    }
}
