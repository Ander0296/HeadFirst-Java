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

REPASO — LIBRO BE the Compiler (pág. 123) (r2) — programado: 2026-07-27 — [ ] pendiente
Arranque: ejercicios/repasos/lib01-r2.md
OJO: el r1 salió MAL (confundió bucle infinito con error de
compilación). Si vuelve a fallar → RE-ESTUDIO de compile-time vs.
runtime (Sesión #08 y #11).

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r1) — programado: 2026-07-28 — [ ] pendiente
Arranque: ejercicios/repasos/lib05-r1.md

REPASO — LIBRO Movie objects (pág. 170-173) (r1) — programado: 2026-07-28 — [ ] pendiente
Arranque: ejercicios/repasos/lib04-r1.md

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

# ============================================================
# CONCEPTOS DOMINADOS (entran al graduarse un ejercicio con r3 bien)
# ============================================================

- (vacío por ahora: ningún ejercicio llegó todavía al r3)
