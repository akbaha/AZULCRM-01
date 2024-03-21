package com.azul_crm.pages;

import com.azul_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyProfilePage extends BasePage {
    public MyProfilePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "user-name")
    public WebElement usersAccount;

    @FindBy (id = "pagetitle")
    public WebElement emailUnderTheGeneralTab;

    @FindBy(xpath = "//div[@id='profile-menu-filter']/a")
    public List<WebElement> MyProfileMenuOptions;
}
