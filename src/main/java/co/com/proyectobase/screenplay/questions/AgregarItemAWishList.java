package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.TheNinjaStorePhonesPdaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AgregarItemAWishList implements Question<String>{

	public static AgregarItemAWishList es() {
		return new AgregarItemAWishList();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TheNinjaStorePhonesPdaPage.RESULTADO_AGREGAR_WISH_LIST).viewedBy(actor).asString();
	}	
	
	
}
