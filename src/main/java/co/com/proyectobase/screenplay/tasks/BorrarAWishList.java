package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.TheNinjaStoreHomePage;
import co.com.proyectobase.screenplay.ui.TheNinjaStorePhonesPdaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BorrarAWishList implements Task {
	
	public BorrarAWishList(String item) {
		super();
		this.item = item;
	}

	private String item;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.OPCION_WISH_LIST));		
	    //actor.attemptsTo(Click.on(TheNinjaStorePhonesPdaPage.BUSCAR_ITEM)); //falta adecuar para id item borrado
	    actor.attemptsTo(Click.on(TheNinjaStorePhonesPdaPage.BORRAR_EN_WISH_LIST));
	}		
	
	public static BorrarAWishList ItemAWishList(String item) {
		return Tasks.instrumented(BorrarAWishList.class, item);
	}

}
