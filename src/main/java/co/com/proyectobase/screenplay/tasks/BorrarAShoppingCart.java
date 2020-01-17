package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.TheNinjaStoreHomePage;
import co.com.proyectobase.screenplay.ui.TheNinjaStorePhonesPdaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class BorrarAShoppingCart implements Task {
	
	public BorrarAShoppingCart(String item) {
		super();
		this.item = item;
	}

	private String item;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.OPCION_CARRITO_COMPRAS));	 	
	    //actor.attemptsTo(Click.on(TheNinjaStorePhonesPdaPage.BUSCAR_ITEM)); //falta adecuar para id item borrado
	    actor.attemptsTo(Click.on(TheNinjaStorePhonesPdaPage.BORRAR_EN_CARRITO_COMPRAS));
	}		
	
	public static BorrarAShoppingCart ItemACarritoCompras( String item) {
		return Tasks.instrumented(BorrarAShoppingCart.class, item);
	}

}
