# Sistema de Validación de Datos con Manejo de Excepciones en Java
# Descrpción del proyecto
Este proyecto en Java consiste en un formulario interactivo por consola que solicita al usuario tres datos esenciales: edad, contraseña y correo electrónico. A cada uno se le aplican validaciones específicas utilizando excepciones personalizadas para garantizar la integridad y seguridad de la información ingresada.
El formulario no avanza hasta que los datos ingresados sean válidos según los siguientes criterios:

	•Edad: Debe estar en el rango de 0 a 120 años.
 
	•Contraseña: Debe tener al menos 8 caracteres, incluir una letra mayúscula y un número.
 
	•Email: Debe tener un formato válido de correo electrónico (ej. usuario@dominio.com).

Se emplean clases de excepción personalizadas para identificar errores específicos como:

	•EdadInvalidaException
 
	•PasswordInseguraException
 
	•FormatoInvalidoException
 
	•EmailInvalidoException

El objetivo del proyecto es aplicar el uso de excepciones, validación de entradas del usuario y separación de responsabilidades mediante clases auxiliares.

# Instrucciones para compilar y ejecutar el programa
1. Estructura de Archivos Recomendados
Guarda el código en archivos separados para facilitar la organización:

─ Main.java

─ Validar.java

─ EdadInvalidaException.java

─ EmailInvalidoException.java

─ FormatoInvalidoException.java

─ PasswordInseguraException.java

2. Compilar el Programa

Abre una terminal en la carpeta donde guardaste los archivos y ejecuta:

javac *.java

Esto compilará todos los archivos .java. Si no hay errores, se generarán archivos .class.

3. Ejecutar el Programa

Después de compilar, ejecuta el programa con:

java Main

4. Interacción

El programa te pedirá ingresar:

	1.Edad
 
	2.Contraseña
 
	3.Correo electrónico

Si alguno de los datos es incorrecto, se mostrará un mensaje de error y se pedirá que lo ingreses nuevamente hasta que sea válido.

# Clases:

•Main: Contiene el método main() y controla la interacción con el usuario

•Validar: Clase utilitaria con métodos estáticos para validar edad, contraseña y email

•EdadInvalidaException: Se lanza si la edad ingresada es menor que 0 o mayor que 120

•PasswordInseguraException: Se lanza si la contraseña no cumple con requisitos de seguridad

•FormatoInvalidoException: Se lanza si algún campo está vacío o no cumple un formato básico

•EmailInvalidoException: Se lanza si el correo electrónico tiene un formato inválido

# Capturas de pantalla
Ejecución en la terminal de visul estudio. Se agrego datos incorrectos para comprobar la validación de estos: 
<img src="capturas/cap1.PNG" >
<br>
<img src="capturas/cap2.PNG">

# Planner
https://teams.microsoft.com/l/entity/com.microsoft.teamspace.tab.planner/mytasks?tenantId=f94bf4d9-8097-4794-adf6-a5466ca28563&webUrl=https%3A%2F%2Ftasks.teams.microsoft.com%2Fteamsui%2FpersonalApp%2Falltasklists&context=%7B%22subEntityId%22%3A%22%2Fv1%2Fplan%2FswUDlhKRhky0yvek7JolhGQAGAxN%22%7D 
