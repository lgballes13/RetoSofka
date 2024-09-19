package co.sofka.tasks;

import co.sofka.userinterfaces.DogsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectGolden implements Task {


    private String golden;

    public SelectGolden (String golden){
        this.golden = golden;
    }

    public static SelectGolden retriever(String golden){
        return Tasks.instrumented(SelectGolden.class, golden);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DogsPage.SEL_ANIMAL.of(golden)));
    }
}
