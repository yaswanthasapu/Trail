package com.Test;

import Base.Lambda_Base;
import Pages.Lambda_Page1;
import Pages.Lambda_Page2;
import Pages.Lambda_Page3;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lambda_Test extends Lambda_Base {
Lambda_Page1 lambdaPage1;
Lambda_Page2 lambdaPage2;
Lambda_Page3 lambdaPage3;

    @BeforeClass
    public void Testing_Scenarios(){

        lambdaPage1=new Lambda_Page1(driver);
        lambdaPage2=new Lambda_Page2(driver);
        lambdaPage3=new Lambda_Page3(driver);
    }

    @Test
    public void Test_Scenario1(){
        lambdaPage1.simpleFormDemo();
        lambdaPage1.enterMsg();
    }
    @Test
    public void Test_Scenario2(){

        lambdaPage2.progressBarAndSliders();
    }
    @Test
    public void Test_Scenario3() throws InterruptedException {
        lambdaPage3.inputForm();
        lambdaPage3.submit();
        lambdaPage3.nameField();
        lambdaPage3.inputFormDetails();
    }

}
