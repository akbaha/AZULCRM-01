package com.azul_crm.pages;

import com.azul_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MoreModulePage extends BasePage{

    public MoreModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='menu-popup-feed-add-post-form-popup']//span/span[2]")
    public List<WebElement> moreTabOptions;

    @FindBy(xpath = "//div[@id='menu-popup-feed-add-post-form-popup']//span/span[.='Appreciation']")
    public WebElement appreciationTab;



}
