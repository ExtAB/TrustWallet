package Pages;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WelcomePage extends BasePage {

    private By createNewWalletButton = By.cssSelector("div [data-test='welcome-button']");
    private By importOrRecoverWalletButton = By.cssSelector("div div div.css-1ba1iev div div:nth-child(3)");
    private By ledgerButton = By.cssSelector("div div div.css-1ba1iev div div:nth-child(4)");

    public WelcomePage(ChromeDriver driver) {
        super(driver);
    }
}
