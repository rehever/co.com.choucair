package co.com.choucair.certification.proyectob.tasks;

import co.com.choucair.certification.proyectob.userinterface.ConfirmationAdress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmAddress implements Task {
    public static ConfirmAddress GoToCheckout() { return Tasks.instrumented(ConfirmAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ConfirmationAdress.CHECKOUT_BUTTON));
    }
}
