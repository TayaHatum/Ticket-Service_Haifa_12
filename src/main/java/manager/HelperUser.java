package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm(){
        /// wd.findElement(By.cssSelector("a[href='/login']")).click();
        click(By.cssSelector("a[href='/login']"));
    }


    public void fillLoginForm(String email,String password){
        // find+click+clear+sendKey
        type(By.cssSelector("input[aria-label='Email']"),email);
        type(By.cssSelector("input[aria-label='Password']"),password);
    }


    public void submitLogin(){
        click(By.xpath("//button[text()=' Login']"));
    }
    public boolean isLoginSuccess(){
        // if logout button present  -- > loginSuccess Assert

        // List<WebElement> list = wd.findElements(By.xpath("//div[text()=' Logout']"));
        // list.size() // =1 ---> true  // ==0 ---> false
        return isElementPresent(By.xpath("//div[text()=' Logout']"));
    }


    public void  openRegistrationForm(){
        openLoginForm();
        click(By.xpath("//button[text()=' Register']"));
    }


    public void submitRegistration(){
        click(By.xpath("//button[text()=' Register']"));
    }

    public void fillRegistrationForm(String name, String surname,String email,String password,String confpassword,String phone){
        type(By.cssSelector("input[aria-label='Name']"),name);
        type(By.cssSelector("input[aria-label='Surname']"),surname);
        type(By.cssSelector("input[aria-label='Email']"),email);
        type(By.cssSelector("input[aria-label='Password']"),password);
        type(By.cssSelector("input[aria-label='confirm']"),confpassword);
        type(By.cssSelector("input[aria-label='Phone']"),phone);
    }

    public void checkPolicy(){
        click(By.cssSelector("label.label-for-checkbox"));
    }

    public boolean isRegistrationSuccess(String email){
        System.out.println(wd.findElement(By.cssSelector("p")).getText());
        String message = wd.findElement(By.cssSelector("p")).getText();

        return message.contains("was successful")&message.contains(email);
    }

    public void logout() {
        click(By.xpath("//div[text()=' Logout']"));
    }
}
