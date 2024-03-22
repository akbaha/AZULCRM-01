package com.azul_crm.pages;

import com.azul_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamMsgPage {


        public ActivityStreamMsgPage(){

            PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(css = "span[id='feed-add-post-form-tab-message'] span")
        public WebElement LinkMessage;

        @FindBy(xpath = "//*[@id='bx-b-uploadfile-blogPostForm']")
        public WebElement Uploadfile;

        @FindBy(xpath = "//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main']")
        public WebElement inputFiles;

        @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
        public WebElement Allemployees;

        @FindBy(name="bxu_files[]")
        public WebElement testpath;

        @FindBy(xpath = "//*[@id='blog-submit-button-save']")
        public WebElement buttonSubmit;

        @FindBy(xpath = "//td[@class='files-del-btn']")
        public WebElement removeImage;

  /*  @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[1]")
    public WebElement iframe;*/

   /* @FindBy(id= " microoPostFormLHE_blogPostForm ")
    public WebElement InputMsg;*/

        //@FindBy(xpath = "//span[contains(@id, 'check-in-text')]")
        @FindBy(xpath = "//span[@class='insert-btn-text']")
        public WebElement buttonInsertText;

        @FindBy(xpath = "//span[@title='Click to insert file']")
        public WebElement imageUploadPath;

        @FindBy(xpath = "//body[@contenteditable ='true']")
        public WebElement InputMsg;

        @FindBy(xpath = "//span[contains(@id, 'bxid')]")
        public WebElement actualMsg;


        @FindBy(xpath ="//img[@class='files-preview']")
        public WebElement imgupload;

        @FindBy(xpath = "//img[starts-with(@id, 'bxid') and not(contains(@id, ' '))]")
        public WebElement insertimag;

        // update

}
