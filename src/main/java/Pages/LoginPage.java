package Pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Type;
import java.sql.Driver;
import java.util.List;

public class LoginPage extends PageBase {

    public LoginPage (WebDriver driver) {
        super(driver);
    }


    @FindBy (id = "courseGrade")
    WebElement SelectGrade;

    @FindBy (id = "teacherOnBehalf")
    WebElement Teacher;
    @FindBy (id = "ui-select-choices-row-0-0")
    WebElement SelectTeacher;

    @FindBy (id ="Email" )
    WebElement UserName;

    @FindBy (id = "inputPassword")
    WebElement Password;

    @FindBy (id = "btnLogin")
    WebElement LoginButton;

    @FindBy (className="lms-responsive-img")
    WebElement Logo;
    @FindBy ( xpath = "/html/body/div/div/div/div/div[1]/h1")
    WebElement LoginTex;

    @FindBy (xpath = "/html/body/div[1]/aside/div/nav/ul/li[4]")
    WebElement CoursesButton;

    @FindBy (id = "btnListAddCourse")
    WebElement AddCourseButton;

    @FindBy (id = "txtCourseName")
    WebElement CourseName;

    @FindBy (id = "btnSaveAsDraftCourse")
    WebElement CreateButton;

    @FindBy (id = "courseNameView")
    WebElement NewCourseName;





public void EnterUserName (String username){SetText(UserName,username);}

public void EnterPassword (String password){SetText(Password,password);}

public void ClickOnLoginButton () {ClickButton(LoginButton);}

    public String GetLogoText (){
    return Logo.getText();
    }

    public String GetLoginText () {
    return LoginTex.getText();
    }

    public void ClickOnCoursesButton (){
        CoursesButton.click();
    }

    public void ClickOnAddCourseButton (){
        AddCourseButton.click();
    }

    public void EnterCourseName (String coursename){
        SetText(CourseName,coursename);
    }

    public void SelectGradeDropList (){

    Select select = new Select(SelectGrade);
    select.selectByIndex(3);

    }

    public void SelectTeacherDropList (){
    Teacher.click();
    SelectTeacher.click();
    }


    public void ClickOnCreateButton (){
    ClickButton(CreateButton);
    }

    public String NewCourseNameAssertion (){
        return NewCourseName.getText();
    }

}
