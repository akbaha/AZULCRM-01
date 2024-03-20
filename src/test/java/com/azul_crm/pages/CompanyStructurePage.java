package com.azul_crm.pages;

import com.azul_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {

    public CompanyStructurePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//span[@id='pagetitle']")
    public WebElement companyStructure;

    @FindBy (xpath = "//span[@class='user-name']")
    public WebElement loginemail;

    @FindBy (xpath ="(//span[.='Add department'])[1]" )
    public WebElement addDepartment;



}
