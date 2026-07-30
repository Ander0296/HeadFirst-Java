LIBRO — Sharpen your pencil: "What's legal?" (¿Qué es legal?)
(Ubicación pág. 305-306, Sesión #56)

## ENUNCIADO

Dado este método:

```java
int calcArea(int height, int width) {
    return height * width;
}
```

Decidí cuáles de estos llamados son LEGALES (compilan) y cuáles NO.
Poné un check al lado de los que SÍ son legales. (Algunas líneas solo
asignan valores que se usan después, en el llamado de la línea
siguiente.)

```java
int a = calcArea(7, 12);

short c = 7;
calcArea(c, 15);

int d = calcArea(57);

calcArea(2, 3);

long t = 42;
int f = calcArea(t, 17);

int g = calcArea();

calcArea();

byte h = calcArea(4, 20);

int j = calcArea(2, 3, 5);
```

Si te trabás: revisá la Sesión #56 de la guía (ensanchamiento
implícito aplicado a argumentos de métodos) y la Sesión #41 (la misma
regla aplicada a arreglos).

## MI RESPUESTA

(escribí acá, línea por línea, si cada llamado es LEGAL o NO, y por
qué)

int a = calcArea(7, 12); // Legal

short c = 7; // Legal
calcArea(c, 15); // Legal

int d = calcArea(57); // Ilegal, un solo parámetro.

calcArea(2, 3); // Legal

long t = 42; // Legal
int f = calcArea(t, 17); // Ilegal, estamos metiendo un párametro más grande en un entero, puede perder información

int g = calcArea(); // Ilegal, no tiene parámetros.

calcArea(); // Ilegal, no tiene parámetros.

byte h = calcArea(4, 20); // Ilegal, estamos metiendo una sálida entera en un byte

int j = calcArea(2, 3, 5); // Ilegal, estámos metiendo  más parámetros
---

PROMPT DE ENTREGA (copiar y pegar en Claude cuando termines):

Hice el ejercicio del libro "What's legal?" (página 305-306).
Mi respuesta está en ejercicios/lib10-legal-argumentos.md. Corregilo
EN EL CHAT pero SIN darme la solución completa de entrada: decime qué
tengo bien, qué tengo mal, y dame pistas para lo que falta. La
solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
