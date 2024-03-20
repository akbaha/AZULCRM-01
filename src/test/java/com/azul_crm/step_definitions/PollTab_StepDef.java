package com.azul_crm.step_definitions;

import com.azul_crm.pages.BasePage;
import com.azul_crm.pages.PollModulePage;
import com.azul_crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class PollTab_StepDef extends PollModulePage {

    @Given("user click on a Poll tab")
    public void user_click_on_a_poll_tab() {
        pollModule.click();
    }

    @Then("user should see in the delivery box {string} by default")
    public void user_should_see_in_the_delivery_box_by_default(String string) {
        for (WebElement each : deliveryBox) {
            if (each.getText().contains(string)) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        }
    }

    @Then("user can write {string} in the Message title field")
    public void user_can_write_in_the_message_title_field(String string) {
        Driver.getDriver().switchTo().frame(pollIframe);
        textFieldIframe.sendKeys(string);
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("user can write {string} in the Question field")
    public void user_can_write_in_the_question_field(String string) {
        questionBox.sendKeys(string);
    }


    @Then("user click on Send button")
    public void user_click_on_send_button() {
        sendButton.click();
    }

    @Then("user can see created Poll with Message title {string}")
    public void user_can_see_created_poll(String expectedTitle) {
        Assert.assertEquals(expectedTitle, lastCreatedPost.getText());
    }


    @Then("user can select the “Allow multiple choice” checkbox")
    public void user_can_select_the_allow_multiple_choice_checkbox() {
        multipleChoiceCheckbox.click();
        Assert.assertTrue(multipleChoiceCheckbox.isSelected());
    }

    @Then("user can write {string} in the Answer1 field")
    public void user_can_write_in_the_answer1_field(String string) {
        answer1Box.sendKeys(string);
    }

    @Then("user can write {string} in the Answer2 field")
    public void user_can_write_in_the_answer2_field(String string) {
        answer2Box.sendKeys(string);
    }


    @Then("user delete all employees from delivery box")
    public void user_delete_from_delivery_box() {
        for (WebElement each : closeAllDeliveryButton) {
            each.click();
        }
    }


    @Then("user can see Error message {string}")
    public void user_can_see_error_message(String expectedErrorMessage) {
        String actualErrorMessage = errorMessage.getText();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }


}
