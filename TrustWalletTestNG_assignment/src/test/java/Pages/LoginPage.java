package Pages;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginPage extends BasePage {

    By passwordField = By.cssSelector("#field-1");
    By unlockButton = By.cssSelector("div > div > form > button");
    By hiddenButton = By.cssSelector("div div form div.css-8atqhb div div div");
    By forgottenPassword = By.cssSelector("div div form p.chakra-text.chakra-link.css-1rwjqd8");
    By resetWallet = By.cssSelector("div div form p.chakra-text.chakra-link.css-zh7q6e");
    By resetWalletConfirmationButton = By.cssSelector("#chakra-modal-3 footer button.chakra-button.css-1e9k14z");
    By resetWalletCancelationButton = By.cssSelector("#chakra-modal-3 footer button.chakra-button.css-1tqcdlw");

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public void loginToWallet(String password) {
        sendKeys(passwordField, password);
    }

    public boolean isUnlockedButtonDisabled() {
        return driver.findElement(unlockButton).isEnabled();
    }

    public void resetWalletAction() {
        click(resetWallet);
        click(resetWalletConfirmationButton);
    }
}