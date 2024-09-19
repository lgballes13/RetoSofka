package co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {


    public static final Target BTN_SIGN_IN = Target.the("button sign in").locatedBy("//a[text()='Sign In']");
    public static final Target FIELD_USERNAME = Target.the("field username").locatedBy("//input[@name='username']");
    public static final Target FIELD_PASSWORD = Target.the("field password").locatedBy("//input[@name='password']");
    public static final Target BTN_LOGIN = Target.the("button login").locatedBy("//input[@name='signon']");
    public static final Target LBL_WELCOME = Target.the("mesage welcome").locatedBy("//div[@id='WelcomeContent']");
    public static final Target BTN_HOMEPAGE = Target.the("button homepage").locatedBy("//img[@src='../images/logo-topbar.svg']");





}
