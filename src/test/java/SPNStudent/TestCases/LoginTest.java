package SPNStudent.TestCases;

import SPNStudent.Pages.StudentDashboard;
import SPNStudent.Pages.LoginPage;
import SPNStudent.Util.BaseSPN;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseSPN {

    public LoginTest(){
        super();
    }

    @Test
    public void loginShouldSuccess() throws InterruptedException {
        StudentDashboard studentDashboard = new LoginPage()
                .clickUserEmailfld(getUserEmail())
                .clickUserPasswordfld(getPassword())
                .clickLoginbtn();
        Assert.assertTrue(studentDashboard.isDashboardtxt());
    }
}
