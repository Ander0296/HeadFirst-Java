# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda del libro (tamaño según formato: 6-10
páginas si vino como texto, 3-5 si vino como pantallazos), explicada en
español y conectada con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página estudiada: página 208 de 1629 (14%) — spillage (derrame): el compilador chequea el TIPO, no el valor, y las 3 formas de asignar. Faltan por ver: el código de la clase Player (se salteó la pág. 177) y la página 201 (también salteada). Ver Sesión #33.
- Última sesión: Sesión #33
- Ejercicios pendientes: 3 — Pool Puzzle original (Sesión #17, OPCIONAL), Pool Puzzle "Echo" (EJERCICIO #07, OPCIONAL), "Who Am I?" (lib06, EN CURSO, intento 2 hecho). Estados completos, fechas y repasos: ver EJERCICIOS.md (fuente de verdad; esta línea solo lista lo pendiente).
- IMPORTANTE — spoiler pendiente: las páginas 197-199 (soluciones oficiales de Pool Puzzle "Echo" y de "Who Am I?") ya fueron leídas por Claude pero NO explicadas al usuario a propósito, para no arruinar esos dos ejercicios en curso. Retomarlas recién cuando el usuario termine ambos.
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
| string concatenation                | concatenación de Strings | Lo que hace el operador `+` cuando al menos uno de los dos lados es un String: PEGA los dos valores en un texto nuevo (no suma números). Ej: `"Dog: " + name` con `name="Fido"` da `"Dog: Fido"`. |
| spec (specification)               | especificación | Documento que describe QUÉ tiene que hacer un programa, sin decir CÓMO programarlo. |
| attribute (adelanto)               | atributo | Dato propio que tiene cada objeto (ej. el punto de rotación de una Amoeba); adelanto informal de "instance variable" (variable de instancia), que se ve formal más adelante. |
| encapsulation (adelanto, sin nombrar aún) | encapsulamiento | Que el comportamiento y los datos de una "cosa" vivan juntos y aislados dentro de su propia clase, así un cambio ahí no obliga a tocar el resto del programa. Visto en acción en "Chair Wars", nombre formal más adelante. |
| inheritance                        | herencia | Relación donde una clase (subclase) recibe automáticamente los métodos y atributos de otra clase más general (superclase), sin volver a escribirlos. |
| superclass                          | superclase | Clase más general/abstracta que define comportamiento común para sus subclases (ej. Shape). |
| subclass                            | subclase | Clase más específica que hereda de una superclase (ej. Square, Circle, Triangle, Amoeba heredan de Shape). |
| override (method overriding)       | hacer override / sobrescribir | Una subclase redefine un método que heredó, cuando necesita cambiar o extender su comportamiento. La JVM decide en runtime qué versión correr según el tipo real del objeto. |
| invoke (a method)                   | invocar (un método) | Llamar a un método SOBRE un objeto puntual (ej. invocar rotate() sobre el objeto triángulo); el resto del programa no necesita saber cómo lo hace ese objeto por dentro. |
| polymorphism (adelanto)             | polimorfismo | Cuarto pilar de POO (junto a encapsulamiento, herencia y abstracción); mencionado de pasada en un chiste, se ve formal más adelante. |
| instance variable                   | variable de instancia | Dato que un objeto SABE sobre sí mismo (su estado); cada objeto de la misma clase puede tener un valor distinto. Nombre formal de lo que veníamos llamando "atributo". |
| instance                            | instancia | Otra forma de decir "objeto": un objeto ES una instancia de su clase. |
| getter / setter                     | método getter / setter | Método que LEE (get) o ESCRIBE (set) el valor de una instance variable, ej. `getAlarmTime()` / `setAlarmTime()`. |
| Objectville                          | Objectville (nombre de broma) | Nombre humorístico e inventado del libro para el mundo real de la POO, donde los objetos hablan entre sí (se llaman methods unos a otros) en vez de que todo lo haga un único main(). No es un término técnico real de Java. |
| default value                        | valor por defecto | Valor que Java le asigna automáticamente a una instance variable que nunca recibió un valor explícito: `0` para numéricos, `false` para boolean, `null` para tipos de referencia (objetos, String) — nunca queda "vacía". |
| the heap                              | el heap (montón) | Área de memoria donde viven TODOS los objetos creados con `new` en Java; se libera automáticamente vía garbage collection, nunca a mano. |
| garbage collection                    | recolección de basura | Proceso automático de la JVM que libera la memoria de objetos que ya no se pueden usar (nada los referencia), para poder reusar ese espacio. |
| eligible for garbage collection       | elegible para recolección de basura | Estado de un objeto cuando la JVM detecta que ya no puede usarse nunca más; recién ahí el Garbage Collector puede liberar su espacio. |
| static method                          | método estático | Method que pertenece a la clase EN SÍ MISMA, no a un objeto particular; se llama directo sobre el nombre de la clase, sin `new` (ej. `Math.random()`). |
| cast (type casting)                    | cast (conversión de tipo) | Conversión explícita de un tipo de dato a otro, ej. `(int)` para convertir un `double` a `int` cortando (truncando) su parte decimal, sin redondear. |
| OR operator (\|\|)                     | operador OR / "o" (`\|\|`) | Da `true` si AL MENOS UNA de las condiciones que conecta es `true`; solo da `false` si TODAS son `false`. |
| break                                   | break | Instrucción que corta de inmediato un bucle (`while`/`for`), sin importar su condición; se usa típicamente dentro de un `if` para salir apenas se cumple algo. |
| JAR file (.jar)                        | archivo JAR (Java ARchive) | Formato para empaquetar todas las clases compiladas de una app Java en un solo archivo (basado en pkzip), para no entregar cientos de archivos sueltos. |
| manifest (del jar)                      | manifiesto (del JAR) | Archivo de texto simple dentro de un JAR que indica cuál clase de ese JAR contiene el `main()` que hay que ejecutar. |
| constant (public static final)          | constante (`public static final`) | Patrón para declarar un valor "global" real en Java: `public` lo hace accesible desde cualquier código, `static` lo liga a la clase (no a un objeto), `final` impide que cambie de valor. Se profundiza en el Capítulo 10. |
| primitive (primitive type)              | primitiva (tipo primitivo) | Tipo de dato que guarda el VALOR real directo (no una referencia): `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`. Cada uno tiene un tamaño fijo en bits. |
| object reference (reference variable)   | referencia a objeto | Variable que en vez de guardar el valor directo, guarda la dirección de un objeto que vive en el heap. Se profundiza en las próximas páginas del Capítulo 3. |
| char                                     | char (carácter) | Primitiva de 16 bits que guarda UN SOLO carácter, con comillas SIMPLES (`'f'`) — distinto de `String`, que usa comillas dobles y guarda una secuencia de caracteres. |
| signed (numeric types)                   | con signo | Que un tipo numérico admite valores negativos y positivos (todos los enteros y decimales de Java lo son). |
| literal suffix (L, f)                    | sufijo de literal (`L`, `f`) | Letra al final de un número literal para decirle al compilador de qué tipo es exactamente, ej. `3456789L` (long) o `32.5f` (float), evitando que lo confunda con `int` o `double`. Puede ir en mayúscula o minúscula. |
| spillage                                 | derrame | Lo que pasaría si se intentara meter un valor de un tipo grande en una variable de un tipo más chico. El compilador lo previene mirando los TIPOS, no los valores: `int x = 24; byte b = x;` no compila. |
| literal (literal value)                  | literal (valor literal) | Valor escrito directamente en el código, no calculado ni tomado de otra variable: el `12` de `x = 12;`, el `true` de `isGood = true;`, el `'j'` de `char initial = 'j';`. |
| assignment                               | asignación | Acto de poner un valor dentro de una variable con `=`. Es SEPARABLE de la declaración: se puede declarar primero (`boolean listo;`) y asignar después (`listo = true;`). |

============================================================
(SESIONES — desde la #30 en formato CORTO: 5-8 bullets, sin bloques
de código, máximo ~15 líneas por sesión. Las sesiones #01 a #29, en
el formato largo original, están en GUIA-ARCHIVO.md.)
============================================================

SESIÓN #30 — 2026-07-24 — Who Am I? + soluciones oficiales del Capítulo 2 (pág. 191-195, 13%)
- Ejercicio nuevo "Who Am I?": 13 frases para identificar quién habla (clase, objeto, method o instance variable).
- Soluciones oficiales del libro: DrumKit valida la solución del usuario (el if oficial también queda muerto, forzado por los imanes).
- BE the Compiler A y B validados: arreglo A idéntico al oficial; en B el libro imprime episodeNumber pero cualquier play() válido sirve.
- Concepto nuevo: el compilador chequea que objeto.metodo() exista declarado en la clase — error de compilación si falta.
- Concepto nuevo: un archivo .java puede tener varias clases; solo la pública debe llamarse como el archivo.
- Ejercicios de la tanda: "Who Am I?" (lib06, pendiente).
- Dudas: pregunta de comprensión (¿method inexistente falla al compilar o al ejecutar?) respondida MAL — dijo "al ejecutar". Segunda confusión compile-time vs. runtime de la semana (la primera fue el repaso r1 de BE the Compiler). Regla enseñada: si el compilador puede saberlo leyendo el código quieto → compilación; si depende de algo que pasa en vivo → ejecución. La contrapregunta (input del usuario → runtime) la respondió BIEN. Vigilar en el r2 del 2026-07-27.
- PRÓXIMO PASO: seguir con el resto de las soluciones (falta la del Pool Puzzle Echo, no mirarla hasta resolver el EJERCICIO #07) y arrancar el Capítulo 3.

SESIÓN #31 — 2026-07-24 — Arranque del Capítulo 3: Primitives and References (pág. 200, 13%)
- Portada del Capítulo 3, "Know Your Variables: Primitives and References" (Conocé tus variables: primitivas y referencias).
- Idea clave adelantada (se profundiza en próximas páginas): en Java hay dos familias de tipos — primitivos (`int`, `float`, `long`...) que guardan el valor directo, y referencias, que guardan la dirección de un objeto que vive en el heap.
- Limpieza de paginas/: se detectaron y borraron 12 capturas sueltas de una sesión de Vim/terminal ajenas al libro, mezcladas por error con las páginas reales.
- Ejercicios de la tanda: ninguno nuevo. "Who Am I?" (lib06) sigue en curso, intento 2 corregido en el chat.
- Dudas: ninguna.
- PRÓXIMO PASO: seguir el Capítulo 3 desde la pág. 201. Las páginas 197-199 (soluciones de Pool Puzzle Echo y Who Am I) quedan pendientes de explicar hasta que el usuario termine esos dos ejercicios.

SESIÓN #32 — 2026-07-24 — Las 8 primitivas de Java y la analogía del vaso (pág. 200-206, salteada la 201, 13%)
- Analogía central: una variable es un vaso (cup) — tiene un tamaño (bits) y un tipo, y contiene un valor.
- Las 8 primitivas con su tamaño: byte(8), short(16), int(32), long(64), float(32), double(64), boolean(tamaño según la JVM), char(16, valor 0-65535).
- Concepto nuevo: `char` usa comillas SIMPLES (`'f'`) y guarda un solo carácter; distinto de `String` (comillas dobles).
- Concepto nuevo: sufijos de literal `L` (long) y `f` (float), para que el compilador no confunda tipos numéricos parecidos.
- Confirmado con el usuario (2/2 bien): en `int z = x;`, `z` copia el VALOR de `x` en ese momento — si `x` cambia después, `z` no se entera.
- Se saltó la página 201 (pendiente, junto con la pág. 177 de la clase Player).
- Ejercicios de la tanda: ninguno.
- PRÓXIMO PASO: seguir el Capítulo 3 desde la página 207.

SESIÓN #33 — 2026-07-25 — Spillage: el compilador mira el tipo, no el valor (pág. 207-208, 14%)
- Página 207 es solo la foto del té desbordando un vaso chico: refuerzo visual de la analogía de la pág. 206, sin contenido nuevo.
- Concepto central: **spillage** (derrame). `int x = 24; byte b = x;` NO compila, aunque 24 entre de sobra en un byte.
- El porqué: el compilador razona sobre TIPOS declarados, no sobre valores. Ve int (32 bits) → byte (8 bits) y frena por la POSIBILIDAD de derrame. Conecta con compile-time vs. runtime (Sesión #08/#11).
- Nota del profe: `byte b = 24;` SÍ compila (literal, el compilador lo verifica); `byte b = x;` no (variable, solo ve el tipo). Para forzarlo existe el cast `(byte) x` — el libro lo ve más adelante, todavía no usarlo.
- Las 3 formas de asignar: literal (`x = 12;`), otra variable (`x = y;`), expresión (`x = y + 43;`).
- Declarar y asignar son actos SEPARABLES: `boolean isLearning;` crea el vaso vacío, `isLearning = true;` le pone el contenido.
- Erratum del libro: en la tabla de la pág. 208 el código dice `isLearning` y la descripción de al lado dice `isCrazy`. No cambia el concepto.
- Ejercicios de la tanda: ninguno todavía — al pie de la pág. 208 arranca un "Sharpen your pencil" cuyo enunciado está en la página siguiente.
- Dudas: ninguna.
- PRÓXIMO PASO: página 209, el "Sharpen your pencil" que quedó abierto.

# ============================================================
# FORMATO DE CADA SESIÓN (referencia para Claude — copiar y llenar)
# Formato CORTO obligatorio: 5-8 bullets, SIN bloques de código (el
# código ya vive en el chat, el libro y los ejercicios), sin narrar
# las dudas (solo tema + veredicto en una línea). Máx ~15 líneas.
# ============================================================

SESIÓN #NN — [fecha] — [tema] (pág. X-Y, Z%)
- [idea clave 1, una línea]
- [idea clave 2...]
- Ejercicios de la tanda: [nombre + pendiente/completado, o "ninguno"]
- Nota del profe: [solo si la hubo, una línea]
- Dudas: [tema + bien/corregido en una línea, o "ninguna"]
- PRÓXIMO PASO: [una línea]
