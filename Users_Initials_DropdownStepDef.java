package com.arine.automation.glue;

import com.arine.automation.exception.AutomationException;
import com.arine.automation.pages.PageFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.arine.automation.glue.CommonSteps.takeScreenshot;

public class Users_Initials_DropdownStepDef {

    CommonSteps common = new CommonSteps();

    @When("User clicks on {string} dropDown")
    public void userClicksOnUserInitialsDropdown(String dropdownName) throws AutomationException {
        PageFactory.users_Initials_DropdownPage().openUserInitialsDropdown();
        common.logInfo("User clicked on the '" + dropdownName + "' dropdown.");
        takeScreenshot();
    }

    @Then("Verify that the user can see the options in the upper right {string}")
    public void verifyDropdownOptions(String options) throws AutomationException {
        PageFactory.users_Initials_DropdownPage().verifyDropdownOptions(options);
        common.logInfo("Verified the dropdown options for the user’s initials: " + options);
        takeScreenshot();
    }

    @When("User clicks on {string} field")
    public void userClicksLayoutOnField(String fieldName) throws AutomationException {
        PageFactory.users_Initials_DropdownPage().clickOnField(fieldName);
        common.logInfo("User clicked on the field: '" + fieldName + "'.");
        takeScreenshot();
    }

    @Then("Verify that the user can see the options by hovering on the {string} field {string}")
    public void verifyDropdownOptionsByHovering(String fieldName, String options) throws AutomationException {
        PageFactory.users_Initials_DropdownPage().verifyDropdownSubmenuOptions(fieldName, options);
        common.logInfo("Verified submenu options when hovering over the '" + fieldName + "' field: " + options);
        takeScreenshot();
    }

    @When("User clicks on Manage Access field")
    public void userClicksOnManageAccessField() throws AutomationException {
        PageFactory.users_Initials_DropdownPage().clickOnField("Manage Access");
        common.logInfo("User clicked on the 'Manage Access' field.");
        takeScreenshot();
    }

    @Then("Verify that the user can see the options by hovering on the Manage Access field {string}")
    public void verifyManageAccessSubmenuOptions(String options) throws AutomationException {
        PageFactory.users_Initials_DropdownPage().verifyManageAccessSubmenuOptions(options);
        common.logInfo("Verified submenu options when hovering over the 'Manage Access' field: " + options);
        takeScreenshot();
    }
}
