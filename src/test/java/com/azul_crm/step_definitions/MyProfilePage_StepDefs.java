package com.azul_crm.step_definitions;

import com.azul_crm.pages.BasePage;
import com.azul_crm.pages.MyProfilePage;
import com.azul_crm.utilities.BrowserUtils;
import com.azul_crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyProfilePage_StepDefs extends MyProfilePage {

    MyProfilePage myProfilePage = new MyProfilePage();

    public MyProfilePage_StepDefs(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @When("user click on My Profile")
    public void user_click_on_my_profile() {
       MyProfile.click();
    }
    @Then("user should see the following options exist on My Profile page")
    public void user_should_see_the_following_options_exist_on_my_profile_page(List<String> expectedOptions) {
        System.out.println("expectedOptions = " + expectedOptions);
        List <String > actualOptions = BrowserUtils.getElementsText(MyProfileMenuOptions);
       Assert.assertEquals(expectedOptions,actualOptions);
       System.out.println("actualOptions = " + actualOptions);


    }


    @Then("user should see the email under the General tab is the same as the user’s account.")
    public void userShouldSeeTheEmailUnderTheGeneralTabIsTheSameAsTheUserSAccount() {
        Assert.assertEquals(usersAccount.getText(),emailUnderTheGeneralTab.getText());
    }
}
