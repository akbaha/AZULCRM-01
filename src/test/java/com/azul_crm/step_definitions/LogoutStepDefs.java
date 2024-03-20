package com.azul_crm.step_definitions;

import com.azul_crm.pages.BasePage;
import com.azul_crm.utilities.BrowserUtils;
import com.azul_crm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogoutStepDefs extends BasePage {

    public LogoutStepDefs(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @When("user click the username and click logout button")
    public void user_click_the_username_and_click_logout_button() {
        profilename.click();
        logoutButton.click();
    }
    @Then("user should log out")
    public void user_should_log_out() {
        BrowserUtils.verifyTitle("Authorization");
    }


    @When("user click the username")
    public void userClickTheUsername() {
        profilename.click();
    }


    public List<String> expectedOptions;


    @Then("user should see following options exist under the profile name")
    public void userShouldSeeFollowingOptionsExistUnderTheProfileName(List<String> expectedOptions) {
        System.out.println("expectedOptions = " + expectedOptions);
        System.out.println("optionsUnderProfileName.getText() = " + optionsUnderProfileName.getText());
        String options =  optionsUnderProfileName.getText().toString();

        List <String> actualOptions = new ArrayList<>();
        for (String each : options.split("\n")) {
            actualOptions.add(each);
        }

        System.out.println("actualOptions = " + actualOptions);

        Assert.assertEquals(expectedOptions,actualOptions);
    }




























}
