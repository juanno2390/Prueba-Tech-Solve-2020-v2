package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.Keys;

import co.com.proyectobase.screenplay.ui.TheNinjaStoreHomePage;
import co.com.proyectobase.screenplay.ui.TheNinjaStorePhonesPdaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarAShoppingCart implements Task {
	
	public AgregarAShoppingCart(String opcionMenu, String item) {
		super();
		this.opcionMenu = opcionMenu;
		this.item = item;
	}

	private String opcionMenu;
	private String item;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.OPCION_PHONESPDA));	//falta adecuar variable opcionmenu 	
	    actor.attemptsTo(Click.on(TheNinjaStorePhonesPdaPage.BUSCAR_ITEM)); //falta adecuar variable item
	    actor.attemptsTo(Click.on(TheNinjaStorePhonesPdaPage.AGREGAR_A_CARRITO_COMPRAS));
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.OPCION_CARRITO_COMPRAS));
	}		
	
	public static AgregarAShoppingCart ItemACarritoCompras(String opcionMenu, String item) {
		return Tasks.instrumented(AgregarAShoppingCart.class, opcionMenu, item);
	}

}
