# co.com.proyectobase.techsolve2020
# 17/01/2020 
# Juan Esteban Acevedo M

proyecto de automatización Serenity + Screenplay 

Realizado en eclipse IDE oxigen
gradle v6.0
jdk v1.8
Ejecucion en Navegador Google Chrome:ChromeDriver
IMPORTANTE: Cuando descarguen y descompriman el .zip, renombrar carpeta "co.com.proyectobase.techsolve2020" 

Pasos para su correcto funcionamiento del putilizacion:
-una vez descargado el proyecto, establescalo en una ruta e inicie su IDE(eclipse oxigen/neon o IntelliJ IDEA).
Importar como projecto gradle existente en IDE:(Debe tener instalado previamente Buildship Gradle integration 3.0 y Cucumber(Serenitybdd)
(en eclipse lo puede descargar desde el marketplace).

-El Gradle.build del proyecto se encargara de rearmar las librerias para el proyecto (tenga muy encuenta tener ya instaladas 
las dependecias descritas en el paso anterior).

- El Gradle.setting contiene: 
rootProject.name = 'co.com.proyectobase.techsolve2020'

Una vez todo este compilado y correcto, Para ejecutar el proyecto debe ir a la 
clase RunnerTags.java (src->test->java->...runners->RunnerTags.java) alli dentro del archivo ejecutar 
con JUnit Test(click derecho->run as->JUnit Test). POr defecto se configura para que se ejecute todos los casos
pedidos en el examen como regresion.

En src->test->resources->features encontrara los casos del examen descritos como Historias de Usuario(HU), ademas de la informacion
del usuario a registrar y loguear en la plataforma.

Quedo atento a cualquier inquietud, puede escribirmo al correo juanno23@hotmail.com



