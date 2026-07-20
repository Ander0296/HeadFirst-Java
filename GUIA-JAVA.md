# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda de 3-8 pantallazos del libro, explicados en
español y conectados con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página estudiada: página 131 de 1629 (10%) — Capítulo 1, "Mixed Messages" completo y arranca "Pool Puzzle" (completo, sección cerrada)
- Última sesión: Sesión #17
- Ejercicios pendientes: 2 — BottleSong "encontrá la falla" (Sesión #14, [~] en curso/pausado, ver EJERCICIOS.md). "Pool Puzzle" (Sesión #17, [ ] pendiente, OPCIONAL). "Mixed Messages" (Sesión #17) completado 2026-07-19, 5/5 a la primera. "BE the Compiler" (Sesión #16) completado 2026-07-19. Code Magnets "Shuffle1" (Sesión #15) completado 2026-07-17. Repasos r1: "Sharpen your pencil" pág. 80-81 y "DooBee" agendados para 2026-07-20, "Shuffle1" agendado para 2026-07-21, "BE the Compiler" agendado para 2026-07-22, "Mixed Messages" agendado para 2026-07-23
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
| class                              | clase | Representa "una pieza" del programa; un source file normalmente contiene una. |
| method                             | método | Contiene instrucciones; se declara adentro de una clase. |
| statement                          | instrucción | Una línea de código dentro de un método que hace algo puntual. |
| curly braces                       | llaves ({ }) | Delimitan el cuerpo de una clase o de un método. |
| main method                        | método main | Punto de entrada de la aplicación: `public static void main(String[] args)`. Uno solo por aplicación, no por clase. |
| println vs. print                  | println vs. print | `print` no salta de línea después de imprimir; `println` sí. |
| strongly typed language            | lenguaje fuertemente tipado | Java no deja mezclar tipos de datos incorrectos; el compilador lo controla. |
| compile-time / runtime             | tiempo de compilación / tiempo de ejecución | El compilador atrapa errores ANTES de correr (sintaxis, tipos); la JVM atrapa los que solo aparecen DURANTE la ejecución. |
| ClassCastException                 | excepción de conversión de clase | Error en tiempo de ejecución al intentar convertir un objeto a un tipo que no le corresponde. |
| loop (while / for)                 | bucle | Repite todo lo que está en su bloque mientras la prueba condicional sea verdadera. |
| conditional test                   | prueba condicional | Expresión que da como resultado un `boolean` (`true` o `false`); es lo que evalúa un `while` o un `if`. |
| boolean                            | booleano | Tipo de dato con solo dos valores posibles: `true` o `false`. |
| assignment operator (=) vs. equality operator (==) | operador de asignación (=) vs. operador de igualdad (==) | `=` asigna un valor; `==` compara si dos valores son iguales. Confundirlos es el error más común de principiante. |
| branching (if/else)                | ramificación / bifurcación condicional | Ejecutar un bloque de código u otro según si una prueba condicional es verdadera o falsa. |
| IoT (Internet of Things)           | Internet de las Cosas | Dispositivos embebidos (electrodomésticos, sensores, etc.) conectados y programables; Java es popular en este ámbito. |
| embedded device                    | dispositivo embebido | Hardware chico (cajero automático, tarjeta, electrodoméstico) que corre solo una porción reducida de la plataforma Java. |
| array                              | array / arreglo | Una sola variable que guarda VARIOS valores del mismo tipo, accedidos por posición numérica (índice). |
| zero-based                         | indexado desde cero | En un array, la primera posición es el índice 0, no el 1; el último índice es `length - 1`. |
| length (de un array)               | length (propiedad, no método) | Cantidad de elementos del array; se usa sin paréntesis: `array.length`. |
| java.util.Random / nextInt()       | java.util.Random / nextInt() | Clase de Java para generar números al azar; `nextInt(n)` devuelve un entero entre 0 (incluido) y n (sin incluir). Primer uso real de un objeto en el libro (adelanto de POO). |
| ArrayIndexOutOfBoundsException     | excepción de índice fuera de rango | Error en tiempo de ejecución al pedir una posición de un array que no existe (fuera de 0 a length-1). |
| Code Magnets                       | Imanes de Código | Sección recurrente de ejercicio: reordenar pedazos de código desarmados (como imanes en una heladera) para armar un programa que compile y dé la salida pedida. |
| JavaCross                          | JavaCross | Crucigrama opcional (ícono Puzzle) con palabras del capítulo que se está viendo, para "el lado derecho del cerebro". |
| Mixed Messages                     | Mensajes Mezclados | Puzzle: emparejar bloques de código candidatos con la salida que producirían si se insertaran en el programa dado. |
| candidate block (of code)          | bloque candidato (de código) | Fragmento de código que podría ir en un espacio faltante de un programa; hay que emparejarlo con la salida correcta. |

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

- ¿Una clase puede tener varios métodos, o solo uno (según el diagrama
  "Code structure in Java")? Respondida correctamente: en el propio
  diagrama del libro aparecen dos métodos dentro de la misma clase, lo
  que confirma que una clase puede tener tantos métodos como haga
  falta (method 1, method 2, ... method N).

EJERCICIOS CREADOS: ninguno
EJERCICIOS DEL LIBRO COMPLETADOS: "Sharpen your pencil" (pág. 80-81) —
completado 2026-07-16, muy buen nivel de intuición (ver EJERCICIOS.md
para el detalle y el primer repaso agendado el 2026-07-20).
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 87).

SESIÓN #10 — 2026-07-16 — Anatomy of a class: de la clase al método main (Ubicación pág. 86-89 de 1629, 7%)

IDEAS CLAVE

- Construcción concreta (con código real, no solo cajas) de la
  jerarquía vista en la Sesión #09: archivo fuente -> clase -> método(s)
  -> instrucción(es). Un source file normalmente contiene UNA clase,
  encerrada entre llaves { }.
- Una clase tiene uno o más métodos, declarados DENTRO de las llaves
  de la clase. Un método contiene instrucciones (statements), que van
  dentro de las llaves del método.
- Anatomy of a class: cuando la JVM arranca, busca la clase indicada
  por línea de comandos y, adentro de ESA clase, un método con la
  firma exacta `public static void main(String[] args) { }` — el
  punto de entrada de la aplicación.
- Toda aplicación Java necesita al menos una clase y al menos un
  método main — pero es UN SOLO main POR APLICACIÓN, no uno por clase.
  La JVM no "adivina" ni lee archivos en algún orden: vos le indicás
  explícitamente qué clase ejecutar (ej. `java Dog`), y recién ahí
  busca el main dentro de esa clase puntual.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

```java
public class Dog {
  void bark() {
    statement1;
    statement2;
  }
}
```
```java
public static void main(String[] args) {
  // your code goes here
}
```

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- La última captura de la pág. 89 llegó cortada (no se vio la línea
  `public class ... {` que probablemente encabeza el bloque del main).
  Contenido no verificado al 100%; revisar si aparece de nuevo esa
  página completa más adelante.

DUDAS QUE SURGIERON (y su respuesta corta)

- Si una app tiene 3 clases, ¿cuántos main como máximo? Respuesta:
  uno solo en total (correcto en el usuario). Matiz corregido: el main
  NO es "el primer archivo que se lee" (no hay orden ni lectura
  secuencial de archivos) — es el método que la JVM busca DENTRO de
  la clase que vos elegís explícitamente al ejecutar el programa
  (ej. `java Dog`), no un archivo elegido automáticamente.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 89-90, posiblemente repitiendo el final de la 89
si la captura anterior estaba cortada).

SESIÓN #11 — 2026-07-16 — De MyFirstApp al ciclo Save/Compile/Run + Fireside Chats (Ubicación pág. 90-96 de 1629, 8%)

IDEAS CLAVE

- Desglose anotado token por token del esqueleto completo de un
  programa Java (`public class MyFirstApp { public static void main
  (String[] args) { ... } }`), confirmando y completando lo visto en
  la Sesión #10.
- Correr un programa = decirle a la JVM "cargá esta clase y ejecutá su
  main() hasta que termine". Ciclo de 3 pasos: Save (.java) -> Compile
  (`javac` genera el .class) -> Run (`java NombreClase`).
- Diferencia `print` vs `println`: println salta de línea después de
  imprimir, print no.
- "Fireside Chats": sección recurrente humorística del libro (diálogo
  entre "personajes"); en esta, Compilador vs. JVM discuten sus roles.
  Sustancia real: el compilador atrapa errores de sintaxis/tipos ANTES
  de correr (compile-time); la JVM atrapa errores que solo aparecen
  DURANTE la ejecución (runtime) — ej. ClassCastException, violaciones
  de acceso a métodos privados. Java es un lenguaje fuertemente
  tipado, controlado en gran parte por el compilador.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

```java
public class MyFirstApp {
  public static void main (String[] args) {
    System.out.println("I Rule!");
    System.out.println("The World");
  }
}
```

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- La distinción compile-time vs. runtime (qué atrapa el compilador vs.
  qué atrapa la JVM) es un clásico de entrevistas de Java/backend —
  vale la pena tenerla clara más allá del tono humorístico de la
  página.
- La pág. 96 quedó cortada justo donde arranca la lista de "Your code
  can tell the JVM to:" — pendiente de ver esa lista completa.

DUDAS QUE SURGIERON (y su respuesta corta)

- Ejemplo de error de compilador vs. error de JVM (runtime). Respuesta
  correcta: compilador → error de sintaxis (`it x = 10;` en vez de
  `int`), se detecta antes de correr. JVM/runtime → un `Scanner` que
  espera un entero (`nextInt()`) y recibe texto del usuario; no se
  puede saber de antemano qué va a tipear, así que solo se detecta en
  ejecución (excepción puntual: `InputMismatchException`).

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 96, retomando la lista cortada de "What can you
say in the main method?").

SESIÓN #12 — 2026-07-16 — Statements, loops y branching: las 3 cosas que decís en el main (Ubicación pág. 99-107 de 1629, 8%)

IDEAS CLAVE

- Las 3 cosas que se pueden decir dentro de un método: (1) hacer algo
  (statements), (2) hacer algo repetidamente (loops), (3) hacer algo
  bajo una condición (branching).
- Reglas de sintaxis base: instrucción termina en `;`, comentario de
  línea con `//`, la mayoría del espacio en blanco no importa, variable
  se declara con tipo + nombre, clases/métodos van dentro de `{ }`.
- Loops: `while` y `for`. Todo bucle depende de un conditional test
  que DEBE dar un valor boolean (`true`/`false`) — un `int` no es
  compatible con `boolean` en Java, a diferencia de otros lenguajes.
- Operadores de comparación: `<`, `>`, `==` (igualdad, DOS signos).
  Trampa clásica de principiante: confundir `=` (asignación) con `==`
  (igualdad).
- Branching con `if`/`else`: misma lógica de prueba booleana que el
  `while`, pero ejecuta un bloque u otro en vez de repetir.
- Ejemplo trazado completo (clase Loopy) mostrando la salida real en
  consola de un `while` que corre 3 veces.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

```java
public class Loopy {
  public static void main(String[] args) {
    int x = 1;
    System.out.println("Before the Loop");
    while (x < 4) {
      System.out.println("In the loop");
      System.out.println("Value of x is " + x);
      x = x + 1;
    }
    System.out.println("This is after the loop");
  }
}
```

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- Ninguno.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- La confusión `=` vs `==` no es solo un tip del libro: en la vida real
  sigue siendo uno de los bugs más comunes incluso en devs con
  experiencia, sobre todo dentro de un `if`.
- La página 107 quedó cortada justo al arrancar "Conditional
  branching" (if/else) — pendiente ver esa sección completa.

DUDAS QUE SURGIERON (y su respuesta corta)

- ¿Por qué no se puede escribir `while (x)` con x de tipo int en Java?
  Respondida correctamente: la prueba condicional debe ser boolean sí
  o sí; int y boolean no son compatibles. Hace falta una comparación
  que devuelva boolean (`x > n`, `x == n`, `x < n`, etc.).

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 107, retomando "Conditional branching" cortada).

SESIÓN #13 — 2026-07-16 — if/else completo + arranca "serious business application" (Ubicación pág. 108-111 de 1629, 9%)

IDEAS CLAVE

- Nota: las capturas de esta tanda repitieron primero las páginas
  103, 105 y 107 (ya vistas en la Sesión #12) antes de traer contenido
  nuevo — no se re-explicaron.
- `if` solo: el bloque corre solo si la condición es true; el código
  fuera del bloque corre siempre, sin importar la condición.
- `if`/`else`: con else, siempre corre exactamente UNA de las dos
  ramas (nunca ninguna, nunca las dos).
- Repaso reforzado `print` vs `println`: println = print + salto de
  línea; print mantiene todo en el mismo renglón.
- Arranca una sección nueva, "Coding a serious business application"
  (pág. 111), con la ironía visual característica del libro (ilustrada
  con botellas de cerveza) — contenido cortado, sigue en la próxima
  tanda.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

```java
class IfTest2 {
  public static void main(String[] args) {
    int x = 2;
    if (x == 3) {
      System.out.println("x must be 3");
    } else {
      System.out.println("x is NOT 3");
    }
    System.out.println("This runs no matter what");
  }
}
```

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- "Sharpen your pencil: DooBee" (pág. 109) — pendiente, ver
  EJERCICIOS.md. Clave de corrección guardada en Engram, sin mostrar
  hasta que el usuario entregue su intento.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Ninguna nueva esta tanda.

DUDAS QUE SURGIERON (y su respuesta corta)

- ¿Qué imprime `if (x==5) print("A") else print("B"); print("C");`
  con x=5? Respuesta del usuario incompleta: dijo solo "imprime A".
  Corrección: el `print("C")` está FUERA del if/else, así que corre
  siempre — salida real "AC" (todo pegado, son `print`, no `println`).

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 111, retomando "Coding a serious business
application").

SESIÓN #14 — 2026-07-16 — BottleSong (poniendo todo en práctica) + The Java-Enabled House (Ubicación pág. 111-117 de 1629, 9%)

IDEAS CLAVE

- Ejemplo integrador "BottleSong" (canción "10 green bottles"):
  combina int, String, while e if/else en un programa completo y
  realista. Trae un bug lógico sutil a propósito, para que el lector
  lo encuentre y lo arregle (ejercicio "spot the flaw").
- Narrativa "The Java-Enabled House": historia ilustrada (sin código)
  de electrodomésticos comunicándose entre sí vía Java, usada como
  gancho para el panorama real de Java en dispositivos embebidos.
- Java realmente se usa en: celulares, cajeros automáticos, tarjetas
  de crédito, sistemas de seguridad hogareños, parquímetros, consolas
  de videojuegos, desarrollo IoT y gran parte de Android. Contexto de
  panorama general, no para dominar en detalle.
- Arranca una sección nueva en pág. 117 (ilustración "phrase-o-matic"
  de jerga corporativa), cortada — sigue en la próxima tanda.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

```java
public class BottleSong {
  public static void main(String[] args) {
    int bottlesNum = 10;
    String word = "bottles";
    while (bottlesNum > 0) {
      if (bottlesNum == 1) {
        word = "bottle";
      }
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
      // ... (ver ejercicios/ej02-bottlesong/BottleSong.java para el código completo)
    }
  }
}
```

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- "BottleSong: encontrá y arreglá la falla" (pág. 111) — pendiente,
  ver EJERCICIOS.md. Archivo de arranque en
  ejercicios/ej02-bottlesong/BottleSong.java. Clave de corrección
  guardada en Engram, sin mostrar hasta que el usuario entregue su
  intento.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- El panorama de "Java en dispositivos embebidos/IoT" es útil como
  contexto de entrevista, pero es nicho para un junior backend — no
  hace falta profundizar, solo tener presente que existe.

DUDAS QUE SURGIERON (y su respuesta corta)

- En BottleSong, ¿el chequeo `if (bottlesNum == 1)` pasa antes o
  después de restarle 1 a bottlesNum? Respuesta del usuario incorrecta
  (dijo "después"). Corrección: en el código, la línea del chequeo
  está ANTES de la línea de la resta — se evalúa con el valor VIEJO de
  bottlesNum. Esa es justo la pista central del bug pendiente del
  ejercicio.

EJERCICIOS CREADOS: ninguno
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 117, retomando la sección cortada del
"phrase-o-matic").

SESIÓN #15 — 2026-07-17 — Phrase-O-Matic: arrays, java.util.Random, y Code Magnets (Ubicación pág. 117-122 de 1629, 9-10%)

IDEAS CLAVE

- Programa nuevo "Phrase-O-Matic": generador de frases de jerga
  corporativa/tech al azar (parodia del "buzzword bingo" — frases que
  suenan sofisticadas pero no dicen nada concreto, ej. "agnostic
  pub-sub DSL"). Primer uso real y explicado en detalle de ARRAYS.
- Array (arreglo): una sola variable que guarda VARIOS valores del
  mismo tipo, accedidos por posición numérica. Se declara
  `Tipo[] nombre = {valor1, valor2, ...};`.
- Los arrays son "zero-based" (indexado desde cero): la primera
  posición es el índice 0, la última es `length - 1` (NO `length`).
- `.length` da la cantidad de elementos del array — es una PROPIEDAD,
  sin paréntesis (no es un método).
- `java.util.Random`: clase de Java para generar números al azar.
  `new java.util.Random()` crea un generador — es, técnicamente, el
  primer OBJETO real que el libro usa en código (adelanto de POO, sin
  explicarlo formalmente todavía). `randomGenerator.nextInt(n)`
  devuelve un entero entre 0 (incluido) y n (sin incluir).
- El rango de `nextInt(oneLength)` (0 a oneLength-1) coincide EXACTO
  con el rango de índices válidos de un array de oneLength elementos
  — por diseño, nunca da un índice inválido. Evita la
  ArrayIndexOutOfBoundsException (excepción de índice fuera de rango).
- Ejercicio nuevo: "Code Magnets" (Imanes de Código) — reordenar
  pedazos de código desarmados para armar un programa Java que
  compile y dé una salida exacta. Es una sección de tipo "Exercise"
  (obligatoria).
- Arranca sección nueva "BE the Compiler" (pág. 122), cortada — sigue
  en la próxima tanda.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

```java
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated", ...};
        String[] wordListTwo = {"loosely coupled", "six sigma", ...};
        String[] wordListThree = {"framework", "library", ...};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
```

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- "Code Magnets: Shuffle1" (pág. 121-122) — pendiente, ver
  EJERCICIOS.md. Archivo de arranque en
  ejercicios/ej03-shuffle1/Shuffle1.java.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- `new java.util.Random()` es, sin que el libro lo diga todavía
  explícitamente, la primera vez que el código "crea un objeto" —
  vale la pena tenerlo presente para cuando el libro explique POO en
  serio: ya veniste usando uno sin saberlo.
- ArrayIndexOutOfBoundsException es un error de runtime muy común en
  Java real (junto con NullPointerException); entender por qué
  `nextInt(length)` lo evita acá es un buen ejemplo concreto de
  "diseñar para que un error ni pueda pasar".

DUDAS QUE SURGIERON (y su respuesta corta)

- ¿Cuál es el índice del último elemento de un array de 8 elementos?
  Respondida correctamente: 7 (índices desde 0, a diferencia de
  "cuántos hay" que se cuenta desde 1).
- ¿Por qué `nextInt(oneLength)` nunca da un índice inválido? Idea de
  fondo correcta pero mecanismo impreciso al principio (dijo "toma un
  número al azar entre el número de palabras" sin especificar el
  rango exacto). Aclarado: `nextInt(n)` da de 0 a n-1, que es EXACTO
  el rango de índices válidos de un array de n elementos — por eso
  nunca falla.

EJERCICIOS CREADOS: #03 (Code Magnets: Shuffle1, ver EJERCICIOS.md)
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 122, retomando "BE the Compiler" cortada).

SESIÓN #16 — 2026-07-19 — BE the Compiler + JavaCross + arranca Mixed Messages (Ubicación pág. 122-126 de 1629, 10%)

IDEAS CLAVE

- Cierre de la tanda anterior: la salida de "Shuffle1" (`a-b c-d`) queda
  confirmada en el propio libro, coincide con lo ya resuelto y
  completado en la Sesión #15.
- Arranca "BE the Compiler" (Sé el Compilador, pág. 123): sección tipo
  Exercise donde el lector tiene que actuar de compilador. Se dan 3
  "archivos fuente" completos (A, B, C) y hay que decidir, para cada
  uno, si compila o no — y si no compila, cómo arreglarlo. No es un
  ejercicio de sintaxis nueva: usa exactamente la jerarquía vista en
  las Sesiones #09 y #10 (archivo fuente → clase → método →
  instrucción), pero puesta a prueba con casos donde algún nivel de esa
  jerarquía falta o está mal ubicado.
- Arranca "JavaCross" (pág. 124-125): crucigrama con ícono Puzzle
  (opcional, no obligatorio) — la mayoría de las palabras salen del
  Capítulo 1, con algunas del mundo tech en general. Es 100% repaso de
  vocabulario ya visto; no aporta concepto nuevo, por eso queda como
  opcional y NO se registra como ejercicio pendiente obligatorio (el
  usuario puede resolverlo cuando quiera, avisando si lo hace).
- Arranca una sección nueva, "Mixed Messages" (pág. 126): un tipo de
  puzzle distinto — dado un programa con un bloque faltante, hay que
  emparejar cada "bloque candidato" de código con la salida que
  produciría si se insertara ahí (no todas las salidas se usan, y
  alguna puede repetirse). El contenido concreto (el programa y los
  bloques candidatos) todavía no apareció — la página quedó cortada,
  sigue en la próxima tanda.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- El código de "BE the Compiler" ES el enunciado del ejercicio — no se
  repite acá para no adelantar la solución (ver
  ejercicios/lib01-be-the-compiler.md para los 3 archivos completos).
- Concepto de fondo (ya visto, acá se pone a prueba en la práctica):
  una instrucción (`statement`), un `while` o un `if` NUNCA pueden
  estar sueltos ni directamente dentro del cuerpo de una clase — tienen
  que estar dentro de un método. Y un método NUNCA puede estar suelto
  fuera de toda clase — tiene que estar dentro de un `class { }`.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- "BE the Compiler" (pág. 123) — pendiente, ver EJERCICIOS.md. Archivo
  de arranque en ejercicios/lib01-be-the-compiler.md.
- "JavaCross" (pág. 124-125) — opcional (ícono Puzzle), no registrado
  como pendiente obligatorio; queda a disposición del usuario si quiere
  resolverlo más adelante.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- Las dos reglas estructurales que pone a prueba "BE the Compiler"
  (todo método dentro de una clase, toda instrucción dentro de un
  método) son, en la vida real, la causa de un error de compilador
  clásico y muy común en principiantes: "class, interface, enum, or
  record expected" o llaves de más/de menos — vale la pena tenerlas
  automatizadas antes de seguir.

DUDAS QUE SURGIERON (y su respuesta corta)

- ¿Por qué un método sin clase no compila? Respuesta inicial correcta
  en esencia pero con un matiz a pulir: no es que "no se encuentra la
  clase" (eso suena a búsqueda en tiempo de ejecución) — es un error de
  SINTAXIS en tiempo de compilación: la gramática de Java solo permite
  `package`, `import` y declaraciones de clase/interfaz/enum/record a
  nivel de archivo; un método suelto ahí no es una construcción válida.
- Confusión real y valiosa: "¿un `while` sería un método?" — Not, y fue
  un lindo punto de partida para separar dos ideas que se pisaban: las
  llaves `{ }` no son "de método", son de BLOQUE (las usa cualquier
  cosa que agrupe instrucciones: clase, método, while, if). Lo que
  hace a un método ser método es tener NOMBRE y poder ser LLAMADO desde
  otro lado (`dog.bark();`); un `while` no tiene nombre, no se llama,
  corre en el lugar exacto donde está escrito, como parte de las
  instrucciones del método que lo contiene.
- Ejercicio "BE the Compiler": primer intento de la C decía que sí
  compilaba (por tener nombre de clase, aunque sin main). Se explicó
  con la analogía del "menú de la clase" (solo puede listar qué TIENE
  -variables- y qué SABE HACER -métodos con nombre-, nada más suelto).
  Segundo intento, correcto: no compila porque al `while` le falta el
  método que lo envuelva. Detalle en EJERCICIOS.md.

EJERCICIOS DEL LIBRO COMPLETADOS: "BE the Compiler" (pág. 123) —
completado 2026-07-19 tras dos intentos en la C, ver EJERCICIOS.md
para el detalle y el primer repaso agendado el 2026-07-22.

EJERCICIOS CREADOS: ninguno (BE the Compiler es del libro, registrado
en EJERCICIOS.md)
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 126, retomando "Mixed Messages" cortada).

SESIÓN #17 — 2026-07-19 — Mixed Messages completo + Pool Puzzle (Ubicación pág. 127-131 de 1629, 10%)

IDEAS CLAVE

- Se completa "Mixed Messages" (arrancada cortada en la Sesión #16):
  un programa `Test` con un `while` que le falta un bloque de código.
  Se dan 5 bloques candidatos y 8 salidas posibles de consola; hay que
  emparejar cada candidato con la salida que produciría si se
  insertara en el hueco (no todas las salidas se usan, y alguna se
  puede repetir). Es un ejercicio de TRAZAR el programa a mano, vuelta
  por vuelta del `while`, sin ejecutarlo en la compu.
- Punto de sintaxis clave para no confundirse: `x + "" + y + " "` con
  `x` e `y` enteros NO suma los números — los concatena como texto
  (uno pegado al otro, sin espacio entre ellos, con un espacio
  después). Si `x` vale 4 e `y` vale 10, imprime `410 ` (texto), no
  `14` (la suma numérica). Es la misma idea de concatenación con `+`
  que ya vimos con Strings, pero ahora mezclada con números — un punto
  clásico de trampa/entrevista.
- Arranca "Pool Puzzle" (pág. 129-131): un tipo de puzzle nuevo, con
  ícono Puzzle (opcional). Se da una clase con VARIOS espacios en
  blanco (condiciones dentro de `while`/`if`, asignaciones, y
  `System.out.print(...)`), y una "pileta" (pool) de fragmentos sueltos
  para completar esos espacios. Reglas: cada fragmento se usa como
  máximo UNA vez, y no hace falta usarlos todos. El objetivo es que el
  programa compile, corra, y produzca una salida EXACTA armada
  letra por letra con varios `print()` seguidos (sin `println`, para
  que todo quede pegado en la misma línea hasta el `System.out.println()`
  final de cada vuelta).
- El propio libro avisa que Pool Puzzle "es más difícil de lo que
  parece" — necesita pensar en simultáneo la condición del `while`,
  varios `if` anidados, y en qué orden se van pegando los `print()`
  para armar la palabra final.

CÓDIGO CLAVE (el Java esencial de la tanda, ya explicado en el chat)

- El código de ambos ejercicios ES el enunciado — no se repite acá
  para no adelantar la solución (ver ejercicios/lib02-mixed-messages.md
  y ejercicios/ej04-pool-puzzle/PoolPuzzleOne.java).
- Concepto reforzado (ya visto, puesto a prueba en la práctica): un
  `System.out.print(x + "" + y + " ")` con `x`/`y` `int` concatena
  texto, no suma números — Java decide sumar o concatenar según el
  tipo de los operandos y el orden en que aparece cada `+`.

EJERCICIOS DEL LIBRO EN ESTA TANDA (nombre + hecho/pendiente)

- "Mixed Messages" (pág. 127-129) — pendiente, ver EJERCICIOS.md.
  Archivo de arranque en ejercicios/lib02-mixed-messages.md.
- "Pool Puzzle" (pág. 129-131) — pendiente, OPCIONAL (ícono Puzzle),
  ver EJERCICIOS.md. Archivo de arranque en
  ejercicios/ej04-pool-puzzle/PoolPuzzleOne.java.

NOTA DEL PROFE (cosas que el libro no dice pero importan)

- La trampa de `x + "" + y` (concatenación vs. suma según el tipo) es
  un clásico de entrevista de Java junior: preguntan qué imprime
  `System.out.println(1 + 2 + "3")` (da "33", suma primero porque son
  dos int, después concatena con el String) vs.
  `System.out.println("1" + 2 + 3)` (da "123", concatena todo porque
  arranca con String) — vale la pena tenerlo mentalmente afilado.

DUDAS QUE SURGIERON (y su respuesta corta)

- ¿Qué imprime `System.out.print(x + "" + y + " ")` con x=12, y=3?
  Respuesta correcta en lo esencial (concatena "12" y "3" sin sumar),
  pero faltaba el espacio final literal del `" "` — se aclaró que ese
  espacio es justo lo que separa cada vuelta del while en la salida
  final (ej. el espacio en el medio de "22 46").
  Segunda pregunta (qué corta la línea entre "annoys" y "an oyster" en
  Pool Puzzle): respondida bien, `System.out.println();` vacío.

EJERCICIOS CREADOS: ninguno (ambos son del libro, registrados en
EJERCICIOS.md como #04 y LIBRO Mixed Messages)
EJERCICIOS DEL LIBRO COMPLETADOS: "Mixed Messages" (pág. 127-129) —
completado 2026-07-19, 5 de 5 candidatos correctos a la primera (ver
EJERCICIOS.md para la traza completa y el repaso agendado el
2026-07-23).
PRÓXIMO PASO: seguir con la siguiente tanda de páginas del libro (a
partir de la página 132).

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
