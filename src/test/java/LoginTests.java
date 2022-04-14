import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void loginSuccess(){

        openLoginForm();
        fillLoginForm("noa@gmail.com","Nnoa12345$");
        submitLogin();

        Assert.assertTrue(isLoginSuccess());

    }

}
