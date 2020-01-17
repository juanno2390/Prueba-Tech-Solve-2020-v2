package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.Keys;

import co.com.proyectobase.screenplay.ui.TheNinjaStoreHomePage;
import co.com.proyectobase.screenplay.ui.TheNinjaStoreRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Registrar implements Task {
	
	public Registrar(List<List<String>> data, int i) {
		super();
		//this.data = data;
		this.Firstname = data.get(i).get(0).trim();
		this.Lastname = data.get(i).get(1).trim();
		this.Email = data.get(i).get(2).trim();
		this.Telephone = data.get(i).get(3).trim();
		this.Password = data.get(i).get(4).trim();
		this.Password_C = data.get(i).get(5).trim();
	}

	//private List<List<String>> data;
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Telephone;
	private String Password;
	private String Password_C;		
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.MENU_MYACCOUNT));
	    actor.attemptsTo(Click.on(TheNinjaStoreHomePage.OPCION_REGISTER));		
		actor.attemptsTo(Enter.theValue(Firstname).into(TheNinjaStoreRegisterPage.CAMPO_FIRSTNAME));
		actor.attemptsTo(Enter.theValue(Lastname).into(TheNinjaStoreRegisterPage.CAMPO_LASTNAME));
		actor.attemptsTo(Enter.theValue(Email).into(TheNinjaStoreRegisterPage.CAMPO_EMAIL));
		actor.attemptsTo(Enter.theValue(Telephone).into(TheNinjaStoreRegisterPage.CAMPO_TELEPHONE));
		//actor.attemptsTo(Scroll.to(TheNinjaStoreRegisterPage.BOTON_REGISTRAR));
		//actor.attemptsTo(WaitUntil.the(TheNinjaStoreRegisterPage.BOTON_REGISTRAR, isVisible()).forNoMoreThan(10).seconds());
		actor.attemptsTo(Enter.theValue(Password).into(TheNinjaStoreRegisterPage.CAMPO_PASSWORD));
		actor.attemptsTo(Enter.theValue(Password_C).into(TheNinjaStoreRegisterPage.CAMPO_PASSWORD_CONFIRM));
		actor.attemptsTo(Click.on(TheNinjaStoreRegisterPage.CHECK_AGREE));
		actor.attemptsTo(Click.on(TheNinjaStoreRegisterPage.BOTON_REGISTRAR));
	}	
	
	public static Registrar NuevoUsuario(List<List<String>> data, int i) {
		return Tasks.instrumented(Registrar.class, data, i);
	}
	
}
