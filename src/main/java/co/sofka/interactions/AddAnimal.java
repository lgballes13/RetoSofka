package co.sofka.interactions;

import co.sofka.userinterfaces.CheckoutProcessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddAnimal implements Interaction {

    public static AddAnimal toCart(){
        return Tasks.instrumented(AddAnimal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckoutProcessPage.BTN_ADD_CART));
    }
}
