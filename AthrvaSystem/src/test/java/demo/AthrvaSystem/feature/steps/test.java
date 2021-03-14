package demo.AthrvaSystem.feature.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.AtharvaSystem.pages.verifyallAvailableLinks;

public class test {
	
	verifyallAvailableLinks verifyLinks;
	
	@Given("^User launch the URL$")
    public void launchBrowser() throws Throwable {
		verifyLinks.launchBrowser();
    }
	
	@And("^User fatch the list of all avalible links$")
    public void fatchTheavaliableLinks() throws Throwable {
      verifyLinks.fatchAllAvailableLinks();
    }

	@When("^user hit that link System should prompt valid status code$")
    public void hitLinksAndGetStatusCode() throws Throwable {
       verifyLinks.iterateTheListandHitTheLinks();
    }
	
	@Then("^user verify the status code $")
    public void verifyStatusCode() throws Throwable {
        
    }

}
