/*
 * EJERCICIO #14 — RE-ESTUDIO: "¿dónde vive cada cosa?"
 * (ejercicio del profe — Sesión #09 y #10 de la guía)
 *
 * POR QUÉ EXISTE ESTE EJERCICIO
 *
 * En el repaso r2 de "BE the Compiler" (pág. 123) apareció por segunda
 * vez seguida la misma idea equivocada: que un archivo no compila
 * "porque le falta el main, y todos los programas necesitan un main".
 * Eso es falso, y este ejercicio existe para que lo compruebes VOS
 * MISMO con el compilador, no porque yo te lo diga.
 *
 * La regla real tiene dos mitades, y conviene no mezclarlas:
 *   1. COMPILAR: cualquier clase bien formada compila, tenga main o no.
 *      Lo que sí es obligatorio es el anidamiento — toda instrucción
 *      ejecutable (un while, un if, una asignación) vive dentro de un
 *      metodo, y todo metodo vive dentro de una clase.
 *   2. EJECUTAR: para ARRANCAR un programa la JVM necesita un main.
 *      Eso hace falta al ejecutar, no al compilar.
 *
 * ------------------------------------------------------------------
 * ENUNCIADO
 *
 * Son DOS archivos, en esta misma carpeta.
 *
 * PARTE 1 — Termometro.java (este archivo)
 *
 * Escribi una clase llamada Termometro que NO tenga metodo main.
 * Tiene que tener:
 *   - una variable de instancia para la temperatura actual, en grados
 *     Celsius (numero con decimales);
 *   - un metodo para asignarle un valor a esa temperatura;
 *   - un metodo que devuelva esa misma temperatura convertida a
 *     Fahrenheit. La formula es: fahrenheit = celsius * 9 / 5 + 32.
 *     Ojo con el tipo de los numeros al dividir.
 *   - un metodo que imprima por pantalla si hace frio o calor,
 *     usando un if: si la temperatura es menor a 15, un mensaje; si
 *     no, otro. Los textos los elegis vos.
 *
 * PARTE 2 — TermometroTestDrive.java (el otro archivo de la carpeta)
 *
 * Ahi va la clase con el main que crea un Termometro y lo usa.
 *
 * PARTE 3 — la comprobacion, que es el corazon del ejercicio
 *
 * Compila PRIMERO la clase sin main, sola:
 *
 *     javac Termometro.java
 *
 * Anota que paso: compilo o no compilo, y si aparecio algun mensaje.
 * Despues intenta EJECUTARLA sola:
 *
 *     java Termometro
 *
 * Anota el mensaje exacto que aparece. Ese mensaje es la respuesta
 * del ejercicio: te va a decir con todas las letras en que momento
 * hace falta el main y en cual no.
 *
 * Por ultimo compila y ejecuta el par completo:
 *
 *     javac Termometro.java TermometroTestDrive.java
 *     java TermometroTestDrive
 *
 * PARTE 4 — la pregunta conceptual
 *
 * Respondela en dos o tres frases cuando entregues:
 * de las clases que ya viste en el libro (Startup, GameHelper, Dog,
 * Song, Movie), cuantas tienen metodo main, y por que igual son parte
 * de programas que funcionan.
 *
 * ------------------------------------------------------------------
 * Si te trabas: revisa la Sesion #09 y #10 de la guia (jerarquia
 * archivo fuente -> clase -> metodo -> instruccion).
 *
 * Checklist: ToDo/crear-una-clase-java.md — recorrelo MIENTRAS
 * escribis, y otra vez antes de compilar.
 *
 * Escribi tu codigo DEBAJO de este bloque, todo a mano. Acordate de
 * que la clase publica tiene que llamarse igual que el archivo.
 *
 * ------------------------------------------------------------------
 * PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines)
 *
 * Hice el EJERCICIO #14 "¿donde vive cada cosa?" (RE-ESTUDIO de
 * anidamiento, Sesion #09 y #10). Mi codigo esta en
 * ejercicios/ej14-anidamiento/ (Termometro.java y
 * TermometroTestDrive.java), y abajo pego lo que me devolvio la
 * terminal en cada uno de los tres comandos, mas mi respuesta a la
 * pregunta conceptual.
 * Corregilo EN EL CHAT pero SIN darme la solucion completa de entrada:
 * decime que tengo bien, que tengo mal, y dame pistas para lo que
 * falta. En EJERCICIOS.md registra el resultado en 3 lineas como
 * maximo; si quedo completado, movelo con su correccion a
 * EJERCICIOS-ARCHIVO.md y agenda sus repasos.
 */
