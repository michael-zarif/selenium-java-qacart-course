package webDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverSetup {
    public static ChromeDriver getChromeDriver() {
        // Set ChromeOptions if needed
        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("debuggerAddress","localhost:8888");
        // options.addArguments("--headless"); // Example option

        return new ChromeDriver(options);
    }

    public static FirefoxDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();

        return new FirefoxDriver(options);
    }

    public static EdgeDriver getEdgeDriver() {
        EdgeOptions options = new EdgeOptions();

        return new EdgeDriver(options);
    }
}
