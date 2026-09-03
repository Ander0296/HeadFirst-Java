# EJERCICIOS — JAVA (Head First Java, 3ra ed.)

Solo lo VIVO: pendientes [ ], en curso [~], repasos no cumplidos y
CONCEPTOS DOMINADOS. Lo cerrado (con su corrección larga) vive en
EJERCICIOS-ARCHIVO.md, que NO se lee al inicio. Estados: [ ] · [~] ·
[x] (fecha). Corrección escrita acá: MÁXIMO 3 líneas, el detalle al chat.
Los punteros dicen "de la guía", nunca "de GUIA-JAVA.md": las sesiones
viejas migran a GUIA-ARCHIVO.md y el puntero quedaría mentiroso solo.

FORMATOS (copiar y llenar):

EJERCICIO #NN — [tema] (Ubicación pág. X, Sesión #Y) — [ ] pendiente
Tipo: programa desde cero | completar/corregir código | conceptual | mini-diseño
Arranque: ejercicios/ejNN-nombre/ | Si te trabás: Sesión #Y de la guía

LIBRO — [nombre] (Ubicación pág. X, Sesión #Y) — [ ] pendiente
Arranque: ejercicios/libNN-nombre.md | Si te trabás: Sesión #Y de la guía

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

LIBRO — Sharpen your pencil: ¿legal o no? — marcar cuáles de 12 líneas de asignación entre primitivas compilan y cuáles no (Ubicación pág. 210, Sesión #34) — [ ] pendiente
Arranque: ejercicios/lib07-legal-o-no.md | Si te trabás: Sesión #32 y #33 de GUIA-JAVA.md

# ============================================================
# REPASOS PROGRAMADOS (ordenados por fecha: el de arriba es el que toca)
# ============================================================

Nota: la corrección COMPLETA de cada intento anterior vive en
EJERCICIOS-ARCHIVO.md. Acá solo va el "punto a mirar", en 1-2 líneas.
Criterio vigente (2026-08-25): con ~17 vencidos, se atacan por RIESGO
(los que ya fallaron primero), no por fecha. El archivo de arranque lo
crea `/repaso` en el momento, uno por día.

REPASO — EJERCICIO #05 Robot (Sesión #25) (r1) — programado: 2026-07-28 — [ ] pendiente
Arranque: ejercicios/repasos/ej05-robot-r1/ (Robot.java y RobotTestDrive.java) — YA CREADO

REPASO — EJERCICIO #06 DrumKit (pág. 186) (r1) — programado: 2026-07-29 — [ ] pendiente
Arranque: ejercicios/repasos/ej06-r1/ — YA CREADO

REPASO — EJERCICIO #08 BE the Compiler: arrays (pág. 245-246) (r1) — programado: 2026-07-31 — [ ] pendiente
Arranque: ejercicios/repasos/ej08-r1/ — YA CREADO
Mirar: que diga "compila SÍ, revienta en ejecución" con el nombre de la
excepción, y que cuente el arreglo como objeto (4, no 3).

REPASO — EJERCICIO #09 Code Magnets: TestArrays (pág. 247-249) (r1) — programado: 2026-08-01 — [ ] pendiente
Arranque: ejercicios/repasos/ej09-r1/TestArrays.java
Mirar: que `index[0..3]` quede AFUERA del `while`.

REPASO — LIBRO Five-Minute Mystery: "The case of the pilfered references" (pág. 253-255) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib09-r1.md
Mirar: que cierre la conclusión (queda accesible UN solo Contact) y no
confunda conteo de OBJETOS con conteo de REFERENCIAS.

REPASO — LIBRO "Mixed Messages" (pág. 309-312) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib11-r1.md
Mirar: el conteo de vueltas del bucle (i<9 son 9 objetos, índices 0 a 8).

REPASO — LIBRO "What's legal?" (pág. 305-306) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/lib10-r1.md
Mirar: la trampa de `byte h = calcArea(4, 20)` — la llamada es legal; lo
ilegal es el int de retorno sin cast entrando en un byte.

REPASO — EJERCICIO #11 BE the Compiler: XCopy/Clock (pág. 307) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/ej11-r1/
Mirar: leer el valor exacto que pasa setTime() antes de anotar el output.

REPASO — EJERCICIO DooBee (pág. 109) (r2) — programado: 2026-08-05 — [ ] pendiente
Arranque: ejercicios/repasos/ej01-doobee-r2/DooBee.java — YA CREADO

REPASO — EJERCICIO Code Magnets: Shuffle1 (pág. 121-122) (r2) — programado: 2026-08-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej03-shuffle1-r2/Shuffle1.java — YA CREADO

REPASO — EJERCICIO BottleSong (pág. 111) (r2) — programado: 2026-08-09 — [ ] pendiente
Arranque: ejercicios/repasos/ej02-bottlesong-r2/BottleSong.java — YA CREADO
Mirar: que resuelva en BottleSong.java, no en un "TestDrive".

REPASO — LIBRO "BE the JVM" (pág. 378-380) (r1) — programado: 2026-08-10 — [ ] pendiente
Arranque: ejercicios/repasos/lib16-r1.md
RIESGO: el original necesitó 2 pistas. Mirar: que arme la tabla vuelta
por vuelta solo y llegue a "13 15 i = 6" (`++value` muta la variable:
son 2 incrementos por vuelta, no 1).

REPASO — LIBRO "Annotate the code yourself!" StartupBust (pág. 430-433) (r1) — programado: 2026-08-15 — [ ] pendiente
Arranque: ejercicios/repasos/lib20-r1.md
El original salió PERFECTO (21/21). Mirar: los dos break (15 = salir tras
un hit; 16 = remove + salir tras un kill) y el par 5/6.

REPASO — EJERCICIO #14 Termometro "¿dónde vive cada cosa?" (r1) — programado: 2026-08-17 — [ ] pendiente
Arranque: ejercicios/repasos/ej14-r1/
Mirar: (1) la variable de instancia en `private`; (2) que el método que
imprime no se llame `getEstado()` (`get` promete devolver algo); (3)
`celsius * 9 / 5 + 32` sin paréntesis en el `9 / 5`; (4) el límite:
menor a 15 → frío, si no → calor.
Del examen del 2026-09-02: sabe que la variable va escondida, pero no
dice PARA QUÉ (el método valida antes de asignar) ni que el método
puede cambiar por dentro sin romper a quien lo llama. Mirar que el
método que asigna tenga un chequeo, y que `getX()` devuelva en vez de
imprimir.

REPASO — LIBRO prep code SimpleStartupGame (pág. 353-354) (r1 bis) — programado: 2026-09-05 — [ ] pendiente
Arranque: ejercicios/repasos/lib14-r1bis.md (lo crea `/repaso`)
RE-ESTUDIO ACTIVO (segundo fallo seguido: el original necesitó solución
dada, el r1 salió mal). Releer antes la Sesión #64 de la guía.
Mirar el error espejo del corte del bucle: en el r1 no había NINGUNA
línea que apagara el "MIENTRAS siga vivo". Y además: contar
numOfGuesses (no numOfHits, que es de SimpleStartup) en TODAS las
vueltas; guardar lo que devuelve checkYourself() en una variable en vez
de llamarlo una vez por comparación; construir el array de 3 celdas
antes de setLocationCells.
Checklist: ToDo/un-bucle-que-termina.md

REPASO — EJERCICIO #15 "Agenda de contactos" (r1) — programado: 2026-09-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej15-r1/ (lo crea `/repaso`)
El original salió BIEN (recorrido de ArrayList correcto, `cuantos()`
devuelve, enhanced for con tipo). Mirar: (1) que imprima `i` y NO
`indexOf(get(i))` en el for clásico; (2) que no escriba `== true` sobre
un método que ya devuelve boolean; (3) que use concatenación en un solo
println en vez de tres print.
Checklist: ToDo/recorrer-una-coleccion.md

REPASO — LIBRO "ArrayList vs. arreglo común" (pág. 407) (r1 bis) — programado: 2026-09-06 — [ ] pendiente
Arranque: ejercicios/repasos/lib19-r1bis.md (lo crea `/repaso`)
El r1 salió MAL: no tradujo a código el "borrar" (fila 8, antes
perfecta) y comparó SOLO una posición en vez de recorrer todo el
arreglo en "contains" (fila 9). Checklist: ToDo/recorrer-una-coleccion.md.

REPASO — CONCEPTO "qué hace falta para ARRANCAR un programa" (post-graduación lib01) — programado: 2026-09-06 — [ ] pendiente
Arranque: lo crea `/repaso` en el momento (no tiene carpeta propia: es
conceptual, no un ejercicio de código)
Salió FLOJO en el examen del 2026-09-03 (java-s65): explicó bien qué
hace falta para COMPILAR, pero para ARRANCAR mezcló "la clase que se
ejecuta" con "el método específico que busca la JVM dentro de esa
clase" — no lo separó con precisión. Se sacó de CONCEPTOS DOMINADOS
hasta que esto se sostenga en frío otra vez.

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r2) — programado: 2026-09-07 — [ ] pendiente
Arranque: ejercicios/repasos/lib05-r2.md
Mirar: que entregue las DOS mitades (diagnóstico Y arreglo escrito en
código) sin que haya que pedírselas — ya falló dos veces.
Checklist: ToDo/entregar-un-ejercicio.md

REPASO — LIBRO Sharpen your pencil: "Movie objects" (pág. 170-173) (r2) — programado: 2026-09-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib04-r2.md
El r1 salió PERFECTO. Mirar: que `two.playIt()` no cambia ningún valor, y
que cada objeto conserva los suyos.

REPASO — LIBRO Sharpen your pencil: "Television" (pág. 162-163) (r2) — programado: 2026-09-09 — [ ] pendiente
Arranque: ejercicios/repasos/lib03-television-r2.md
El r1 bis salió BIEN (murió el error de fondo: ya declara estado
VARIABLE). Mirar el error ESPEJO que apareció: dejó `encendido` sin
method que la cambie y la clase quedó 100% get/set, sin un verbo puro.
Checklist: ToDo/crear-una-clase-java.md ("emparejamiento estado ↔
comportamiento").

REPASO — LIBRO "Yours to solve" bug SimpleStartupGame (pág. 365-367) (r2) — programado: 2026-09-17 — [ ] pendiente
Arranque: ejercicios/repasos/lib15-r2.md (lo crea `/repaso`)
El r1 salió BIEN: diagnóstico correcto en prosa a la primera. Mirar el
único punto flojo: dijo "un while" donde va un `if`. Que nombre la
estructura correcta y diga que el chequeo va ANTES del `numOfHits++`.
Checklist: ToDo/recorrer-una-coleccion.md (punto 7).

REPASO — LIBRO Sharpen your pencil (pág. 80-81) (r3) — programado: 2026-09-25 — [ ] pendiente
Arranque: ejercicios/repasos/sharpen-your-pencil-r3.md
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Mirar el único punto que falló
las TRES veces: que en `"Dog: " + name` diga la palabra CONCATENACIÓN y
explique que el `+` entre Strings pega texto en vez de sumar.

REPASO — LIBRO Mixed Messages (pág. 127-129) (r3) — programado: 2026-09-26 — [ ] pendiente
Arranque: ejercicios/repasos/lib02-r3.md
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Salió 5/5 las tres veces. Mirar:
que TRACE el bucle vuelta por vuelta y no conteste de memoria. Trampas:
el candidato donde `y` llega a 10 (salida de 3 dígitos) y el candidato
donde `x` sube DOS veces por vuelta (3 vueltas, no 5).

# ============================================================
# CONCEPTOS DOMINADOS (entran al graduarse un ejercicio con r3 bien)
# ============================================================

- Compile-time vs. runtime: un programa bien anidado (clase → método →
  instrucción) COMPILA aunque tenga un bucle infinito u otro error de
  lógica; eso es un problema de EJECUCIÓN, no de compilación.
- Toda instrucción ejecutable (`while`, `if`...) vive DENTRO de un
  método. No puede estar suelta directo dentro de una clase, sin
  importar el nombre del método que la envuelva.
