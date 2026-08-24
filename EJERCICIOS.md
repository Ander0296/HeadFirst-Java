# EJERCICIOS — JAVA (Head First Java, 3ra ed.)

Este archivo guarda SOLO lo VIVO (se lee entero al inicio de cada
sesión, así que se mantiene corto a propósito): ejercicios [ ]
pendientes y [~] en curso, repasos programados no cumplidos, y la
lista CONCEPTOS DOMINADOS.

Todo lo CERRADO (ejercicios [x] completados con su corrección larga,
repasos ya cumplidos) vive en EJERCICIOS-ARCHIVO.md, que NO se lee al
inicio: solo consulta puntual para comparar un repaso o re-estudiar.

Dos tipos: (A) DEL LIBRO (Sharpen your pencil, BE the compiler, Code
Magnets, Pool Puzzle, crucigramas...), los intento a mano ANTES de
mirar la solución; (B) DEL PROFE, los crea Claude al cerrar un tema o
combinando 2-3 conceptos. Código Java en ejercicios/, diagramas en
diagramas/ (.puml).

Estados: [ ] pendiente  [~] en curso  [x] completado (fecha)
Corrección escrita acá: MÁXIMO 3 líneas. El detalle va al chat, y al
completarse el ejercicio se mueve entero a EJERCICIOS-ARCHIVO.md.

FORMATOS (referencia para Claude — copiar y llenar):

EJERCICIO #NN — [tema] (Ubicación pág. X, Sesión #Y) — [ ] pendiente
Tipo: programa desde cero | completar/corregir código | conceptual | mini-diseño
Arranque: ejercicios/ejNN-nombre/ | Si te trabás: Sesión #Y de la guía
LIBRO — [nombre] (Ubicación pág. X, Sesión #Y) — [ ] pendiente
Arranque: ejercicios/libNN-nombre.md | Si te trabás: Sesión #Y de la guía

OJO con los punteros "Si te trabás": decir "de la guía", no
"de GUIA-JAVA.md". Las sesiones viejas se van moviendo a
GUIA-ARCHIVO.md, así que un puntero que nombra el archivo concreto
queda mentiroso solo. Regla: si la sesión no está en GUIA-JAVA.md,
está en GUIA-ARCHIVO.md.

REPASO — [nombre] (rX) — programado: AAAA-MM-DD — [ ] pendiente
Arranque: ejercicios/repasos/... (desde cero, sin mirar el original)

# ============================================================
# EJERCICIOS ABIERTOS
# ============================================================

EJERCICIO #13 — Code Magnets: "MultiFor" — reconstruir un programa desordenado con dos for anidados e incremento/decremento para que dé la salida pedida (Ubicación pág. 380-382, Sesión #71) — [ ] pendiente
Tipo: completar/corregir código
Arranque: ejercicios/ej13-code-magnets-multifor/MultiFor.java | Si te trabás: Sesión #68 y #69 de la guía

LIBRO — Crucigrama "JavaCross" — 32 pistas de vocabulario Java (Ubicación pág. 383-384, Sesión #71) — [ ] pendiente
Arranque: ejercicios/lib17-javacross.md | Si te trabás: Sesión #56 a #70 de la guía

LIBRO — "Mixed Messages" #3 — matchear 6 candidatos (x++/x--/x=x+N) con la salida de un for anidado con break (Ubicación pág. 386-387, Sesión #72) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Arranque: ejercicios/lib18-mixed-messages-3.md | Si te trabás: Sesión #68 y #69 de la guía

LIBRO — Sharpen your pencil: "¿qué más testear?" — mirando el test code de SimpleStartupTestDrive, qué falta probar del método checkYourself() (Ubicación pág. 346, Sesión #62) — [ ] pendiente
Arranque: ejercicios/lib13-que-mas-testear.md | Si te trabás: Sesión #62 de la guía

LIBRO — "Five-Minute Mystery" (misterio ciberpunk: Jai, Buchanan y Leveler) — descubrir qué sospechó Jai sobre el código de Buchanan (Ubicación pág. 315-316, Sesión #58) — [ ] pendiente
Arranque: ejercicios/lib12-five-minute-mystery-jai.md | Si te trabás: Sesión #52 y #53 de la guía

EJERCICIO #12 — Pool Puzzle: "Puzzle4" — completar una clase con fragmentos de una pileta (sin repetir ninguno) para que un programa imprima "result 543345" (Ubicación pág. 312-314, Sesión #57) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Tipo: completar/corregir código
Arranque: ejercicios/ej12-pool-puzzle-puzzle4/Puzzle4.java | Si te trabás: Sesión #40 a #43 de la guía

LIBRO — "A Heap o' Trouble" ("Un montón de problemas") — unir cada referencia hq[x] de un arreglo con el objeto HeapQuiz que le corresponde, tras una serie de reasignaciones (Ubicación pág. 251-252, Sesión #44) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Arranque: ejercicios/lib08-heap-o-trouble.md | Si te trabás: Sesión #37, #38 y #43 de la guía

EJERCICIO #10 — Pool Puzzle: Triangle — completar los huecos de una clase Triangle con fragmentos de una pileta, para un arreglo de 4 triángulos (Ubicación pág. 250-251, Sesión #44) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Tipo: completar/corregir código
Arranque: ejercicios/ej10-pool-puzzle-triangle/Triangle.java | Si te trabás: Sesión #40 a #43 de la guía

LIBRO — Sharpen your pencil: ¿legal o no? — marcar cuáles de 12 líneas de asignación entre primitivas compilan y cuáles no (Ubicación pág. 210, Sesión #34) — [ ] pendiente
Arranque: ejercicios/lib07-legal-o-no.md | Si te trabás: Sesión #32 y #33 de GUIA-JAVA.md

EJERCICIO #07 — Pool Puzzle: "Echo" — completar dos clases con fragmentos de una pileta para lograr una salida exacta (Ubicación pág. 187-190, Sesión #29) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Tipo: completar/corregir código
Arranque: ejercicios/ej07-pool-puzzle-echo/EchoTestDrive.java
Si te trabás: Sesión #25/#26 (new, operador punto) y Sesión #17

EJERCICIO #04 — Pool Puzzle: completar el código con fragmentos de una pileta para lograr una salida exacta (Ubicación pág. 129-131, Sesión #17) — [ ] pendiente — OPCIONAL (ícono Puzzle)
Tipo: completar/corregir código
Arranque: ejercicios/ej04-pool-puzzle/
Si te trabás: Sesión #12 y #13 (while, if, operadores de comparación)

# ============================================================
# REPASOS PROGRAMADOS (ordenados por fecha: el de arriba es el que toca)
# ============================================================

REPASO — EJERCICIO #05 Robot (Sesión #25) (r1) — programado: 2026-07-28 — [ ] pendiente
Arranque: ejercicios/repasos/ej05-robot-r1/ (Robot.java y RobotTestDrive.java)

REPASO — EJERCICIO #06 DrumKit (pág. 186) (r1) — programado: 2026-07-29 — [ ] pendiente
Arranque: ejercicios/repasos/ej06-r1/

REPASO — LIBRO Sharpen your pencil: Television (pág. 162-163) (r1 bis) — programado: 2026-07-31 — [ ] pendiente
Arranque: ejercicios/repasos/lib03-television-r1bis.md
El r1 salió MAL: se repitió el error de fondo del original (methods de
acción sin la instance variable de estado que modifican). Si vuelve a
fallar → RE-ESTUDIO de "lo que el objeto SABE vs. lo que SABE HACER"
(Sesión #23/#24 y #25, en GUIA-ARCHIVO.md).

REPASO — EJERCICIO #08 BE the Compiler: arrays (pág. 245-246) (r1) — programado: 2026-07-31 — [ ] pendiente
Arranque: ejercicios/repasos/ej08-r1/ (BooksTestDrive.java y Hobbits.java)
Punto a mirar: que diga "compila SÍ, revienta en ejecución" con el
nombre de la excepción, y que cuente el arreglo como objeto (4, no 3).

REPASO — EJERCICIO #09 Code Magnets: TestArrays (pág. 247-249) (r1) — programado: 2026-08-01 — [ ] pendiente
Arranque: ejercicios/repasos/ej09-r1/TestArrays.java
Punto a mirar: que las asignaciones de `index[0..3]` queden AFUERA del
`while` (en el original quedaron adentro, ejecutándose 4 veces de más).

REPASO — LIBRO Five-Minute Mystery: "The case of the pilfered references" (pág. 253-255) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib09-r1.md
Punto a mirar: que cierre la conclusión (después del bucle de Kate
queda accesible UN solo Contact, el de la última vuelta) y que no
confunda el conteo de OBJETOS con el de REFERENCIAS a Contact.

REPASO — LIBRO "Mixed Messages" (pág. 309-312) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib11-r1.md
Punto a mirar: que no cuente mal el número de vueltas del bucle (ej.
i<9 son 9 objetos, índices 0 a 8 — el desliz del intento original).

REPASO — LIBRO "What's legal?" (pág. 305-306) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/lib10-r1.md
Punto a mirar: la trampa del byte h = calcArea(4, 20) — la llamada es
legal, lo ilegal es el int de retorno sin cast entrando en un byte.

REPASO — EJERCICIO #11 BE the Compiler: XCopy/Clock (pág. 307) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/ej11-r1/ (XCopy.java y ClockTestDrive.java)
Punto a mirar: leer bien el valor exacto que pasa setTime() antes de
anotar el output (la primera vez se equivocó de dígitos: 1234 vs. 1245).

REPASO — LIBRO Sharpen your pencil (pág. 80-81) (r2) — programado: 2026-08-04 — [ ] pendiente
Arranque: ejercicios/repasos/sharpen-your-pencil-r2.md
Punto a mirar: concatenación de Strings con `+` (el r1 dio el
resultado correcto sin poder explicar el mecanismo).

REPASO — LIBRO prep code SimpleStartupGame (pág. 353-354) (r1) — programado: 2026-08-04 — [ ] pendiente
Arranque: ejercicios/repasos/lib14-r1.md
El original necesitó 3 intentos y solución dada por Claude. Punto a
mirar: el SI de corte pregunta directo por "kill" (uno solo, sin
anidar) y setLocationCells se ejecuta una sola vez, afuera del while.

REPASO — EJERCICIO DooBee (pág. 109) (r2) — programado: 2026-08-05 — [ ] pendiente
Arranque: ejercicios/repasos/ej01-doobee-r2/DooBee.java

REPASO — EJERCICIO Code Magnets: Shuffle1 (pág. 121-122) (r2) — programado: 2026-08-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej03-shuffle1-r2/Shuffle1.java

REPASO — LIBRO Mixed Messages (pág. 127-129) (r2) — programado: 2026-08-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib02-r2.md

REPASO — EJERCICIO BottleSong (pág. 111) (r2) — programado: 2026-08-09 — [ ] pendiente
Arranque: ejercicios/repasos/ej02-bottlesong-r2/BottleSong.java
El r1 salió BIEN y a la primera (el original había llevado 5 intentos).
Punto a mirar: que resuelva en BottleSong.java, no en un archivo
"TestDrive" (en el r1 usó ese nombre sin haber otra clase que probar).

REPASO — LIBRO "BE the JVM" (pág. 378-380) (r1) — programado: 2026-08-10 — [ ] pendiente
Arranque: ejercicios/repasos/lib16-r1.md
El original necesitó 2 pistas: no contaba que `++value` muta la
variable aparte de la `value++` de arriba (2 incrementos por vuelta,
no 1), y dudaba si `++value` en un print era una mutación real o solo
un cálculo para imprimir. Punto a mirar: que arme la tabla vuelta por
vuelta sin ayuda y llegue a "13 15 i = 6" solo.

REPASO — LIBRO "Yours to solve" bug SimpleStartupGame (pág. 365-367) (r1) — programado: 2026-08-11 — [ ] pendiente
Arranque: ejercicios/repasos/lib15-r1.md
El original necesitó varios intentos (NPE, comparación por índice,
sumar sin chequear repetidos). Punto a mirar: el arreglo paralelo de
"ya contado" y chequearlo ANTES de sumar a numOfHits.

REPASO — LIBRO Sharpen your pencil: "ArrayList vs. arreglo común" (pág. 407) (r1) — programado: 2026-08-12 — [ ] pendiente
Arranque: ejercicios/repasos/lib19-r1.md
El original salió en 2 intentos. Puntos a mirar: (1) el enhanced for
CON el tipo de la variable — fue el único error que se repitió entre
los dos intentos; (2) `boolean isIn = false;` inicializado, si no es
error de compilación; (3) que traduzca size() a `length` de una línea,
sin armar un bucle contador.

REPASO — LIBRO "Annotate the code yourself!" StartupBust (pág. 430-433) (r1) — programado: 2026-08-15 — [ ] pendiente
Arranque: ejercicios/repasos/lib20-r1.md
El original salió PERFECTO (21/21, sin pistas). Puntos a mirar: los dos
break (15 = salir tras un hit; 16 = remove + salir tras un kill) y el
par 5/6 (pedirle la ubicación al helper vs. pasársela a la Startup).

REPASO — LIBRO BE the Compiler (pág. 123) (r3) — programado: 2026-08-16 — [ ] pendiente
Arranque: ejercicios/repasos/lib01-r3.md
RE-ESTUDIO ACTIVO (el archivo C falló en el r1 y en el r2). El
EJERCICIO #14 ya está entregado (2026-08-13) y salió bien: DESBLOQUEADO.
Antes de hacerlo, releer la Sesión #09/#10 de la guía. Punto a mirar:
que la causa de C sea "el while está suelto dentro de la clase, le
falta ALGÚN método que lo envuelva" — NO "le falta el main". Una clase
sin main compila.

REPASO — EJERCICIO #14 Termometro "¿dónde vive cada cosa?" (r1) — programado: 2026-08-17 — [ ] pendiente
Arranque: ejercicios/repasos/ej14-r1/ (Termometro.java y TermometroTestDrive.java)
El original salió bien en 2 entregas. Puntos a mirar: (1) la variable de
instancia en `private`, que en el original quedó `public`; (2) que el
método que imprime NO se llame `getEstado()` — `get` promete devolver
algo y ese método es `void`; (3) la división: `celsius * 9 / 5 + 32` sin
paréntesis alrededor del `9 / 5` (con paréntesis da 1 y arruina la
cuenta); (4) el límite: menor a 15 → frío, si no → calor (el original
dejó los 15 exactos del lado equivocado).

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r2) — programado: 2026-09-07 — [ ] pendiente
Arranque: ejercicios/repasos/lib05-r2.md
El r1 salió BIEN en lo técnico (diagnóstico y los dos arreglos), y NO
repitió los errores de sintaxis del original. Punto a mirar: que
entregue las DOS mitades del enunciado (diagnóstico Y arreglo escrito
en código) sin que haya que pedírselas — eso ya falló dos veces.
Checklist: ToDo/entregar-un-ejercicio.md

REPASO — LIBRO Sharpen your pencil: "Movie objects" (pág. 170-173) (r2) — programado: 2026-09-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib04-r2.md
El r1 salió PERFECTO (3/3) y corrigió el único detalle del original
("Byte Club" con mayúsculas). Punto a mirar: que `two.playIt()` no
cambia ningún valor — imprime y nada más; y que cada objeto conserva
sus propios valores.

# ============================================================
# CONCEPTOS DOMINADOS (entran al graduarse un ejercicio con r3 bien)
# ============================================================

- (vacío por ahora: ningún ejercicio llegó todavía al r3)
