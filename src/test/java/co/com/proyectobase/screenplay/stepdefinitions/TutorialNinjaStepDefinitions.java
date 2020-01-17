package co.com.proyectobase.screenplay.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import java.util.List;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.*;
import co.com.proyectobase.screenplay.tasks.*;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TutorialNinjaStepDefinitions {
	
	public static List<List<String>> data;	
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor usuario = Actor.named("usuarioTechSolve");
	
	@Before
	public void configuracionInicial() {
		usuario.can(BrowseTheWeb.with(hisBrowser));		
	}	
	
	//GENERADOS FEATURES:SCENARIO HU1
	@Given("^Que usuarioTechSolve ingrese a la tienda virtual$")
	public void queUsuarioTechSolveIngreseALaTiendaVirtual() {
		usuario.wasAbleTo(Abrir.LaPaginaTheNinjaStore());
	}


	@When("^el se registra por primera vez para poder comprar$")
	public void elSeRegistraPorPrimeraVezParaPoderComprar(DataTable dtRegistrarUsuario) {
		data= dtRegistrarUsuario.raw();		
		for (int i=0; i < data.size(); i++ ) {
			usuario.attemptsTo(Registrar.NuevoUsuario(data, i));
		}
	}

	@Then("^el deberia ver la palabra (.*) en pantalla inicial$")
	public void elDeberiaVerLaPalabraSuccessEnPantallaInicial(String ResultadoEsperado) {
		usuario.should(seeThat(LaRespuesta.es(), equalTo(ResultadoEsperado)));
	}

	//GENERADOS FEATURES:SCENARIO HU2
	@When("^el realiza login en la web para iniciar sesion$")
	public void elRealizaLoginEnLaWebParaIniciarSesion(DataTable dtLoguearUsuario) {
		data= dtLoguearUsuario.raw();		
		for (int i=0; i < data.size(); i++ ) {
			usuario.attemptsTo(Loguear.Usuario(data, i));
		}
	}

	@When("^el selecciona en el menu la seccion (.*)  para agregar al carrito de compras un (.*)$")
	public void elSeleccionaEnElMenuLaSeccionPhonesPDAsParaAgregarAlCarritoDeComprasUnIphone(String opcionMenu, String Item)  {
		usuario.attemptsTo(AgregarAShoppingCart.ItemACarritoCompras(opcionMenu, Item));
	}	

	@Then("^el deberia ver en el carrito de compras su (.*)$")
	public void elDeberiaVerEnElCarritoDeComprasSuIphone(String ResultadoEsperado) {
		usuario.should(seeThat(AgregarItemACarritoDeCompras.es(), equalTo(ResultadoEsperado)));
	}	

	//GENERADOS FEATURES:SCENARIO HU3
	@When("^el selecciona en el menu la seccion (.*)  para agregar al wish list un (.*)$")
	public void elSeleccionaEnElMenuLaSeccionPhonesPDAsParaAgregarAlWishListUnIPhone(String opcionMenu, String Item) {
		usuario.attemptsTo(AgregarAWishList.ItemAWishList(opcionMenu, Item));
	}

	@Then("^el deberia ver en el wish list su (.*)$")
	public void elDeberiaVerEnElWishListSuIPhone(String ResultadoEsperado) {
		usuario.should(seeThat(AgregarItemAWishList.es(), equalTo(ResultadoEsperado)));
	}	

	//GENERADOS FEATURES:SCENARIO HU4
	@When("^el selecciona en el menu superior la opcion Shopping Cart para borrar su (.*)$")
	public void elSeleccionaEnElMenuSuperiorLaOpcionShoppingCartParaBorrarSuIPhone(String Item) {
		usuario.attemptsTo(BorrarAShoppingCart.ItemACarritoCompras(Item));
	}

	@When("^el selecciona en el menu superior la opcion Wish List para borrar su (.*)$")
	public void elSeleccionaEnElMenuSuperiorLaOpcionWishListParaBorrarSuIPhone(String Item) {
		usuario.attemptsTo(BorrarAWishList.ItemAWishList(Item));
	}

	@Then("^el deberia ver en la lista Shopping Cart (.*)$")
	public void elDeberiaVerEnElShoppingCartVacio(String ResultadoEsperado) {
		usuario.should(seeThat(BorrarItemACarritoDeCompras.es(), equalTo(ResultadoEsperado)));
	}

	@Then("^el deberia ver en la lista wish list (.*)$")
	public void elDeberiaVerEnElWishListVacio(String ResultadoEsperado) {
		usuario.should(seeThat(BorrarItemAWishList.es(), equalTo(ResultadoEsperado)));
	}	
	
}
