# EJERCICIOS — ARCHIVO HISTÓRICO (Head First Java, 3ra ed.)

ESTE ARCHIVO NO SE LEE AL INICIO DE SESIÓN. Es el historial completo
de ejercicios y repasos con sus correcciones largas, guardado para:
- comparar un repaso nuevo contra el intento original (`/repaso`),
- un RE-ESTUDIO (concepto que falló dos veces seguidas),
- o si el usuario pide releer una corrección vieja.

El estado VIVO (pendientes, en curso, repasos programados, conceptos
dominados) vive en EJERCICIOS.md, que sí se lee entero cada sesión.

Contenido: historia completa hasta el 2026-07-24 (sesiones #01-#30),
tal como estaba antes del corte. Puede repetir entradas que en ese
momento seguían abiertas; el estado real de esas entradas es el de
EJERCICIOS.md, no el de acá.

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

REPASO r2 (2026-08-25) — entrega en
ejercicios/repasos/sharpen-your-pencil-r2.md, resuelto desde cero.
Comparación contra el original (2026-07-16) y contra el r1 (2026-07-21):

MEJORÓ (salto grande, el mayor de los tres intentos):
- Línea `x = size - 5;` — DETECTÓ SOLO que `x` nunca fue declarada con
  un tipo ("OJO la variable x nunca fue declarada en tipo de dato").
  Ni el original ni el r1 lo vieron. Dejó de leer el código con pura
  intuición y empezó a leerlo como lo lee el compilador. Es el mayor
  progreso conceptual del ciclo.
- Vocabulario consolidado en la línea 3: "instancia", "clase",
  "parámetros" (el original no reconocía `bark()` como método; el r1
  ya lo hacía, el r2 lo sostiene sin dudar).
- `while`: el r1 lo llamaba "condicional while" (un while es un BUCLE,
  no un condicional). El r2 ya no usa la palabra equivocada.
- `Integer.parseInt(num)`: explica el mecanismo completo (el String
  "8" pasa a ser el int 8), sostenido desde el r1.
- `int[] numList`: el r1 solo observaba que eran pares (irrelevante);
  el r2 nombra la variable y dice que se inicializa con esos valores.

ERROR QUE SE REPITIÓ (tercera vez consecutiva):
- Línea `System.out.print("Dog: " + name);` — el original dijo "no
  recuerdo cómo se llama ese concepto"; el r1 dio el resultado
  correcto sin nombrar el mecanismo; el r2 avanza un paso más
  ("Se imprime Dog: Fido debido a que name es equivalente a Fido" —
  ahora explica de dónde sale el valor) pero SIGUE sin decir la
  palabra CONCATENACIÓN ni explicar que el `+` entre Strings PEGA
  texto en vez de sumar. Diagnóstico: no es que no lo entienda —
  lo opera bien — es que el término nunca se fijó. Causa detectada:
  ANKI.txt tenía dos tarjetas de casos AVANZADOS de concatenación
  (1 + 2 + "3", y null concatenado) pero NINGUNA de la definición
  base. Remedio aplicado: tarjeta base agregada a ANKI.txt.

PRECISIONES MENORES (dichas en el chat, no son errores de fondo):
- Invirtió parámetro y argumento ("se pasa por parámetros los valores
  ... para iniciar sus argumentos"). Es al revés: los PARÁMETROS son
  las variables declaradas en el constructor; los ARGUMENTOS son los
  valores concretos que se pasan al llamarlo.
- "variable de tipo array" → el tipo es `int[]`: un arreglo DE enteros.
- En tres intentos nunca distinguió `print` de `println` (print no
  salta de línea): por eso "Hello" y "Dog: Fido" salen pegados.

RESULTADO: repaso r2 salió BIEN (12/12 líneas correctas en su
intención, con una observación que supera al enunciado del propio
libro). El punto de concatenación queda como ÚNICO pendiente del
ciclo, atacado por tarjeta de Anki en vez de re-estudio formal: el
concepto se opera bien, lo que falta es el nombre. Se agenda r3
(~1 mes después del r2) — es el último del ciclo: si sale bien, el
ejercicio se GRADÚA.

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

VALIDADO POR EL LIBRO (Sesión #30, pág. 193-195): solución oficial de
A = agregar `StreamingSong song = new StreamingSong();` (idéntico al
arreglo del usuario). Solución oficial de B = agregar un method
`play()` a la clase Episode (el del libro imprime "Playing episode " +
episodeNumber; el del usuario imprimía un texto fijo — ambos válidos,
lo esencial era que el method exista para que `episode.play()`
compile).

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

LIBRO — Who Am I? ("¿Quién soy?") — identificar si cada frase la dice una clase, un objeto, un method o una instance variable (Ubicación pág. 191, Sesión #30) — [~] en curso
Entregá en: ejercicios/lib06-who-am-i.md (archivo de arranque ya
creado por Claude, con las 13 frases traducidas y la sección
"MI RESPUESTA").
Si te trabás: revisá la Sesión #23/#24, #25 y #27 (en GUIA-ARCHIVO.md).
Resultado y corrección de Claude (se llena al revisar):

Intento 1 (2026-07-24):

Correctas (3/13): #2 objeto, #3 clase, #5 clase.

Cerca pero imprecisa (1/13): #13 respondió "variable" — el enunciado
pide una de 4 categorías puntuales y hay una más específica que
"variable" a secas (la misma idea del #2, pero aplicada al dato en
vez de al objeto que lo contiene).

Error sistemático (8/13): #4, #6, #7, #8, #9, #10, #11, #12 — en vez
de elegir una de las 4 categorías del enunciado (clase, objeto,
method, instance variable), respondió con palabras clave o sintaxis
de Java relacionadas de refilón con cada frase (`main`, `punto y
coma`, `metodos`, `instancias`, `new`, `condicion`, `void`). Se le
explicó en el chat que el ejercicio pide identificar CUÁL DE LOS 4
PERSONAJES habla en cada frase, no qué palabra de Java se asocia a
la idea. Pistas dadas sin solución: #4 (la acción en general = el
"sabe hacer" de la Sesión #23/24), #9 (ya tiene anotado en su
vocabulario que "instance" = sinónimo de "object" — aplicarlo acá).
Pendiente de revisión del usuario: reintentar #4, #6, #7, #8, #10,
#11, #12 con esa aclaración.

Intento 2 (2026-07-24): mejoró de 3 a 6 correctas claras: #2 objeto,
#3 clase, #5 clase+objeto (completó la doble respuesta), #6 instance
variable (corrigió desde "punto y coma"), #9 objeto (corrigió desde
"instancias", aplicando la equivalencia instance=object), #12 clase
(corrigió desde "void").

Parcial, falta ajuste (2): #8 "instance variables" (correcto pero
incompleto, falta la otra categoría que también vive dentro de un
objeto); #10 "clase, instance variable" (clase correcta por `new`,
pero "instance variable" sobra, no tiene sentido para crear objetos).

Todavía no llegan (4): #4 "objeto" (sigue sin ver que "hacer cosas" es
la acción/verbo = method, no quién la ejecuta); #7 "metodos" (mismo
error que el #4 pero invertido: un method no "tiene" comportamiento,
ES el comportamiento — falta identificar quién lo posee); #11 "clase"
(una clase es un plano fijo que no cambia en runtime, no aplica);
#13 "objeto" (RETROCESO respecto al intento 1, que tenía "variable" —
más cerca de la respuesta que "objeto"). Pistas dadas en el chat sin
solución completa. Pendiente de revisión del usuario: intento 3.

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

EJERCICIO #06 — Code Magnets: "DrumKit" — reordenar imanes para armar un programa que dé la salida pedida (Ubicación pág. 186, Sesión #29) — [x] completado (2026-07-24)
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
Corrección de Claude:

Compiló y la salida fue EXACTA a la primera ("bang bang ba-bang" /
"ding ding da-ding"). DrumKit.java perfecto: instance variables
topHat/snare en true, methods playSnare()/playTopHat() bien armados.
Usó todos los imanes.

OBSERVACIÓN CONCEPTUAL: su `if (d.snare == true)` quedó como CÓDIGO
MUERTO (puso `d.snare = false;` antes, así que nunca dispara) y el
primer "bang" sale del `d.playSnare();` suelto. CORRECCIÓN DEL PROFE
SOBRE SU PROPIA CORRECCIÓN: en el primer análisis Claude dijo que la
solución del libro "usa el if de verdad" — FALSO. Prueba: si el if
disparara (snare true al chequear) imprimiría un "bang", y el imán
suelto `d.playSnare();` (que también hay que ubicar, es incondicional)
imprimiría OTRO — dos "bang" rompen la salida. Con todos los imanes en
juego, el if no puede dispararse: el código muerto es forzado por el
acertijo, no un defecto de la solución del usuario. El usuario defendió
su decisión con este mismo argumento (usar todos los imanes y respetar
la salida) ANTES de que Claude lo verificara — criterio correcto.

Trazado bonus verificado en el chat: el usuario respondió bien que
mover `d.snare = false;` después del if imprimiría "bang" DOS veces.

RESULTADO: EJERCICIO COMPLETADO a la primera, solución equivalente a
la oficial. Primer repaso agendado para 2026-07-29.

VALIDADO POR EL LIBRO (Sesión #30, pág. 191-193): la solución oficial
es new → d.playSnare() → d.snare=false → d.playTopHat() → if al FINAL
(muerto, no dispara). Confirma el análisis: con todos los imanes, el
if no puede dispararse. La solución del usuario (mismo conjunto,
distinto orden, misma salida) es 100% equivalente a la oficial.

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

REPASO — EJERCICIO #06 DrumKit (pág. 186) (r1) — programado: 2026-07-29 — [ ] pendiente
Entregá en: ejercicios/repasos/ej06-r1/ (desde cero, sin mirar el original; archivos de arranque nuevos con los imanes, solo comentarios)
Comparación de Claude (se llena al revisar):
...

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

REPASO — EJERCICIO BottleSong (pág. 111) (r1) — programado: 2026-07-25 — [x] completado (2026-07-26)
Entregá en: ejercicios/repasos/ej02-bottlesong-r1/BottleSong.java (desde cero, sin mirar el original; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude: SALIÓ BIEN, y con una mejora grande de proceso.
El original (2026-07-21) le llevó 5 intentos: 4 caminos equivocados
(cambiar `> 0` por `> 1`, cambiar `== 1` por `== 2`, mover el bloque
`Quedarán`/`No quedará` arriba de la resta) antes de dar con el fix.
En el r1 dio con el MISMO fix a la PRIMERA: mover las 3 líneas de los
dos `println(bottlesNum + " " + word)` + `println("Y si...")` para que
queden ANTES de `bottlesNum = bottlesNum - 1`, dejando el decremento,
el chequeo del singular y el `Quedarán`/`No quedará` en su orden.
Salida verificada línea por línea contra la letra: 100% correcta, de
"10 botellas..." hasta "No quedará ninguna botella verde, colgada de
la pared". Ningún error del original se repitió.
Nota (no es error de lógica, sí de convención): resolvió en un archivo
nuevo `BottleSongTestDrive.java` en vez de en `BottleSong.java` como
pedía el enunciado. Compila igual (nombre de clase = nombre de
archivo), pero el sufijo TestDrive en este libro significa "clase con
main que INSTANCIA y prueba a OTRA clase" (Robot/RobotTestDrive,
DrumKit/DrumKitTestDrive). Acá no hay otra clase que probar: es un
programa de una sola clase, así que el nombre correcto es BottleSong.
Se agendó r2 para 2026-08-09.

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

REPASO — EJERCICIO BE the Compiler (pág. 123) (r2) — programado: 2026-07-27 — [x] completado (2026-08-12, con atraso)
Entregá en: ejercicios/repasos/lib01-r2.md (desde cero, sin mirar el original ni el r1; archivo de arranque nuevo, solo comentarios, sin código)
Comparación de Claude:

A: "Sí compila y ejecuta, no tiene errores de sintaxis; el error que
tiene es lógico, entra en un bucle infinito" — CORRECTO, y es la
MEJORA GRANDE de este repaso. En el r1 había dicho "no compila porque
entra en un bucle infinito", confundiendo runtime con compile-time.
Acá separó los dos planos explícitamente y con vocabulario propio
("no los tiene en sintaxis... el error es lógico"). El concepto
compile-time vs. runtime, que era el punto marcado a vigilar, quedó
RECUPERADO. Único matiz menor, no pedido por el enunciado: además de
no terminar nunca, el programa jamás llega a imprimir "big x" (x se
queda fijo en 1 y nunca supera 3).

B: "Da error de compilación ya que no se tiene el nombre de la clase" —
CORRECTO. Tercera vez consecutiva que lo resuelve bien (original, r1 y
r2). Es el archivo más sólido de los tres.

C: "Da error de compilación ya que no tiene una clase main y Java no la
va encontrar ya que todos los programas necesitan un main" —
INCORRECTO en la causa, y es el ERROR REPETIDO por segunda vez
seguida. En el r1 había dicho "no compila porque falta declarar el
main"; acá repite la misma idea y además la justifica con una regla
que es FALSA: "todos los programas necesitan un main". Dos problemas
distintos apilados:
  (1) Vocabulario: `main` es un MÉTODO, no una clase. "Una clase main"
      no existe.
  (2) Concepto de fondo: una clase sin `main` COMPILA perfectamente
      (la mayoría de las clases de cualquier programa real no tienen
      main — Startup, GameHelper y Dog no lo tienen). `main` solo hace
      falta para ARRANCAR un programa, y eso es ejecución, no
      compilación. Lo que rompe a Exercise1c es otra cosa: el `while`
      está suelto directamente dentro de la clase, y una instrucción
      ejecutable necesita vivir dentro de ALGÚN método — con cualquier
      nombre, no necesariamente main.
Ojo con la ironía: en A separó bien compilación de ejecución, y en C
volvió a mezclarlas (usó una razón de ejecución, "Java no lo va a
encontrar para arrancarlo", para explicar un error de compilación).

RESULTADO: MEJORÓ mucho (A recuperado, B firme), pero C falló por
SEGUNDA VEZ SEGUIDA (r1 y r2) con la misma imprecisión, agravada por
la regla falsa del main obligatorio. Se aplica la regla de RE-ESTUDIO:
releer Sesión #09 y #10 de GUIA-ARCHIVO.md (jerarquía archivo fuente →
clase → método → instrucción) + ejercicio nuevo del profe
(EJERCICIO #14, Termometro/TermometroTestDrive) que ataca directo el
malentendido "todo programa necesita un main". Intervalo acortado:
r3 agendado para 2026-08-16.

REPASO — LIBRO Mixed Messages (pág. 127-129) (r1) — programado: 2026-07-23 — [x] completado (2026-07-25)
Entregado en: ejercicios/repasos/lib02-r1.md (desde cero, sin mirar el original)

Comparación de Claude: 5 de 5 candidatos correctos, igual que el intento
original (2026-07-19, también 5/5). Candidato 1→E, 2→G, 3→H, 4→B, 5→D,
verificado con traza propia vuelta por vuelta. Sin errores nuevos ni
repetidos: repaso limpio. Se agenda r2 para 2026-08-08.

REPASO r2 (2026-08-25) — entregado en ejercicios/repasos/lib02-r2.md
(desde cero). Comparación de Claude: 5 de 5 candidatos correctos por
TERCERA vez consecutiva (original 2026-07-19: 5/5; r1 2026-07-25: 5/5).
Candidato 1→E, 2→G, 3→H, 4→B, 5→D, verificado otra vez con traza propia
vuelta por vuelta, sin dar por buena la respuesta anterior.

Las dos trampas del ejercicio siguen resueltas un mes y medio después:
- Candidato 2 → G: `y` llega a 10 en la última vuelta y la salida pasa
  a 3 dígitos (410). Descarta F y E, que se quedan en 2 dígitos.
- Candidato 4 → B: `x` se incrementa DOS veces por vuelta (una en el
  bloque candidato, otra en la línea fija del while), así que el bucle
  corre 3 vueltas y no 5. Es el único candidato con salida de 3 grupos.

Sin errores nuevos ni repetidos. Se agenda r3 para 2026-09-26 (el
2026-09-25 ya estaba ocupado por el r3 de Sharpen your pencil pág.
80-81 — regla de máximo 1 repaso por día).

OBSERVACIÓN DE MÉTODO: tres entregas perfectas seguidas, sin una sola
pista, con un mes de separación entre cada una. El repaso ya no está
enseñando nada: está confirmando. Candidato claro a graduarse en el r3
y a que sus conceptos (trazar un while vuelta por vuelta, incremento
doble de la variable de control, concatenación que cambia el ancho de
la salida) pasen a CONCEPTOS DOMINADOS.

EJERCICIO #08 — BE the Compiler: dos programas con arreglos (A: Books/BooksTestDrive, B: Hobbits) — decir si compilan, si se ejecutan sin excepción, y escribir la versión corregida (Ubicación pág. 245-246, Sesión #42) — [x] completado (2026-07-27)
Entregado en: ejercicios/ej08-be-the-compiler-arrays/ (BooksTestDrive.java y Hobbits.java)

Corrección de Claude: los DOS programas quedaron correctos y la salida
coincide exacto con la del libro. A: agregó los tres `new Books()` que
faltaban, y por primera vez contó bien los objetos (4 en total: el
arreglo + los 3 Books) — la confusión reincidente de las Sesiones #39
y #40 quedó saldada. B: movió el `z = z + 1` al FINAL del while y bajó
la condición a `z < 3`; diagnosticó bien las dos fallas (se salteaba
h[0] y se pasaba de índice).

Lo que falta afinar (no invalida el ejercicio, salió bien):
1. "Compila pero no se ejecuta" es impreciso. Los dos programas SÍ
   arrancan; revientan a mitad de camino. En A la excepción salta en la
   primerísima instrucción y no se imprime nada; en B se imprimen
   "frodo" y "sam" y RECIÉN AHÍ revienta. Salida parcial + excepción es
   la firma de un error de runtime.
2. Nombres de las excepciones (los va a ver escritos en la terminal):
   A → NullPointerException; B → ArrayIndexOutOfBoundsException.
   Dijo "error de desbordamiento": la idea es correcta, le falta el
   nombre.
3. En B contó "3 objetos que debemos crear": son 4 con el arreglo,
   igual que en A. La regla la aplicó bien en un programa y no en el
   otro.
4. NOTA DEL PROFE: en los dos `while` hardcodeó el 3 (`x < 3`,
   `z < 3`). Con `x < myBooks.length` y `z < h.length` el bucle se
   adapta solo si mañana el arreglo cambia de tamaño. Es lo que se usa
   en código real.

RESULTADO: salió BIEN. Repaso r1 agendado para 2026-07-31.

============================================================

REPASO — LIBRO Sharpen your pencil: Television (pág. 162-163) (r1) — programado: 2026-07-27 — [x] cumplido (2026-07-28)
Entregado en: ejercicios/repasos/lib03-television-r1.md
Respuesta del r1 — instance variables: marca, tamaño, resolucion,
peso, color. Methods: cambiarCanal(), encender(), apagar().

Comparación de Claude: RESULTADO — salió MAL (se repitió el error de
fondo del original). Nuevo repaso agendado a ~3 días (2026-07-31).

MEJORÓ (real, y vale):
1. Notación Java desde el arranque: escribió los methods como
   `cambiarCanal()`, `encender()`, `apagar()` (camelCase + paréntesis).
   En el original arrancó con prosa en español ("Prenderse", "cambiar
   canal") y tardó varios intentos en llegar a esa forma.
2. NO repitió el error del intento 2 (get/set sobre verbos:
   `getSubirVolumen()`, `setPrenderse()`). Ese concepto —get/set van
   sobre sustantivos/datos, no sobre acciones— quedó internalizado.
3. `encender()` y `apagar()` aparecieron juntos de entrada; en el
   original la contraparte de encender() llegó recién en el intento 5.
4. Sumó instance variables nuevas y válidas (peso, color): son datos
   que describen el estado de la tele, cada tele real tiene el suyo.

ERROR QUE SE REPITIÓ (el mismo de los intentos 3, 4 y 5 del original):
la sección "instance variables" no declara el estado que sus propios
methods modifican. Tiene `cambiarCanal()`, `encender()` y `apagar()`,
pero arriba no hay `canal` ni un dato de "si está prendida". Un method
de acción siempre cambia ALGO que vive dentro del objeto; si ese algo
no está declarado como instance variable, el method no tiene dónde
escribir. Marca, tamaño, resolución, peso y color son todos datos
FIJOS (la tele nace con ellos y no cambian): falta el estado VARIABLE.
Nota menor: desapareció el volumen por completo (ni method ni variable),
que en el original sí había aparecido.

PARA EL PRÓXIMO REPASO — punto a mirar: que por cada method de acción
que escriba, exista arriba la instance variable que ese method
modifica. Es exactamente la pieza que costó 6 intentos en el original.

============================================================

EJERCICIO #09 — Code Magnets: TestArrays — reconstruir un programa desordenado que recorre un arreglo de islas (islands[]) en un orden salteado usando un segundo arreglo (index[]) como mapa de posiciones (Ubicación pág. 247-249, Sesión #43) — [x] completado (2026-07-28)
Resuelto en: ejercicios/ej09-code-magnets-testarrays/TestArrays.java
Compiló a la primera. Salida verificada contra la esperada del libro:
"island = Fiji / island = Cozumel / island = Bermuda / island = Azores"
— exacta, las 4 líneas en orden.

Corrección de Claude: RESULTADO — salió BIEN (salida exacta, un solo
punto a mejorar, de diseño y no de resultado).

BIEN:
1. Las dos declaraciones (`new int[4]`, `new String[4]`) y el uso de
   dos arreglos de tipos distintos conviviendo.
2. `int ref;` declarado sin valor y asignado antes de leerse —
   correcto por la regla de definite assignment de las variables
   locales. Se explicó en el chat el contraste con las instance
   variables (esas sí arrancan con valor por defecto).
3. Bucle sin off-by-one: `y = 0`, `y < 4`, `y = y + 1` al final del
   cuerpo. Cuatro vueltas exactas.
4. Entendió el concepto central del ejercicio: `index[]` usado como
   MAPA de posiciones para recorrer `islands[]` salteado
   (index = {1,3,0,2} → Fiji, Cozumel, Bermuda, Azores).
5. `print` vs `println` bien usados para armar la línea completa.

A MEJORAR (único punto):
Las cuatro asignaciones de `index[0..3]` quedaron DENTRO del `while`,
así que se ejecutan en cada vuelta: 16 asignaciones para llenar un
arreglo de 4. La salida sale igual porque los valores son constantes —
error tramposo: el programa anda y aun así está mal. Es código de
PREPARACIÓN y va antes del bucle, como sí hizo (bien) con
`islands[0..3]`. Aplicó la regla en un arreglo y no en el otro.
Regla dada en el chat: adentro del bucle va solo lo que tiene que
pasar en cada vuelta.

NOTA DEL PROFE: escribió `String[] islands` (corchetes pegados al
tipo) donde el libro pone `String [] islands`. Las dos compilan; la
suya es la convención actual (los corchetes son parte del TIPO).

RESULTADO: salió BIEN. Repaso r1 agendado para 2026-08-01.

============================================================

LIBRO — Five-Minute Mystery: "The case of the pilfered references" ("El caso de las referencias robadas") — explicar por qué Tawny elige la versión de Bob (arreglo de 10 referencias) sobre la de Kate (una sola referencia reasignada), aunque la de Kate use menos memoria (Ubicación pág. 253-255, Sesión #45) — [x] completado (2026-07-28)
Resuelto en: ejercicios/lib09-five-minute-mystery.md

Corrección de Claude: RESULTADO — salió BIEN, a la primera y con el
mecanismo correcto, no con una intuición vaga.

BIEN (el núcleo del misterio):
1. Identificó que Kate SÍ crea los 10 objetos: el problema no es la
   creación, es el acceso posterior.
2. Explicó el mecanismo completo con sus palabras: "un solo control
   remoto que va a estar apuntando a un objeto diferente en cada
   vuelta, esto hace que pierdan la referencia y queden [candidatos]
   para el garbage collector". Es exactamente la respuesta del libro.
3. Reusó por su cuenta la analogía del control remoto (Sesión #27/#31)
   y el concepto de garbage collection (Sesión #37) sin que se los
   nombraran en la corrección.
4. Ató el veredicto a la especificación de Tawny (poder acceder a la
   información de cada uno de los diez contactos).

A AFINAR (no invalidan la respuesta):
1. No cerró el remate explícito: al terminar el bucle de Kate queda
   accesible UN solo Contact (el de la última vuelta), así que la
   línea "do complicated Contact list updating with contactRef" no
   tiene sobre qué trabajar. El razonamiento estaba, faltó la
   conclusión escrita.
2. Vocabulario: se dice "elegible/candidato" para el garbage
   collector, no "seleccionable".
3. La ironía del cuento, que conviene tener a mano: una variable de
   referencia ocupa muchísimo menos que un objeto. Kate se ahorró 9
   referencias (poquísimo) y perdió el acceso a 9 objetos (todo). Por
   eso Tawny dice "you've saved a LITTLE memory".

CONTEO DE REFERENCIAS (pregunta de verificación de la tanda): dijo que
después del bucle de Bob hay 11 referencias vivas apuntando a objetos
Contact. Son 10 (contacts[0..9]). La 11ª referencia, `contacts`,
apunta al ARREGLO, no a un Contact. Sí hay 11 OBJETOS en juego (10
Contact + el objeto arreglo) — el error es cruzar el conteo de objetos
con el de referencias a Contact. Es el mismo matiz del EJ #08 (el
arreglo cuenta como objeto), aplicado ahora del otro lado.

RESULTADO: salió BIEN. Repaso r1 agendado para 2026-08-02.

LIBRO — Sharpen your pencil: "What's legal?" — marcar qué llamados a un método con dos parámetros int son legales, con ensanchamiento implícito de byte/short/long (Ubicación pág. 305-306, Sesión #56) — [x] completado (2026-07-30)
Arranque: ejercicios/lib10-legal-argumentos.md

CORRECCIÓN: 9 de 9 líneas correctas, incluida la trampa fina del
ejercicio (byte h = calcArea(4, 20): la LLAMADA es legal, lo ilegal
es el int de retorno entrando sin cast en un byte). Las dos únicas
sin razón escrita (short→int y descartar el retorno) las explicó bien
al preguntarle.

RESULTADO: salió BIEN, 9/9. Repaso r1 agendado para 2026-08-03.

EJERCICIO #11 — BE the Compiler: XCopy (pass-by-value) y Clock/ClockTestDrive (return sin tipo) — decir si compilan, y si compilan, qué imprimen (Ubicación pág. 307, Sesión #56) — [x] completado (2026-07-30)
Arranque: ejercicios/ej11-be-compiler-xcopy-clock/XCopy.java y ClockTestDrive.java

CORRECCIÓN: Parte A perfecta (compila, output "42 84", explicó bien
el pass-by-value). Parte B diagnóstico y arreglo correctos (void con
return valor no compila, se arregla a String); primer output anotado
tenía un error de dígitos (1234 en vez de 1245), corregido al toque.

RESULTADO: salió BIEN. Repaso r1 agendado para 2026-08-03.

LIBRO — "Mixed Messages" — unir cada par de condiciones candidatas (while/if) de la clase Mix4 con la salida que produce (Ubicación pág. 309-312, Sesión #57) — [x] completado (2026-07-30) — OPCIONAL (ícono Puzzle)
Arranque: ejercicios/lib11-mixed-messages.md

CORRECCIÓN: 4/4 correctos (14 1, 25 1, 14 1, 20 1 — dos candidatos
comparten salida, el enunciado lo permitía). El razonamiento del
candidato 1 tuvo un desliz de conteo (dijo "8 objetos" con `i < 9`,
son 9: índices 0 a 8) que no afectó el resultado final.

RESULTADO: salió BIEN, 4/4. Repaso r1 agendado para 2026-08-02.

============================================================

LIBRO — Sharpen your pencil: prep code para SimpleStartupGame — escribir el pseudocódigo (GET/DECLARE/COMPUTE/WHILE) de la clase del juego real, antes de ver la solución del libro (Ubicación pág. 353-354, Sesión #64) — [x] completado (2026-07-31)
Arranque: ejercicios/lib14-prep-code-simplestartupgame.md

Corrección de Claude: RESULTADO — NO llegó a pasar solo; se dio la
solución completa a pedido explícito del usuario después del intento 3
("se me fue de las manos").

BIEN (lo que sí resolvió sin ayuda extra):
1. Creación del objeto SimpleStartup (faltaba en el intento 1).
2. setLocationCells sacado de adentro del while — se ejecuta una sola
   vez antes de arrancar la partida (mal ubicado en el intento 1).
3. Sacó el array "respuestas" innecesario y la variable respuestaResult
   ("failed"/"passed"), que era el patrón de SimpleStartupTestDrive
   (clase de TEST que compara contra un resultado esperado) mal
   aplicado acá, donde un humano juega en vivo por consola.
4. Buena intuición de construir el array de 3 celdas a partir del
   número al azar (nadie se lo pidió explícitamente, lo dedujo del
   enunciado).

A CORREGIR (no llegó a resolverlos en 3 intentos):
1. El SI de corte del bucle terminó rompiendo en AMBOS casos (hit Y
   "si no"), en vez de cortar solo cuando result es "kill". El error
   de fondo se repitió en 3 formas distintas: primero anidado de forma
   contradictoria (chequeaba "kill" adentro de una rama que ya exigía
   "diferente de kill"), después el mismo anidado sin la exclusión
   explícita (seguía siendo código muerto), y por último un SI/SI NO
   que corta en cualquier resultado.
2. El array de 3 celdas quedó con nombre pisado (declaró `locs` pero
   usó `dot`, el nombre del objeto SimpleStartup, como si fuera el
   array) y el bucle interno no usaba `i` para separar las celdas
   (`numero al azar + 1` siempre, en vez de `numero al azar + i`), así
   que las 3 celdas no quedaban consecutivas y distintas.
3. La condición del mini-bucle ("MIENTRAS i sea = 3") no funciona como
   condición de "seguir repitiendo": con i arrancando en 1, un bucle
   que exige i==3 para seguir no arranca nunca. Necesitaba "i < 3" (o
   equivalente), como el for clásico ya visto.

SOLUCIÓN DADA (prep code):
```
MÉTODO public static void main(String[] args)
DECLARAR SimpleStartup dot, y CREAR el objeto ahí
DECLARAR int numOfGuesses, inicializado en 0
DECLARAR un array de 3 posiciones, locs
DECLARAR String result

CALCULAR un número al azar entre 0 y 4 → startPos
GUARDAR en locs[0] el valor startPos
PARA i desde 1 hasta 2:
  GUARDAR en locs[i] el valor startPos + i
LLAMAR dot.setLocationCells(locs)

MIENTRAS el Startup siga vivo:
  PEDIR un número al usuario por línea de comandos → guardarlo en guess
  result = LLAMAR dot.checkYourself(guess)
  INCREMENTAR numOfGuesses en 1
  SI result es igual a "kill":
    PARAR el bucle con break

ESCRIBIR "You took " + numOfGuesses + " guesses"
```

RESULTADO: NO PASÓ solo, se le dio la solución completa. Repaso r1
agendado para 2026-08-04.

============================================================

LIBRO — "Yours to solve": el bug de SimpleStartupGame — entrar 1,1,1 daba hit-hit-kill en vez de sostenerse en miss (Ubicación pág. 365-367, Sesión #67) — [x] completado (2026-08-07)
Arranque: ejercicios/lib15-bug-simplestartupgame.md

Corrección de Claude: el usuario resolvió el bug directo en código
(pruebas/simplestartupgame/) en vez de escribir la hipótesis en prosa
en el archivo de arranque — la solución funcionando demuestra el
diagnóstico igual.

DIAGNÓSTICO CORRECTO: checkYourself() sumaba a numOfHits cada vez que
guess coincidía con locationCells[i], SIN registrar si esa celda YA
había sido contada antes. Por eso repetir el mismo número 3 veces
seguidas se contaba como 3 hits distintos y mataba el Startup con una
sola celda real acertada.

SOLUCIÓN: arreglo paralelo `boolean[] posiciones` que marca cada celda
ya contabilizada, chequeado ANTES de sumar a numOfHits (si ya estaba
marcada, no vuelve a sumar). Es el mismo enfoque que usa la solución
oficial del libro (el usuario llegó solo, sin haberla leído todavía).
Los 3 bugs de intentos anteriores (NPE por no inicializar el arreglo,
comparar guess==i en vez de guess==locationCells[i], sumar sin chequear
el arreglo) quedaron los tres resueltos en esta versión.

Detalles menores señalados (no bloquean, quedan a criterio del
usuario): el print "Numero repetido" duplica la salida del turno
(imprime esa línea Y "miss" en la misma jugada, cuando el libro
espera una sola palabra por turno) y la instance variable `int
posicion;` quedó sin usar (código muerto).

RESULTADO: PASÓ — diagnóstico y arreglo correctos, sin ayuda de
Claude. Repaso r1 agendado para 2026-08-11.

============================================================

LIBRO — BE the JVM: elegir cuál de 3 salidas imprime realmente la clase Output, con un for que mezcla pre y post-incremento (Ubicación pág. 378-380, Sesión #70) — [x] completado (2026-08-07)

Enunciado (tal cual lo plantea el libro): se da una clase Java completa
(Output) y 3 ventanas de terminal con posibles salidas ("12 14" / "12
14 x = 6" / "13 15 x = 6"), separadas por "-or-". Hay que jugar a ser
la JVM y determinar cuál de las 3 es la salida real.

Entregá en: ejercicios/lib16-be-the-jvm.md (archivo de arranque ya
creado por Claude, con el código completo y las 3 opciones).
Si te trabás: revisá la Sesión #69 de GUIA-JAVA.md (trampa `++x` vs.
`x++` dentro de una expresión mayor).
Resultado y corrección de Claude:

Intento 1: "13 14 15" — no coincidía con ninguna de las 3 opciones del
libro (buen instinto al no forzar un match), pero tampoco era correcto.
No estaba contando que `++value` (pre-incremento dentro del `print`)
MUTA la variable de verdad, aparte de la `value++;` de arriba: en las
vueltas donde `i > 4` hay DOS incrementos separados, no uno. Pista
dada: contar las dos mutaciones por vuelta.

Duda genuina intermedia (buena pregunta, no error): si `++value` dentro
de una expresión como un `print` solo calculaba un valor "para
imprimir" o si también modificaba la variable real. Se aclaró con
ejemplo comparando `x = value + 1` (cálculo, no muta `value`) contra
`x = ++value` (muta `value` de verdad Y usa ese valor ya actualizado).

Intento 2: "13 15 i = 6" — CORRECTO. Confirmado además corriendo el
código él mismo (la traza a mano coincide con la ejecución real).

NOTA: ninguna de las 3 opciones que da el libro coincide EXACTAMENTE
con este resultado — la más cercana en números ("13 15 x = 6") tiene
los dos números bien pero el texto final dice "x = 6" en vez de "i =
6" (el código imprime `"i = " + i`, no una variable `x`). No se pudo
confirmar si es una particularidad de la transcripción del pantallazo
o una trampa a propósito del libro; el resultado del usuario queda
validado porque coincide con la ejecución real del programa, que es la
fuente de verdad más confiable disponible acá.

RESULTADO: PASÓ, con 2 pistas (contar las dos mutaciones por vuelta;
diferencia entre `++value` como mutación real vs. un cálculo tipo
`value + 1`). EJERCICIO COMPLETADO. Repaso r1 agendado para 2026-08-10.

============================================================

LIBRO — Sharpen your pencil: "ArrayList vs. arreglo común" — traducir 6 líneas de código con ArrayList a su equivalente con un arreglo común (Ubicación pág. 407, Sesión #75) — [x] completado (2026-08-07)

Enunciado: la tabla de la pág. 407 con dos columnas. A la izquierda, 9
líneas de código usando `ArrayList<String>`; a la derecha, el
equivalente con un arreglo común `String[]`. El libro regala 3 celdas
(filas 1, 2 y 4) y pide completar las filas 3, 5, 6, 7, 8 y 9. Aclara:
"We don't expect you to get all of them exactly right, so just make
your best guess." (No esperamos que las aciertes todas exactamente,
así que hacé tu mejor intento.)
Arranque: ejercicios/lib19-arraylist-vs-array.md
Si te trabás: Sesión #37, #38 y #75 de la guía.
Resultado y corrección de Claude:

Intento 1 — 4 de 6 filas bien:
- Fila 3 `myList[0] = a;` BIEN.
- Fila 5 `myList[1] = b;` BIEN.
- Fila 7 `String str = myList[1];` BIEN.
- Fila 8 `myList[1] = null;` BIEN, y fue la mejor de todas: es la
  respuesta exacta del libro para `myList.remove(1)`. Entendió el
  concepto de fondo — un arreglo no se puede achicar, así que "quitar"
  no es quitar: es dejar el cajón vacío, y el cajón sigue existiendo.
- Fila 6 `int theSize = myList.size();` MAL por SOBREPENSAR: escribió
  un bucle que cuenta posiciones no-null. El razonamiento venía de la
  Sesión #75 (`length` = capacidad, `size()` = ocupados), que había
  respondido perfecto — pero el libro pedía la traducción directa de
  una línea a una línea.
- Fila 9 `contains` — concepto correcto (recorrer y comparar con
  `.equals()`), sintaxis rota.

Errores de sintaxis del intento 1 (pistas dadas, sin solución):
1. Llaves y paréntesis INVERTIDOS, dos veces: `if{size != null}` y
   `for{(contain : myList)...}`. Regla: la condición va entre `()`, el
   bloque entre `{}`.
2. Enhanced for sin el TIPO de la variable: `for(size : myList)`.
3. `== true` redundante sobre algo que ya devuelve boolean.
4. Comparó contra el literal `"Frog"` en vez de contra la variable `b`.
5. Imprimió el resultado en vez de asignarlo a `boolean isIn`.

El usuario entregó con la aclaración "de pronto sintácticamente esté
mal pero creo que se entiende". Se le señaló que el compilador no
interpreta intenciones: la sintaxis es parte del ejercicio, no un
detalle cosmético.

Intento 2 — las 6 filas con el concepto correcto. EJERCICIO COMPLETADO.
- Fila 6 `int TheSize = myList.length;` — CORRECTO. Corrigió el
  sobrepensamiento a la primera pista.
- Fila 9 — arregló 3 de los 5 errores señalados sin ayuda extra:
  llaves/paréntesis en su lugar, `.equals(b)` contra la variable, y el
  `== true` eliminado.

Detalles de sintaxis que quedaron abiertos en el intento 2 (explicados
en el chat, son los puntos a mirar en el repaso):
a. `boolean isIn;` sin inicializar + uso posterior → error de
   COMPILACIÓN real ("variable isIn might not have been initialized").
   Java exige que una variable local esté asignada con certeza antes de
   leerse; el compilador no asume `false`. Va `boolean isIn = false;`.
b. El enhanced for SIGUE sin el tipo: `for (contain : myList)`. Es el
   único punto de la lista que se repitió del intento 1 → es el que hay
   que vigilar.
c. `System.Out.Print(isIn)` — Java es case-sensitive: `Out` y `Print`
   con mayúscula no existen. Va `System.out.println(isIn);`. Faltaba
   además el punto y coma.
d. El `print` quedó DENTRO del for por posición de las llaves: imprime
   una vez por vuelta en vez de una vez al final.
e. Bonus conceptual que conecta la fila 8 con la fila 9: como la fila 8
   dejó un `null` en el arreglo, `contain.equals(b)` revienta con
   NullPointerException al llegar a esa posición. `ArrayList.contains()`
   ya maneja ese caso solo; con arreglo hay que chequear el null a mano.
   Es exactamente el trabajo que ArrayList te ahorra, que es la moraleja
   completa de la tabla.

RESULTADO: PASÓ en 2 intentos, con pistas (nunca la solución completa).
Lo más valioso: acertó la fila 8 de una y entendió por qué. Repaso r1
agendado para 2026-08-12.

============================================================

LIBRO — Sharpen your pencil: "Annotate the code yourself!" — emparejar
21 números del código real de StartupBust con sus 21 anotaciones (dos
bloques independientes: 1-10 y 11-21) (Ubicación pág. 430-433,
Sesión #79) — [x] completado (2026-08-12)

Enunciado: el libro numera las líneas del código real de StartupBust
(`-- 1` a `-- 21`) y pone al pie de cada página las anotaciones en
prosa, desordenadas y con un guión vacío adelante. Hay que escribir el
número delante de cada anotación. Cada una se usa exactamente una vez y
no sobra ninguna. Los números 1-10 (pág. 430: instance variables,
setUpGame, startPlaying) van con el BLOQUE A; los 11-21 (pág. 433:
checkUserGuess, finishGame, main) con el BLOQUE B. El libro cierra con
"DON'T turn the page!" porque la 434 es la solución oficial.

Entregado en: ejercicios/lib20-anotar-startupbust.md

RESULTADO: 21 de 21. PERFECTO, sin una sola pista.
Se entregó en dos tiempos el mismo día: primero el Bloque A solo (el
Bloque B no se había guardado por un problema del editor), y a
continuación el archivo completo. No fueron dos intentos: el Bloque B
llegó bien a la primera, igual que el A.

BLOQUE A — 10/10:
- Separó bien el par 5 / 6, que es la trampa del bloque: dos líneas
  consecutivas dentro del mismo for donde 5 es PEDIRLE la ubicación al
  helper (`helper.placeStartup(3)`) y 6 es PASÁRSELA a la Startup con
  el setter (`startup.setLocationCells(newLocation)`). Aplicó el
  criterio correcto: ¿a qué objeto le habla esta línea?
- Distinguió el par 9 / 10 pese a la redacción casi idéntica ("llamar a
  nuestro propio método"): 9 = checkUserGuess, adentro del while;
  10 = finishGame, afuera. Lo resolvió por POSICIÓN en el flujo.

BLOQUE B — 11/11:
- Resolvió el punto más difícil del bloque: los DOS break no son lo
  mismo. 15 es el break tras un "hit" (salir temprano, no tiene sentido
  seguir probando las otras Startups) y 16 es el remove + break tras un
  "kill" (esta murió: sacala de la lista Y salí). Entendió que uno solo
  corta y el otro hace un trabajo extra antes de cortar.
- 12 = `String result = "miss"` con la anotación "asumir que es un miss
  salvo que te digan lo contrario": captó el valor pesimista por
  defecto, que es el patrón de diseño real de esa línea.
- 11 (numOfGuesses++), 13 (for sobre startups), 14 (checkYourself),
  17 (println del result), 18 (todo el bloque de finishGame),
  19/20/21 (las tres líneas del main: crear el objeto juego, prepararlo,
  arrancar el bucle) — todas correctas.

Lo que este ejercicio demuestra: no reconoció el código, lo ENTENDIÓ.
Poner en palabras propias qué hace cada línea es la prueba real de
comprensión, y la pasó sin ayuda en las 21.

Este ejercicio destraba la pág. 434 (la versión anotada del libro), que
hasta ahora estaba marcada como spoiler.

Repaso r1 agendado para 2026-08-15.

# ------------------------------------------------------------
EJERCICIO #14 — RE-ESTUDIO "¿dónde vive cada cosa?" — clase Termometro
SIN main + TermometroTestDrive con main (ejercicio del profe, Sesión
#09 y #10) — [x] completado (2026-08-13, 2 entregas)

CONTEXTO: ejercicio creado como remedio del RE-ESTUDIO, después de que
el archivo C de "BE the Compiler" (lib01) fallara en el r1 y en el r2
con la misma idea equivocada: "no compila porque le falta el main".

OBJETIVO CUMPLIDO — el corazón del ejercicio salió bien:
- Compiló Termometro.java SIN main: compiló sin un solo mensaje.
- Al ejecutarla obtuvo, de la propia JVM:
  "Error: Main method not found in class Termometro, please define the
  main method as: public static void main(String[] args)"
  (Error: no se encontró el método main en la clase Termometro...)
- Contrastó ese mensaje con el que había obtenido en el 1er intento
  ("Could not find or load main class Termometro" /
  ClassNotFoundException), que NO es lo mismo: ese decía que la JVM ni
  siquiera encontró el archivo .class. Había compilado desde IntelliJ
  (que deja los .class en out/) y corrido `java` parado en src/. Al
  rehacerlo con javac + java en la misma carpeta apareció el mensaje
  correcto. El desvío terminó enseñando más que el camino directo: son
  dos fallas de EJECUCIÓN distintas y ahora las distingue.

BIEN DESDE EL 1ER INTENTO:
- Anidamiento IMPECABLE: variable de instancia y métodos dentro de la
  clase, instrucciones dentro de los métodos, nada suelto. Ese era el
  error de fondo del RE-ESTUDIO y no reapareció ni una vez.
- `this.temperaturaActual = temperaturaActual;` en el setter, para
  desambiguar el parámetro de la variable de instancia. No se lo pidió
  nadie.
- `double` bien elegido como tipo (la temperatura lleva decimales).
- TermometroTestDrive correcto: new, operador punto, main bien formado.

CORREGIDO EN LA 2DA ENTREGA:
- DIVISIÓN ENTERA. Había escrito `temperaturaActual * (9 / 5) + 32`.
  Los paréntesis aislaban una división entre dos int, así que 9/5 daba
  1 y el Fahrenheit salía mal. Lo arregló sacando los paréntesis:
  `temperaturaActual * 9 / 5 + 32` resuelve de izquierda a derecha y el
  primer paso ya arrastra un double, que se propaga al resto. Verificado
  con 20 °C = 68.0 °F.
- EL MÉTODO QUE IMPRIME. Al principio getEstado() devolvía un String con
  un operador ternario y el print vivía en el main. Lo reescribió como
  `void` con if/else y System.out.println adentro, como pedía el
  enunciado.

QUEDÓ SIN CORREGIR (anotado para el repaso, no bloqueó el cierre):
- `public double temperaturaActual;` sigue pública: debería ser
  `private`. Tiene el setter escrito pero no protege nada, porque
  cualquiera puede hacer `term.temperaturaActual = -9999;`.
- El nombre `getEstado()` quedó mintiendo: es `void`, y en Java `get`
  es una convención que promete un valor de retorno. Debería llamarse
  imprimirEstado() o mostrarEstado().
- El límite quedó corrido: `> 15` deja los 15 exactos en "frío", y el
  enunciado los ponía del otro lado ("menor a 15 → un mensaje, si no →
  el otro").
- PARTE 4 (la pregunta conceptual sobre cuántas de Startup/GameHelper/
  Dog/Song/Movie tienen main) OMITIDA por decisión del usuario, que
  prefirió avanzar. Defendible: la JVM ya le había demostrado el
  concepto en vivo.

CHECKLIST TOCADO: ToDo/crear-una-clase-java.md ganó dos bloques nuevos
por errores que no cubría — (1) la división entre dos int y la trampa
de los paréntesis que la aíslan; (2) la tabla que separa "Main method
not found" (encontró la clase, falta la puerta) de "Could not find or
load main class" (no encontró el .class), más los puntos sobre
verificar dónde está el .class y sobre que los IDE lo mandan a out/.

Este ejercicio destraba el repaso r3 de lib01 (2026-08-16).
Repaso r1 agendado para 2026-08-17.

============================================================

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r1) — programado: 2026-07-28 — [x] cumplido (2026-08-24, con casi un mes de atraso)
Resuelto en: ejercicios/repasos/lib05-r1.md
Corrección de Claude (comparado contra el original del 2026-07-24):

MEJORÓ: los dos arreglos salieron limpios de una. En el original, el
arreglo de B había necesitado un tercer intento por dos errores de
sintaxis (`system.out.println` en minúscula y sin punto y coma). Esta
vez escribió `void play() { System.out.println("Playing song"); }`
correcto a la primera: mayúscula, `;` y llaves. Ese error NO volvió.

SE MANTUVO: el diagnóstico de A y B, correcto a la primera y sin
pistas, igual que en el original.

SE REPITIÓ (error de método, no de Java): entregó solo el diagnóstico y
omitió la mitad "¿cómo lo arreglarías?" del enunciado. Hubo que
pedírsela en el chat — exactamente lo que había pasado en el intento 1
del original. Segundo strike del mismo error.

RETROCESO LEVE de precisión en A: el original decía "la variable song
no está definida" (preciso). Esta vez dijo "no se ha creado un objeto",
mezclando los dos pasos (declarar la referencia vs. crear el objeto con
`new`), y habló de una referencia que "apunta a esa clase" — una
referencia apunta a un OBJETO, nunca a una clase. Señalado en el chat.
Tampoco indicó dónde va la línea nueva; en el original sí lo había
dicho ("arriba de song.artist").

CHECKLIST CREADO: ToDo/entregar-un-ejercicio.md, por el error de método
repetido dos veces. Cubre releer el enunciado contando sus preguntas,
escribir el arreglo en código en vez de describirlo, y la tabla que
separa clase / objeto / referencia.

RESULTADO: r1 BIEN en lo técnico. Repaso r2 agendado para 2026-09-07.

============================================================

REPASO — LIBRO Sharpen your pencil: "Movie objects" (pág. 170-173) (r1)
— programado: 2026-07-28 — [x] cumplido (2026-08-24, sesión java-s57)
Resuelto en: ejercicios/repasos/lib04-r1.md

Entrega:
- object 1: "Gone with the Stock" / Tragic / -2 — CORRECTO.
- object 2: "Lost in Cubicle Space" / Comedy / 5 — CORRECTO. No se dejó
  arrastrar por `two.playIt()`: el method imprime y no toca ninguna
  instance variable, así que los valores del objeto quedan intactos.
- object 3: "Byte Club" / "Tragic but ultimately uplifting" / 127 —
  CORRECTO, y con las mayúsculas exactas del código.

MEJORÓ: en el original había escrito el título 3 en minúsculas
("byte club"). Esta vez copió el String tal cual aparece en el código.
En Java un String es sensible a mayúsculas y minúsculas, así que la
precisión al transcribir un valor no es cosmética: es el hábito que
después evita que `.equals()` devuelva false sin motivo aparente.

SE REPITIÓ: nada. Cero errores en las dos pasadas.

RESULTADO: 3/3 PERFECTO. Repaso r2 agendado para 2026-09-08 (el
2026-09-07 ya está ocupado por lib05-r2 — máximo 1 repaso por día).

# ============================================================
# DADAS DE BAJA (decisión tomada en un triage — no vuelven)
# ============================================================

Triage del 2026-08-24 (`/pendientes`). Los 4 Pool Puzzles entrenaban el
mismo músculo — leer código ajeno y ensamblarlo — que ya quedó aprobado
en lib20 (21/21 sin pistas), ej13 y los Code Magnets. Cuatro
repeticiones sin tocar en un mes no son tarea: son ruido.

- EJERCICIO #04 — Pool Puzzle (pág. 129-131, Sesión #17) — abierto 36 días.
  Baja: músculo ya aprobado por otra vía.
- EJERCICIO #07 — Pool Puzzle "Echo" (pág. 187-190, Sesión #29) — abierto 31 días.
  Baja: músculo ya aprobado por otra vía.
- EJERCICIO #10 — Pool Puzzle Triangle (pág. 250-251, Sesión #44) — abierto 28 días.
  Baja: músculo ya aprobado por otra vía.
- LIBRO "A Heap o' Trouble" (pág. 251-252, Sesión #44) — abierto 28 días.
  Baja: mismo concepto (referencias vs. objetos en el heap) que el repaso
  lib09 "pilfered references", que sigue vivo y programado.
- EJERCICIO #12 — Pool Puzzle "Puzzle4" (pág. 312-314, Sesión #57) — abierto 25 días.
  Baja: músculo ya aprobado por otra vía.
