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

LIBRO — Sharpen your pencil: "Abstract versus Concrete classes" (pág. 557-560, Sesión #103) — [ ] pendiente
Arranque: ejercicios/lib28-sharpen-abstracta-o-concreta.md | Si te trabás: Sesiones #102 y #103 de la guía
OJO: el arranque dice "15 huecos" por error; son 21.


# ============================================================
# REPASOS PROGRAMADOS (ordenados por fecha: el de arriba es el que toca)
# ============================================================

Nota: corrección completa en EJERCICIOS-ARCHIVO.md; acá solo el "punto a mirar". Criterio (2026-08-25):
por RIESGO (los que ya fallaron primero), uno por día; el arranque lo crea `/repaso` en el momento.

REPASO — LIBRO "What's legal?" (pág. 305-306) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/lib10-r1.md (lo crea `/repaso`)
Mirar `byte h = calcArea(4, 20)`: la llamada es legal; lo ilegal es el int de retorno sin cast entrando en un byte.

REPASO — EJERCICIO #11 BE the Compiler: XCopy/Clock (pág. 307) (r1) — programado: 2026-08-03 — [ ] pendiente
Arranque: ejercicios/repasos/ej11-r1/ (lo crea `/repaso`)
Mirar: leer el valor exacto que pasa setTime() antes de anotar el output.

REPASO — EJERCICIO #15 "Agenda de contactos" (r1) — programado: 2026-09-06 — [ ] pendiente
Arranque: ejercicios/repasos/ej15-r1/ (lo crea `/repaso`)
Original BIEN. Mirar: imprimir `i` (no `indexOf(get(i))`), sin `== true` sobre un boolean, y un println con concatenación. ToDo/recorrer-una-coleccion.md

REPASO — LIBRO Sharpen your pencil: "Movie objects" (pág. 170-173) (r2) — programado: 2026-09-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib04-r2.md (lo crea `/repaso`)
r1 PERFECTO. Mirar que `two.playIt()` no cambia ningún valor y que cada objeto conserva los suyos.

REPASO — EJERCICIO #13 Code Magnets: "MultiFor" (pág. 380-382) (r1) — programado: 2026-09-11 — [ ] pendiente
Arranque: ejercicios/repasos/ej13-r1/MultiFor.java (lo crea `/repaso`)
Original PERFECTO a la primera. Mirar que el `if (i == 1) { i++; }` quede DESPUÉS del for interno (antes imprimiría `2 4`) y que sepa por qué el 2 nunca es cabeza de vuelta.

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

REPASO — LIBRO Sharpen your pencil: ¿qué relaciones tienen sentido? (pág. 505) (r1) — programado: 2026-09-22 — [ ] pendiente
Arranque: ejercicios/repasos/lib25-r1.md (lo crea `/repaso`)
Original: 11/11 en SÍ/NO, pero sin escribir las invertidas hasta que se le pidió. Mirar que clasifique cada NO en los tres tipos (invertido / TIENE-UN / sin arreglo) y ESCRIBA la línea corregida. ToDo/entregar-un-ejercicio.md (Nivel 1, condicionales).

REPASO — LIBRO "ArrayList vs. arreglo común" (pág. 407) (r2) — programado: 2026-09-22 — [ ] pendiente
Arranque: ejercicios/repasos/lib19-r2.md (lo crea `/repaso`)
r1 bis BIEN. Mirar que la bandera `boolean` arranque en `false` antes del bucle, que salga con `break`, y `b.equals(x)` y no al revés. ToDo/recorrer-una-coleccion.md (punto 8)

REPASO — EJERCICIO #06 Code Magnets: DrumKit (pág. 186) (r2) — programado: 2026-09-23 — [ ] pendiente
Arranque: ejercicios/repasos/ej06-r2/ (DrumKit.java y DrumKitTestDrive.java) (lo crea `/repaso`)
r1 PERFECTO a la primera, con un orden DISTINTO al original (razonó, no recordó). Mirar que sepa POR QUÉ el `if` es código muerto forzado: con el `d.playSnare()` suelto en juego, si el `if` disparara saldrían DOS "bang".

REPASO — EJERCICIO #05 Robot (Sesión #25) (r2) — programado: 2026-09-23 — [ ] pendiente
Arranque: ejercicios/repasos/ej05-r2/ (Robot.java y RobotTestDrive.java) (lo crea `/repaso`)
r1 mejor que el original (el setter ya valida y usa `this`). Mirar que la validación no falle EN SILENCIO (el `if` sin `else`). ToDo/crear-una-clase-java.md (Nivel 3).

REPASO — LIBRO Mixed Messages (pág. 127-129) (r3) — programado: 2026-09-26 — [ ] pendiente
Arranque: ejercicios/repasos/lib02-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. 5/5 las tres veces. Que TRACE el bucle: `y` llega a 10 (3 dígitos) y `x` sube DOS veces por vuelta (3 vueltas, no 5).

REPASO — EJERCICIO #09 Code Magnets: TestArrays (pág. 247-249) (r2) — programado: 2026-10-01 — [ ] pendiente
Arranque: ejercicios/repasos/ej09-r2/TestArrays.java (lo crea `/repaso`)
r1 MEJOR que el original: corrigió solo el único error (las 4 asignaciones de `index[]` ya salieron del `while`). Mirar que siga separando preparación de bucle y que no invierta `islands[index[y]]`.

REPASO — LIBRO Five-Minute Mystery: "The case of the pilfered references" (pág. 253-255) (r2) — programado: 2026-10-03 — [ ] pendiente
Arranque: ejercicios/repasos/lib09-r2.md (lo crea `/repaso`)
r1 BIEN: conteos de Bob exactos (11 objetos, 11 referencias) y cerró "queda UN solo Contact accesible". Mirar que en Kate diga TAMBIÉN cuántas referencias hay (1) y que nombre "elegibles para el garbage collector". ToDo/entregar-un-ejercicio.md (Nivel 1).

REPASO — EJERCICIO #18 Pool Puzzle: los botes (pág. 536-537) (r1) — programado: 2026-10-04 — [ ] pendiente
Arranque: ejercicios/repasos/ej18-r1/TestBoats.java (lo crea `/repaso`, CON diccionario de la piscina)
Salió con muchas pistas y trabado por el inglés. Mirar que sin ayuda diga por qué `b3.move()` imprime "drift" (Rowboat no tiene move(): hereda el de Boat) y que deje UN solo `public class` por archivo.

REPASO — CONCEPTO "String vs. int: Integer.parseInt" (r1) — programado: 2026-10-04 — [ ] pendiente
Arranque: ejercicios/repasos/concepto-parseint-r1/ (lo crea `/repaso`; salió de DOMINADOS en el examen del 01/10)
Examen: sabía que hay que convertir, pero escribió `parseInt(cantidad) + 2` sin `Integer.` (no compila) y sin la línea completa; dijo "82" sin decir que es String. Mirar las tres cosas. ToDo/entregar-un-ejercicio.md (Nivel 3).

REPASO — CONCEPTO "== vs. equals() (y el String pool)" (r1) — programado: 2026-10-05 — [ ] pendiente
Arranque: ejercicios/repasos/concepto-equals-r1/ (lo crea `/repaso`; lo pidió el usuario por confusión, Sesión #104)
Chequeo del 02/10: veredictos bien, pero dijo "equals compara el contenido" para Dog (sin sobrescribir = mismo objeto, como ==) y "toString sale de Animal" (sale de Object, heredado a través de Animal). Mirar: que diga QUIÉN escribió el método y si la clase lo sobrescribió.

REPASO — CONCEPTO "el compilador mira la referencia, la JVM mira el objeto" (r2) — programado: 2026-10-06 — [ ] pendiente
Arranque: ejercicios/repasos/concepto-compilador-vs-jvm-r2.md (lo crea `/repaso`; INCLUIR asignaciones con Object, adelantado desde el 12/10)
r1 bis BIEN (28/09). Sesión #106: invirtió la frase ES-UN dos veces (`Cat c = metodoQueDevuelveObject();` "compila"; `Object o = c;` "no compila"). Mirar: que escriba "<derecha> ES UN <izquierda>" en cada asignación, que conteste LÍNEA POR LÍNEA y lea el `new` de ESA variable. ToDo/entregar-un-ejercicio.md (Nivel 3).

REPASO — CONCEPTO "qué método corre cuando hay sobrescritura" (r2) — programado: 2026-10-07 — [ ] pendiente
Arranque: ejercicios/repasos/concepto-sobrescritura-r2.md (lo crea `/repaso`)
r1 BIEN (5/5): leyó el método ENTERO y escribió la salida en orden — las dos caídas de los exámenes del 17/09 y 20/09 quedaron resueltas. Mirar que sostenga el orden cuando la cadena de llamadas tenga TRES niveles, y que no arrastre líneas de la versión del padre que la subclase no tiene.

REPASO — LIBRO BE the Compiler, parte 2 (pág. 183-184) (r3) — programado: 2026-10-08 — [ ] pendiente
Arranque: ejercicios/repasos/lib05-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Mirar la SALIDA del archivo B: puso la del método que NO se llama. Que lea el println DESDE ADENTRO del método que se ejecuta. ToDo/entregar-un-ejercicio.md (Nivel 2).

REPASO — LIBRO Sharpen your pencil: "Television" (pág. 162-163) (r3) — programado: 2026-10-09 — [ ] pendiente
Arranque: ejercicios/repasos/lib03-television-r3.md (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. Errores NUEVOS a mirar: `static` en instance variables, y el nombre EXACTO de la variable adentro del método (MARCA≠marca). ToDo/crear-una-clase-java.md

REPASO — LIBRO Sharpen your pencil: contar el árbol Doctor (pág. 482) (r2) — programado: 2026-10-12 — [ ] pendiente
Arranque: ejercicios/repasos/lib23-r2.md (lo crea `/repaso`)
r1 bis BIEN 8/8 (separó variables de métodos, dijo "sobrescrito"). Mirar que escriba el NÚMERO total en cada conteo (no solo "ninguna propia + una heredada") y que en P8 diga que FamilyDoctor es HERMANO de Surgeon: la herencia baja, no va de costado.

REPASO — LIBRO Mixed Messages: "Mixed2" (pág. 531-533) (r2) — programado: 2026-10-16 — [ ] pendiente
Arranque: ejercicios/repasos/lib26-r2.md (lo crea `/repaso`)
r1 BIEN 4/4 sin pistas, con el porqué de las 12 llamadas. Mirar que en a2 nombre el `new C()` (el objeto) antes de subir la cadena, y que no diga "ivar es 13": ivar vale 7, lo que imprime es ivar + 6. ToDo/entregar-un-ejercicio.md (Nivel 2).

REPASO — LIBRO BE the Compiler: Monster/Vampire (pág. 533-535) (r2) — programado: 2026-10-17 — [ ] pendiente
Arranque: ejercicios/repasos/lib27-r2.md (lo crea `/repaso`)
r1 BIEN 4/4 con porqué en los 4 pares. Mirar: que LLENE la línea final (en blanco 2 veces), que nombre "tipo de RETORNO" en el par 2 y que no diga que un byte llamaría al de Vampire (con referencia Monster, el compilador solo ve frighten(int)). ToDo/entregar-un-ejercicio.md (Nivel 4).

REPASO — EJERCICIO #08 BE the Compiler: arrays (pág. 245-246) (r3) — programado: 2026-10-29 — [ ] pendiente
Arranque: ejercicios/repasos/ej08-r3/ (dos archivos) (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. r2 BIEN (29/09): nombró las DOS excepciones, "arranca y revienta", "arreglo" siempre. Arrastra (3ª vez): no escribió las 2 líneas que B imprime antes de reventar, y `z < 3` en vez de `h.length`. ToDo/entregar-un-ejercicio.md (Nivel 3) · ToDo/recorrer-una-coleccion.md (2).

REPASO — EJERCICIO #14 Termometro "¿dónde vive cada cosa?" (r3) — programado: 2026-10-30 — [ ] pendiente
Arranque: ejercicios/repasos/ej14-r3/ (lo crea `/repaso`)
ÚLTIMO DEL CICLO: si sale bien, GRADÚA. r2 BIEN (30/09): `private` resuelto. Mirar: que el método de frío/calor IMPRIMA (no devuelva), `get` en los que devuelven, y que el TestDrive pruebe LAS DOS ramas del if. ToDo/crear-una-clase-java.md (Niveles 3 y 6).


# ============================================================
# CONCEPTOS DOMINADOS (entran al graduarse un ejercicio con r3 bien)
# ============================================================

- Compile-time vs. runtime: un programa bien anidado COMPILA aunque tenga un bucle infinito; eso es un problema de EJECUCIÓN.
- Toda instrucción ejecutable (`while`, `if`...) vive DENTRO de un método (con cualquier nombre), nunca suelta en la clase.
- `main` es un MÉTODO (`public static void main(String[] args)`), no una clase: la JVM lo busca dentro de la clase que se nombra en `java NombreClase`. Cualquier cantidad de clases puede tenerlo; los demás `main` se ignoran.
- Una clase sin `main` compila igual: `main` no lo exige el compilador, solo hace falta para ARRANCAR. Sin él da error al EJECUTAR (`Main method not found in class X`); `Could not find or load main class X` es otra cosa (carpeta o nombre equivocados).
- `+` entre un String y otra cosa CONCATENA (une texto): `"Dog: " + name` → `Dog: Fido`. `{2, 4, 6, 8}` con `int[]` es un ARREGLO, no una lista.
- Antes de decir qué hace un `if`/`while`, EVALUAR la condición con el valor real (x = 22 → `22 < 15` es falso); un `while` cuya variable nunca cambia es un bucle infinito.
