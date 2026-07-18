# MECANOGRAFÍA — frases de tipeo por sesión

Las mantiene Claude (regla de mecanografía en CLAUDE.md): al cerrar
cada tanda agrega acá 1-2 frases en español (20-35 palabras) con las
ideas clave de la sesión, y vuelca TODAS las frases aplanadas (una
palabra por línea) a ~/.config/ttyper/texts/headfirst-java.txt.
Yo practico con ttyper (CTRL+SUPER+ALT+T) sin mirar el teclado.
Las frases no se editan después; si un concepto cambió, frase nueva.

============================================================

s08 — JVM y bytecode:
El compilador javac traduce el código fuente a bytecode, y la JVM
(máquina virtual) de cada sistema operativo ejecuta ese mismo
bytecode: por eso Java se escribe una vez y corre en todas partes.

s10 — anatomía del main:
Toda aplicación Java arranca en el método main: public static void
main(String[] args) { } y la clase pública debe llamarse exactamente
igual que su archivo fuente.

s12 — statements, loops y branching:
Dentro del main hacés tres cosas: statements (sentencias) que
terminan en punto y coma, loops como while para repetir mientras la
condición sea true, y branching con if para decidir caminos.

s13 — if/else:
Con if (condición) { } else { } el programa elige entre dos caminos;
la condición siempre es un boolean y va entre paréntesis, nunca con
punto y coma antes de la llave.

s15 — arrays y Random:
Un array se declara con corchetes, sus posiciones empiezan en cero,
y java.util.Random genera enteros al azar con nextInt(limite) para
elegir una frase distinta cada vez.
