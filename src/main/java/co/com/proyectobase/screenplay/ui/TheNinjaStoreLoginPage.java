package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TheNinjaStoreLoginPage extends PageObject {
	
	public static final Target CAMPO_EMAIL = Target.the("campo para escribir un e-mail")
			.located(By.id("input-email"));	
	
	public static final Target CAMPO_PASSWORD = Target.the("campo para escribir el password")
			.located(By.id("input-password"));	
	
	public static final Target BOTON_LOGIN = Target.the("boton para realizar inicio de sesion")
			.located(By.xpath("//input[@value='Login']"));	
	
	public static final Target RESULTADO_LOGIN = Target.the("area donde visualizamos menu principal cuando el login exitoso")
			.located(By.linkText("Account"));	
}
