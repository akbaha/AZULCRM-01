package com.azul_crm.step_definitions;

import com.azul_crm.pages.ActivityStreamMsgPage;
import com.azul_crm.utilities.BrowserUtils;
import com.azul_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ActivityStreamMsg_StepDef {

    ActivityStreamMsgPage activityStreamMsgPage = new ActivityStreamMsgPage();

    @When("the User clicks link Message")
    public void the_user_clicks_link_message() {
        activityStreamMsgPage.LinkMessage.click();


    }
    @When("the user click upload files")
    public void the_user_click_upload_files() {
        activityStreamMsgPage.Uploadfile.click();
    }

    @And("the user click Upload Files and images {string}")
    public void theUserClickUploadFilesAndImages(String Path) {

        activityStreamMsgPage.testpath.sendKeys(Path);
        //BrowserUtils.waitFor(4);
    }


    @And("the user click send button")
    public void theUserClickSendButton() {


        activityStreamMsgPage.buttonSubmit.click();

        BrowserUtils.waitFor(5);
    }


    @And("the user remove file")
    public void theUserRemoveFile() {
        BrowserUtils.waitFor(9);
        activityStreamMsgPage.removeImage.click();
    }


    @And("the User write msg")
    public void theUserWriteMsg() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        // Driver.getDriver().switchTo().frame(0);
        BrowserUtils.sleep(2);

        activityStreamMsgPage.InputMsg.sendKeys("hello cydeo");
        //System.out.println("activityStreamMsgPage.InputMsg.getText() = " + activityStreamMsgPage.InputMsg.getText());


        Driver.getDriver().switchTo().defaultContent();

    }

    @And("user click insert in text")
    public void userClickInsertInText() {

        String filename = activityStreamMsgPage.imageUploadPath.getText();
        activityStreamMsgPage.buttonInsertText.click();

        //System.out.println("activityStreamMsgPage.actualMsg.getText() = " + activityStreamMsgPage.actualMsg.getText());

        //Assert.assertEquals(filename,activityStreamMsgPage.actualMsg.getText());

    }

    @And("assert the result")
    public void assertTheResult() {


        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        // Driver.getDriver().switchTo().frame(0);
        BrowserUtils.sleep(2);

        String msg = activityStreamMsgPage.InputMsg.getText();
        Driver.getDriver().switchTo().defaultContent();


        String filename = activityStreamMsgPage.imageUploadPath.getText();

        String actualMsg = msg.substring(0, msg.lastIndexOf(".pdf"));
        String expectedmsg = filename.substring(0, filename.lastIndexOf(" "));


        Assert.assertEquals(expectedmsg,actualMsg);

        //System.out.println("activityStreamMsgPage.InputMsg.getText() = " + msg);
        //System.out.println("activityStreamMsgPage.imageUploadPath.getText() = " + expectedmsg);

    }

    @And("assert the result image")
    public void assertTheResultImage() {

        String expectedMsg =  activityStreamMsgPage.imgupload.getAttribute("src");

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        // Driver.getDriver().switchTo().frame(0);
        BrowserUtils.sleep(2);

         String actualMsg =  activityStreamMsgPage.insertimag.getAttribute("src");

        Driver.getDriver().switchTo().defaultContent();


        String expectedSrc = expectedMsg.replaceAll("&width=\\d+&height=\\d+", "");
        String actualSrc = actualMsg.replaceAll("&width=\\d+&height=\\d+", "");


        Assert.assertEquals(expectedSrc,actualSrc);

    }
}
