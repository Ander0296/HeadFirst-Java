# LIBRO — "Yours to solve": el bug de SimpleStartupGame — pág. 365-367, Sesión #67

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

Ojo: el libro TODAVÍA no reveló la solución (la promete recién en el
próximo capítulo) — así que ni Claude la sabe todavía. No hay spoiler
escondido acá: es una hipótesis real, no una adivinanza con respuesta
ya vista.

## MI RESPUESTA

(escribí acá tu hipótesis: qué parte del código de `SimpleStartup`
o `SimpleStartupGame` creés que puede estar fallando para que ingresar
el mismo número tres veces dé hit-hit-kill en vez de comportarse según
dónde está realmente ubicada la Startup)

## Pistas si te trabás

Repasá el código de `checkYourself()` y de `main()` que ya viste en las
Sesiones #61 a #66 de la guía: ¿qué pasa con `locationCells` entre una
llamada y la siguiente? ¿Se genera una sola vez o podría estar
regenerándose en algún momento raro?

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "Yours to solve" sobre el bug de
SimpleStartupGame (página 365-367).
Mi respuesta está en ejercicios/lib15-bug-simplestartupgame.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
