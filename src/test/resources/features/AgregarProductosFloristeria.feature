Feature: Agregar productos de la categoría agradecimientos en la página Floristería Mundo Flor

  Background:
    Given el usuario ingresa a la pagina principal de la floristeria

  @Test1
  Scenario: Ingresar a la sección de agradecimientos
    When el usuario selecciona la categoria agradecimientos
    Then visualiza todos los productos de la categoria agradecimientos y se valida que el titulo sea AGRADECIMIENTOS

  @Test2
  Scenario: Añadir dos productos de la categoría Agradecimientos al carrito de compras
    When el usuario selecciona la categoria agradecimientos
    When el usuario selecciona el primer producto y regresa a la página agradecimientos
    And el usuario selecciona el segundo producto
    Then el usuario visualiza los productos en el carrito y se valida que el titulo de la pagina sea CARRITO

  @Test3
  Scenario: Validar que los productos se muestran correctamente en la opción Carro
    When el usuario selecciona la categoria agradecimientos
    When el usuario selecciona el primer producto y regresa a la página agradecimientos
    And el usuario selecciona el segundo producto
    When el usuario regresa a la pagina de agradecimientos
    And el usuario hace clic en el carrito
    Then el usuario visualiza los productos que agregó


