package SPNStudent.TestCases;

import SPNStudent.Pages.Courses;
import SPNStudent.Pages.LoginPage;
import SPNStudent.Util.BaseSPN;
import org.testng.annotations.Test;

public class CourseTest extends BaseSPN {

    public CourseTest(){
        super();
    }

    @Test
    public void courseEnrollShouldSuccess() throws InterruptedException {
        Courses courses = new LoginPage()
                .clickUserEmailfld(getUserEmail())
                .clickUserPasswordfld(getPassword())
                .clickLoginbtn()
                .clickhomeicon()
                .clickHomeBtn()
                .clickCoursesBtn()
                .clickAddCartBtn();

    }
}
