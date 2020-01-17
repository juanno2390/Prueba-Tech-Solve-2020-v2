#Author: juanno23@hotmail.com

@Regresion
Feature: Como un usuario
	quiero ingresar a la web de compras The Ninja Store
	para agregar y quitar articulos al carrito compras o marcarlos para wish list
	
	@HU1
	Scenario Outline: Registro de usuario
		Given Que usuarioTechSolve ingrese a la tienda virtual
		When el se registra por primera vez para poder comprar
		| <FirstName>  | <LastName>| <EMail> | <Telephone> | <Pass> | <Pass_C> |
		Then el deberia ver la palabra Success en pantalla inicial
						
    Examples: 
      | FirstName | LastName | EMail                | Telephone | Pass | Pass_C |
      | juanes  	| Acevedo  | juanno90@hotmail.com | 2926898   | 1234 |	1234	|
		
  @HU2
  Scenario: Login usuario y adicion de un item al carrito de compras
    Given Que usuarioTechSolve ingrese a la tienda virtual
    When el realiza login en la web para iniciar sesion
#   | EMail                | Pass |
    | juanno90@hotmail.com | 1234 | 
    And el selecciona en el menu la seccion Phones & PDAs  para agregar al carrito de compras un iPhone 
    Then el deberia ver en el carrito de compras su iPhone 		
    
 @HU3
  Scenario: Agregar un item a Wish List con exito
    Given Que usuarioTechSolve ingrese a la tienda virtual
    When el realiza login en la web para iniciar sesion
#   | EMail                | Pass |
    | juanno90@hotmail.com | 1234 | 
    And el selecciona en el menu la seccion Phones & PDAs  para agregar al wish list un iPhone 
    Then el deberia ver en el wish list su iPhone 
    
  @HU4
  Scenario: Borrar item del Carrito de compras y del Wish List con exito
    Given Que usuarioTechSolve ingrese a la tienda virtual
    When el realiza login en la web para iniciar sesion
#   | EMail                | Pass |
    | juanno90@hotmail.com | 1234 | 
    And el selecciona en el menu superior la opcion Shopping Cart para borrar su iPhone
    And el selecciona en el menu superior la opcion Wish List para borrar su iPhone 
    Then el deberia ver en la lista Shopping Cart Your shopping cart is empty! 
    And el deberia ver en la lista wish list Your shopping cart is empty!             
    