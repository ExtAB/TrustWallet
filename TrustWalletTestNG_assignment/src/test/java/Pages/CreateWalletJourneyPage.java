package Pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateWalletJourneyPage extends BasePage {
    By createWalletPasswordField = By.cssSelector("input[placeholder='Password']");
    By confirmWalletPasswordField = By.cssSelector("input[placeholder='Confirm password']");
    By termsOfUseButton = By.cssSelector("div div form label span.chakra-checkbox__control.css-3bjp2t");
    By backButton = By.cssSelector("div div form div.chakra-button__group.css-ci3d2t button.chakra-button.css-3uexwc");
    By proceedButton = By.cssSelector("button[data-test='approve-button']");
    By otherWaysToKeepItSafeLink = By.cssSelector("a[data-test='keep-safe-link']");
    By copySecretPhrase = By.cssSelector("button[data-test='copy-phrase-icon']");
    By noThanksButton = By.cssSelector("button[data-test='cancel-button']");
    By privacyPolicy = By.cssSelector("a[data-test='privacy-policy-link']");
    By openWalletButton = By.cssSelector("div button[data-test='open-wallet-button']");
    By setDefaultWalletToggle = By.cssSelector("label[data-test='set-default-wallet-toggle']");

    public CreateWalletJourneyPage(ChromeDriver driver) {
        super(driver);
    }

    public CreateWalletJourneyPage fillPasswordFieldAndProceed(String password) {
        sendKeys(createWalletPasswordField, password);
        sendKeys(confirmWalletPasswordField, password);
        click(termsOfUseButton);
        click(proceedButton);
        return this;
    }

    public CreateWalletJourneyPage startBackUpSecretPhrase() {
        click(proceedButton);
        return this;
    }

    public CreateWalletJourneyPage showSecretPhrase() {
        click(proceedButton);
        return this;
    }

    public CreateWalletJourneyPage solveSecretPhrase() throws IOException, UnsupportedFlavorException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);

        for (String phrase : actualCopedText.split(" ")) {
            clickOnSpecificPhrase(phrase);
        }
        return this;
    }

    public void clickOnSpecificPhrase(String phrase) {
        click(By.cssSelector("div input[value='" + phrase + "']"));
    }

}
