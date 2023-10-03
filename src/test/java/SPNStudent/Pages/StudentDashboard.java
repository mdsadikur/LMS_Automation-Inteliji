package SPNStudent.Pages;

import SPNStudent.Util.BaseSPN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentDashboard extends BaseSPN {

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    WebElement dashboardtxt;

    @FindBy(xpath = "//div[@class=\"profile_info_icon collaps_icon\"]")
    WebElement homeicon;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeBtn;



    public StudentDashboard(){
        PageFactory.initElements(driver, this);
    }

    public boolean isDashboardtxt(){
        return dashboardtxt.isDisplayed();
    }

    public StudentDashboard clickhomeicon(){
        homeicon.isDisplayed();
        homeicon.click();
        return this;
    }

    public HomePage clickHomeBtn(){
        homeBtn.isDisplayed();
        homeBtn.click();
        return new HomePage();
    }


}
