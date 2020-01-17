package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.TheNinjaStoreHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	TheNinjaStoreHomePage storeHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(storeHomePage));
	}

	public static Abrir LaPaginaTheNinjaStore() {
		return Tasks.instrumented(Abrir.class);
	}
}
