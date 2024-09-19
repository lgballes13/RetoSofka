package co.sofka.stepdefinitions;

import co.sofka.interactions.AddAnimal;
import co.sofka.interactions.GoHome;
import co.sofka.interactions.RemoveIguana;
import co.sofka.questions.Validate;
import co.sofka.tasks.SelectIguana;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.CoreMatchers;

public class RemoveAnimalStepDefinition {


    @When("^return to homepage$")
    public void returnToHomepage() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoHome.page());
    }


    @When("^they choose the \"([^\"]*)\"$")
    public void theyChooseThe(String iguana) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectIguana.green(iguana));
    }

    @When("^they add the reptile to the cart$")
    public void theyAddTheReptileToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddAnimal.toCart());
    }

    @When("^remove the Iguana from the cart$")
    public void removeTheIguanaFromTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(RemoveIguana.fromTheCart());
    }

    @Then("^they should see \"([^\"]*)\" in the cart$")
    public void theyShouldSeeInTheCart(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate golden in cart", Validate.GoldenInCart(), CoreMatchers.containsString(message)));
    }
}
