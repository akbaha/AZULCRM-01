package com.azul_crm.step_definitions;

import com.azul_crm.pages.MoreModulePage;
import com.azul_crm.pages.PollModulePage;
import com.azul_crm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AppreciationTab_StepDefs extends MoreModulePage {

    PollModulePage pollModulePage = new PollModulePage();

    @Then("user click on a More tab")
    public void user_click_on_a_more_tab() {
        moreModule.click();
    }
    @Then("user click Appreciation tab")
    public void user_click_appreciation_tab() {
        appreciationTab.click();
    }


    @Then("user click on Cancel button")
    public void user_click_on_cancel_button() {
        pollModulePage.cancelButton.click();
    }

    @Then("user can not see created post with Message title {string}")
    public void user_can_not_see_created_post_with_message_title(String expectedTitle) {
        BrowserUtils.waitFor(2);
        Assert.assertNotEquals(expectedTitle, lastCreatedPost.getText());
    }


}
