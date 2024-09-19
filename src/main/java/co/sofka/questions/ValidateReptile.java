package co.sofka.questions;

import co.sofka.userinterfaces.ReptilesPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidateReptile {

    public static Question<String> rattlesnake(){
        return actor -> TextContent.of(ReptilesPage.TXT_RATTLESNAKE).viewedBy(actor).asString();
    }


    public static Question<String> iguana(){
        return actor -> TextContent.of(ReptilesPage.TXT_IGUANA).viewedBy(actor).asString();
    }
}
