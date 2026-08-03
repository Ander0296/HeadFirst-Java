# LIBRO — Sharpen your pencil: prep code para SimpleStartupGame — pág. 353-354, Sesión #64

## Contexto (qué es esto)

Ya armaron `SimpleStartupTestDrive` (clase de test) y `SimpleStartup` (la
clase con `checkYourself()`, Sesión #63). Pero todavía falta la clase
que arma la partida real e interactúa con el usuario: `SimpleStartupGame`.
Antes de mostrártela, el libro te pide escribir el **prep code** (el plan
en pseudocódigo, no Java real todavía) para esa clase.

## Enunciado (traducido)

"Construimos la clase de test y la clase SimpleStartup. Pero todavía no
hicimos el juego (game) en sí. Dado el código de la página opuesta y la
especificación de la clase real, escribí tus ideas de prep code para la
clase del juego. Te dimos algunas líneas para arrancar. NO mires la
página siguiente hasta hacer este ejercicio.

Tenés que tener entre 12 y 18 líneas (sin contar las líneas que solo
tienen una llave)."

Puntos de partida que da el libro (ya en el formato prep code: palabras
en mayúscula tipo GET/DECLARE/COMPUTE/WHILE, sin sintaxis real de Java):

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

(escribí acá tu prep code: pseudocódigo con GET/DECLARE/COMPUTE/WHILE/IF/
REPEAT, siguiendo el estilo de la Sesión #61 y #63 — no hace falta que
sea Java compilable, es el PLAN de la lógica antes de escribir código real)

- MÉTODO `public static void main(String[] args)`
- DECLARAR una variable de tipo SimpleStartup y crear el objeto en dot
- DECLARAR una variable `int` para contar los intentos del usuario, llamada `numOfGuesses`
- DECLARAR una variable int de tipo Array llamada locs
- DECLARAR una variable String result para guardar el resultado de checkYourself
- CALCULAR un número al azar entre 0 y 4 — la posición donde arranca el `SimpleStartup` (el array de ubicaciones son 3 celdas consecutivas)
- GUARDAR en la posición 0 del array dot el numero al azar
- LLAMAR el método setLocationCells para guardar la respuesta y pasarla como parámetro
- PARA el numero que se genera al azar iniciamos i en 1 MIENTRAS i sea = 3 porque 0 es el numero al azar
  - DECLARAR variable int y será igual a posiciones = numero al azar + 1
  - GUARDAR  en la posicion dot[i] la variable posiciones
- MIENTRAS el Startup siga vivo:
  - PEDIR input del usuario por la línea de comandos
  - LLAMAR el método checkYourself para evaluar si el número ingresado es correcto
  - INCREMENTAR numOfGuesses en 1
  - SI result tiene el mismo contenido en hit.
      - PARAR el branching con break,
  - SI NO parar el mientras con un break
- ESCRIBIR que ha ganado y mostrar los intentos



## Pistas si te trabás

Repasá el prep code de `checkYourself()` (Sesión #61 y #63 de la guía):
mismo estilo de palabras en mayúscula. Pensá en un bucle `WHILE` que seguí
mientras el Startup no esté "kill" — cada vuelta pide un intento, lo
revisa y suma 1 a `numOfGuesses`.

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "prep code para SimpleStartupGame" (página 353-354).
Mi respuesta está en ejercicios/lib14-prep-code-simplestartupgame.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
