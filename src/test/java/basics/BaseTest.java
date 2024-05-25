package basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.WebFormPage;

public class BaseTest {
    protected WebFormPage formPage;

    @BeforeEach
    public void openPage() {
        formPage = new WebFormPage();
        formPage.openFormPage();
        formPage.maximizeWindow();
    }

    @AfterEach
    public void tearDown() {
        formPage.tearDown();
    }
}
