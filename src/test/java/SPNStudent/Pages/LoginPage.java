package SPNStudent.Pages;

import SPNStudent.Util.BaseSPN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseSPN {

    @FindBy(name = "email")
    WebElement userEmailid;

    @FindBy(name = "password")
    WebElement userPasswordid;

    @FindBy(xpath = "//button[@class='theme_btn text-center w-100']")
    WebElement Loginbtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickUserEmailfld(String UserEmail){
        userEmailid.isDisplayed();
        userEmailid.clear();
        userEmailid.sendKeys(UserEmail);
        return this;
    }

    public LoginPage clickUserPasswordfld(String UserPassword){
        userPasswordid.isDisplayed();
        userPasswordid.clear();
        userPasswordid.sendKeys(UserPassword);
        return this;
    }

    public StudentDashboard clickLoginbtn() throws InterruptedException {
       Loginbtn.isDisplayed();
       Loginbtn.click();
       Thread.sleep(5000);
       return new StudentDashboard();
    }
}
