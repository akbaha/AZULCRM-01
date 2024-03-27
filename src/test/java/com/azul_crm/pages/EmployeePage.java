package com.azul_crm.pages;

import com.azul_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage {


    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> menu;

    @FindBy(id="pagetitle")
    public WebElement CompanyStructureTitle;

    //Comment

}
