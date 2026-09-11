# EJERCICIOS — JAVA (Head First Java, 3ra ed.)

Solo lo VIVO: pendientes [ ], en curso [~], repasos no cumplidos y
CONCEPTOS DOMINADOS. Lo cerrado vive en EJERCICIOS-ARCHIVO.md, que NO se
lee al inicio. Estados: [ ] · [~] · [x] (fecha). Corrección escrita acá:
MÁXIMO 3 líneas, el detalle al chat. Los punteros dicen "de la guía",
nunca "de GUIA-JAVA.md" (las sesiones viejas migran y mentirían).

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

LIBRO — Sharpen your pencil: contar el árbol Doctor/Surgeon/FamilyDoctor (Ubicación pág. 482, Sesión #88) — [ ] pendiente
Arranque: ejercicios/lib23-sharpen-arbol-doctor.md | Si te trabás: Sesión #88 de la guía
Trampa: preguntan cuántas TIENE cada clase, no cuántas escribe.

LIBRO — Sharpen your pencil: el árbol de los músicos (Ubicación pág. 496, Sesión #90) — [ ] pendiente
Arranque: ejercicios/lib24-sharpen-arbol-musicos.md | Si te trabás: Sesión #90 de la guía
"Yours to solve": sin solución del libro, se corrige por criterio (cada relación tiene que tener sentido).

# ============================================================
# REPASOS PROGRAMADOS (ordenados por fecha: el de arriba es el que toca)
# ============================================================

Nota: corrección completa en EJERCICIOS-ARCHIVO.md; acá solo el "punto a mirar". Criterio (2026-08-25):
por RIESGO (los que ya fallaron primero), uno por día; el arranque lo crea `/repaso` en el momento.

REPASO — EJERCICIO #09 Code Magnets: TestArrays (pág. 247-249) (r1) — programado: 2026-08-01 — [ ] pendiente
Arranque: ejercicios/repasos/ej09-r1/TestArrays.java (lo crea `/repaso`)
Mirar: que `index[0..3]` quede AFUERA del `while`.

REPASO — LIBRO Five-Minute Mystery: "The case of the pilfered references" (pág. 253-255) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib09-r1.md (lo crea `/repaso`)
Mirar: que cierre la conclusión (queda accesible UN solo Contact) sin confundir conteo de OBJETOS con conteo de REFERENCIAS.

REPASO — LIBRO "Mixed Messages" (pág. 309-312) (r1) — programado: 2026-08-02 — [ ] pendiente
Arranque: ejercicios/repasos/lib11-r1.md (lo crea `/repaso`)
Mirar: el conteo de vueltas del bucle (i<9 son 9 objetos, índices 0 a 8).

REPASO — LIBRO "What's legal?" (pág. 305-306) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/lib10-r1.md (lo crea `/repaso`)
Mirar `byte h = calcArea(4, 20)`: la llamada es legal; lo ilegal es el int de retorno sin cast entrando en un byte.

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
Original PERFECTO (21/21). Mirar los dos break (15 = salir tras un hit; 16 = remove + salir tras un kill) y el par 5/6.

REPASO — EJERCICIO #15 "Agenda de contactos" (r1) — programado: 2026-09-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej15-r1/ (lo crea `/repaso`)
Original BIEN. Mirar: imprimir `i` (no `indexOf(get(i))`), sin `== true` sobre un boolean, y un println con concatenación. ToDo/recorrer-una-coleccion.md

REPASO — LIBRO Sharpen your pencil: "Movie objects" (pág. 170-173) (r2) — programado: 2026-09-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib04-r2.md (lo crea `/repaso`)
r1 PERFECTO. Mirar que `two.playIt()` no cambia ningún valor y que cada objeto conserva los suyos.

REPASO — EJERCICIO #13 Code Magnets: "MultiFor" (pág. 380-382) (r1) — programado: 2026-09-11 — [ ] pendiente
Arranque: ejercicios/repasos/ej13-r1/MultiFor.java (lo crea `/repaso`)
Original PERFECTO a la primera. Mirar que el `if (i == 1) { i++; }` quede DESPUÉS del for interno (antes imprimiría `2 4`) y que sepa por qué el 2 nunca es cabeza de vuelta.

REPASO — CONCEPTO "qué hace falta para ARRANCAR un programa" (post-graduación lib01) (r2) — programado: 2026-09-14 — [ ] pendiente
Arranque: ejercicios/repasos/lib01-concepto-arranque-r2.md (lo crea `/repaso`)
r1 PARCIAL (2026-09-11): "clase main" desapareció y P3-P5 perfectas, pero dijo "main le indica a la JVM la clase" (al revés: vos elegís la clase, la JVM busca main adentro) y "el programa solo puede tener un main". ToDo/crear-una-clase-java.md (trampa del main, punto 4).

REPASO — LIBRO "Leer el javadoc" (pág. 452-454) (r1) — programado: 2026-09-12 — [ ] pendiente
Arranque: ejercicios/repasos/lib21-r1.md (lo crea `/repaso`)
4 de 5 bien. Mirar el PAQUETE de ArrayList (dijo java.lang) y que conteste las DOS mitades de cada pregunta (qué hace Y qué devuelve). ToDo/leer-la-documentacion-de-java.md

REPASO — EJERCICIO #16 Code Magnets: "ArrayListMagnet" (pág. 461-463) (r1) — programado: 2026-09-13 — [ ] pendiente
Arranque: ejercicios/repasos/ej16-r1/ArrayListMagnet.java (lo crea `/repaso`)
Salida exacta pero resuelto SIN los imanes (el arranque los perdió): repetir CON los imanes. Mirar que use `if (a.contains("two"))` al final y sepa por qué NO entra. ToDo/recorrer-una-coleccion.md

REPASO — LIBRO "Yours to solve" bug SimpleStartupGame (pág. 365-367) (r2) — programado: 2026-09-17 — [ ] pendiente
Arranque: ejercicios/repasos/lib15-r2.md (lo crea `/repaso`)
r1 BIEN. Flojo: dijo "while" donde va un `if`. Que nombre la estructura y ponga el chequeo ANTES del `numOfHits++`. ToDo/recorrer-una-coleccion.md (punto 7).

REPASO — LIBRO "BE the JVM" (pág. 378-380) (r2) — programado: 2026-09-18 — [ ] pendiente
Arranque: ejercicios/repasos/lib16-r2.md (lo crea `/repaso`)
r1 BIEN sin pistas. Que nombre `value > 14` como corte (no `i > 14`) y ENTREGUE la traza vuelta por vuelta, no prosa. ToDo/un-bucle-que-termina.md (2), ToDo/entregar-un-ejercicio.md (Nivel 1).

REPASO — EJERCICIO #14 Termometro "¿dónde vive cada cosa?" (r2) — programado: 2026-09-19 — [ ] pendiente
Arranque: ejercicios/repasos/ej14-r2/ (lo crea `/repaso`)
r1 BIEN en el corazón. Arrastra: variable sin `private`, y NOMBRES DE MÉTODO (tres veces eligió un prefijo en vez de un verbo puro). Que la PARTE 4 llegue contestada: se salteó las dos veces. ToDo/crear-una-clase-java.md (Nivel 3).

REPASO — LIBRO "ArrayList vs. arreglo común" (pág. 407) (r2) — programado: 2026-09-22 — [ ] pendiente
Arranque: ejercicios/repasos/lib19-r2.md (lo crea `/repaso`)
r1 bis BIEN. Mirar que la bandera `boolean` arranque en `false` antes del bucle, que salga con `break`, y `b.equals(x)` y no al revés. ToDo/recorrer-una-coleccion.md (punto 8)

REPASO — EJERCICIO #06 Code Magnets: DrumKit (pág. 186) (r2) — programado: 2026-09-23 — [ ] pendiente
Arranque: ejercicios/repasos/ej06-r2/ (DrumKit.java y DrumKitTestDrive.java) (lo crea `/repaso`)
r1 PERFECTO a la primera, con un orden DISTINTO al original (razonó, no recordó). Mirar que sepa POR QUÉ el `if` es código muerto forzado: con el `d.playSnare()` suelto en juego, si el `if` disparara saldrían DOS "bang".

REPASO — EJERCICIO #05 Robot (Sesión #25) (r2) — programado: 2026-09-23 — [ ] pendiente
Arranque: ejercicios/repasos/ej05-r2/ (Robot.java y RobotTestDrive.java) (lo crea `/repaso`)
r1 mejor que el original (el setter ya valida y usa `this`). Mirar que la validación no falle EN SILENCIO (el `if` sin `else`). ToDo/crear-una-clase-java.md (Nivel 3).

REPASO — EJERCICIO #08 BE the Compiler: arrays (pág. 245-246) (r2) — programado: 2026-09-24 — [ ] pendiente
Arranque: ejercicios/repasos/ej08-r2/ (dos archivos) (lo crea `/repaso`)
r1 BIEN: los dos programas corregidos y salida exacta. Arrastra "no se ejecuta" (arranca y revienta: B imprime DOS líneas antes), no nombró NullPointerException en A, dijo "lista" por arreglo y volvió a hardcodear el 3 en vez de `.length`. ToDo/entregar-un-ejercicio.md (Nivel 3).

REPASO — LIBRO Sharpen your pencil (pág. 80-81) (r3) — programado: 2026-09-25 — [ ] pendiente
Arranque: ejercicios/repasos/sharpen-your-pencil-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Falló las TRES veces: que en `"Dog: " + name` diga CONCATENACIÓN y que el `+` pega texto, no suma.

REPASO — LIBRO Mixed Messages (pág. 127-129) (r3) — programado: 2026-09-26 — [ ] pendiente
Arranque: ejercicios/repasos/lib02-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. 5/5 las tres veces. Que TRACE el bucle: `y` llega a 10 (3 dígitos) y `x` sube DOS veces por vuelta (3 vueltas, no 5).

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r3) — programado: 2026-10-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib05-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Mirar la SALIDA del archivo B: puso la del método que NO se llama. Que lea el println DESDE ADENTRO del método que se ejecuta. ToDo/entregar-un-ejercicio.md (Nivel 2).

REPASO — LIBRO Sharpen your pencil: "Television" (pág. 162-163) (r3) — programado: 2026-10-09 — [ ] pendiente
Arranque: ejercicios/repasos/lib03-television-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Errores NUEVOS a mirar: `static` en instance variables, y el nombre EXACTO de la variable adentro del método (MARCA≠marca). ToDo/crear-una-clase-java.md


# ============================================================
# CONCEPTOS DOMINADOS (entran al graduarse un ejercicio con r3 bien)
# ============================================================

- Compile-time vs. runtime: un programa bien anidado COMPILA aunque tenga un bucle infinito; eso es un problema de EJECUCIÓN.
- Toda instrucción ejecutable (`while`, `if`...) vive DENTRO de un método (con cualquier nombre), nunca suelta en la clase.
