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
