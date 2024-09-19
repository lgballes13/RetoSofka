package co.sofka.questions;

import co.sofka.userinterfaces.DogsPage;
import co.sofka.userinterfaces.LoginPage;
import co.sofka.userinterfaces.ReptilesPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.TextContent;

public class Validate {


    public static Question<String> orderSubmitted(){
        return actor -> TextContent.of(DogsPage.LBL_ORDER_SUBMITTED).viewedBy(actor).asString();
    }

    public static Question<String> welcomeMessage(){
        return actor -> TextContent.of(LoginPage.LBL_WELCOME).viewedBy(actor).asString();
    }

    public static Question<String> GoldenInCart(){
        return actor -> TextContent.of(DogsPage.LBL_GOLDEN).viewedBy(actor).asString();

    }

}
