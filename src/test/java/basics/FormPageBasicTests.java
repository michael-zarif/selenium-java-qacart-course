package basics;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormPageBasicTests extends FormBaseTest {
    @Test
    @Order(1)
    public void testWebFormTitle() {
        var expectedTitle = "Web form";
        var actualTitle = formPage.getPageTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    @Order(2)
    public void testWebForm() {
        formPage.enterTextInput("Selenium");
        formPage.submitForm();
        var expectedMessage = "Received!";
        var actualMessage = formPage.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
