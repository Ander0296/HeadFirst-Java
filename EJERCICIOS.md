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

REPASO r1 (2026-07-21) — entrega en
ejercicios/repasos/sharpen-your-pencil-r1/sharpen-your-pencil-r1.md,
resuelto desde cero. Comparación línea por línea contra el original:

MEJORÓ (2 de los 3 puntos débiles del intento original quedaron
resueltos):
- Línea `if (x < 15) myDog.bark(8);` — el original decía "no sé qué es
  bark la verdad" (no reconocía que era un método). Esta vez: "ejecuta
  myDog.bark y tiene un parámetro que es 8" — entendió que `bark()` es
  una ACCIÓN que se ejecuta sobre el objeto `myDog`, con un argumento.
  Punto débil cerrado.
- Bloque `try/catch` — el original solo anotó la línea de
  `readTheFile`, sin explicar el mecanismo de la excepción. Esta vez
  anotó las 4 líneas por separado, incluyendo el catch: "si no existe
  o tenemos un error, imprime el mensaje de abajo" — mecánica completa
  entendida. Punto débil cerrado.
- Bonus: en `x = size - 5;` esta vez calculó el valor final (22), algo
  que el original no hacía.

ERROR QUE SE REPITIÓ (parcialmente):
- Línea `System.out.print("Dog: " + name);` — el original decía "no
  recuerdo cómo se llama ese concepto" (el operador `+` uniendo
  strings). Esta vez el resultado que dio ("imprime en consola Dog:
  'Fido'") es CORRECTO, pero otra vez sin nombrar ni explicar el
  mecanismo: que `+` entre un String y una variable String hace
  CONCATENACIÓN (pegar un string con otro, no una suma numérica). Es
  un progreso parcial (ahora intuye bien el resultado) pero el
  concepto de fondo todalabía no está verbalizado — se retoma en el
  chat de esta sesión.

RESULTADO: repaso salió BIEN (11/12 líneas sólidas, mejora clara en 2
de los 3 puntos débiles originales; el punto de concatenación quedó
parcial, no repetido dos veces desde cero como para requerir
re-estudio formal). Se agenda repaso r2 (~2 semanas después de r1).

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

LIBRO — BottleSong: encontrá y arreglá la falla en el código dado (Ubicación pág. 111, Sesión #14) — [x] completado (2026-07-21)

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

5. (2026-07-21) Retomó el ejercicio y aplicó un enfoque distinto al de
   la pista: en vez de mover el chequeo `if (bottlesNum == 1)`, movió
   las 3 líneas de los dos `System.out.println(bottlesNum + " " + word)`
   + `System.out.println("Y si...")` para que queden ANTES de
   `bottlesNum = bottlesNum - 1`, dejando el resto del bloque
   (decremento, chequeo singular, `Quedarán`/`No quedará`) en su orden
   original. Es una solución válida y distinta a la sugerida — mismo
   resultado por otro camino: ahora los dos primeros `println` de cada
   verso usan el valor de `bottlesNum` ANTES de restar (el conteo
   "actual"), y la línea `Quedarán`/`No quedará` sigue usando el valor
   YA restado, con `word` ya actualizado a singular cuando corresponde.
   Compiló sí. Salida real pegada por el usuario confirmada línea por
   línea contra la traza manual: coincide 100% con la letra de la
   canción, de "10 botellas..." hasta "No quedará ninguna botella
   verde, colgada de la pared." — EJERCICIO COMPLETADO.

Nota aparte (no bloquea, ver punto 4): "Quedarán" queda fijo en plural
incluso en el verso de la última botella ("Quedarán 1 botella verde"),
detalle que el propio usuario detectó y que también existe en el
original en inglés del libro ("There'll be" no conjuga por número) —
queda solo como observación, no es parte de la falla que había que
arreglar.

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

LIBRO — BE the Compiler: decidir si tres archivos Java compilan y, si no, cómo arreglarlos (Ubicación pág. 123, Sesión #16) — [x] completado (2026-07-19)

Enunciado (tal cual lo plantea el libro): se dan 3 "archivos fuente"
completos (A, B, C). Hay que jugar a ser el compilador: decidir si
cada uno compila, y si no, explicar cómo arreglarlo.

Entregá en: ejercicios/lib01-be-the-compiler.md (archivo de arranque
ya creado por Claude, con los 3 archivos y una sección "MI RESPUESTA").
Si te trabás: revisá la Sesión #09 y #10 de GUIA-JAVA.md (jerarquía
archivo fuente → clase → método → instrucción).
Resultado y corrección de Claude (se llena al revisar):

Intento 1 (2026-07-19):

A: CORRECTO — compila (bien anidado: clase → main → while → if). Buena
observación extra, no pedida por el enunciado: notó que x nunca se
modifica dentro del while, así que corre para siempre. Matiz de
vocabulario: no es "error de bucle" (no tira ninguna excepción ni se
frena) — es un bucle infinito que además NUNCA llega a imprimir
"big x", porque x se queda fijo en 1 y jamás supera 3.

B: CORRECTO — no compila, y el motivo (falta la clase) es el correcto.
Matiz: no es que "la sintaxis esté bien pero falte la clase" como si
fueran dos cosas separadas — la ausencia del `class { }` que envuelva
al método ES en sí misma la falla de sintaxis (un método no puede
existir suelto a nivel de archivo).

C: intento 1 incorrecto (dijo que compilaba por tener nombre de clase,
sin ver el problema real). Se explicó en el chat, con analogía de
"menú de la clase" (qué TIENE = variables, qué SABE HACER = métodos,
nada más puede ir suelto ahí), la regla de que toda instrucción
ejecutable (while, if) tiene que vivir dentro de un método.

Intento 2 (mismo día): CORRECTO — no compila, y la causa es la
correcta: al `while` le falta estar dentro de un método (le falta ese
nivel de anidamiento entre la clase y la instrucción). Matiz de
redacción pulido en el chat: no es "se rompe por estar dentro de una
clase" (eso es obligatorio) sino "se rompe por estar SOLO dentro de la
clase, sin el método intermedio que le falta".

RESULTADO FINAL: A compila (bien anidado; detectó además, sin que se
lo pidieran, que x nunca se incrementa y el while queda infinito). B
no compila (falta el `class { }` que envuelva al método). C no compila
(falta el método que envuelva al `while`). Las tres, correctas.
COMPLETADO. Primer repaso agendado para 2026-07-22.

NOTA: "JavaCross" (crucigrama, pág. 124-125) es opcional (ícono
Puzzle) — no se registra como pendiente obligatorio; si el usuario
quiere resolverlo, avisa y se corrige, pero no bloquea el avance.

============================================================

LIBRO — Mixed Messages: emparejar 5 bloques candidatos con la salida que producirían (Ubicación pág. 127-129, Sesión #17) — [x] completado (2026-07-19)

Enunciado (tal cual lo plantea el libro): un programa (`Test`) tiene un
bloque de código faltante dentro de un `while`. Se dan 5 bloques
candidatos y 8 salidas posibles (no todas se usan, alguna se puede
repetir). Hay que emparejar cada candidato con la salida que
produciría si se insertara en el hueco.

Entregá en: ejercicios/lib02-mixed-messages.md (archivo de arranque ya
creado por Claude, con el programa completo, los 5 candidatos, las 8
salidas posibles y una sección "MI RESPUESTA").
Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while, if) y
practicá trazar el bucle a mano, vuelta por vuelta.
Resultado y corrección de Claude (se llena al revisar):

Entrega: 5 de 5 candidatos correctos a la primera. Verificado con
traza propia de Claude, vuelta por vuelta:

- Candidato 1 (y = x - y;) → E (00 11 21 32 42). CORRECTO.
- Candidato 2 (y = y + x;) → G (00 11 23 36 410). CORRECTO. El salto a
  3 dígitos en la última vuelta (y llega a 10) es justo la trampa que
  el ejercicio quería que se detectara.
- Candidato 3 (y = y + 2; if (y>4) y=y-1;) → H (02 14 25 36 47).
  CORRECTO.
- Candidato 4 (x=x+1; y=y+x;) → B (11 34 59). CORRECTO — el más
  engañoso de los 5: x se incrementa DOS veces por vuelta (una en el
  candidato, otra en la línea fija del while), así que el bucle corre
  menos vueltas de las que parece a simple vista.
- Candidato 5 (if(y<5){x=x+1; if(y<3)x=x-1;} y=y+2;) → D (02 14 36 48).
  CORRECTO — el más largo de trazar, con if anidados que en las
  primeras vueltas se cancelan entre sí (x sube y baja) hasta que la
  condición interna deja de cumplirse.

Las salidas A (22 46), C (02 14 26 38) y F (11 21 32 42 53) no se usan
para ningún candidato — como avisaba el enunciado, no todas las
salidas se usan. COMPLETADO. Primer repaso agendado para 2026-07-23.

============================================================

EJERCICIO #04 — Pool Puzzle: completar el código con fragmentos de una pileta para lograr una salida exacta (Ubicación pág. 129-131, Sesión #17) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Tipo: completar/corregir código
Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while, if,
operadores de comparación).
Enunciado:
Clase `PoolPuzzleOne` con varios espacios en blanco (condiciones,
asignaciones e impresiones) que hay que completar usando fragmentos de
una lista dada ("la pileta"), cada uno usable una sola vez, sin usar
todos necesariamente, para que compile, corra y produzca EXACTO:
```
a noise
annoys
an oyster
```
Este es opcional (ícono Puzzle del libro, no Exercise obligatorio) —
se puede saltar sin culpa, pero es buena práctica de trazar bucles e
`if` a mano y de armar salida con `print()` fragmento por fragmento.
Entregá en: ejercicios/ej04-pool-puzzle/ (archivo de arranque ya
creado por Claude, con el esqueleto completo y la lista de fragmentos
disponibles, todo en comentarios)
Corrección de Claude (se llena al revisar):
...

============================================================

LIBRO — BE the Compiler, parte 2 — decidir si dos archivos Java compilan y, si no, cómo arreglarlos (Ubicación pág. 183-184, Sesión #28) — [x] completado (2026-07-24)
Entregá en: ejercicios/lib05-be-the-compiler-2.md (archivo de arranque
ya creado por Claude, con los 2 archivos y una sección "MI RESPUESTA").
Si te trabás: revisá la Sesión #25 (new, operador punto) y la Sesión
#16/#18 de GUIA-JAVA.md (mismo formato de ejercicio, ya resuelto antes).
Resultado y corrección de Claude:

Intento 1: diagnóstico de ambos archivos CORRECTO a la primera —
A: no compila porque `song` nunca se declaró ni se creó con `new`. B:
no compila porque `Episode` no tiene ningún method `play()`. Faltaba
la otra mitad del enunciado ("¿cómo lo arreglarías?"), pedida en el
chat.

Intento 2: arregló A perfecto (`StreamingSong song = new
StreamingSong();` declarado antes de usarla). En el arreglo de B se
colaron dos errores nuevos de sintaxis: `system.out.println(...)` con
minúscula (Java es case-sensitive, `System` va con mayúscula) y sin
punto y coma al final. Señalado en el chat.

Intento 3: corrigió los dos detalles de B (`System.out.println("Play
song");`, mayúscula y `;`). RESULTADO: los dos archivos, diagnóstico Y
arreglo, quedaron correctos. EJERCICIO COMPLETADO. Primer repaso
agendado para 2026-07-28.

============================================================

LIBRO — Sharpen your pencil: "Movie objects" — completar la tabla con los valores finales de tres objetos Movie al terminar main() (Ubicación pág. 170-173, Sesión #26) — [x] completado (2026-07-24)
Entregá en: ejercicios/lib04-movie-objects.md (archivo de arranque ya
creado por Claude, con el código completo y una sección "MI RESPUESTA").
Si te trabás: revisá la Sesión #25 y #26 de GUIA-JAVA.md (new, operador
punto, cada objeto tiene su propia copia de las instance variables).
Resultado y corrección de Claude:

Entrega:
- object 1: "Gone with the Stock" / Tragic / -2 — CORRECTO, exacto.
- object 2: "Lost in Cubicle Space" / Comedy / 5 — CORRECTO, exacto.
- object 3: "byte club" / "Tragic but ultimately uplifting" / 127 —
  valores correctos. Único detalle cosmético (no bloquea): el título
  real en el código es "Byte Club" con mayúsculas — en Java un String
  es sensible a mayúsculas/minúsculas, así que si este valor se
  comparara con `.equals()` en código real, "byte club" y "Byte Club"
  serían dos Strings DISTINTOS. Acá es solo una tabla de lectura, no
  afecta el resultado del ejercicio.

RESULTADO: 3 de 3 objetos correctos, trazó bien que cada objeto
mantiene sus propios valores incluso con `playIt()` llamado solo sobre
`two`. EJERCICIO COMPLETADO. Primer repaso agendado para 2026-07-28.

============================================================

EJERCICIO #07 — Pool Puzzle: "Echo" — completar dos clases con fragmentos de una pileta para lograr una salida exacta (Ubicación pág. 187-190, Sesión #29) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Tipo: completar/corregir código
Si te trabás: revisá la Sesión #25/#26 (new, operador punto) y la
Sesión #17 (EJERCICIO #04, mismo tipo de acertijo) de GUIA-JAVA.md.
Enunciado:
Clases `Echo` y `EchoTestDrive` con varios espacios en blanco
(nombres, condiciones, asignaciones) que hay que completar usando
fragmentos de una lista dada ("la pileta", reutilizables), para que
compile, corra y produzca EXACTO:
```
helloooo...
helloooo...
helloooo...
helloooo...
10
```
Bonus del libro: si la última línea fuera 24 en vez de 10, ¿cómo
completarías el acertijo?
Entregá en: ejercicios/ej07-pool-puzzle-echo/EchoTestDrive.java
(archivo de arranque ya creado por Claude, con el esqueleto completo
de las dos clases y la pileta de fragmentos, todo en comentarios)
Corrección de Claude (se llena al revisar):
...

============================================================

EJERCICIO #06 — Code Magnets: "DrumKit" — reordenar imanes para armar un programa que dé la salida pedida (Ubicación pág. 186, Sesión #29) — [ ] pendiente
Tipo: completar/corregir código
Si te trabás: revisá la Sesión #12/#13 (if, boolean) y la Sesión #25
(new, operador punto) de GUIA-JAVA.md.
Enunciado:
Un programa completo (clases `DrumKit` y `DrumKitTestDrive`, una
batería simulada) está desarmado en imanes sueltos — reordenalos (sin
cambiar lo que dice cada uno), agregando las llaves `{ }` que hagan
falta, para que compile y, al correr `java DrumKitTestDrive`, imprima
EXACTO:
```
bang bang ba-bang
ding ding da-ding
```
Entregá en: ejercicios/ej06-drumkit/ (dos archivos de arranque ya
creados por Claude, DrumKit.java y DrumKitTestDrive.java, con los
imanes completos en comentarios)
Corrección de Claude (se llena al revisar):
...

============================================================

EJERCICIO #05 — Robot: tu primer objeto propio con new y el operador punto (Sesión #25) — [x] completado (2026-07-24)
Tipo: programa desde cero
Si te trabás: revisá la Sesión #25 de GUIA-JAVA.md (ejemplo Dog/
DogTestDrive del libro: new, operador punto, clase TestDrive).
Enunciado:
Escribí una clase `Robot` con dos instance variables (`nombre` String,
`bateria` int) y dos methods (`saludar()` y `cargar()`, que imprimen
por consola). Después escribí `RobotTestDrive`, la clase con el main()
que crea un objeto Robot con `new`, le pone nombre y batería con el
operador punto, y llama a sus dos methods. Mismo patrón que
`Dog d = new Dog(); d.size = 40; d.bark();` de la Sesión #25, pero con
tu propia clase, para practicar `new` y el operador punto de cero (sin
copiar Dog).
Entregá en: ejercicios/ej05-robot/ (dos archivos de arranque ya
creados por Claude, Robot.java y RobotTestDrive.java, solo comentarios)
Corrección de Claude (se llena al revisar):

Entrega: ejercicios/ej05-robot/Robot.java + RobotTestDrive.java.
Compiló a la primera. Salida:
```
Hola, soy :Anderson
Cargando, batería: 50%
```
Exacta a lo esperado según su propio código.

Robot.java: `nombre` y `bateria` declaradas `private`, con
`setNombre()`/`setBateria()`. `saludar()` imprime "Hola, soy :" + nombre
(concatenación correcta) y `cargar()` imprime "Cargando, batería: " +
bateria + "%" (correcto). Detalle cosmético, no bloquea: falta un
espacio después de los dos puntos ("soy :Anderson" en vez de "soy:
Anderson"), es solo estética del string.

RobotTestDrive.java: `Robot r = new Robot();` — uso correcto de `new`,
mismo patrón que `Dog d = new Dog();`. `r.setNombre("Anderson");` /
`r.setBateria(50);` / `r.saludar();` / `r.cargar();` — cuatro usos
correctos del operador punto para invocar methods sobre el objeto `r`.

OBSERVACIÓN IMPORTANTE (no es error, es una diferencia de enfoque):
el ejercicio pedía practicar el mismo patrón que `d.size = 40;`
(ESCRIBIR una instance variable directo con el operador punto). Acá,
en cambio, `nombre` y `bateria` son `private`, así que `r.nombre = ...`
directo ni siquiera compilaría — por eso se usó `setNombre()`/
`setBateria()` en su lugar. Es una solución VÁLIDA y más prolija (ya
usa encapsulamiento, el tema que el libro recién formaliza en el
Capítulo 4), pero practica el operador punto solo para LLAMAR methods,
no para leer/escribir una instance variable directo — matiz para tener
en cuenta, no resta puntos. Buena señal: antepuso una buena práctica
sin que se la pidieran.

RESULTADO: EJERCICIO COMPLETADO. Primer repaso agendado para
2026-07-28.

============================================================

LIBRO — Sharpen your pencil: "Television" — completar qué instance variables y qué methods necesitaría una clase Television (Ubicación pág. 162-163, Sesión #24) — [x] completado (2026-07-23)

Enunciado (tal cual lo plantea el libro): se muestra el dibujo de una
tele y una tabla vacía de una clase "Television", dividida en dos
secciones: arriba "instance variables" (lo que el objeto SABE) y abajo
"methods" (lo que el objeto SABE HACER). Completá la tabla pensando
qué necesitaría saber y hacer un objeto Televisión. El libro aclara
"Yours to solve" (es tuyo para resolver): no hay una única respuesta
correcta, es un ejercicio abierto de diseño.

Entregá en: ejercicios/lib03-television.md (archivo de arranque ya
creado por Claude, con el enunciado y una sección "MI RESPUESTA").
Si te trabás: revisá la Sesión #23 y #24 de GUIA-JAVA.md (instance
variables vs. methods, "sabe" vs. "sabe hacer").
Resultado y corrección de Claude (se llena al revisar):

Intento 1 (2026-07-22): instance variables Marca, Dimensiones,
Resolución, Entradas (HDMI, DVI) — CORRECTAS, son datos que describen
el estado de la tele y cada tele real puede tener un valor distinto.
Methods Prenderse, Apagarse, cambiar canal, subir volumen, bajar
volumen — CORRECTOS, son acciones reales que una tele puede hacer.

Falta una pieza (pista, no solución): en el ejemplo de Alarm de la
página 160, la instance variable `alarmTime` tenía DOS métodos que la
leían/escribían (`getAlarmTime()`/`setAlarmTime()`). Mirá tus propios
methods: cambiar canal, subir volumen, bajar volumen, prenderse y
apagarse TODOS cambian algo dentro de la tele. Pregunta para pensar:
¿en qué instance variable queda GUARDADO ese "algo" que cada uno de
esos métodos cambia? (Ej.: si subís el volumen, ¿dónde vive el número
que subió?) Faltan instance variables para el estado que esos métodos
modifican. Pendiente de revisión del usuario.

Intento 2 (2026-07-22): agregó getSubirVolumen(), setBajarVolumen(),
getPrenderse()/setPrenderse(), getApagarse()/setApagarse(),
getCambiarCanal()/setCambiarCanal() — pero como get/set de los MÉTODOS
DE ACCIÓN (verbos), no de una instance variable nueva. Instance
variables sigue sin cambios (Marca, Dimensiones, Resolución,
Entradas). Malentendido a corregir: get/set aplica sobre un DATO
(sustantivo, ej. `alarmTime`), no sobre una ACCIÓN (verbo, ej. "subir
volumen"). "getSubirVolumen()" no tiene sentido porque "subir volumen"
no es un dato que se pueda leer. Pista dada en el chat: pensar qué
SUSTANTIVO (pieza de dato) se esconde detrás de cada acción — ese
sustantivo es la instance variable que falta agregar. También hay una
línea duplicada (getSubirVolumen() aparece dos veces), detalle menor
de tipeo. Pendiente de revisión del usuario.

Intento 3 (2026-07-23), después de retomar la explicación sustantivo
vs. verbo con la analogía del auto (acelerar=verbo/method,
velocidad=sustantivo/instance variable): reemplazó los methods por
getMarca()/setMarca(), getDimensiones()/setDimensiones(),
getResolución()/setResolucion() — CORRECTO, ahora el get/set está bien
aplicado sobre sustantivos (datos), no sobre verbos. El concepto de la
sesión pasada quedó claro.

Lo que falta (pista, no solución): al pasar a este formato,
desaparecieron los methods de ACCIÓN que tenía el intento 1
(prenderse, apagarse, cambiar canal, subir/bajar volumen) — una tele
real no solo describe sus características fijas (marca, dimensiones),
también HACE cosas cuando la usás. Esos methods de acción no
compiten con get/set: son otro tipo de method (verbo puro, sin
get/set) y siguen haciendo falta. Además "Entradas (HDMI, DVI)" quedó
sin su par get/set, a diferencia de las otras tres instance variables.
Y sigue pendiente la pieza de la sesión anterior: si esos methods de
acción vuelven, cada uno modifica ALGO dentro de la tele — ¿qué
instance variable nueva falta para guardar ese "algo" (ej. el volumen
actual, el canal actual, si está prendida)? Pendiente de revisión del
usuario.

Intento 4 (2026-07-23): agregó methods de acción de vuelta —
cambiarVolumen(), cambiarCanal(), encendido() — más getCanal() y
getVolumen(). Buena señal: reconoció que canal y volumen son datos
(sustantivos) que la tele necesita poder leer. Pero la sección
"instance variables" (lo que la tele SABE, arriba) sigue sin cambios —
Marca, Dimensiones, Resolución, Entradas — sin `canal` ni `volumen`
declarados ahí. Pista dada: un method get no tiene de dónde leer un
dato que nunca se declaró como algo que la tele "sabe". Falta también
la contraparte de `encendido()` (¿la tele solo puede prenderse y
después queda prendida para siempre?) y su instance variable de
estado. Sobre Entradas (HDMI, DVI): el usuario preguntó si necesita
get/set, con la duda de que confunde el cable físico con el dato — se
aclaró en el chat que el dato es "qué entradas soporta esta tele"
(mismo tipo de sustantivo que Marca), y se introdujo la noción de que
no todo dato necesita AMBOS get y set (un dato fijo como Entradas
puede llevar solo get). Pendiente de revisión del usuario.

Intento 5 (2026-07-23): sacó setMarca()/setDimensiones()/setResolucion()
y dejó solo los get — internalizó la idea de "dato fijo, solo get".
Agregó apagar() como contraparte de encender() — resuelto. Agregó
getCanal()/setCanal(), getVolumen(), getEntradas() — reconoce canal,
volumen y entradas como datos. Sigue pendiente lo mismo de los
intentos 3 y 4: la sección "instance variables" de arriba (lo que la
tele SABE) sigue sin cambios — Marca, Dimensiones, Resolución,
Entradas — sin declarar `canal`, `volumen` ni un dato de "si está
prendida" ahí arriba, aunque los methods ya los usan. Notas menores
(no bloquean): cambiarCanal() y setCanal() hacen básicamente lo mismo
con nombres distintos (duplicado); volumen tiene get + cambiarVolumen()
pero canal tiene get/set completo — inconsistencia de estilo entre los
dos, no un error. Pendiente de revisión del usuario.

Intento 6 (2026-07-23) — FINAL: agregó Canal, Volumen y Encendido a la
sección de instance variables (ahora 7 en total: Marca, Dimensiones,
Resolución, Entradas, Canal, Volumen, Encendido). Además ordenó los
methods para que queden consistentes: solo get para los datos fijos
(Marca, Dimensiones, Resolución, Entradas) y get/set completo para los
datos que cambian en uso (Canal, Volumen) — resolvió también la
inconsistencia y el duplicado cambiarCanal()/setCanal() señalados en
el intento 5, dejando solo setCanal(). RESULTADO FINAL: instance
variables y methods quedan coherentes entre sí (todo method get/set
tiene su dato declarado arriba). Único detalle opcional (no bloquea,
diseño real futuro): a `Encendido` le faltaría un method para
CONSULTAR el estado (ej. `estaEncendida()`), ya que `encender()`/
`apagar()` solo lo modifican pero nada lo lee — queda como nota, no
como pendiente. EJERCICIO COMPLETADO. Primer repaso agendado para
2026-07-27.

============================================================

REPASOS

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r1) — programado: 2026-07-28 — [ ] pendiente
Entregá en: ejercicios/repasos/lib05-r1.md (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — LIBRO Movie objects (pág. 170-173) (r1) — programado: 2026-07-28 — [ ] pendiente
Entregá en: ejercicios/repasos/lib04-r1.md (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO #05 Robot (Sesión #25) (r1) — programado: 2026-07-28 — [ ] pendiente
Entregá en: ejercicios/repasos/ej05-robot-r1/ (desde cero, sin mirar el original; dos archivos de arranque nuevos, Robot.java y RobotTestDrive.java, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO Sharpen your pencil: Television (pág. 162-163) (r1) — programado: 2026-07-27 — [ ] pendiente
Entregá en: ejercicios/repasos/lib03-television-r1.md (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO BottleSong (pág. 111) (r1) — programado: 2026-07-25 — [ ] pendiente
Entregá en: ejercicios/repasos/ej02-bottlesong-r1/BottleSong.java (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO Sharpen your pencil (pág. 80-81) (r1) — programado: 2026-07-20 — [x] completado (2026-07-21)
Entregá en: ejercicios/repasos/sharpen-your-pencil-r1/sharpen-your-pencil-r1.md (desde cero, sin mirar el original)
Comparación de Claude: salió bien — ver detalle en la sección del
ejercicio original más arriba. Punto pendiente: concatenación de
Strings con `+` (resultado correcto, mecanismo aún no verbalizado).

REPASO — EJERCICIO Sharpen your pencil (pág. 80-81) (r2) — programado: 2026-08-04 — [ ] pendiente
Entregá en: ejercicios/repasos/sharpen-your-pencil-r2.md (desde cero, sin mirar el original ni el r1; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO DooBee (pág. 109) (r1) — programado: 2026-07-20 — [x] completado (2026-07-22)
Entregá en: ejercicios/repasos/ej01-doobee-r1/DooBee.java (desde cero, sin mirar el original)
Comparación de Claude: salió MEJOR que el intento original. La primera
vez costó 3 intentos (mal conteo de vueltas con `x < 2`, después
`if (x == 2)` con el valor viejo). Esta vez llegó DIRECTO a la
solución correcta: `while (x < 3)`, `print`/`print` en los dos
espacios de adentro, `if (x == 3)` — sin repetir ninguno de los dos
errores anteriores. Traza verificada: x=1→(Doo Bee x=2)→(Doo Bee
x=3)→sale del while→if(x==3) true→"Do". Salida "DooBeeDooBeeDo",
exacta, coincide con la pegada por el usuario. COMPLETADO. Se agenda
r2.

REPASO — EJERCICIO DooBee (pág. 109) (r2) — programado: 2026-08-05 — [ ] pendiente
Entregá en: ejercicios/repasos/ej01-doobee-r2/DooBee.java (desde cero, sin mirar el original ni el r1; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO Code Magnets: Shuffle1 (pág. 121-122) (r1) — programado: 2026-07-21 — [x] completado (2026-07-23)
Entregá en: ejercicios/repasos/ej03-shuffle1-r1/Shuffle1.java (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude: compiló a la primera y salida exacta "a-b c-d",
igual que en el intento original — dos de dos aciertos a la primera,
sin errores de compilación ni de lógica en ninguna de las dos rondas.

Traza verificada vuelta por vuelta: x=3→(a, "-", x=2)→(b c, "-", x=1→d,
x=0)→sale del while (x=0, no cumple x>0). Coincide letra por letra con
"a-b c-d".

Detalle interesante: NO repitió el orden exacto del original. La
primera vez había puesto `print("-")` y `x = x - 1` justo después del
`if (x > 2)`, antes de chequear `x == 2`. Esta vez los movió a DESPUÉS
del `if (x == 2)`. Es un orden distinto pero igual de válido — ambos
respetan lo esencial (el guion y la resta ocurren una vez por vuelta,
en un punto donde no rompen ningún `if`). Que haya llegado a una
solución diferente y también correcta, en vez de memorizar el orden
anterior, es buena señal: entendió el MECANISMO (qué tiene que pasar
en cada vuelta), no una secuencia fija de memoria.

RESULTADO: repaso salió BIEN. Se agenda r2.

REPASO — EJERCICIO Code Magnets: Shuffle1 (pág. 121-122) (r2) — programado: 2026-08-06 — [ ] pendiente
Entregá en: ejercicios/repasos/ej03-shuffle1-r2/Shuffle1.java (desde cero, sin mirar el original ni el r1; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO BE the Compiler (pág. 123) (r1) — programado: 2026-07-22 — [x] completado (2026-07-24)
Entregá en: ejercicios/repasos/lib01-r1.md (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude:

A: "No compila porque entra en un bucle infinito" — INCORRECTO, y es un
ERROR NUEVO (en el intento original de 2026-07-19 este archivo lo
había resuelto BIEN a la primera). Confunde runtime con compile-time:
un bucle infinito no es un error de compilación, el compilador no
"corre" el programa para saber si termina o no — solo revisa que la
sintaxis y el anidamiento (clase → main → while → if) estén bien
formados, y acá lo están. A SÍ COMPILA. Lo que tiene de especial es
que, al ejecutarlo, nunca termina (x se queda fijo en 1 para siempre,
nunca supera 3) y por lo tanto tampoco llega a imprimir "big x" — pero
eso es un problema de EJECUCIÓN, no de compilación.

B: "No compila porque falta declarar el nombre de la clase" —
CORRECTO, coincide con el resultado original (le falta el `class { }`
que envuelva al método). Sin repetir errores acá.

C: "no compila porque falta declarar el main" — PARCIALMENTE correcto.
Detectó bien que algo falta entre la clase y el `while`, pero el
`while` no compila por faltarle específicamente un `main` — le falta
CUALQUIER método que lo envuelva (podría llamarse de cualquier forma).
La regla de fondo (Sesión #09/#10): una instrucción ejecutable como
`while` no puede vivir suelta directo dentro de una clase, necesita
estar dentro de algún método. Mismo tipo de imprecisión que en el
intento 2 del original, que sí lo dijo genérico ("le falta el método
que lo envuelva").

RESULTADO: salió MAL — el punto más flojo es A, un error NUEVO
(retrocedió respecto al intento original) por confundir bucle
infinito con error de compilación; la distinción compile-time vs.
runtime (ya vista en Sesión #08 y #11) necesita repaso. Se acorta el
intervalo: repaso r2 agendado para 2026-07-27 (no se marca RE-ESTUDIO
todavía porque es la primera vez que falla, no dos seguidas).

REPASO — EJERCICIO BE the Compiler (pág. 123) (r2) — programado: 2026-07-27 — [ ] pendiente
Entregá en: ejercicios/repasos/lib01-r2.md (desde cero, sin mirar el original ni el r1; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...

REPASO — EJERCICIO Mixed Messages (pág. 127-129) (r1) — programado: 2026-07-23 — [ ] pendiente
Entregá en: ejercicios/repasos/lib02-r1.md (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude (se llena al revisar):
...
