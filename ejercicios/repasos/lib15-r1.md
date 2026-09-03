# REPASO r1 — LIBRO "Yours to solve": el bug de SimpleStartupGame — pág. 365-367, Sesión #67

Repaso DESDE CERO: no mires tu respuesta original ni la corrección de
aquella vez. Resolvelo como si fuera la primera.

## Contexto (qué es esto)

El libro corrió el juego dos veces. La primera, entrando 1,2,3,4,5,6, se
comportó como se espera: miss, miss, miss, hit, hit, kill ("You took 6
guesses"). La segunda, entrando el MISMO número tres veces seguidas
(1,1,1), dio hit, hit, kill ("You took 3 guesses") — algo no cierra.

## Enunciado (traducido)

"Es un cliffhanger (final en suspenso): ¿vamos a encontrar el bug?
¿vamos a arreglarlo? Quedate atento al próximo capítulo, donde
contestamos estas preguntas y más... Y mientras tanto, pensá qué salió
mal y cómo arreglarlo. A vos te toca resolverlo."

## MI RESPUESTA
No tengo a la mano el código para ver que es lo que está fallando.
Pero podría darte una hipotesis, el problema es que no estamos guardando los intentos que el usuario está ingresando
entonces cuando repite un valor correcto, va a volver a contar como correcto.
Una solución es crear un array con las posiciones en las que el usuario ha ingresado,
Esas posiciones deben estar dentro de un while para ir indicando que se está repitiendo la posición.
mientras no ponga una opción valida va salir ese mensaje.
O podemos usar un ArrayList que lo soluciona de una manera más fácil.

(escribí acá tu hipótesis: qué parte del código de `SimpleStartup`
o `SimpleStartupGame` creés que puede estar fallando para que ingresar
el mismo número tres veces dé hit-hit-kill en vez de comportarse según
dónde está realmente ubicada la Startup)

## Pistas si te trabás

Repasá el código de `checkYourself()` y de `main()` que ya viste en las
Sesiones #61 a #66 de la guía: ¿qué pasa con `locationCells` entre una
llamada y la siguiente? ¿Se genera una sola vez o podría estar
regenerándose en algún momento raro?

Si te trabás: revisá la Sesión #67 de la guía.
Checklist: ToDo/recorrer-una-coleccion.md

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el REPASO r1 del ejercicio del libro "Yours to solve" sobre el bug
de SimpleStartupGame (página 365-367). Mi respuesta está en
ejercicios/repasos/lib15-r1.md.
Corregilo EN EL CHAT comparando contra mi versión original (está en
EJERCICIOS-ARCHIVO.md): qué mejoré, qué error repetí y por qué. No me
des la solución completa de entrada: primero pistas.
Después actualizá REPASOS en EJERCICIOS.md según el resultado.
