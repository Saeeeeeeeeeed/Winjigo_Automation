package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    public PageBase (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    protected static void ClickButton(WebElement Bottun)
    {
        Bottun.click();
    }

    protected static void SetText (WebElement text,String value)
    {
        text.sendKeys(value);
        //text.sendKeys(Keys.ENTER);
    }
}
