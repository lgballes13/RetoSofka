package co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriesPage {

    public static final Target REPTILES_CATEGORY = Target.the("btn reptiles category").locatedBy("//img[@src='../images/reptiles_icon.gif']");
    public static final Target DOGS_CATEGORY = Target.the("btn dogs category").locatedBy("//img[@src='../images/dogs_icon.gif']");



}
