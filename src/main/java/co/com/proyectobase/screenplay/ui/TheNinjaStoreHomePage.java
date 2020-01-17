package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tutorialsninja.com/demo/")
public class TheNinjaStoreHomePage extends PageObject {
	//rutas de menu y accesos
	public static final Target MENU_MYACCOUNT = Target.the("Menu que muestra las opciones de login para usuario")
			.located(By.xpath("//span[contains(text(),'My Account')]"));	
	
	public static final Target OPCION_REGISTER = Target.the("Opcion que nos llevara al formulario para registro de usuario")
			.located(By.linkText("Register"));
	
	public static final Target OPCION_LOGIN = Target.the("Opcion que nos llevara al formulario para inicio de sesion")
			.located(By.linkText("Login"));
	
	public static final Target OPCION_LOGOUT = Target.the("Opcion que finaliza la sesion de usuario activa")
			.located(By.linkText("Logout"));	
	
	public static final Target OPCION_PHONESPDA = Target.the("Opcion que nos llevara a la lista de Phones & PDAs")
			.located(By.linkText("Phones & PDAs"));		
	
	public static final Target OPCION_CARRITO_COMPRAS = Target.the("Opcion que nos llevara a la lista de items agregados al Carrito de compras")
			.located(By.xpath("//div[@id='top-links']/ul/li[4]/a/i"));		
	
	public static final Target OPCION_WISH_LIST = Target.the("Opcion que nos llevara a la lista de items agregados al Wish List")
			.located(By.xpath("//a[@id='wishlist-total']/i"));			
	
}
