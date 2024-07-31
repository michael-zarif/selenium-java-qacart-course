package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import webDriver.WebDriverSetup;

public class WebPage {

    protected final WebDriver driver;

    public WebPage() {
        this.driver = WebDriverSetup.getChromeDriver(); // can be changed to any other browser defined in WebDriverSetup class
    }

    public void openPage(String URL){
        driver.get(URL);
    }

    public void navigateToPage(String URL){
        driver.navigate().to(URL);
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void setSize(int width, int height){
        var dimension = new Dimension(width, height);
        driver.manage().window().setSize(dimension);
    }

    public void tearDown() {
        driver.quit();
    }

}
