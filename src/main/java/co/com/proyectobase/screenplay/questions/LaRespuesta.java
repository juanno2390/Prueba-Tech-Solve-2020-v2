package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.TheNinjaStoreRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String>{

	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TheNinjaStoreRegisterPage.RESULTADO_REGISTRO).viewedBy(actor).asString();
	}

}
