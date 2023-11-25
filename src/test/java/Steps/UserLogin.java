package Steps;

import Pages.LoginPage;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static Tests.TestBase.driver;

public class UserLogin extends TestBase {

    LoginPage loginObject ;

@Given("the user is on Login Page")
public void UserInLoginPage (){

    //Assert.assertTrue(loginObject.GetLoginText().contains("Login"),"we are in loginpage");

}

@When("I entered {string}, {string}")
public void LoginCredentials (String username, String password){
    loginObject = new LoginPage(driver);
    loginObject.EnterUserName(username);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    loginObject.EnterPassword(password);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("click on Login button")
    public void ClickOnLogin (){
    loginObject.ClickOnLoginButton();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

    @When("click on courses button")
    public void click_on_courses_button() {
       loginObject.ClickOnCoursesButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("click on add course button")
    public void click_on_add_course_button() {
        loginObject.ClickOnAddCourseButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("enter {string}")
    public void enter_course_name(String Coursename) {
        loginObject.EnterCourseName(Coursename);
    }

    @When("select garde from drop list")
    public void select_garde_from_drop_list() {
        loginObject.SelectGradeDropList();
    }

    @When("select teacher form drop list")
    public void select_teacher_form_drop_list() {
        loginObject.SelectTeacherDropList();
    }

    @When("click on create button")
    public void click_on_create_button() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginObject.ClickOnCreateButton();
    }


@Then("course added successfully")
public void HomePageAssertion (){
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    Assert.assertTrue(loginObject.NewCourseNameAssertion().contentEquals("Automation_Cucumber"),"course not added successfully");
}



}
