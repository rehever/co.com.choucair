package co.com.choucair.certification.proyectob.tasks;

import co.com.choucair.certification.proyectob.userinterface.TShirtsModifyQualities;
import co.com.choucair.certification.proyectob.util.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ModifyTShirt implements Task {
    public static ModifyTShirt shirtsModify() { return Tasks.instrumented(ModifyTShirt.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(TShirtsModifyQualities.TSHIRTS_ADDQUANTITY),
                JavaScriptClick.on(TShirtsModifyQualities.TSHIRTS_ADDQUANTITY),
                JavaScriptClick.on(TShirtsModifyQualities.TSHIRTS_ADDQUANTITY),
                SelectFromOptions.byVisibleText(Const.SIZE).from(TShirtsModifyQualities.SIZEOPTIONS),
                JavaScriptClick.on(TShirtsModifyQualities.TSHIRTS_ADDTOCART),
                Click.on(TShirtsModifyQualities.TSHIRTS_ADDTOCARTTWO));
    }
}
