package util;

public enum Endpoints {
    BASEPAGE("First thing when you open the app you get the Homepage of TrustWallet", "chrome-extension://egjidjbpglichdcondbcbdnbeeppgdph/home.html#/onboarding"),
    PASSWORD_PAGE("[Insert_explanation_here]", "/create/password"),
    INITIATE_PHRASE_PAGE("[Insert_explanation_here]", "/create/seed-phrase-initiate");
    // so on...
    String summary;
    String path;

    Endpoints(String summary, String path) {
        this.summary = summary;
        this.path = path;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getPath() {
        return this.path;
    }
}
