import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void registrationSuccess(){
        int i =(int) (System.currentTimeMillis()/1000)%3600;
        String email = "wick"+i+"@mail.com";

        openRegistrationForm();
        fillRegistrationForm("John","Wick",email,"Wick12345$","Wick12345$","+8765432100");
        checkPolicy();
        submitRegistration();

        Assert.assertTrue(isRegistrationSuccess(email));
    }

}
