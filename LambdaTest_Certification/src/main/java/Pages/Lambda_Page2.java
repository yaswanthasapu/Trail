package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Lambda_Page2 {
    WebDriver driver;
    public Lambda_Page2(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }

    @FindBy(xpath = "//a[text()='Drag & Drop Sliders']")
    WebElement dragDrop;

    @FindBy(xpath = "//div[@id='slider3']/div/input")
    WebElement slider;
    public void progressBarAndSliders(){
        dragDrop.click();
        for(int i=0;i<80;i++){
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

    }
}
