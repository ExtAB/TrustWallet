package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class TrustWalletTests extends BaseTest {
    @Test(testName = "As a trust wallet user I want to create a valid wallet", groups = "Regression")
    public void Create_A_Valid_TrustWallet() throws IOException, UnsupportedFlavorException, InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        CreateWalletJourneyPage createWalletJourneyPage = new CreateWalletJourneyPage(driver);
        WalletPage walletPage = new WalletPage(driver);

        welcomePage.click(welcomePage.getCreateNewWalletButton());
        createWalletJourneyPage
                .fillPasswordFieldAndProceed("AwesomeCandidate101@RockIt.com");
        Thread.sleep(5000);
        // TODO: 3/16/2023 there seems to be a bug that you need to re-do it twice
        createWalletJourneyPage
                .fillPasswordFieldAndProceed("AwesomeCandidate101@RockIt.com");
        Thread.sleep(5000);

        createWalletJourneyPage
                .startBackUpSecretPhrase()
                .showSecretPhrase()
                .click(createWalletJourneyPage.getCopySecretPhrase())
                .click(createWalletJourneyPage.getProceedButton());

        createWalletJourneyPage.solveSecretPhrase()
                .click(createWalletJourneyPage.getProceedButton())
                .click(createWalletJourneyPage.getProceedButton())
                .click(createWalletJourneyPage.getOpenWalletButton());

        walletPage.confirmPopUp();
        Assert.assertTrue(walletPage.getCurrencyListHomepage().size() > 0);
    }

    public void otherTestsWouldInclude() {
        HistoryPage historyPage = new HistoryPage(driver);
        SettingsPage settingsPage = new SettingsPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WalletPage walletPage = new WalletPage(driver);
    }

    public void positiveTestCases() {
    }

    public void negativeTestCases() {
    }

    public void performanceTestCases() {
    }
}