package Pages;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.chrome.ChromeDriver;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HistoryPage extends BasePage {
    String transactions;

    public HistoryPage(ChromeDriver driver) {
        super(driver);
    }
}
