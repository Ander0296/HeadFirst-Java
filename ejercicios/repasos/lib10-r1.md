REPASO r1 — LIBRO Sharpen your pencil: "What's legal?" (¿Qué es legal?)
(Ubicación pág. 305-306, Sesión #56) — desde cero, sin mirar tu versión original

## ENUNCIADO

Dado este método:

```java
int calcArea(int height, int width) {
    return height * width;
}
```

Nombres: `calcArea` (calcularÁrea), `height` (alto), `width` (ancho).

Decidí cuáles de estos llamados son LEGALES (compilan) y cuáles NO.
Algunas líneas solo asignan valores que se usan después, en el llamado
de la línea siguiente.

Para CADA línea escribí: LEGAL o NO LEGAL, y POR QUÉ en una frase.
Mirá las DOS puntas de cada línea: lo que ENTRA al método (los
argumentos) y lo que SALE (el tipo de la variable que recibe el
resultado).

```java
int a = calcArea(7, 12);
Compila, es legal, retorna un int, la variable es int, y los argumentos también son int.

short c = 7;
calcArea(c, 15);
Compila, por ensanchamiento implicito, un short cabe en un int.

int d = calcArea(57);
No compila, calArea pide dos argumentos, solo le estamos pasando uno.

calcArea(2, 3);
Compila, no se guarda en ninguna variable pero se está ejecutando el método con argumentos int.

long t = 42;
int f = calcArea(t, 17);
No compila, un long no puede entrar en un int de forma implicita, se debe hacer un conversión para que t sea un int y se pueda pasar como argumento.

int g = calcArea();
no compila, no estamos pasando argumentos.

calcArea();
Tampoco compila, faltan los argumentos

byte h = calcArea(4, 20);
No compila el return es de tipo int, la variable en la que se está guardando es de tipo byte, es más chica que el return.

int j = calcArea(2, 3, 5);
No compila, estamos pasando un argumento de más.
```

Si te trabás: revisá la Sesión #56 de GUIA-JAVA.md (ensanchamiento
implícito aplicado a argumentos de métodos) y la Sesión #41 (la misma
regla aplicada a arreglos).
Checklist: ToDo/entregar-un-ejercicio.md




---

PROMPT DE ENTREGA (copiar y pegar en Claude cuando termines):

/entrega Repaso r1 del libro "What's legal?" (pág. 305-306). Mi respuesta está en ejercicios/repasos/lib10-r1.md
