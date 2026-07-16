# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda de 3-8 pantallazos del libro, explicados en
español y conectados con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página estudiada: página 63 de 1629 (6%) — fin de la intro (créditos)
- Última sesión: Sesión #07
- Ejercicios pendientes: ninguno todavía (ver EJERCICIOS.md)
- Entorno verificado: OpenJDK 26.0.1, javac/java en PATH sin configuración
  extra necesaria (Arch Linux, JVM default del sistema).

## VOCABULARIO EN <-> ES (Claude agrega una fila por término nuevo)

| Inglés                            | Español | En una frase |
| --------------------------------- | ------- | ------------ |
| reference book                    | libro de referencia | Se consulta puntualmente por un dato específico, no se lee de corrido (ej: una enciclopedia). |
| novelty                           | novedad | Lo que el cerebro busca constantemente; lo rutinario se filtra como "no importante". |
| abstract method (adelanto)        | método abstracto | Método sin cuerpo, declarado pero no implementado; se ve en detalle con herencia. |
| IS-A / HAS-A (adelanto)           | relación ES-UN / TIENE-UN | Relaciones entre clases (herencia vs. composición); se ven en detalle más adelante. |
| metacognition                     | metacognición | Pensar sobre cómo uno piensa/aprende; prestar atención a cómo prestás atención. |
| object (adelanto)                 | objeto | Contenedor que agrupa datos propios de una "cosa"; se ve en detalle con clases y objetos. |
| BE the Compiler                   | Sé el Compilador | Ejercicio recurrente del libro donde el lector actúa como si fuera el compilador de Java. |
| Puzzleville / Pool Puzzle         | Puzzleville / Pool Puzzle | Sección recurrente de acertijos del libro (ya la teníamos anotada en EJERCICIOS.md). |
| IDE                               | entorno de desarrollo integrado | Herramienta (ej. IntelliJ) que automatiza compilar/correr; el libro recomienda NO usarla al principio. |
| JDK                               | kit de desarrollo de Java | Trae todo para compilar/correr Java, pero NO incluye la documentación de la API. |
| PATH                               | variable de entorno PATH | Lista de carpetas que el sistema revisa para encontrar cualquier comando (no solo javac). |
| API documentation                 | documentación de la API | Referencia de las clases/métodos ya construidos en Java; se consulta aparte del JDK. |
| Exercise (icono zapatilla)        | Ejercicio | Obligatorio; practica lo aprendido. |
| Puzzle (icono rompecabezas)       | Acertijo | Opcional; lógica/crucigramas para quien le guste ese desafío. |
| faux-UML                          | UML simplificado/falso | Versión de UML adaptada para no chocar con la sintaxis real de Java. |

============================================================
(ACÁ VAN LAS SESIONES — Claude agrega la SESIÓN #01 en la primera
clase y sigue numerando hacia abajo, una sección por sesión, usando
el formato de referencia del final del archivo)
============================================================

SESIÓN #01 — 2026-07-15 — Cómo usar este libro (intro) (Ubicación pág. 35-38 de 1629, 3-4%)

IDEAS CLAVE

- El libro NO es un "reference book" (libro de consulta puntual, tipo
  enciclopedia): está diseñado para "learning", es decir, para leerse
  de principio a fin, construyendo cada concepto sobre el anterior.
- Perfil ideal del lector: alguien que ya programó algo (aunque sea
  básico, con loops o if/then) y quiere aprender Java con una
  explicación amena en vez de una lectura técnica árida.
- No es el libro indicado para quien solo sabe HTML sin lógica de
  programación, ni para quien busca un manual de referencia de C++.
- El formato con humor, dibujos e historias no es relleno: es una
  técnica pedagógica basada en cómo funciona el cerebro (brain-based
  learning) — retenemos mejor lo visual, sorprendente o emocional que
  el texto plano y monótono.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Todavía no hay código: son páginas puramente introductorias.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno en esta tanda.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Ninguna en esta sesión.

DUDAS QUE SURGIERON (y su respuesta corta)

- Diferencia entre "reference book" y libro de "learning": no es
  cuánto contenido trae cada uno, sino el USO — consulta puntual vs.
  lectura progresiva que construye comprensión.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 39).

SESIÓN #02 — 2026-07-15 — Cómo usar este libro: principios de aprendizaje (Ubicación pág. 39-43 de 1629, 4%)

IDEAS CLAVE

- El cerebro busca novedad (novelty) constantemente por supervivencia;
  filtra como "no importante" todo lo rutinario y seguro — como
  estudiar en casa o en una biblioteca — aunque el lector quiera
  aprenderlo. Solo guarda algo cuando detecta algo fuera de lo común
  (disparo de neuronas + descarga química).
- Principios de diseño de Head First, basados en ciencia cognitiva:
  1. Hacerlo visual: las imágenes se recuerdan mucho más que el texto
     solo (hasta 89% más retención), y el texto debe ir cerca o sobre
     el gráfico al que se refiere (no al pie de página).
  2. Estilo conversacional y personalizado: hablarle al lector en
     primera persona, con tono casual, rinde hasta 40% mejor que un
     tono formal tipo conferencia.
  3. Hacer pensar más profundo al lector: sin ejercicios, desafíos y
     preguntas que obliguen a pensar activamente, no se "ejercitan las
     neuronas" y no queda nada grabado.
- Aparecen como adelanto/chiste visual dos conceptos de POO que se
  verán en detalle más adelante: "abstract method" (método sin cuerpo)
  y la relación IS-A vs. HAS-A entre clases (herencia vs. composición).
  No se explican todavía en profundidad, son solo un ejemplo visual.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Todavía no hay código: sigue siendo introducción.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno en esta tanda.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Ninguna en esta sesión.

DUDAS QUE SURGIERON (y su respuesta corta)

- Por qué el cerebro no guarda contenido técnico aunque uno quiera
  aprenderlo: no es por ser "no visual" (esa es la solución, no la
  causa) — es porque el entorno de estudio es rutinario y seguro, sin
  la novedad/sorpresa que dispara la señal de "esto es importante".

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 44).

SESIÓN #03 — 2026-07-15 — Cómo usar este libro: atención, emociones y metacognición (Ubicación pág. 45-48 de 1629, 4%)

IDEAS CLAVE

- Principios de diseño #4 y #5: conseguir y mantener la atención del
  lector (lo inesperado engancha, lo aburrido no), y apelar a las
  emociones (no hace falta drama: alcanza con sorpresa, curiosidad,
  diversión o el "¡la tengo!" de resolver algo).
- Metacognición (metacognition): pensar sobre cómo uno piensa/aprende.
  Casi nadie tuvo una materia de "cómo aprender" — se esperaba que
  aprendiéramos, pero rara vez se enseñó el cómo.
- Dos caminos para que el cerebro trate el contenido como importante:
  el lento (repetición pura/bruta, sin importar el timing — NO es lo
  mismo que la repetición espaciada tipo Anki, que además optimiza
  CUÁNDO repasar según la curva del olvido) y el rápido (cualquier
  actividad que aumente la actividad cerebral, sobre todo distintos
  TIPOS de actividad).
- "Here's what WE did": el libro detalla sus técnicas concretas —
  imágenes con el texto INCRUSTADO DENTRO (no en pie de foto ni en
  cuerpo de texto aparte, porque esa cercanía obliga al cerebro a
  esforzarse en relacionar palabra e imagen, y ese esfuerzo dispara
  más neuronas), estilo conversacional, y repetición con múltiples
  medios y sentidos para que el contenido se codifique en más de un
  área del cerebro.
- Adelanto visual (todavía no explicado a fondo): un objeto (object)
  como "contenedor" que agrupa datos propios de una cosa (ejemplo del
  perro "fido" y su "Dog object").

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Todavía no hay código: sigue siendo introducción metodológica.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno en esta tanda.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Ninguna en esta sesión.

DUDAS QUE SURGIERON (y su respuesta corta)

- Repetición pura vs. repetición espaciada (Anki): el libro describe
  la repetición bruta (repetir sin importar el timing), no el
  algoritmo optimizado de espaciado que usa Anki — son primas, no lo
  mismo.
- Ubicación del texto en la imagen: es DENTRO de la imagen (no afuera)
  lo que genera más esfuerzo mental y más neuronas activas, porque
  obliga al cerebro a relacionar palabra e imagen en el mismo lugar.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 49).

SESIÓN #04 — 2026-07-15 — Cómo usar este libro: técnicas finales y enfoque 80/20 (Ubicación pág. 49-52 de 1629, 4-5%)

IDEAS CLAVE

- Se nombran por primera vez dos secciones recurrentes del libro que
  ya estaban anotadas en EJERCICIOS.md: "BE the Compiler" y
  "Puzzleville" (relacionado con "Pool Puzzle").
- Más de 50 ejercicios en el libro, diseñados "challenging-yet-doable"
  (desafiantes pero resolubles), porque se aprende más haciendo que
  leyendo.
- Múltiples estilos de aprendizaje (multiple learning styles): el
  mismo contenido se repite de formas distintas (paso a paso, panorama
  general, ejemplo de código) porque cada persona prefiere una vía
  distinta, y repetir en varios formatos beneficia a TODOS por igual.
- Contenido para ambos lados del cerebro (both sides of your brain):
  ES UN PUNTO DISTINTO al anterior — activar ambos hemisferios permite
  que uno "descanse" mientras el otro trabaja, lo que da más
  resistencia (stamina) para mantenerse enfocado por más tiempo. Es
  alternar la carga entre dos partes (como alternar grupos musculares
  en el gimnasio, imagen "Brain Barbell"), NO dividir tareas en
  módulos independientes (eso sería "modularizar", un concepto de
  programación que no aplica igual acá).
- Historias con más de un punto de vista y desafíos/preguntas sin
  respuesta directa, porque el cerebro aprende trabajando, no
  observando — pero cuidando que ese esfuerzo esté puesto en lo
  correcto (no gastar neuronas descifrando texto mal escrito).
- Enfoque 80/20 del propio libro: no cubre todo, solo lo que
  realmente se va a usar — el mismo principio de priorización que
  sigue este proyecto de estudio (ver CLAUDE.md).
- Se anticipa el título de la próxima sección: "Here's what YOU can do
  to bend your brain into submission" — consejos prácticos para el
  lector, no solo explicación de las técnicas del libro.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Todavía no hay código: sigue siendo introducción.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno todavía para resolver; solo se nombran los formatos de
  ejercicio ("BE the Compiler", "Puzzleville").

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Ninguna en esta sesión.

DUDAS QUE SURGIERON (y su respuesta corta)

- Confundió "multiple learning styles" con "both sides of your brain"
  al principio: el primero es adaptarse a CÓMO preferís aprender
  (varios formatos del mismo contenido); el segundo es alternar QUÉ
  hemisferio trabaja para sostener el foco por más tiempo. Son
  principios separados en el libro.
- Intentó usar la analogía de "modularizar" (programación) para "both
  sides of your brain": no aplica, porque modularizar es dividir en
  partes independientes con responsabilidades separadas, mientras que
  acá los dos lados del cerebro alternan la carga de LA MISMA
  actividad (aprender), turnándose para descansar — más parecido a
  alternar grupos musculares en el gimnasio que a dividir un sistema
  en módulos.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 53).

SESIÓN #05 — 2026-07-15 — Cómo usar este libro: los 10 consejos y qué necesitás (Ubicación pág. 52-54 de 1629, 5%)

IDEAS CLAVE

- Los 10 consejos prácticos del libro para el lector: ir más despacio
  y pensar antes de leer la respuesta; hacer los ejercicios a mano con
  lápiz (no solo mirarlos); leer TODOS los "There are No Dumb
  Questions" (son contenido central, no opcional); no leer todo en un
  mismo lugar; dejar lo más desafiante como lo último antes de dormir
  (el cerebro procesa y consolida en ese tiempo posterior, y meter
  contenido nuevo en el medio compite por ese mismo espacio y hace
  perder parte de lo aprendido); tomar agua (la deshidratación baja el
  rendimiento cognitivo); hablarlo en voz alta o explicárselo a otro;
  escuchar al cerebro y parar si se satura; sentir algo con el
  material (involucrarse, no leer en piloto automático); tipear y
  correr el código uno mismo, experimentando y hasta rompiéndolo.
- "Lo que necesitás para este libro": el libro recomienda explícitamente
  NO usar un IDE (entorno de desarrollo integrado) hasta terminarlo —
  un IDE oculta detalles que importan para entender qué pasa de
  verdad. Recomienda aprender primero desde la línea de comandos.
  Esto coincide con cómo ya venimos trabajando en este proyecto
  (usuario compila y corre a mano con javac/java).
- Nota de versión: el libro asume Java 11 (salvo Apéndice B); con Java
  8 la mayoría del código funciona igual; cuando algo requiera una
  versión más nueva, el libro lo va a aclarar.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Todavía no hay código: última tanda de la introducción metodológica.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno; son consejos generales, no un ejercicio puntual.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Usar nvim + jdtls (o cualquier LSP con autocompletado) no rompe la
  recomendación del libro de "no usar IDE": lo que el libro busca
  evitar es que un botón de compilar/correr te oculte el `javac`/`java`
  real. Mientras sigas compilando y ejecutando a mano desde la
  terminal, el punto central (entender qué pasa en cada paso) se
  respeta, tengas o no autocompletado en el editor.

DUDAS QUE SURGIERON (y su respuesta corta)

- Por qué importa el tiempo después de cerrar el libro (consejo #5):
  no es solo "no saturar" en general — es que la consolidación a
  memoria de largo plazo pasa en ESE rato específico, y meter
  contenido nuevo ahí compite por el mismo espacio de procesamiento y
  hace perder parte de lo recién aprendido.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 55) — probablemente arranca ya contenido técnico
de Java.

SESIÓN #06 — 2026-07-15 — Setting up Java (Ubicación pág. 55-58 de 1629, 5%)

IDEAS CLAVE

- Guía práctica de instalación: el libro recomienda instalar Java 17
  si no sabés qué versión bajar (aunque el contenido del libro está
  escrito pensando en Java 11 — son cosas distintas: versión
  recomendada para instalar vs. versión base de los ejemplos).
  Recomiendan una build de OpenJDK, en particular Eclipse Adoptium.
- El JDK (Java Development Kit) trae todo lo necesario para compilar y
  correr Java, pero NO incluye la documentación de la API — eso se
  descarga o consulta aparte.
- Cualquier editor de texto plano sirve (no "rich text"), y el archivo
  debe terminar en ".java" (cuidado con editores que agregan ".txt"
  sin avisar).
- PATH: lista de carpetas que el sistema revisa, en orden, cada vez
  que se ejecuta CUALQUIER comando (no es específico de javac) — si la
  carpeta bin de Java no está ahí, la terminal no reconoce javac
  aunque esté instalado.
- Foro recomendado para problemas de instalación: javaranch.com.
- Se verificó el entorno del usuario a pedido explícito: OpenJDK
  26.0.1, javac/java resueltos correctamente vía PATH sin necesidad de
  configuración adicional (Arch Linux, JVM default del sistema).

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Primer comando real del libro: `javac` (compilador de Java).

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno; es la guía de instalación.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- El usuario corre Java 26.0.1, bastante por delante de la base del
  libro (11) y de la recomendada para instalar (17). Es compatible sin
  problemas; si algún ejemplo choca con un cambio de versión más
  nueva, se marca acá en el momento.

DUDAS QUE SURGIERON (y su respuesta corta)

- Por qué el JDK no alcanza sin la documentación de la API: el JDK te
  deja compilar/correr, pero no te dice qué clases y métodos ya
  existen en Java ni cómo usarlos — eso lo da la documentación aparte.
- Qué es PATH exactamente: no es una ruta única "para javac", es una
  lista de carpetas que el sistema revisa para CUALQUIER comando que
  ejecutes.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 59) — se termina la intro y arranca contenido
técnico real de Java.

SESIÓN #07 — 2026-07-15 — Cierre de la intro: UML simplificado, Exercise vs. Puzzle (Ubicación pág. 59-63 de 1629, 5-6%)

IDEAS CLAVE

- El libro usa diagramas UML simplificados ("faux-UML"), no UML puro,
  para no chocar con la sintaxis real de Java y no tener que aprender
  UML y Java al mismo tiempo. PUENTE CON UML-JAVA: cuando un ejercicio
  tenga 2+ clases relacionadas, vale la pena pasar esas mismas clases
  a UML formal en el proyecto hermano.
- El libro NO enseña a organizar/empaquetar proyectos Java (eso
  depende de herramientas como Maven o Gradle) — asume que se aprende
  aparte, más adelante.
- Diferencia clave para EJERCICIOS.md: "Exercise" (ícono zapatilla) es
  OBLIGATORIO, practica lo aprendido. "Puzzle" (ícono rompecabezas) es
  OPCIONAL, acertijos de lógica/crossword para quien le guste ese
  desafío — no hay que desanimarse si no se resuelven o no interesan.
- Los ejercicios "Sharpen your pencil" no siempre tienen una única
  respuesta impresa; parte del aprendizaje es que el propio lector
  decida si su respuesta está bien.
- Los ejemplos de código del libro son intencionalmente mínimos/lean,
  no robustos ni completos — hacerlos robustos queda como tarea
  personal para después de terminar el libro.
- Páginas 62-63: créditos de los revisores técnicos de la 3ra edición
  (Marc Loy, Abraham Marin-Perez) — sin contenido de aprendizaje.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Todavía no hay código: última tanda de la introducción completa.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno; se explican los formatos, no aparece un ejercicio puntual.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Ninguna en esta sesión.

DUDAS QUE SURGIERON (y su respuesta corta)

- Ninguna; ambas respuestas de comprensión fueron correctas.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 64) — ahí sí debería arrancar el Capítulo 1 con
contenido técnico real de Java.

# ============================================================
# FORMATO DE CADA SESIÓN (referencia para Claude — copiar y llenar)
# ============================================================

SESIÓN #NN — [fecha] — [tema] (Ubicación X-Y del libro, Z%)

IDEAS CLAVE

- ...

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- ...

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- ...

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- ...

DUDAS QUE SURGIERON (y su respuesta corta)

- ...

EJERCICIOS CREADOS: #...
PRÓXIMO PASO: ...
