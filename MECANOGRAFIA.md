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
