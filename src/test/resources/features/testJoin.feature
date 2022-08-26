# language: es
  #Autor: John sanchez P

  @historiausuario
Característica: ingresar a la página de Utest.com y proceder a dar clic
  en la opción de registro (JOIN TODAY) y realizar el diligenciamiento
  del formulario con la finalidad de crear un nuevo usuario.

  @escenariologueo
  Escenario: Crear un nuevo usuario
    Dado que queremos acceder a la pagina
    Cuando presionamos el boton registrar
    Entonces quedamos logueados correctamente y con una cuenta creada


    #Criterios de aceptación
  # El Usuario debe llenar todos los campos manualmente
  # No se deben dejar campos con información detectada automaticamente
  # Se debe utilizar una contraseña segura (Combinar caracteres)
  # Aceptar todos los Checks del final
