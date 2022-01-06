package co.com.choucair.certification.proyectob.tasks;

import co.com.choucair.certification.proyectob.userinterface.DeleteAndCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class DeleteProduct implements Task {
    public static DeleteProduct andCheckout() { return Tasks.instrumented(DeleteProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(DeleteAndCheckout.DELETE_TSHIRTS),
                Click.on(DeleteAndCheckout.GOTOCHECKOUT));
    }
}