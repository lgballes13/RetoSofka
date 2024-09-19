package co.sofka.interactions;

import co.sofka.userinterfaces.CategoriesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDogs implements Task {


    public static SelectDogs category(){
        return Tasks.instrumented(SelectDogs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CategoriesPage.DOGS_CATEGORY));
    }
}
