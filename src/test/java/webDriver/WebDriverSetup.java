package webDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverSetup {
    public static ChromeDriver getChromeDriver() {
        // Set ChromeOptions if needed
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Example option

        return new ChromeDriver(options);
    }

    public static EdgeDriver getEdgeDriver() {
        return new EdgeDriver();
    }
}
