# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda de 3-8 pantallazos del libro, explicados en
español y conectados con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página estudiada: página 86 de 1629 (7%) — Capítulo 1, "Code structure in Java"
- Última sesión: Sesión #09
- Ejercicios pendientes: 1 (Sharpen your pencil de la Sesión #09 — ver EJERCICIOS.md)
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
| bytecode                          | bytecode | Código intermedio que genera el compilador a partir del `.java`; no es el código fuente ni instrucciones nativas del procesador, lo entiende la JVM. |
| JVM (Java Virtual Machine)        | máquina virtual de Java | Programa que traduce (interpreta) el bytecode a lo que el dispositivo real entiende; es la pieza que hace portable a Java. |
| write-once/run-anywhere           | escribí una vez, corré donde sea | Lema histórico de Java: el mismo `.class` compilado corre sin cambios en cualquier dispositivo que tenga una JVM. |
| backward compatibility            | compatibilidad hacia atrás | Código Java viejo sigue corriendo sin tocarlo en versiones nuevas de la JVM. |

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

SESIÓN #08 — 2026-07-16 — Capítulo 1: cómo funciona Java por dentro (compilador, bytecode y JVM) (Ubicación pág. 75-77 de 1629, 7%)

IDEAS CLAVE

- Arranca el Capítulo 1: "Breaking the Surface". El libro anticipa que
  se va a ver sintaxis, loops, branching (if/else) y qué hace a Java
  particular frente a otros lenguajes.
- El proceso de compilar y correr un programa Java tiene 4 pasos:
  1. Source: escribís el código fuente en un archivo de texto plano,
     siguiendo la sintaxis de Java (protocolo/lenguaje establecido).
  2. Compiler: el comando `javac` (Java compiler) lee ese archivo,
     revisa errores, y si está todo bien genera un archivo nuevo.
  3. Output (bytecode): ese archivo nuevo NO es código fuente ni
     instrucciones nativas del procesador — es bytecode, un código
     intermedio "traducido", independiente de la plataforma.
  4. Virtual Machines (JVM): cada dispositivo (laptop, celular,
     tablet) corre su propia JVM (Java Virtual Machine), un programa
     que traduce/interpreta ese bytecode a lo que ESE dispositivo en
     particular entiende, y lo ejecuta.
- Por qué importa (interview-ready): esto es lo que hace a Java
  "write-once/run-anywhere" — el mismo `.class` compilado UNA vez
  corre sin recompilar en cualquier equipo que tenga una JVM instalada
  (a diferencia de lenguajes que compilan directo a código nativo de
  UN sistema operativo/procesador específico).
- Ejemplo ilustrativo del libro ("Party.java"): un programa de
  invitación a una fiesta con ventana y botones. El libro aclara
  EXPLÍCITAMENTE que ese código no es real ni completo — es solo para
  mostrar el flujo Source → `javac` → bytecode → `java` (JVM) antes de
  escribir código de verdad.
- Historia breve de Java: salió el 23 de enero de 1996 (algunos dicen
  que "se escapó", broma del libro). Tiene más de 25 años, evolucionó
  muchísimo y se escribió una cantidad enorme de código Java desde
  entonces (el libro dice "17 gazillion lines", un número inventado a
  propósito, es un chiste, no un dato real). Java es conocido por su
  compatibilidad hacia atrás: código viejo sigue corriendo en JVMs
  nuevas sin tocarlo.
- El libro avisa que va a mostrar primero estilos de código MÁS
  VIEJOS (porque es lo que más se encuentra en el mundo real) y recién
  después las alternativas modernas — mismo patrón que ya vimos con la
  versión del libro (11) vs. la recomendada para instalar (17).
- Última imagen de la tanda: un personaje dice "escuché que Java no es
  muy rápido comparado con lenguajes compilados como C y Rust" — es un
  mito que el libro claramente va a discutir en la página siguiente,
  todavía no lo resuelve acá.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- Ejemplo ilustrativo (el libro dice que NO es código real, no
  intentes compilarlo — recién vamos a escribir código de verdad en
  la próxima tanda):

  ```java
  import java.awt.*;       // trae clases de ventanas/botones "viejas" de Java (AWT)
  import java.awt.event.*; // trae clases para manejar eventos (ej: clic de botón)

  class Party {
      public void buildInvite() {
          Frame f = new Frame();                     // crea una ventana nueva
          Label l = new Label("Party at Tim's");      // crea un texto fijo dentro de la ventana
          Button b = new Button("You bet");           // crea un botón con el texto "You bet"
          Button c = new Button("Shoot me");          // crea otro botón con el texto "Shoot me"
          Panel p = new Panel();                      // crea un panel: contenedor para agrupar componentes
          p.add(l);                                   // agrega el texto "l" adentro del panel "p"
      } // acá seguiría más código (agregar los botones, mostrar la ventana...)
  }
  ```

- Comandos reales (estos sí son de verdad, se van a usar en breve):
  - `javac Party.java` → compila y genera `Party.class` (bytecode).
  - `java Party` → la JVM traduce el bytecode y corre el programa.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno; todavía es contenido conceptual antes del primer programa
  real del capítulo.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- El proceso Source → Compiler → Bytecode → JVM es EL concepto más
  preguntado en entrevistas junior sobre Java ("¿por qué Java es
  portable?", "¿qué es la JVM?", "¿qué es el bytecode?"). Vale la pena
  tenerlo firme antes de seguir.
- El "17 gazillion lines" es un chiste del libro (número inventado
  para exagerar), no un dato real — no lo repitas como estadística en
  una entrevista.

DUDAS QUE SURGIERON (y su respuesta corta)

- Por qué el mismo `.class` corre igual en hardware distinto: porque
  cada dispositivo tiene su propia JVM, que traduce/interpreta ese
  mismo bytecode al "lenguaje" que entiende ESE equipo puntual — el
  bytecode no cambia, lo que cambia es quién lo traduce. Respuesta
  correcta y completa.
- Por qué el libro muestra código de "Party.java" que dice no compilar:
  la respuesta apuntó al principio general de impacto visual/textual
  del libro (correcto, pero es la razón general). La razón puntual que
  da el libro en su propia nota es separar dos aprendizajes: primero
  dar una sensación del PROCESO completo (Source → Compiler → Bytecode
  → JVM) sin la carga de la sintaxis exacta, y recién después meterse
  de lleno en sintaxis real y compilable — si se mezclan las dos cosas
  de entrada, se aprende peor ambas.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 78) — probablemente ahí el libro responde el mito
de "Java es lento" y arranca el primer programa real.

SESIÓN #09 — 2026-07-16 — Velocidad de Java, versiones, primer ejercicio del libro y estructura del código (Ubicación pág. 80-86 de 1629, 7%)

IDEAS CLAVE

- Resuelve el mito de la sesión anterior ("¿Java es lento?"): cuando
  salió, sí era lento, pero después apareció la HotSpot VM y otros
  mejoradores de rendimiento. Hoy Java es considerado rápido — casi
  tan rápido como C y Rust, y mucho más rápido que la mayoría de los
  demás lenguajes. El "superpoder" es que la JVM puede optimizar el
  código MIENTRAS SE EJECUTA (en tiempo real), así que se pueden
  escribir apps rápidas sin necesidad de escribir vos mismo trucos
  especiales de rendimiento. Contra (el libro es transparente): Java
  usa bastante más memoria que C o Rust.
- Q&A sobre la numeración de versiones de Java (históricamente
  confusa): JDK 1.0 → 1.2 → 1.3 → 1.4 → J2SE 5.0 (que en realidad
  era la versión 1.5) → Java 6 (1.6) → 7 (1.7) → 8 (1.8). Técnicamente
  Java sigue en "1.x" porque todas las versiones son compatibles hacia
  atrás desde la 1.0, pero desde Java 9 en adelante se usa el número
  sin el prefijo "1." (Java 9 es la versión 9, no la 1.9). Desde
  septiembre 2017 (cuando salió Java 9) hay un release nuevo cada 6
  meses, cada uno con un número "mayor" nuevo — por eso se pasó rápido
  de 9 a 18 (y el usuario hoy corre Java 26, mismo ritmo).
- Primer ejercicio real del libro ("Sharpen your pencil"): un
  fragmento de código Java con variables, un `if`, un `while`, un
  array, prints y un `try/catch`. El libro pide escribir, línea por
  línea, en una frase simple, qué hace cada instrucción — usando la
  intuición, SIN haber visto esta sintaxis en detalle todavía (eso se
  explica recién en las próximas ~40 páginas). Da 3 líneas ya resueltas
  como ejemplo de formato. Queda registrado como pendiente en
  EJERCICIOS.md — el usuario lo resuelve a mano antes de que Claude lo
  corrija.
- "Code structure in Java" (estructura de anidamiento, sin ejercicio,
  solo conceptual): un archivo fuente (source file) contiene una
  definición de clase (class definition); una clase contiene métodos
  (method 1, method 2); cada método contiene instrucciones (statement).
  Es la jerarquía básica de organización de CUALQUIER programa Java,
  va a aparecer todo el tiempo de acá en adelante.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- El código del ejercicio "Sharpen your pencil" está en EJERCICIOS.md
  (no se repite acá para no adelantar la solución antes de que el
  usuario lo intente).
- Diagrama "Code structure in Java": source file → class definition →
  method 1 (statement) → method 2 (statement, statement). Sin código
  de ejemplo todavía, es solo la jerarquía visual.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- "Sharpen your pencil" (pág. 80-81) — pendiente, ver EJERCICIOS.md.
  Las respuestas oficiales del libro están en pág. 83-84, pero Claude
  las tiene guardadas SIN mostrarlas todavía — se corrige recién
  cuando el usuario entregue su intento.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Lo que el libro describe como "la JVM optimiza el código mientras
  se ejecuta" tiene nombre técnico real: JIT compilation (Just-In-Time
  compilation). Es un término que sí conviene tener a mano para
  entrevistas, aunque el libro en esta página no lo nombra así.
- Para el mundo laboral real, lo que más importa de la numeración de
  versiones no es la lista completa 9-18-26, sino identificar las
  versiones LTS (Long-Term Support: 8, 11, 17, 21, y próximamente 25).
  Son las que las empresas realmente usan en producción, a diferencia
  de las versiones intermedias de 6 meses que casi nadie despliega.

DUDAS QUE SURGIERON (y su respuesta corta)

- Pendiente: falta la ronda de comprensión de esta sesión.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: el usuario resuelve a mano el "Sharpen your pencil" de
EJERCICIOS.md; después seguimos con la siguiente tanda de páginas del
libro (a partir de la página 87).

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
