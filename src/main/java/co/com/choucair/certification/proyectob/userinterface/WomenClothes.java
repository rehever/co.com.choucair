package co.com.choucair.certification.proyectob.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WomenClothes {
    public static final Target WOMEN_BUTTON = Target.the("Women Clothes Button").
            located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
}
