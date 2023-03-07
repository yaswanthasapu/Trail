package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Lambda_Page3 {
    WebDriver driver;
    public Lambda_Page3(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }
    @FindBy(xpath = "//a[text()='Input Form Submit']")
    WebElement InputForm;
    @FindBy(xpath = "//div[@class='text-right mt-20']/button[@type='submit']")
    WebElement Submit;
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement Name;
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement Email;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement Password;
    @FindBy(xpath = "//input[@placeholder='Company']")
    WebElement Company;
    @FindBy(xpath = "//input[@placeholder='Website']")
    WebElement Website;
    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement City;
    @FindBy(xpath = "//input[@placeholder='Address 1']")
    WebElement Address1;
    @FindBy(xpath = "//input[@placeholder='Address 2']")
    WebElement Address2;
    @FindBy(xpath = "//input[@placeholder='State']")
    WebElement State;
    @FindBy(xpath = "//input[@placeholder='Zip code']")
    WebElement Zipcode;
//    @FindBy(xpath = "//button[text()='Submit']")
//    WebElement SubmitFinal;
    public void inputForm(){
        InputForm.click();
    }
    public void submit(){
        Submit.click();
    }
    public void nameField(){
        String nameAlert=Name.getAttribute("validationMessage");
        Assert.assertEquals(nameAlert,"Please fill out this field.");
        System.out.println(nameAlert);
    }
    public void inputFormDetails() throws InterruptedException {
        Name.sendKeys("Umar");
        Email.sendKeys("yaswanthasapu976@gmail.com");
        Password.sendKeys("@Umar901");
        Company.sendKeys("$$$$$$$$$$$");
        Website.sendKeys("www.google.com");

        WebElement testDropDown = driver.findElement(By.name("country"));
        Select dropdown = new Select(testDropDown);

        dropdown.selectByValue("IN");
        City.sendKeys("Goa");
        Address1.sendKeys("airghboeiurgyhvp9nefgyperoyghv0io");
        Address2.sendKeys("uryh9erugyh9oeurfyghv9peorjhygvo");
        State.sendKeys("Goa");
        Zipcode.sendKeys("500081");

        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[@id='exit_popup_close']"))).click().build().perform();


       // driver.switchTo().alert().dismiss();
        Submit.click();
    }

}
