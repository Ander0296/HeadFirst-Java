# EJERCICIOS — JAVA (Head First Java, 3ra ed.)
Acá viven DOS tipos de ejercicios:
(A) DEL LIBRO: los trae el propio libro (Sharpen your pencil, BE the
    compiler, Code Magnets, Pool Puzzle, Exercise, crucigramas...).
    Los intento a mano ANTES de mirar la solución del libro o pedirla.
    Claude registra acá los que queden pendientes y su resultado.
(B) DEL PROFE: los crea Claude Code cuando un tema lo amerita
    (normalmente al cerrar un capítulo o cuando se juntan 2-3
    conceptos). Se hacen A MANO, hasta vaciar los pendientes.
El código Java va en ejercicios/ (yo lo compilo y lo ejecuto).
Los diagramas van en diagramas/ (.puml).
Estados: [ ] pendiente  [~] en curso  [x] completado (fecha)

FORMATO EJERCICIO DEL PROFE (referencia para Claude — copiar y llenar):

EJERCICIO #NN — [tema] — [ ] pendiente
Tipo: programa desde cero | completar/corregir código | conceptual | mini-diseño
Si te trabás: revisá la Sesión #Y de GUIA-JAVA.md
Enunciado:
(claro y concreto, pensado para novato)
Entregá en: ejercicios/ejNN-nombre/ (o diagramas/ejNN.puml)
Corrección de Claude (se llena al revisar):
...

FORMATO EJERCICIO DEL LIBRO (referencia para Claude — copiar y llenar):

LIBRO — [nombre del ejercicio] — [tema] (Ubicación X, Sesión #Y) — [ ] pendiente
Resultado y corrección de Claude (se llena al revisar):
...

============================================================

LIBRO — Sharpen your pencil: "Look how easy it is to write Java" — línea por línea, qué hace cada instrucción (Ubicación pág. 80-81, Sesión #09) — [ ] pendiente

Enunciado (tal cual lo plantea el libro): abajo tenés un fragmento de
código Java. Todavía NO viste esta sintaxis en detalle (variables,
if, while, arrays, try/catch) — el libro pide que uses la intuición,
como si fuera casi inglés/pseudocódigo, y escribas en una frase simple
qué hace CADA línea. No hace falta que la frase esté en inglés como
pide el libro: la podés escribir en español.

El libro ya te da 3 ejemplos resueltos como guía de formato:
- Línea 1 → "declare an integer variable named 'size' and give it the value 27"
- Línea con el `if` → "if x (value of 22) is less than 15, tell the dog to bark 8 times"
- Una de las líneas con `print` → "print out 'Hello'... probably at the command line"

Código completo:
```java
int size = 27;
String name = "Fido";
Dog myDog = new Dog(name, size);
x = size - 5;
if (x < 15) myDog.bark(8);

while (x > 3) {
  myDog.play();
}

int[] numList = {2, 4, 6, 8};
System.out.print("Hello");
System.out.print("Dog: " + name);
String num = "8";
int z = Integer.parseInt(num);

try {
  readTheFile("myFile.txt");
} catch (FileNotFoundException ex) {
  System.out.print("File not found.");
}
```

Entregá en: contame acá en el chat tus frases línea por línea (no
hace falta archivo .java, es un ejercicio de lectura/intuición).
Si te trabás: revisá la Sesión #09 de GUIA-JAVA.md (ahí está el
contexto de "Speed and memory usage" y "Code structure in Java").
Resultado y corrección de Claude (se llena al revisar):
...
