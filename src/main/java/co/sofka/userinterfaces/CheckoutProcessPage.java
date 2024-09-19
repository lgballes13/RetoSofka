package co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutProcessPage {

    public static final Target BTN_ADD_CART = Target.the("button add to cart").locatedBy("//a[text()='Add to Cart']");
    public static final Target BTN_CHECKOUT = Target.the("button proceed to checkout").locatedBy("//a[text()='Proceed to Checkout']");
    public static final Target BTN_CONTINUE = Target.the("button continue").locatedBy("//input[@value='Continue']");
    public static final Target BTN_CONFIRM = Target.the("button Confirm").locatedBy("//a[text()='Confirm']");






}
