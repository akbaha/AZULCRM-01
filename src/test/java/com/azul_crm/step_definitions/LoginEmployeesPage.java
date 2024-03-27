
package com.azul_crm.step_definitions;

import com.azul_crm.pages.BasePage;
import com.azul_crm.pages.EmployeePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LoginEmployeesPage {

    BasePage basePage = new BasePage();
    EmployeePage employeePage = new EmployeePage();

    @When("the user click on the Employees module")
    public void the_user_click_on_the_employees_module() {

        basePage.employeesMenu.click();
    }

    @And("the user see all module")
    public void theUserSeeAllModule(List<String> ListModules) {

        List<String> listMenu = new ArrayList<>();
        for (WebElement each : employeePage.menu) {

            listMenu.add(each.getText());
            //System.out.println(each.getText());
        }

        Assert.assertEquals(ListModules, listMenu);
    }

    @Then("the {string} module should be displayed")
    public void the_module_should_be_displayed(String expectedModule) {

        String actualModul = employeePage.CompanyStructureTitle.getText();

        Assert.assertEquals(expectedModule,actualModul);

    }

    //comment


}
