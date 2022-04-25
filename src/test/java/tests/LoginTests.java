package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition(){
        if(app.user().isLoginSuccess()){
            app.user().logout();
        }
    }


    @Test
    public void loginSuccess(){

       app.user().openLoginForm();
        app.user().fillLoginForm("noa@gmail.com","Nnoa12345$");
        app.user().submitLogin();

        Assert.assertTrue(app.user().isLoginSuccess());

    }


    @Test
    public void loginSuccess2(){

        app.user().openLoginForm();
        app.user().fillLoginForm("noa@gmail.com","Nnoa12345$");
        app.user().submitLogin();

        Assert.assertTrue(app.user().isLoginSuccess());

    }
}
