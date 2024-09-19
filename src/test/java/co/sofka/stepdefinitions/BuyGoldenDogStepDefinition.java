package co.sofka.stepdefinitions;

import co.sofka.interactions.AddAnimal;
import co.sofka.interactions.SelectDogs;
import co.sofka.questions.Validate;
import co.sofka.tasks.Login;
import co.sofka.tasks.ProceedToCheckout;
import co.sofka.tasks.SelectGolden;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.CoreMatchers;

public class BuyGoldenDogStepDefinition {

    @When("^they log in to the store$")
    public void theyLogInToTheStore() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.inJPetStore());
    }


    @When("^they select the Dogs category$")
    public void theySelectTheDogsCategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectDogs.category());
    }

    @When("^they choose the \"([^\"]*)\" dog$")
    public void theyChooseTheDog(String golden) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectGolden.retriever(golden));
    }

    @When("^they add the dog to the cart$")
    public void theyAddTheDogToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddAnimal.toCart());
    }

    @When("^they proceed to checkout$")
    public void theyProceedToCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProceedToCheckout.andConfirmPurchase());
    }

    @Then("^they should see the following confirmation message: \"([^\"]*)\"$")
    public void theyShouldSeeTheFollowingConfirmationMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate order submitted", Validate.orderSubmitted(), CoreMatchers.equalTo(message)));
    }

}
