package com.azul_crm.pages;

import com.azul_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollModulePage extends BasePage{

    public PollModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "bx-editor-iframe")
    public WebElement pollIframe;

    @FindBy(tagName = "body")
    public WebElement textFieldIframe;

    @FindBy(xpath = "//span[@id='feed-add-post-destination-item']/span")
    public List<WebElement> deliveryBox;
    @FindBy(css = ".feed-add-post-del-but")
    public List<WebElement> closeAllDeliveryButton;

    @FindBy(css = "#question_0")
    public WebElement questionBox;
    @FindBy(css = "#answer_0__0_")
    public WebElement answer1Box;
    @FindBy(css = "#answer_0__1_")
    public WebElement answer2Box;
    @FindBy(id = "multi_0")
    public WebElement multipleChoiceCheckbox;
    @FindBy(css = ".vote-new-question-link.addq")
    public WebElement addQuestionLink;
    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;
    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;
    @FindBy(css = ".feed-add-error")
    public WebElement errorMessage;


}
