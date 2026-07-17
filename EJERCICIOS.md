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

LIBRO — BottleSong: encontrá y arreglá la falla en el código dado (Ubicación pág. 111, Sesión #14) — [~] en curso, pausado (2026-07-17)

Enunciado (tal cual lo plantea el libro): se da un programa completo
(clase BottleSong, la canción "10 green bottles") que compila y corre
sin errores, pero la salida no es 100% perfecta — tiene una falla
lógica sutil. Encontrala y arreglala.

NOTA: el archivo de arranque se tradujo al español (adaptación, no
literal) a pedido del usuario, para que pudiera concentrarse en la
lógica sin la barrera del inglés. La falla lógica es la misma que la
del libro (singular/plural de "botella"/"botellas" vía la variable
`word`), solo cambia el idioma de lo impreso.

Entregá en: ejercicios/ej02-bottlesong/BottleSong.java (archivo de
arranque ya creado por Claude — código original en comentarios, solo
falta que escribas tu versión corregida debajo).
Si te trabás: revisá la Sesión #12, #13 y #14 de GUIA-JAVA.md (ahí
está todo lo de `while`, `if`/`else` y variables).
Resultado y corrección de Claude (se llena al revisar):

Varios intentos en curso, todavía sin cerrar (pausado por el usuario
el 2026-07-17 para seguir con tandas nuevas; retomar más adelante):

1. Cambió el segundo `if` de `bottlesNum > 0` a `bottlesNum > 1` —
   no arregla la falla original y agrega una nueva (se salta el verso
   de "1 botella").
2. Volvió el segundo `if` a `> 0` y cambió el primer chequeo de
   `bottlesNum == 1` a `bottlesNum == 2` — mejora parcial (el verso de
   "Quedarán 1 botella..." queda bien) pero el verso de "2 botella(s)"
   queda mal (singular en vez de plural).
3. Reordenó el bloque entero `Quedarán/No quedará` para que quede
   ANTES de la resta (en vez de mover solo el chequeo del singular) —
   rompe la lógica: el `else` ("No quedará ninguna...") queda muerto
   (nunca se ejecuta, porque ese chequeo usa el mismo valor que ya
   garantizó el `while` para entrar al bucle) y aparece un verso
   "Quedarán 10..." de más al principio que la canción no tiene.
4. Detectó por su cuenta, sin que Claude lo señalara primero, que
   "Quedarán" es un string fijo que nunca pasa a singular ("Quedará")
   — observación correcta y aguda. Aclarado: ESO no es parte de la
   falla original del libro (en inglés "There'll be" tampoco conjuga
   por número); es un detalle que se le escapó a Claude al traducir.
   Queda como nota aparte para cuando se retome el ejercicio, no es
   requisito para completarlo.

Pista pendiente de aplicar (todavía no la probó): el chequeo
`if (bottlesNum == 1) { word = ...singular... }` tiene que volver a
estar DESPUÉS de `bottlesNum = bottlesNum - 1` (no antes, y no
moviendo el bloque entero de `Quedarán/No quedará`) — son 3 líneas
nada más las que hay que reubicar, dejando todo el resto del `while`
en su orden original.

PRÓXIMO PASO al retomar: pedirle que mueva SOLO esas 3 líneas del
chequeo `if (bottlesNum == 1)`, compile y corra de nuevo.

============================================================

LIBRO — Code Magnets: "Shuffle1" — reordenar los imanes de código para que el programa dé la salida pedida (Ubicación pág. 121-122, Sesión #15) — [x] completado (2026-07-17)

Enunciado (tal cual lo plantea el libro): un programa Java completo
está pegado con imanes en una heladera, pero alguien lo desarmó y los
pedazos quedaron sueltos y desordenados. Además, "se cayeron al piso"
algunas llaves `{ }` de cierre — podés (tenés que) agregar todas las
que hagan falta, no vienen todas en los imanes. Reordená los imanes
(sin cambiar lo que dice cada uno) para armar un programa que
compile y que, al correr `java Shuffle1`, imprima EXACTAMENTE:

    a-b c-d

Los imanes (desordenados, ver el archivo de arranque para el detalle
completo) incluyen: la declaración de la clase y el main, `int x = 3;`,
un `while (x > 0)`, y tres `if` distintos (`x == 1`, `x == 2`, `x > 2`)
más una línea que resta 1 a `x` y otra que imprime el guion "-".

Entregá en: ejercicios/ej03-shuffle1/Shuffle1.java (archivo de
arranque ya creado por Claude, con los imanes en comentarios — armá
tu versión debajo).
Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while,
if/else).
Resultado y corrección de Claude (se llena al revisar):

Entrega: ejercicios/ej03-shuffle1/Shuffle1.java. Compiló a la primera,
sin errores. Salida verificada con traza a mano: `a-b c-d`, exacta.

Armó un orden VÁLIDO pero distinto al de referencia interna: puso el
`System.out.print("-")` y la resta `x = x - 1` justo después del
`if (x > 2)`, ANTES de chequear `x == 2`, en vez de después. Funciona
perfecto igual porque respetó lo esencial — el momento exacto de la
resta respecto a cada impresión —, no memorizó un orden fijo. Buena
señal de comprensión real del mecanismo (traza x=3→2→1→0, cada if
evaluado con el valor correcto de x en cada vuelta). COMPLETADO.
Primer repaso agendado para 2026-07-21.

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

REPASO — EJERCICIO Code Magnets: Shuffle1 (pág. 121-122) (r1) — programado: 2026-07-21 — [ ] pendiente
Entregá en: ejercicios/repasos/ej03-shuffle1-r1/Shuffle1.java (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...
