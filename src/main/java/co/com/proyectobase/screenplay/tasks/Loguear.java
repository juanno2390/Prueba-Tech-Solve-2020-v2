package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.Keys;

import co.com.proyectobase.screenplay.ui.TheNinjaStoreHomePage;
import co.com.proyectobase.screenplay.ui.TheNinjaStoreLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguear implements Task {

	public Loguear(List<List<String>> data, int i) {
		super();
		//this.data = data;
		this.Email = data.get(i).get(0).trim();
		this.Password = data.get(i).get(1).trim();
	}

	//private List<List<String>> data;
	private String Email;
	private String Password;	
		
	@Override
	public <T extends Actor> void performAs(T actor) {
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.MENU_MYACCOUNT));
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.OPCION_LOGIN));		
		actor.attemptsTo(Enter.theValue(Email).into(TheNinjaStoreLoginPage.CAMPO_EMAIL));
		actor.attemptsTo(Enter.theValue(Password).into(TheNinjaStoreLoginPage.CAMPO_PASSWORD));
		actor.attemptsTo(Click.on(TheNinjaStoreLoginPage.BOTON_LOGIN));
	}	
	
	public static Loguear Usuario(List<List<String>> data, int i) {
		return Tasks.instrumented(Loguear.class, data, i);
	}
	
	
}
