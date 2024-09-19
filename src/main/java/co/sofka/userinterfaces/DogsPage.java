package co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DogsPage {


    public static final Target SEL_ANIMAL = Target.the("select golden retreiver").locatedBy("//td[text()='{0}']//preceding-sibling::td");
    public static final Target LBL_ORDER_SUBMITTED = Target.the("message order submitted").locatedBy("//li[text()='Thank you, your order has been submitted.']");
    public static final Target LBL_GOLDEN = Target.the("name golden of cart").locatedBy("//td[contains(text(), 'Golden ')]");




}
