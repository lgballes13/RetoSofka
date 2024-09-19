package co.sofka.stepdefinitions;

import co.sofka.questions.Validate;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.CoreMatchers;

public class LoginStepDefinition {


    @Then("^they should see the \"([^\"]*)\" message$")
    public void theyShouldSeeTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate welcome message", Validate.welcomeMessage(), CoreMatchers.containsString(message)));
    }


}
