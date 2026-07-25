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

LIBRO — Sharpen your pencil: ¿legal o no? — marcar cuáles de 12 líneas de asignación entre primitivas compilan y cuáles no (Ubicación pág. 210, Sesión #34) — [ ] pendiente
Arranque: ejercicios/lib07-legal-o-no.md | Si te trabás: Sesión #32 y #33 de GUIA-JAVA.md

LIBRO — Who Am I? ("¿Quién soy?") — identificar si cada frase la dice una clase, un objeto, un method o una instance variable (Ubicación pág. 191, Sesión #30) — [~] en curso
Arranque: ejercicios/lib06-who-am-i.md (13 frases traducidas + "MI RESPUESTA")
Si te trabás: Sesión #23/#24, #25 y #27 (en GUIA-ARCHIVO.md)
Estado: intento 2 dio 6/13 claras. Falta intento 3 sobre #4, #7, #8,
#10, #11, #13. Error de fondo: responde con sintaxis de Java en vez de
elegir uno de los 4 personajes del enunciado. (Detalle de los dos
intentos: EJERCICIOS-ARCHIVO.md)

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

REPASO — LIBRO Mixed Messages (pág. 127-129) (r1) — programado: 2026-07-23 — [ ] pendiente ← VENCIDO
Arranque: ejercicios/repasos/lib02-r1.md

REPASO — EJERCICIO BottleSong (pág. 111) (r1) — programado: 2026-07-25 — [ ] pendiente
Arranque: ejercicios/repasos/ej02-bottlesong-r1/BottleSong.java

REPASO — LIBRO Sharpen your pencil: Television (pág. 162-163) (r1) — programado: 2026-07-27 — [ ] pendiente
Arranque: ejercicios/repasos/lib03-television-r1.md

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

REPASO — LIBRO Sharpen your pencil (pág. 80-81) (r2) — programado: 2026-08-04 — [ ] pendiente
Arranque: ejercicios/repasos/sharpen-your-pencil-r2.md
Punto a mirar: concatenación de Strings con `+` (el r1 dio el
resultado correcto sin poder explicar el mecanismo).

REPASO — EJERCICIO DooBee (pág. 109) (r2) — programado: 2026-08-05 — [ ] pendiente
Arranque: ejercicios/repasos/ej01-doobee-r2/DooBee.java

REPASO — EJERCICIO Code Magnets: Shuffle1 (pág. 121-122) (r2) — programado: 2026-08-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej03-shuffle1-r2/Shuffle1.java

# ============================================================
# CONCEPTOS DOMINADOS (entran al graduarse un ejercicio con r3 bien)
# ============================================================

- (vacío por ahora: ningún ejercicio llegó todavía al r3)
