# RUTA — el plan completo: del libro al primer empleo

Este archivo define las FASES del proyecto. La fase actual siempre está
marcada con (⬅ FASE ACTUAL). Claude lo lee para saber hacia dónde va
todo y puede "plantar semillas": al explicar un tema, mencionar en una
línea dónde se va a usar más adelante (ej: "esto reaparece en los tests
con JUnit, Fase 3"). Los detalles finos de cada fase se definen AL
LLEGAR a ella, con el profe proponiendo lo más vigente en ese momento.

## Lo que NUNCA cambia (en todas las fases)

- Las sesiones numeradas, Engram, GUIA-JAVA.md y EJERCICIOS.md.
- Yo escribo todo el código a mano; Claude explica, corrige y guía.
- Los repasos espaciados (evolucionan de individuales a integradores,
  pero no desaparecen).
- git pull al empezar / git push al terminar (dos PCs).
- Todo en español; todo inglés citado va con su traducción al lado.

## FASE 1 — El libro (⬅ FASE ACTUAL)

Objetivo: terminar Head First Java ENTENDIENDO, no solo leyendo.
Cómo: el sistema actual (tandas, ejercicios del libro y del profe,
repasos espaciados).
Evolución de los repasos dentro de esta fase: cuando el repaso r3 de
un ejercicio sale bien, el ejercicio se GRADÚA y sus conceptos pasan
al pool de conceptos dominados; con 3+ conceptos en el pool arrancan
los REPASOS INTEGRADORES (las reglas exactas están en CLAUDE.md).
Termina cuando: último capítulo explicado + ejercicios pendientes en
cero + repasos individuales al día.

## FASE 2 — Consolidación (2 a 4 semanas, apenas termine el libro)

Objetivo: demostrar que puedo construir algo completo SIN el libro.
- PROYECTO INTEGRADOR: una aplicación de consola real que combine todo
  (clases, herencia, interfaces, colecciones, excepciones, archivos).
  El tema lo elegimos juntos al llegar — idealmente algo que me guste,
  se aprende más. La diseño PRIMERO en UML (diagramas/, puente con el
  proyecto UML-Java) y recién después la escribo. Claude hace de
  cliente y de revisor de código, NO de programador.
- ENTREVISTA SIMULADA #1: Claude me hace preguntas de entrevista
  junior usando la tabla de vocabulario de GUIA-JAVA.md (el concepto
  en inglés, yo lo explico en español y digo el término en inglés).
- Los repasos individuales que queden vivos se terminan en esta fase;
  de acá en adelante, solo repasos integradores.
Termina cuando: el proyecto funciona, está en GitHub con un README
claro, y la entrevista simulada sale decente.

## FASE 3 — Herramientas del trabajo real

Objetivo: cerrar la brecha entre "sé Java" y "puedo trabajar de esto".
Temas, en orden tentativo (el profe propone recursos actualizados al
llegar a cada uno):
1. IntelliJ IDEA — el IDE que usan casi todas las empresas.
2. Maven o Gradle — cómo se construyen los proyectos de verdad.
3. JUnit 5 — tests automáticos: lo que más distingue a un junior
   preparado de uno que solo leyó un libro.
4. SQL + JDBC — bases de datos.
5. Spring Boot básico — el framework backend número 1 en Java.
Método: igual que ahora, pero el "libro" pasa a ser documentación
oficial, tutoriales o un libro nuevo que el profe proponga en ese
momento. Cada herramienta se practica SOBRE el proyecto integrador:
se le agregan tests, se migra a Maven, se le conecta base de datos...
Termina cuando: el proyecto integrador quedó con build, tests y base
de datos, y entiendo qué hace cada pieza.

## FASE 4 — Portafolio y búsqueda de empleo

Objetivo: conseguir el primer empleo.
- 2-3 proyectos en GitHub, cada uno con README claro: qué hace, cómo
  correrlo, qué aprendí haciéndolo.
- CV y LinkedIn redactados con Claude, apoyados en los proyectos.
- Katas / ejercicios tipo entrevista (2-3 por semana).
- ENTREVISTAS SIMULADAS periódicas, cada vez más exigentes: preguntas
  técnicas + "contame tu proyecto" + algo de código en vivo.
- Aplicar a vacantes junior / trainee / practicante mientras sigo
  estudiando (no esperar a "estar listo": nadie se siente listo).
Termina cuando: firmo el contrato.

## Decisiones que se toman AL LLEGAR (a propósito no se fijan hoy)

- El tema exacto del proyecto integrador (Fase 2).
- Qué recursos usar en Fase 3: cambian rápido; el profe busca lo
  vigente en ese momento y lo propone con opciones.
- Si conviene un segundo libro o solo documentación (Fase 3).
- El orden fino de Fase 4 según cómo esté el mercado en ese momento.
