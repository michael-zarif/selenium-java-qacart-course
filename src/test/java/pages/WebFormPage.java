package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebFormPage {

    private final WebDriver driver;

    public WebFormPage() {
        this.driver = WebDriverSetup.getChromeDriver(); // can be changed to any other browser defined in WebDriverSetup class
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void openFormPage() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void enterText(String text) {
        driver.findElement(By.id("my-text-id")).sendKeys(text);
    }

    public void submitForm() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public String getMessage() {
        return driver.findElement(By.id("message")).getText();
    }

    public void tearDown() {
        driver.quit();
    }
}