package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class TheNinjaStorePhonesPdaPage extends PageObject {

	public static final Target BUSCAR_ITEM = Target.the("Opcion que nos llevara al detalle del Item")
			.located(By.linkText("iPhone"));		
	
	public static final Target AGREGAR_A_CARRITO_COMPRAS = Target.the("Boton que agrega Item al carrito de compras")
			.located(By.id("button-cart"));	

	public static final Target RESULTADO_AGREGAR_CARRITO_COMPRAS = Target.the("Area de Resultado de item agregado al carrito de compras exitoso")
			.located(By.xpath("//table[@class='table table-bordered']//a[contains(text(),'iPhone')]"));		
	
	public static final Target AGREGAR_A_WISH_LIST = Target.the("Boton que agrega Item a Wish List")
			.located(By.xpath("//div[@id='product-product']//div[@class='btn-group']//button[1]"));		

	public static final Target BORRAR_EN_CARRITO_COMPRAS = Target.the("Boton que borra Item del carrito de compras")
			.located(By.xpath("//button[@class='btn btn-danger']"));	
	
	public static final Target BORRAR_EN_WISH_LIST = Target.the("Boton que borra Item del Wish List")
			.located(By.xpath("//a[@class='btn btn-danger']"));		
		
	public static final Target RESULTADO_AGREGAR_WISH_LIST = Target.the("Area de Resultado de item agregado al wish list exitoso")
			.located(By.xpath("//table[@class='table table-bordered table-hover']//a[contains(text(),'iPhone')]"));			

	public static final Target RESULTADO_BORRAR_CARRITO_COMPRAS = Target.the("Area Resultado del borrar item del carrito de compras exitoso")
			.located(By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]"));		
	
	public static final Target RESULTADO_BORRAR_WISH_LIST = Target.the("Area de Resultado del borrar item del wish list exitoso")
			.located(By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]"));			

	
}
