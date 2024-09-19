package co.sofka.interactions;

import co.sofka.userinterfaces.CategoriesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectReptiles implements Interaction {

    public static SelectReptiles category(){
        return Tasks.instrumented(SelectReptiles.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CategoriesPage.REPTILES_CATEGORY));
    }
}
