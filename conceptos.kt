//En Kotlin, puedes declarar variables utilizando var o val.
//var crea una variable mutable, lo que significa que su valor puede cambiar después de la inicialización.
//val crea una variable inmutable, similar a una constante, cuyo valor no puede modificarse una vez asignado.

var contador = 0 // Variable mutable
val nombre = "Juan" // Variable inmutable

//CONSTANTES 
//En Kotlin, las constantes se definen con val.
//Son útiles cuando necesitas un valor que no cambiará durante la ejecución del programa.

val PI = 3.14159

//OPCIONALES Y NULOS
//Kotlin tiene un sistema de tipos seguro para manejar valores nulos.
//Para declarar una variable que puede ser nula, utiliza el operador ?.

val edad: Int? = null // Puede ser nulo
val nombre: String? = "Ana" // Puede ser nulo o no

//Para acceder al valor de una variable opcional, debes manejar los casos en los que sea nulo
//(por ejemplo, usando el operador ?. o el operador de elvis ?:).