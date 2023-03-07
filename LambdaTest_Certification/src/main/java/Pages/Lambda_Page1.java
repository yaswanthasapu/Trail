package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Lambda_Page1 {
 WebDriver driver;
 public Lambda_Page1(WebDriver driver){
     PageFactory.initElements(driver, this);
     this.driver= driver;
 }

 @FindBy(xpath = "//a[text()='Simple Form Demo']")
    WebElement SimpleFormDemo;
 @FindBy(xpath = "//p[text()='Enter Message']/following-sibling::input[@type='text']")
 WebElement EnterMsg;
 @FindBy(xpath = "//p[text()='Enter Message']/following-sibling::button[@id='showInput']")
 WebElement GetCheckedValue;

    @FindBy(xpath = "//div[@class='container']/div/div/div[4]")
    WebElement ProgressBarAndSliders;

    public void simpleFormDemo() {
        Assert.assertTrue(SimpleFormDemo.isEnabled());
        SimpleFormDemo.click();
        String URL= driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.lambdatest.com/selenium-playground/simple-form-demo");
    }
    public void enterMsg(){
        String data= "Welcome to my world";
        EnterMsg.sendKeys(data);
        GetCheckedValue.click();
        Assert.assertEquals(data,"Welcome to my world");
    }

}
