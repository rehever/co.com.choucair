package co.com.choucair.certification.proyectob.tasks;

import co.com.choucair.certification.proyectob.userinterface.FillEmailSignUp;
import co.com.choucair.certification.proyectob.util.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class FillEmailUser implements Task {

    public static FillEmailUser toRegisterUser() { return Tasks.instrumented(FillEmailUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Const.EMAIL).into(FillEmailSignUp.EMAIL_CAMP),
                Click.on(FillEmailSignUp.SIGNUP_BUTTON));
    }
}
