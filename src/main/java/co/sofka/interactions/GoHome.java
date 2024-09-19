package co.sofka.interactions;

import co.sofka.tasks.Login;
import co.sofka.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoHome implements Interaction {


    public static GoHome page(){
        return Tasks.instrumented(GoHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.BTN_HOMEPAGE));
    }
}
