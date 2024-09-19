package co.sofka.interactions;

import co.sofka.userinterfaces.ReptilesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RemoveIguana implements Interaction {

    public static RemoveIguana fromTheCart (){

        return Tasks.instrumented(RemoveIguana.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ReptilesPage.REMOVE_IGUANA));
    }
}
