package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
public class LoginTest extends BaseTest {

    @Test
    public void testInvalidLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "invalid_pass");


        String actualError = loginPage.getErrorMessage();

        String expectedError = "Kullanıcı adi ve sifre uyusmuyor";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Assert.assertEquals(actualError, expectedError,
                "Hata mesajı beklenenden farklı!");
    }
}
