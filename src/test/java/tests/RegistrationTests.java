package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

   @Test
    public void registrationSuccess(){
        int i =(int) (System.currentTimeMillis()/1000)%3600;
        String email = "wick"+i+"@mail.com";

        app.user().openRegistrationForm();
        app.user().fillRegistrationForm("John",
                "Wick",
                email,
                "Wick12345$",
                "Wick12345$",
                "+8765432100");
        app.user().checkPolicy();
        app.user().submitRegistration();

        Assert.assertTrue(app.user().isRegistrationSuccess(email));
    }

}
