package Tests;

import TestngListeners.Retry.Retry;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import util.Endpoints;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public ChromeDriver driver;
    public WebDriverWait wait;

    @BeforeSuite
    public void beforeSuite(ITestContext context) {
        for (ITestNGMethod method : context.getSuite().getAllMethods()) {
            method.setRetryAnalyzerClass(Retry.class);
        }
    }

    @BeforeMethod
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("app.crx"));
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get(Endpoints.BASEPAGE.getPath());
        driver.manage().deleteAllCookies();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot takesScreenshot = driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./failedTestsScreenShots/" + result.getName() + ".png"));
        }
        driver.quit();
    }
}