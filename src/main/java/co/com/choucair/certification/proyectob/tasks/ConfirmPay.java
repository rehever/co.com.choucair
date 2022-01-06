package co.com.choucair.certification.proyectob.tasks;

import co.com.choucair.certification.proyectob.userinterface.PayCheck;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmPay implements Task {
    public static ConfirmPay payByCheck() { return Tasks.instrumented(ConfirmPay.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PayCheck.PAYBYCHECK));
    }
}