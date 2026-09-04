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
Arranque: ejercicios/repasos/... (desde cero, sin mirar el original) (lo crea `/repaso`)

# ============================================================
# EJERCICIOS ABIERTOS
# ============================================================

LIBRO — "Leer el javadoc" — buscar la ficha de ArrayList en la documentación oficial y contestar 5 preguntas (paquete/módulo, las dos versiones de add, clear(), un método nuevo, qué es deprecated) (Ubicación pág. 452-454, Sesión #83) — [ ] pendiente
Arranque: ejercicios/lib21-leer-el-javadoc.md | Si te trabás: Sesión #83 de la guía

EJERCICIO #13 — Code Magnets: "MultiFor" — reconstruir un programa desordenado con dos for anidados e incremento/decremento para que dé la salida pedida (Ubicación pág. 380-382, Sesión #71) — [ ] pendiente
Tipo: completar/corregir código
Arranque: ejercicios/ej13-code-magnets-multifor/MultiFor.java | Si te trabás: Sesión #68 y #69 de la guía

LIBRO — Sharpen your pencil: "¿qué más testear?" — mirando el test code de SimpleStartupTestDrive, qué falta probar del método checkYourself() (Ubicación pág. 346, Sesión #62) — [ ] pendiente
Arranque: ejercicios/lib13-que-mas-testear.md | Si te trabás: Sesión #62 de la guía

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
Arranque: ejercicios/repasos/ej09-r1/TestArrays.java (lo crea `/repaso`)
Mirar: que `index[0..3]` quede AFUERA del `while`.

REPASO — LIBRO Five-Minute Mystery: "The case of the pilfered references" (pág. 253-255) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib09-r1.md (lo crea `/repaso`)
Mirar: que cierre la conclusión (queda accesible UN solo Contact) y no
confunda conteo de OBJETOS con conteo de REFERENCIAS.

REPASO — LIBRO "Mixed Messages" (pág. 309-312) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib11-r1.md (lo crea `/repaso`)
Mirar: el conteo de vueltas del bucle (i<9 son 9 objetos, índices 0 a 8).

REPASO — LIBRO "What's legal?" (pág. 305-306) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/lib10-r1.md (lo crea `/repaso`)
Mirar: la trampa de `byte h = calcArea(4, 20)` — la llamada es legal; lo
ilegal es el int de retorno sin cast entrando en un byte.

REPASO — EJERCICIO #11 BE the Compiler: XCopy/Clock (pág. 307) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/ej11-r1/ (lo crea `/repaso`)
Mirar: leer el valor exacto que pasa setTime() antes de anotar el output.

REPASO — EJERCICIO DooBee (pág. 109) (r2) — programado: 2026-08-05 — [ ] pendiente
Arranque: ejercicios/repasos/ej01-doobee-r2/DooBee.java — YA CREADO

REPASO — EJERCICIO Code Magnets: Shuffle1 (pág. 121-122) (r2) — programado: 2026-08-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej03-shuffle1-r2/Shuffle1.java — YA CREADO

REPASO — EJERCICIO BottleSong (pág. 111) (r2) — programado: 2026-08-09 — [ ] pendiente
Arranque: ejercicios/repasos/ej02-bottlesong-r2/BottleSong.java — YA CREADO
Mirar: que resuelva en BottleSong.java, no en un "TestDrive".

REPASO — LIBRO "Annotate the code yourself!" StartupBust (pág. 430-433) (r1) — programado: 2026-08-15 — [ ] pendiente
Arranque: ejercicios/repasos/lib20-r1.md (lo crea `/repaso`)
El original salió PERFECTO (21/21). Mirar: los dos break (15 = salir tras
un hit; 16 = remove + salir tras un kill) y el par 5/6.

REPASO — EJERCICIO #14 Termometro "¿dónde vive cada cosa?" (r1) — programado: 2026-08-17 — [ ] pendiente
Arranque: ejercicios/repasos/ej14-r1/ (lo crea `/repaso`)
Mirar: (1) la variable de instancia en `private`; (2) que el método que
imprime no se llame `getEstado()` (`get` promete devolver algo); (3)
`celsius * 9 / 5 + 32` sin paréntesis en el `9 / 5`; (4) el límite:
menor a 15 → frío, si no → calor.
Del examen 2026-09-02: sabe que la variable va escondida pero no PARA
QUÉ. Mirar que el método que asigna tenga un chequeo.

REPASO — LIBRO prep code SimpleStartupGame (pág. 353-354) (r1 bis) — programado: 2026-09-05 — [ ] pendiente
Arranque: ejercicios/repasos/lib14-r1bis.md (lo crea `/repaso`)
RE-ESTUDIO ACTIVO (2do fallo seguido). Releer antes la Sesión #64.
Mirar: (1) una línea que apague el "MIENTRAS siga vivo"; (2) contar
numOfGuesses, no numOfHits; (3) guardar el retorno de checkYourself()
en una variable; (4) crear el array de 3 celdas antes de
setLocationCells. Checklist: ToDo/un-bucle-que-termina.md

REPASO — EJERCICIO #15 "Agenda de contactos" (r1) — programado: 2026-09-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej15-r1/ (lo crea `/repaso`)
El original salió BIEN. Mirar: (1) imprimir `i`, no `indexOf(get(i))`;
(2) sin `== true` sobre un método que ya devuelve boolean; (3) un solo
println con concatenación. Checklist: ToDo/recorrer-una-coleccion.md

REPASO — LIBRO "ArrayList vs. arreglo común" (pág. 407) (r1 bis) — programado: 2026-09-06 — [ ] pendiente
Arranque: ejercicios/repasos/lib19-r1bis.md (lo crea `/repaso`)
El r1 salió MAL: no tradujo a código el "borrar" (fila 8, antes
perfecta) y comparó SOLO una posición en vez de recorrer todo el
arreglo en "contains" (fila 9). Checklist: ToDo/recorrer-una-coleccion.md.

REPASO — CONCEPTO "qué hace falta para ARRANCAR un programa" (post-graduación lib01) — programado: 2026-09-06 — [ ] pendiente
Arranque: lo crea `/repaso` (es conceptual, sin carpeta propia)
Flojo en el examen del 2026-09-03: para ARRANCAR mezcló "la clase que
se ejecuta" con "el método que la JVM busca dentro de esa clase".
Mirar que separe las dos cosas. Salió de CONCEPTOS DOMINADOS.

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r2) — programado: 2026-09-07 — [ ] pendiente
Arranque: ejercicios/repasos/lib05-r2.md (lo crea `/repaso`)
Mirar: que entregue las DOS mitades (diagnóstico Y arreglo escrito en
código) sin que haya que pedírselas — ya falló dos veces.
Checklist: ToDo/entregar-un-ejercicio.md

REPASO — LIBRO Sharpen your pencil: "Movie objects" (pág. 170-173) (r2) — programado: 2026-09-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib04-r2.md (lo crea `/repaso`)
El r1 salió PERFECTO. Mirar: que `two.playIt()` no cambia ningún valor, y
que cada objeto conserva los suyos.

REPASO — LIBRO Sharpen your pencil: "Television" (pág. 162-163) (r2) — programado: 2026-09-09 — [ ] pendiente
Arranque: ejercicios/repasos/lib03-television-r2.md (lo crea `/repaso`)
El r1 bis salió BIEN. Mirar el error ESPEJO: dejó `encendido` sin
método que la cambie, la clase quedó 100% get/set sin un verbo puro.
Checklist: ToDo/crear-una-clase-java.md.

REPASO — LIBRO "Yours to solve" bug SimpleStartupGame (pág. 365-367) (r2) — programado: 2026-09-17 — [ ] pendiente
Arranque: ejercicios/repasos/lib15-r2.md (lo crea `/repaso`)
El r1 salió BIEN: diagnóstico correcto en prosa a la primera. Mirar el
único punto flojo: dijo "un while" donde va un `if`. Que nombre la
estructura correcta y diga que el chequeo va ANTES del `numOfHits++`.
Checklist: ToDo/recorrer-una-coleccion.md (punto 7).

REPASO — LIBRO "BE the JVM" (pág. 378-380) (r2) — programado: 2026-09-18 — [ ] pendiente
Arranque: ejercicios/repasos/lib16-r2.md (lo crea `/repaso`)
El r1 salió BIEN sin pistas (el original necesitó 2). Mirar los dos
puntos flojos: (1) que nombre `value > 14` como condición de corte, no
`i > 14`; (2) que ENTREGUE la traza vuelta por vuelta, no prosa.
Checklist: ToDo/un-bucle-que-termina.md (punto 2) y
ToDo/entregar-un-ejercicio.md (Nivel 1).

REPASO — LIBRO Sharpen your pencil (pág. 80-81) (r3) — programado: 2026-09-25 — [ ] pendiente
Arranque: ejercicios/repasos/sharpen-your-pencil-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Mirar el único punto que falló
las TRES veces: que en `"Dog: " + name` diga la palabra CONCATENACIÓN y
explique que el `+` entre Strings pega texto en vez de sumar.

REPASO — LIBRO Mixed Messages (pág. 127-129) (r3) — programado: 2026-09-26 — [ ] pendiente
Arranque: ejercicios/repasos/lib02-r3.md (lo crea `/repaso`)
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
