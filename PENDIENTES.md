# PENDIENTES — la deuda del proyecto

**Este archivo NO se lee al inicio de sesión.** Lo lee `/pendientes`, una vez
por semana. Acá vive lo que quedó colgando y NO es un ejercicio (los
ejercicios viven en `EJERCICIOS.md`).

## La regla que hace que esto sirva

**Un número de página suelto no es accionable.** "Falta la 213" no se puede
triagear nunca: nadie sabe si eso era una figura decorativa, medio capítulo o
un chiste. Toda entrada de este archivo dice **QUÉ** falta, no solo dónde.

Cuando una página no llega en una tanda, Claude la clasifica **en el momento**,
en una de estas tres, y lo dice en una línea:

| Clase | Qué es | Qué se hace |
| --- | --- | --- |
| **Hueco de formato** | Kindle web no la dejó copiar (figura, viñeta, código como imagen) y el concepto NO quedó cubierto por las páginas vecinas | entra acá; Claude pide ESE pantallazo puntual en la próxima tanda |
| **Diferido a propósito** | contenido que se saltea con criterio (una solución que sería spoiler, un Ready-Bake) | entra acá, con la condición de rescate |
| **Cubierto igual** | la página repetía o el concepto ya quedó explicado con las vecinas | **NO entra**: se descarta y se dice en una línea |

La tercera es la más importante. La mayoría de las páginas "salteadas" de este
libro son huecos de formato de Kindle web, no contenido faltante — meterlas
todas en una lista las convierte en una deuda falsa que se relee para siempre
y no se salda nunca.

# ============================================================
# HUECOS DE FORMATO — falta el contenido, hay que recuperarlo
# ============================================================

- **Páginas 447-448** (anotado el 2026-09-03, Sesión #82): no vinieron en la
  tanda. La 446 es la página de resumen (bullet points) que cierra el
  capítulo y la 449-451 es el repaso de `import`, así que en el medio muy
  probablemente esté el EJERCICIO de fin de capítulo (Exercise, Code Magnets
  o crucigrama). Rescate: pedir ESOS dos pantallazos puntuales en la próxima
  tanda; si resultan ser relleno, se dan de baja en el acto.

- **Páginas 479-480** (anotado el 2026-09-10, Sesión #87): no vinieron en la
  tanda. La 478 arranca "An inheritance example:" (Un ejemplo de herencia) con
  el chiste del doctor, y la 481 ya muestra el CÓDIGO de `Doctor`,
  `FamilyDoctor` y `Surgeon`. En el medio falta la presentación de ese ejemplo:
  casi seguro el DIAGRAMA del árbol Doctor → FamilyDoctor/Surgeon y el texto
  que explica qué sobrescribe cada uno. PARCIALMENTE SALDADO el 2026-09-10
  (Sesión #88): el diagrama del árbol Doctor llegó en la pág. 482. Queda solo
  el texto de presentación del ejemplo. Rescate: si no aparece solo, dar de baja.

- **Página 483** (anotado el 2026-09-10, Sesión #88): no vino en la tanda. La
  482 arranca el diseño del simulador de animales (paso 1: buscar lo común) y
  la 484 ya muestra la foto de los seis animales con las 5 variables y los 4
  métodos comunes. En el medio falta, casi seguro, la lista de los seis tipos
  escrita y/o el resto del paso 1. Rescate: pedir ESE pantallazo en la próxima
  tanda; si resulta ser solo la foto, se da de baja.

**SALDADO 2026-09-10** — la página 476 (Brain Power del capítulo 7) llegó con
texto en la Sesión #87 y quedó explicada: era la pregunta del gato doméstico
vs. el tigre.

# ============================================================
# DIFERIDO A PROPÓSITO
# ============================================================

- **Ready-Bake Code de `GameHelper`**: faltan sus 5 métodos privados.
  Sin ellos `StartupBust` no compila. Rescate: pedir esas páginas como
  pantallazo cuando toque hacer correr el juego completo.

# ============================================================
# BACKLOG VIEJO — VACÍO (saldado el 2026-09-08)
# ============================================================

Ya no hay páginas sin clasificar. Las 41 que quedaban se dieron de baja en
el triage del 2026-09-08: ver DADAS DE BAJA.

De acá en más, toda página que no llegue en una tanda se clasifica EN EL
MOMENTO con la tabla de arriba. Si esta sección vuelve a llenarse de
números pelados, el sistema se rompió.

# ============================================================
# DADAS DE BAJA (decisión tomada, no vuelven)
# ============================================================

## Backlog viejo COMPLETO — baja el 2026-09-08 (41 páginas)

Motivo (explicado por el usuario en el triage): **la versión web de Kindle
saltea números de página**. Esas páginas no son contenido que se haya
salteado: en muchos casos ni siquiera existen como página mostrada. Anotar
el número sin saber qué había adentro generaba deuda falsa — imposible de
triagear y que se releía para siempre.

Páginas dadas de baja: 177 (la nota decía "código de la clase Player", pero
después se escribió el juego completo a mano), 201, 209, 213, 215-217, 226,
233, 237-238, 241, 253, 256, 261, 268-269, 271, 285, 287, 300, 306, 310,
326, 328, 332, 334, 336, 342, 344, 347, 355, 364, 366, 385, 399, 404, 406,
409, 411 y 421.

Rescate: si al releer el libro aparece que faltaba un concepto real en
alguna, se pide ESE pantallazo puntual y se anota como hueco de formato con
su QUÉ. Nunca se reabre la lista de números.

## Páginas del backlog viejo — baja el 2026-09-03

- **428, 431, 434-435**: tramos intermedios ya cubiertos por las páginas
  vecinas explicadas (el triage del 2026-08-25 ya las había marcado como
  cubiertas; acá se aplica la decisión).
- **440 y 444**: tramos intermedios del mismo bloque, dados de baja junto
  con los anteriores. Si al releer el libro aparece que faltaba un
  concepto real ahí, se rescata pidiendo ESE pantallazo puntual.

## Ejercicios — baja el 2026-09-03 (triage: llevaban 27 a 40 días abiertos)

- **LIBRO lib07 "Sharpen your pencil: ¿legal o no?" (pág. 210)** — abierto
  40 días. Mismo músculo que lib10 "What's legal?", ya completado y con
  repaso vivo: asignaciones entre primitivas y casts. Repetirlo no agrega
  un concepto nuevo.
- **LIBRO lib12 "Five-Minute Mystery" (Jai/Buchanan, pág. 315-316)** —
  abierto 35 días. Lectura pura, sin código para compilar. lib09, del mismo
  formato, ya está completado y con repaso vivo.
- **LIBRO lib17 Crucigrama "JavaCross" (pág. 383-384)** — abierto 27 días.
  32 pistas de vocabulario; ese trabajo ya lo hacen ANKI.txt (con
  repetición espaciada real) y la tabla de vocabulario de la guía. Costo
  alto, valor bajo.
- **LIBRO lib18 "Mixed Messages" #3 (pág. 386-387)** — abierto 27 días.
  Marcado OPCIONAL por el libro, y lib11 (mismo formato: matchear
  candidatos contra la salida de un bucle) ya está hecho y con repaso vivo.

Los archivos de arranque de estos cuatro siguen en ejercicios/ por si
alguna vez se quieren retomar: la baja saca el ejercicio de la lista viva,
no borra el enunciado.
