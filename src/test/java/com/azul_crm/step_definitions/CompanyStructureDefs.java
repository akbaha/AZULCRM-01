package com.azul_crm.step_definitions;

import com.azul_crm.pages.BasePage;
import com.azul_crm.pages.CompanyStructurePage;
import com.azul_crm.utilities.BrowserUtils;
import com.azul_crm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import javax.swing.text.Utilities;


public class CompanyStructureDefs extends BasePage {

    BasePage basePage = new BasePage();
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();

    @When("the user can pass on Company Structure under Employee menu")
    public void theUserCanPassOnCompanyStructureUnderEmployeeMenu() {
        basePage.employeesMenu.click();

    }

    @And("the Company Structure visible for every user")
    public void theCompanyStructureVisibleForEveryUser() {
        Assert.assertTrue(companyStructurePage.companyStructure.isDisplayed());


    }

    @When("the hr user is on company structure page")
    public void the_hr_user_is_on_company_structure_page() {
        Assert.assertTrue(companyStructurePage.loginemail.getText().contains("hr"));
    }

    @When("the hr can add a department")
    public void the_hr_can_add_a_department() {
Assert.assertTrue(companyStructurePage.addDepartment.isDisplayed());
    }

    @When("the helpdesk and Marketing users is on company structure page")
    public void theHelpdeskAndMaketingUsersIsOnCompanyStructurePage() {

        String email = companyStructurePage.loginemail.getText();
        Assert.assertTrue((email.contains("help")||email.contains("market")));

    }

    @And("the helpdesk and Marketing users unaccused for adding department")
    public void theHelpdeskAndMaketingUsersUnaccusedForAddingDepartment() {
       /* try {
            Assert.assertFalse("Element should not be visible: " + companyStructurePage.addDepartment, companyStructurePage.addDepartment.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }*/

        BrowserUtils.verifyElementNotDisplayed(By.xpath("(//span[.='Add department'])[1]"));



    }
}
