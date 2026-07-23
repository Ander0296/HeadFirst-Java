# MECANOGRAFÍA — frases de tipeo por sesión

Las mantiene Claude (regla de mecanografía en CLAUDE.md): al cerrar
cada tanda agrega acá 1-2 frases CORTAS en español (10-16 palabras)
con las ideas clave de la sesión, y vuelca CADA frase aplanada (una
palabra por línea) a su propio archivo:
~/.config/ttyper/texts/headfirst-java-sNN.txt.
Yo practico con ttyper (CTRL+SUPER+ALT+T) sin mirar el teclado.
Las frases no se editan después; si un concepto cambió, frase nueva.

============================================================

s08 — JVM y bytecode:
javac compila el código fuente a bytecode y la JVM lo ejecuta en
cualquier sistema.

s10 — anatomía del main:
Java arranca en public static void main(String[] args) { } dentro
de una clase pública.

s12 — statements, loops y branching:
En un método hay statements, loops para repetir y branching con if
para decidir.

s13 — if/else:
La condición del if siempre es un boolean y va entre paréntesis.

s15 — arrays y Random:
Los arrays empiezan en cero y nextInt(limite) devuelve un entero al
azar.

s16a — BE the Compiler, estructura obligatoria:
Todo bucle o if vive dentro de un método, y todo método dentro de una
clase.

s16b — errores de compilación:
Si el compilador encuentra un error de sintaxis, el programa no
compila ni corre.

s17a — trazar un while paso a paso:
Para predecir la salida hay que rastrear el código vuelta por vuelta,
variable por variable.

s17b — concatenar números como texto:
x + "" + y con enteros no suma, concatena como texto pegado.

s18 — bucle infinito por falta de incremento:
Sin x = x + 1 dentro del while, la condición nunca se vuelve falsa.

s19 — fin del Capítulo 1, arranca el Capítulo 2:
Termina Breaking the Surface y empieza Objectville: clases y objetos.

s20a — Chair Wars, procedural vs objetos:
Laura pensó en procedimientos, Brad pensó en objetos: rotate y playSound por forma.

s20b — cada objeto sabe hacer lo suyo:
Cada clase sabe hacer sus propias cosas: eso es orientado a objetos.

s21a — el desenlace de Chair Wars:
Brad solo tocó la clase Amoeba; Laura tuvo que re-testear todo de nuevo.

s21b — qué es un atributo:
Un atributo es un dato propio de cada objeto, adelanto de instance variable.

s22a — herencia, superclase y subclases:
Shape es superclase, Square y Circle son subclases que heredan de ella.

s22b — qué es hacer override:
Override significa que la subclase redefine un método heredado.

s23a — diseñar una clase, checklist básico:
Al diseñar una clase pensá qué sabe el objeto y qué sabe hacer.

s23b — interfaz vs implementación:
El objeto sabe cómo hacerlo, el resto del programa solo dice qué hacer.

s24a — instance variable vs método:
Instance variable es lo que el objeto sabe, método es lo que sabe hacer.

s24b — instancia es sinónimo de objeto:
Pensá en instancia como otra forma de decir objeto en POO.

s25a — new y el operador punto:
Con new creo un objeto y con el punto accedo a sus datos y métodos.

s25b — escribir un dato vs. ejecutar un método:
d.size = 40 escribe el dato; d.bark() ejecuta el método.
