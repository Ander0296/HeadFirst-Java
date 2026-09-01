# REPASO r1 — LIBRO: prep code para SimpleStartupGame — pág. 353-354, Sesión #64

Repaso desde cero. NO mires tu versión original ni la solución del libro.

## Contexto (qué es esto)

Ya existen `SimpleStartupTestDrive` (la clase de test) y `SimpleStartup`
(la clase con el método `checkYourself()`). Falta la clase que arma la
partida real e interactúa con el usuario: `SimpleStartupGame`.

Antes de escribirla en Java, el libro te pide el **prep code**: el plan
en pseudocódigo (palabras en mayúscula tipo DECLARAR / CALCULAR /
MIENTRAS / SI / PEDIR), no sintaxis real de Java todavía.

## La clase SimpleStartup (esto el libro te lo da en la página de enfrente)

No hay que recordarla de memoria: es el dato de partida del ejercicio.
Tu prep code va a usar estos dos métodos.

```
SimpleStartup
-------------------------------
int[] locationCells    // las 3 celdas donde está el Startup
int numOfHits          // cuántos aciertos lleva recibidos
-------------------------------
void   setLocationCells(int[] locs)   // setter: le asigna las celdas
String checkYourself(int guess)       // recibe UN intento y devuelve
                                      // "hit", "miss" o "kill"
```

`checkYourself(int)` devuelve `"kill"` recién cuando el intento fue el
tercer acierto. Mientras devuelva `"hit"` o `"miss"`, el Startup sigue vivo.

## Enunciado (traducido)

"Construimos la clase de test y la clase SimpleStartup. Pero todavía no
hicimos el juego (game) en sí. Dado el código de la página opuesta y la
especificación de la clase real, escribí tus ideas de prep code para la
clase del juego. Te dimos algunas líneas para arrancar. NO mires la
página siguiente hasta hacer este ejercicio.

Tenés que tener entre 12 y 18 líneas (sin contar las líneas que solo
tienen una llave)."

Puntos de partida que da el libro:

- MÉTODO `public static void main(String[] args)`
- DECLARAR una variable `int` para contar los intentos del usuario, llamada `numOfGuesses`
- CALCULAR un número al azar entre 0 y 4 — la posición donde arranca el `SimpleStartup` (el array de ubicaciones son 3 celdas consecutivas)
- MIENTRAS el Startup siga vivo:
- PEDIR input del usuario por la línea de comandos

Lo que `SimpleStartupGame` tiene que hacer (la lista completa):

1. Crear el único objeto `SimpleStartup`.
2. Darle una ubicación (tres celdas consecutivas en una fila de siete
   celdas virtuales).
3. Pedirle un intento al usuario.
4. Revisar el intento.
5. Repetir hasta que el Startup se hunda (se hundió = los 3 hits).
6. Avisarle al usuario cuántos intentos le llevó.

Cómo se ve una partida completa ya terminada (el resultado esperado, NO
la solución en código):

```
% java SimpleStartupGame
enter a number 2    (ingresá un número: 2)
hit                 (le diste)
enter a number 3    (ingresá un número: 3)
hit                 (le diste)
enter a number 4    (ingresá un número: 4)
miss                (fallaste)
enter a number 1    (ingresá un número: 1)
kill                (lo hundiste)
You took 4 guesses  (te llevó 4 intentos)
```

## MI RESPUESTA

- MÉTODO `public static void main(String[] args)`
- DECLARAR una variable `int` para contar los intentos del usuario, llamada `numOfGuesses`
- CALCULAR un número al azar entre 0 y 4 — la posición donde arranca el `SimpleStartup` (el array de ubicaciones son 3 celdas consecutivas)
- MIENTRAS el Startup siga vivo:
- PEDIR input del usuario por la línea de comandos


## Pistas si te trabás

Repasá el prep code de `checkYourself()` (Sesión #61 y #63 de
GUIA-JAVA.md): mismo estilo de palabras en mayúscula. Pensá en un bucle
MIENTRAS que sigue mientras el Startup no esté "kill" — cada vuelta pide
un intento, lo revisa y suma 1 a `numOfGuesses`.

Si te trabás con el enunciado del juego completo: revisá la Sesión #64
de GUIA-JAVA.md.

Checklist: ToDo/entregar-un-ejercicio.md

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

/entrega Hice el repaso r1 de "prep code para SimpleStartupGame" (pág. 353-354),
mi respuesta está en ejercicios/repasos/lib14-r1.md.
Comparalo con mi intento anterior (sin mostrármelo antes si no lo
recuerdo) y decime qué mejoré, qué error repetí y por qué.
Después actualizá REPASOS en EJERCICIOS.md según el resultado.
