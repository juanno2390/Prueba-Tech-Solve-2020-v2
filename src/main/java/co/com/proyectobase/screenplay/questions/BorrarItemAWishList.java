package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.TheNinjaStorePhonesPdaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class BorrarItemAWishList implements Question<String>{

	public static BorrarItemAWishList es() {
		return new BorrarItemAWishList();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TheNinjaStorePhonesPdaPage.RESULTADO_BORRAR_WISH_LIST).viewedBy(actor).asString();
	}	
	
	
}
