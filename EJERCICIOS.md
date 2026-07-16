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

LIBRO — Sharpen your pencil: "Look how easy it is to write Java" — línea por línea, qué hace cada instrucción (Ubicación pág. 80-81, Sesión #09) — [x] completado (2026-07-16)

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

Entrega: ejercicios/SharpenYourPencil.txt — 12 de 12 líneas bien
interpretadas en su intención (9 exactas, 3 con un detalle menor
completado luego con la pista de Claude en el chat: método `bark()`
como acción sobre el objeto, el término "concatenación" para el `+`
entre strings, y la mecánica completa de `try/catch`). Muy buen nivel
de intuición para no haber visto la sintaxis todavía — en varios casos
(línea 3 y línea 4) fue más preciso que el propio ejemplo del libro.
Completado.

============================================================

LIBRO — Sharpen your pencil: "DooBee" — completar el código faltante de un while + if para que coincida con la salida dada (Ubicación pág. 109, Sesión #13) — [x] completado (2026-07-16)

Enunciado (tal cual lo plantea el libro): te dan la salida de un
programa ya ejecutado, y tenés que completar los espacios en blanco
(`____`) del código para que produzca exactamente esa salida.

Salida dada:
```
% java DooBee
DooBeeDooBeeDo
```

Completá el código:
```java
public class DooBee {
  public static void main(String[] args) {
    int x = 1;
    while (x < ____) {
      System.out.____("Doo");
      System.out.____("Bee");
      x = x + 1;
    }
    if (x == ____) {
      System.out.print("Do");
    }
  }
}
```

Pista para arrancar: fijate que toda la salida queda pegada en un
solo renglón, sin saltos de línea — eso te dice algo sobre si hay que
usar `print` o `println` en los espacios en blanco de adentro del
`while`.

Entregá en: ejercicios/ej01-doobee/DooBee.java (archivo de arranque
creado retroactivamente el 2026-07-16, ver nota más abajo).
Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (ahí está
todo lo de `while`, `if`/`else` y `print` vs `println`).
Resultado y corrección de Claude (se llena al revisar):

Intento 1 (ejercicios/DooBee.txt): usó `print` en los 3 espacios
(correcto). Estructura consistente: el valor de `x` en el `if`
coincide con el valor final de `x` al salir de su propio `while`
(buena señal de comprensión). Error: `while (x < 2)` solo da UNA
vuelta arrancando en x=1, así que imprime "DooBee" una sola vez en vez
de dos — la salida de su código sería "DooBeeDo", no "DooBeeDooBeeDo".
Pista dada (sin solución completa): contar cuántas vueltas da el while
con esa condición vs. cuántas veces aparece "DooBee" en la salida
esperada.

Intento 2 (mismo archivo, ejercicios/DooBee.txt): ajustó a
`while (x <= 2)` — ahora dos vueltas, "DooBee" dos veces. Pero el `if`
quedó en `x == 2` (el valor viejo), y el valor real de `x` al salir
del nuevo while es 3. Pista dada: recalcular cuánto vale `x` justo al
salir del while con la nueva condición.

Intento 3 (mismo archivo): corrigió a `if (x == 3)`. Traza completa:
x=1→(1<=2 Doo Bee x=2)→(2<=2 Doo Bee x=3)→(3<=2 false, sale)→
if(x==3) true → "Do". Salida: "DooBeeDooBeeDo", coincide exacto.
COMPLETADO. Primer repaso agendado para 2026-07-20.

NOTA sobre archivo de arranque (regla nueva de CLAUDE.md, 2026-07-16):
este ejercicio se resolvió íntegramente en ejercicios/DooBee.txt,
ANTES de que existiera la regla de archivo de arranque. Por pedido
explícito del usuario, se creó retroactivamente
ejercicios/ej01-doobee/DooBee.java como archivo de arranque formal
(solo comentarios, sin código ejecutable) para dejar el registro
consistente de cara a un futuro repaso. De acá en adelante, todo
ejercicio y repaso NUEVO arranca directamente con su archivo de
arranque ya creado por Claude, antes de que el usuario empiece a
resolver.

============================================================

LIBRO — BottleSong: encontrá y arreglá la falla en el código dado (Ubicación pág. 111, Sesión #14) — [ ] pendiente

Enunciado (tal cual lo plantea el libro): se da un programa completo
(clase BottleSong, la canción "10 green bottles") que compila y corre
sin errores, pero la salida no es 100% perfecta — tiene una falla
lógica sutil. Encontrala y arreglala.

Entregá en: ejercicios/ej02-bottlesong/BottleSong.java (archivo de
arranque ya creado por Claude — código original en comentarios, solo
falta que escribas tu versión corregida debajo).
Si te trabás: revisá la Sesión #12, #13 y #14 de GUIA-JAVA.md (ahí
está todo lo de `while`, `if`/`else` y variables).
Resultado y corrección de Claude (se llena al revisar):
...

============================================================

REPASOS

REPASO — EJERCICIO Sharpen your pencil (pág. 80-81) (r1) — programado: 2026-07-20 — [ ] pendiente
Entregá en: ejercicios/repasos/sharpen-your-pencil-r1/ (desde cero, sin mirar el original)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO DooBee (pág. 109) (r1) — programado: 2026-07-20 — [ ] pendiente
Entregá en: ejercicios/repasos/ej01-doobee-r1/DooBee.java (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...
