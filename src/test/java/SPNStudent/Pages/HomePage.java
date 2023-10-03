package SPNStudent.Pages;

import SPNStudent.Util.BaseSPN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseSPN {

    @FindBy(xpath = "//button[contains(text(),'I Accept')]")
    WebElement cookisAccept;

    @FindBy(xpath = "//header/div[@id='sticky-header']/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]")
    WebElement coursesBtn;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public Courses clickCoursesBtn(){
        cookisAccept.click();
        coursesBtn.isDisplayed();
        coursesBtn.click();
        return new Courses();
    }
}
