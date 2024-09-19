package co.sofka.tasks;


import co.sofka.userinterfaces.CheckoutProcessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ProceedToCheckout implements Task {


    public static ProceedToCheckout andConfirmPurchase(){
        return Tasks.instrumented(ProceedToCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckoutProcessPage.BTN_CHECKOUT),
                Click.on(CheckoutProcessPage.BTN_CONTINUE),
                Click.on(CheckoutProcessPage.BTN_CONFIRM));
    }
}
