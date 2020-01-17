package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TheNinjaStoreRegisterPage extends PageObject {
	
	public static final Target CAMPO_FIRSTNAME = Target.the("campo para escribir el nombre")
			.located(By.id("input-firstname"));	

	public static final Target CAMPO_LASTNAME = Target.the("campo para escribir el apellido")
			.located(By.id("input-lastname"));	
	
	public static final Target CAMPO_EMAIL = Target.the("campo para escribir un e-mail")
			.located(By.id("input-email"));	
	
	public static final Target CAMPO_TELEPHONE = Target.the("campo para escribir un telefono")
			.located(By.id("input-telephone"));		
	
	public static final Target CAMPO_PASSWORD = Target.the("campo para escribir el password")
			.located(By.id("input-password"));		
	
	public static final Target CAMPO_PASSWORD_CONFIRM = Target.the("campo para confirmar el password")
			.located(By.id("input-confirm"));	
	
	public static final Target CHECK_AGREE = Target.the("checkbox para confirmar la aceptacion de las condiciones de privacidad")
			.located(By.xpath("//input[@name='agree']"));		
	
	public static final Target BOTON_REGISTRAR = Target.the("boton para realizar el registro de usuario")
			.located(By.xpath("//input[@value='Continue']"));	
	
	public static final Target RESULTADO_REGISTRO = Target.the("area donde visualizamos el resultado del registro exitoso")
			.located(By.linkText("Success"));		
}
