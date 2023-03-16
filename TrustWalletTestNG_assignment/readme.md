<h1 align="center">Assignment</h1>

## 🚀 Installation
To run the automation project, you should run ```mvn verify``` from the command line or

```shell
mvn clean install
```

## 🔥 Executing the tests
To execute the entire set of tests write on the command promp

```shell
Run testng.xml file
```

The test results will be recorded in the root `ExtentReport.html` directory.

## 📁 File structure

Assignment

```
.idea/
failedTestScreenShots/
src/
├─ main/
│  ├─ java/
│  │  ├─ controller/
│  │  ├─ EnvironmentController.java
│  │
│  │  ├─ module/
│  │  ├─ test-data.json
│  │  ├─ User.java
│  │  
│  │  ├─ utils/
│  │  ├─ Endpoints/
│  │
│  │  ├─ resources/
│  │
├─ test/
│  ├─ java/
│  │  ├─ Pages/
│  │  │  ├─ BasePage.java
│  │  │  ├─ CreateWalletJourneyPage.java
│  │  │  ├─ HistoryPage.java
│  │  │  ├─ LoginPage.java
│  │  │  ├─ SettingsPage.java
│  │  │  ├─ WalletPage.java
│  │  │  ├─ WelcomePage.java
│  │
│  │  ├─ TestngListeners/
│  │  │  ├─ Listeners.java
│  │  │  │  │─  TestListener.java
│  │  │  ├─ Rertry.java
│  │  │  │  │─  Retry.java
│  │  ├─ Tests/
│  │  │  │─  BaseTest.java
│  │  │  │─  TrustWalletTests.java
.gitattributes
.gitignore
.app.crx
pom.xml
README.md
testng.xml

```