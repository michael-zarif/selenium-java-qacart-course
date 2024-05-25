package basics;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormPageBasicTests extends BaseTest {
    @Test
    public void testWebForm() {
        var expectedTitle = "Web form";
        var actualTitle = formPage.getPageTitle();
        assertEquals(expectedTitle, actualTitle);
        formPage.enterText("Selenium");
        formPage.submitForm();
        var expectedMessage = "Received!";
        var actualMessage = formPage.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
