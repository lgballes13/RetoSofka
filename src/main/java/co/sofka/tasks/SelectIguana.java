package co.sofka.tasks;

import co.sofka.userinterfaces.DogsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectIguana implements Task {


    private String iguana;

    public SelectIguana (String iguana){
        this.iguana = iguana;
    }


    public static SelectIguana green(String iguana){
        return Tasks.instrumented(SelectIguana.class, iguana);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DogsPage.SEL_ANIMAL.of(iguana)));
    }
}
