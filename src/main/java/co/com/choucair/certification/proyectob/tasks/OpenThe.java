package co.com.choucair.certification.proyectob.tasks;

import co.com.choucair.certification.proyectob.userinterface.AutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {
    private AutomationPractice automationPractice;
    public static OpenThe shopPage() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationPractice));
    }
}
