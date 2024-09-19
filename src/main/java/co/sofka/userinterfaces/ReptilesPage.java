package co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReptilesPage {


    public static final Target TXT_RATTLESNAKE = Target.the("reptil rattlesnake").locatedBy("//td[text()='Rattlesnake']");
    public static final Target TXT_IGUANA = Target.the("reptil iguana").locatedBy("//td[text()='Iguana']");

    public static final Target REMOVE_IGUANA = Target.the("remove iguana").locatedBy("//td[contains(text(), 'Iguana')]//following-sibling::td//child::a");



}
