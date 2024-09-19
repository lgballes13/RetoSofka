package co.sofka.tasks;

import co.sofka.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Login implements Task {



    private String user;
    private String password;

    public Login (){
        Properties propiedades = new Properties();
        try {
            FileInputStream file = new FileInputStream("config_users.properties");
            propiedades.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.user = propiedades.getProperty("user.name");
        this.password = propiedades.getProperty("user.password");
    }


    public static Login inJPetStore(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.BTN_SIGN_IN),
                Enter.theValue(user).into(LoginPage.FIELD_USERNAME),
                Enter.theValue(password).into(LoginPage.FIELD_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));
    }
}
