package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.TheNinjaStorePhonesPdaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class BorrarItemACarritoDeCompras implements Question<String>{

	public static BorrarItemACarritoDeCompras es() {
		return new BorrarItemACarritoDeCompras();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TheNinjaStorePhonesPdaPage.RESULTADO_BORRAR_CARRITO_COMPRAS).viewedBy(actor).asString();
	}	
	
	
}
