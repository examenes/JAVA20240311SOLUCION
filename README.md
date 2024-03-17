# DESARROLLO DE APLICACIONES MULTIPLATAFORMA
***EXAMEN DE PROGRAMACIÓN - 11 de marzo de 2024***

### Instrucciones:

+	Inicia sesión en tu cuenta de GitHub y haz un *fork* de este repositorio.

+	Clona el *fork* desde Eclipse importando el proyecto Java contenido en él.

+	Renombra el proyecto usando el formato: *ApellidosNombre* (apellidos y nombre completos, sin espacios ni separadores de ningún tipo, con tildes e iniciales en mayúsculas)

+	Lee completamente este documento antes de resolver los ejercicios.

+	Cuando finalces el examen:
	+	Ejecuta el *commit & push* final.
	+	Exporta el proyecto a un archivo zip y entrégalo.

### Ejercicios:

1.	**(5 puntos)** Definir una clase de objetos inmutables llamada `Automovil`, según las especificaciones siguientes: 

	*	Atributos marca, modelo, matricula, año de fabricación, tipo de motor (solo se admitirán los valores `GASOLINA`, `DIESEL`, `HIBRIDO` y `ELECTRICO`) y potencia 

	*	El orden natural de los objetos `Automovil` se define usando como criterios de ordenación: marca, modelo, tipo de motor, potencia y año de fabricación 

	*	Definir al menos dos constructores. Estos lanzarán la excepción `IllegalArgumentException` si el año de fabricación es negativo o mayor que el año en curso, o si la potencia es menor o igual que cero. No se podrá especificar un valor para el tipo de motor distinto de los admitidos. 

	*	Sobrescribir los métodos `hashCode`, `equals` y `toString`. 

	*	Definir los métodos necesarios para consultar el estado de los objetos.
	
2. Crea una clase llamada `PruebaAutomovil` según las especificaciones siguientes: 

	*	**(1,5 puntos)** Añade un método de clase que reciba una colección de objetos `Automovil` y una marca y retorne, usando un único *stream pipeline*, una `LinkedList` que contenga los automóviles de la marca especificada ordenados por año de fabricación. 

	*	**(2 puntos)** Añade un método de clase que reciba una colección de objetos `Automovil` y una marca y retorne, usando un único *stream pipeline*, la potencia media de los automóviles de esa marca por año de fabricación. 

	*	**(1,5 puntos)** En el método `main` crea un `TreeSet` de objetos Automovil que los ordene por tipo de motor, potencia, marca, modelo y año de fabricación. A continuación, almacena en él varios automóviles y úsalo para poner a prueba los dos métodos anteriores.