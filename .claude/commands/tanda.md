---
description: Explica la tanda de páginas que dejé en paginas/ (repetible, una vez por tanda)
argument-hint: [opcional: qué hay en la tanda, ej "páginas 446-453 en texto" o "4 pantallazos"]
---

Tanda nueva. $ARGUMENTS

El material está en `paginas/` (si vino como texto, en los `.md`; si
vino como pantallazos, en la raíz de la carpeta). No entres a
`paginas/leidas/`: eso ya está explicado.

Aplicá el **flujo por tanda** completo de CLAUDE.md (no lo leas con
Read: ya lo tenés cargado), respetando el presupuesto de contexto:

1. Leé el material de la tanda en orden de página.
2. Explicámelo PÁGINA POR PÁGINA, anunciando siempre cuál ("PÁGINA
   446:", "PANTALLAZO 2:") para que pueda seguir el libro con la
   vista. En español, con palabras propias, COMPRIMIENDO — no
   transcribiendo. Toda frase en inglés va con su traducción AL LADO.
   Si aparece sintaxis o una base que no vimos, frená y explicala
   primero.
3. Mostrame el código clave en el chat, comentado solo en las líneas
   que enseñan algo nuevo.
4. Si la tanda trae ejercicios del libro, avisame cuáles son y creales
   su archivo de arranque (código → `ejercicios/ejNN-nombre/`;
   papel → `ejercicios/libNN-nombre.md`), con el `/entrega` relleno al
   final y sin nada de la solución.
5. Verificá que entendí con 1-2 preguntas cortas antes de cerrar.

Cuando termines de explicar, en el mismo turno:
- mové las páginas de la tanda a `paginas/leidas/`;
- actualizá `GUIA-JAVA.md`: la sesión en FORMATO CORTO (5-8 bullets,
  máx ~15 líneas), el vocabulario nuevo y el INICIO RÁPIDO, incluida
  la línea **PRÓXIMA SESIÓN**;
- agregá 1-2 frases nuevas a `MECANOGRAFIA.md` y volcá cada frase
  NUEVA a su propio archivo de ttyper (append-only);
- agregá las tarjetas 80/20 de esta tanda a `ANKI.txt`
  (autocontenidas, separadas por tab);
- revisá si hace falta crear o actualizar un checklist de `ToDo/`;
- guardá en Engram los conceptos clave y la última página vista.

Cerrá con el bloque `▶ SIGUE`. Si la tanda fue de PANTALLAZOS, el
próximo paso es cambiar de sesión (`/cambio`): decilo y explicá por
qué en una línea.
