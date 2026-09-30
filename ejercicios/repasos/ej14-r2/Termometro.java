/*
 * REPASO r2 — EJERCICIO #14: "¿dónde vive cada cosa?"
 * (ejercicio del profe — Sesión #09 y #10 de la guía)
 *
 * DESDE CERO: no mires tus soluciones anteriores. Volver a resolverlo
 * es lo que fija el conocimiento; releerlo no.
 *
 * POR QUÉ EXISTE ESTE EJERCICIO
 *
 * Para separar dos cosas que se mezclan muy fácil:
 *   1. COMPILAR: qué necesita un archivo para que javac lo acepte.
 *   2. EJECUTAR: qué necesita un programa para ARRANCAR.
 * No son lo mismo, y acá lo vas a comprobar VOS con el compilador, no
 * porque te lo diga yo.
 *
 * ------------------------------------------------------------------
 * ENUNCIADO
 *
 * Son DOS archivos, en esta misma carpeta.
 *
 * PARTE 1 — Termometro.java (este archivo)
 *
 * Escribí una clase llamada Termometro que NO tenga método main.
 * Tiene que tener:
 *   - una variable de instancia para la temperatura actual, en grados
 *     Celsius (número con decimales);
 *   - un método para asignarle un valor a esa temperatura;
 *   - un método que devuelva esa misma temperatura convertida a
 *     Fahrenheit. La fórmula es: fahrenheit = celsius * 9 / 5 + 32.
 *     Ojo con el tipo de los números al dividir.
 *   - un método que imprima por pantalla si hace frío o calor, usando
 *     un if: si la temperatura es menor a 15, un mensaje; si no, otro.
 *     Los textos los elegís vos.
 *
 * PARTE 2 — TermometroTestDrive.java (el otro archivo de la carpeta)
 *
 * Ahí va la clase con el main que crea un Termometro y lo usa.
 *
 * PARTE 3 — la comprobación, que es el corazón del ejercicio
 *
 * Compilá PRIMERO la clase sin main, sola:
 *
 *     javac Termometro.java
 *
 * Anotá qué pasó: compiló o no compiló, y si apareció algún mensaje.
 * Después intentá EJECUTARLA sola:
 *
 *     java Termometro
 *
 * Anotá el mensaje exacto que aparece (y su traducción al español, si
 * viene en inglés). Ese mensaje es la respuesta del ejercicio.
 *
 * Por último compilá y ejecutá el par completo:
 *
 *     javac Termometro.java TermometroTestDrive.java
 *     java TermometroTestDrive
 *
 * PARTE 4 — la pregunta conceptual (ES OBLIGATORIA: sin ella el
 * repaso queda incompleto)
 *
 * Respondela en dos o tres frases cuando entregues:
 * de las clases que ya viste en el libro (Startup, GameHelper, Dog,
 * Song, Movie), cuántas tienen método main, y por qué igual son parte
 * de programas que funcionan.
 *
 * ------------------------------------------------------------------
 * Si te trabás: revisá la Sesión #09 y #10 de GUIA-JAVA.md (jerarquía
 * archivo fuente -> clase -> método -> instrucción).
 *
 * Checklist: ToDo/crear-una-clase-java.md — recorrelo MIENTRAS
 * escribís, y otra vez antes de compilar (sobre todo el Nivel 3).
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano. Acordate de
 * que la clase pública tiene que llamarse igual que el archivo.
 *
 * PROMPT DE ENTREGA (copiá y pegá esto cuando termines los DOS
 * archivos y las CUATRO partes):
 * -------------------------------------------------------
 * /entrega Hice el REPASO r2 del ejercicio #14 ("¿dónde vive cada
 * cosa?", Termometro), está en ejercicios/repasos/ej14-r2/
 * (Termometro.java y TermometroTestDrive.java). Compiló: [sí/no].
 * Salida de `javac Termometro.java` sola: [pego]. Salida de
 * `java Termometro` sola: [pego] = [traducción]. Salida del par
 * completo: [pego]. PARTE 4 — mi respuesta a la pregunta conceptual:
 * [escribo]. Comparalo con mi original y mi r1 (sin mostrármelos
 * antes) y decime qué mejoré y qué se repitió.
 */
