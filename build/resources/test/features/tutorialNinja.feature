#Author: juanno23@hotmail.com

@Regresion
Feature: Como un usuario
	quiero ingresar a la web de compras The Ninja Store
	para agregar y quitar articulos al carrito compras o marcarlos para wish list
	
	@HU1
	Scenario Outline: Registro de usuario exitoso
		Given Que usuarioTechSolve ingrese a la tienda virtual
		When el se registra por primera vez para poder comprar
		| <FirstName>  | <LastName>| <EMail> | <Telephone> | <Pass> | <Pass_C> |
		Then el deberia ver la palabra Success en pantalla inicial
				
    Examples: 
      | FirstName | LastName | EMail              	 | Telephone | Pass | Pass_C |
      | juanes  	| Acevedo  | juanno2390@gmail.com  | 2926898   | 1234 |	1234	 |
		
		