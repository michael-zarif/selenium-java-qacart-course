package basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.WebFormPage;

public class BaseTest {
    protected static WebFormPage formPage;
    @BeforeAll
    public static void setup(){
        formPage = new WebFormPage();
    }
    @BeforeEach
    public void openPage() {
        formPage.openFormPage();
        formPage.maximizeWindow();
    }

    @AfterEach
    public void tearDown() {
        formPage.tearDown();
    }
}
