package Pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WalletPage extends BasePage {

    By currencyTopButton = By.cssSelector("div.css-1jpd1oc div.css-16vgtsw div.css-f24u0f div.css-79elbk div div div button div svg");
    By manageTokens = By.cssSelector("#manage-tokens-button");
    By sendButton = By.cssSelector("div.css-1jpd1oc div.css-16vgtsw div.css-1n6d3no button:nth-child(1)");

    By recieveButton = By.cssSelector("div.css-1jpd1oc div.css-16vgtsw div.css-1n6d3no button:nth-child(2)");
    //    List<WebElement> currencyListHomepage = driver.findElements(By.cssSelector("div.css-19lfz3i"));
    By removePopUp = By.cssSelector("#chakra-modal--header-1 button svg");

    By popUpButton = By.cssSelector("#chakra-modal-1 footer div button");

    public WalletPage(ChromeDriver driver) {
        super(driver);
    }

    public void confirmPopUp() {
        click(popUpButton);
        click(popUpButton);
    }

    public List<WebElement> getCurrencyListHomepage() {
        return driver.findElements(By.cssSelector("div.css-19lfz3i"));
    }
}