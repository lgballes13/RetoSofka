package co.sofka.stepdefinitions;

import co.sofka.interactions.SelectReptiles;
import co.sofka.questions.ValidateReptile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;

import java.util.List;
import java.util.Map;

public class ConsultReptilesStepDefiniton {


    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^they are on the pet store homepage$")
    public void theyAreOnThePetStoreHomepage() {
        OnStage.theActorCalled("luis").wasAbleTo(Open.url("https://petstore.octoperf.com/actions/Catalog.action"));
    }

    @When("^they select the Reptiles category$")
    public void theySelectTheCategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectReptiles.category());
    }

    @Then("^they should see a list of all classes of reptiles$")
    public void theyShouldSeeAListOfAllClassesOfReptiles(List<Map<String, String>> reptiles) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate class reptile Rattlesnake", ValidateReptile.rattlesnake(), CoreMatchers.equalTo(reptiles.get(0).get("reptiles"))));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate class reptile Iguana", ValidateReptile.iguana(), CoreMatchers.equalTo(reptiles.get(1).get("reptiles"))));
    }

}
