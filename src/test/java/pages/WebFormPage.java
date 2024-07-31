package pages;

import org.openqa.selenium.By;

public class WebFormPage extends WebPage {

    public void openFormPage(){
        openPage("https://www.selenium.dev/selenium/web/web-form.html");
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

}