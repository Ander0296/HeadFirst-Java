# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda del libro (tamaño según formato: 6-10
páginas si vino como texto, 3-5 si vino como pantallazos), explicada en
español y conectada con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página estudiada: página 367 de 1629 (22%) — Capítulo 5, código completo de `getUserInput()` en `GameHelper`, corrida de ejemplo del juego funcionando bien, y un bug expuesto a propósito ("yours to solve": entrar 1,1,1 da hit-hit-kill) que el libro deja sin resolver para el próximo capítulo. Ver Sesión #67. Próximo: pág. 368 en adelante ("More about for loops"). Páginas salteadas pendientes: código de la clase Player (177), 201, 209, 213, 215-217, 226, 233, 237-238, 241, 253, 256, 261, 268-269, 271, 285, 287, 300, 306, 310 (resto de "Who Am I?"), 326, 328, 332, 334, 336, 342, 344, 347, 355, 364, 366.
- Última sesión: Sesión #67
- Última sesión de Claude: java-s40 (cubrió la Sesión #67) → la
  próxima es java-s41. Contador distinto al de arriba; el /rename sale de ACÁ.
- Ejercicios pendientes: 9 — "¿legal o no?" (lib07), "Five-Minute Mystery" (lib12), "¿qué más testear?" (lib13) y "Yours to solve" (lib15, el bug de SimpleStartupGame) son los NO opcionales; los otros 5 son OPCIONALES: Pool Puzzle original (Sesión #17), "Echo" (EJ #07), "Triangle" (EJ #10), "A Heap o' Trouble" (lib08) y Pool Puzzle "Puzzle4" (EJ #12). Fechas y repasos: ver EJERCICIOS.md.
- SPOILERS leídos por Claude y NO explicados a propósito: pág. 197-199 (Echo, EJ#07), pág. 257 (lib07), pág. 260+262 (Triangle, EJ#10), pág. 262-263 (Heap, lib08), pág. 319 (respuestas de "Who Am I?", diferido) y pág. 319-321 (solución y salida completas de Puzzle4, EJ#12) y pág. 321 (respuesta del Five-Minute Mystery nuevo, lib12). Retomarlas recién cuando el usuario entregue cada ejercicio, o si los da de baja.
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
| reserved word / keyword           | palabra reservada | Palabra que el compilador ya tiene tomada con un significado del lenguaje; no se puede usar como nombre propio (public, static, void, int...). |
| Sharpen your pencil               | Afilá el lápiz | Sección recurrente del libro con ejercicios de papel (sin compilar nada). |
| Make it Stick                     | Hacé que se te pegue | Recuadro del libro con trucos de memoria (mnemotecnias) para fijar una lista. |
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
| BULLET POINTS                      | Puntos clave | Recuadro de resumen al final de cada capítulo del libro: la lista de ideas que hay que llevarse. |
| compile and run without exception  | compilar y ejecutarse sin excepción | Dos condiciones distintas: que el compilador acepte el código, Y que además no reviente en tiempo de ejecución. |
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
| bit pattern                           | patrón de bits | Lo único que compara el operador `==`; no le importa qué representan esos bits (un valor primitivo o la dirección de un objeto). |
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
| dot operator (.)                         | operador punto (`.`) | "Usá lo de antes del punto para conseguir lo de después del punto": `myDog.bark();` = con el objeto referenciado por `myDog`, invocá `bark()`. Como apretar un botón del control remoto de ESE objeto. |
| There are no dumb questions           | No hay preguntas tontas | Sección recurrente del libro con preguntas y respuestas cortas sobre dudas típicas del tema recién visto. |
| Java Exposed                          | Java al descubierto (nombre de broma) | Sección de humor recurrente que parodia una entrevista de revista, personificando un concepto de Java (esta vez, una Object Reference) para explicarlo desde su "punto de vista". |
| null                                  | nulo (palabra reservada) | Valor de una variable de referencia que no se refiere a ningún objeto: el "control remoto" existe pero no está programado a ninguna tele. Solo aplica a referencias, nunca a primitivas. |
| final (en una referencia)             | final | Modificador que impide REASIGNAR la variable: una vez que apunta a un objeto, no puede apuntar a otro. Lo que queda fijo es a cuál se refiere, no el contenido del objeto. |
| NullPointerException (NPE)            | excepción de puntero nulo | Error de EJECUCIÓN que salta al invocar un método o leer un dato sobre una referencia que vale `null`. Compila igual: el compilador no ve valores. El error más común de Java. |
| to be redirected / reprogrammed       | ser redirigida / reprogramada | Que una variable de referencia pase a referirse a OTRO objeto del mismo tipo, como reprogramar el control remoto a otra tele. |
| active reference                      | referencia activa | Variable de referencia que efectivamente apunta a un objeto. Una que vale `null` NO cuenta como activa: existe, pero no controla nada. |
| reachable object                      | objeto alcanzable | Objeto del heap al que todavía se puede llegar desde al menos una referencia activa. Es la única pregunta que hace el garbage collector: si no es alcanzable, es basura. |
| Life and death on the heap            | Vida y muerte en el heap | Sección del Capítulo 3 que recorre paso a paso cuándo un objeto deja de ser alcanzable y pasa a ser recolectable. |
| abandoned object                      | objeto abandonado | Objeto del heap que perdió su última referencia activa: nadie puede llegar a él y queda a la espera del garbage collector. |
| null reference                        | referencia nula | Variable de referencia cuyo valor es `null`. Sigue existiendo y se le puede asignar otro objeto después; simplemente ahora no controla ninguno. |
| toast (jerga) / garbage-collector bait | frito, liquidado / carnada del recolector | Forma informal del libro para decir que un objeto ya es basura: está condenado, solo falta que el GC pase a buscarlo. |
| array                                 | arreglo (o vector) | Objeto que guarda una lista ordenada de elementos del mismo tipo, con acceso directo por posición. |
| array element                         | elemento del arreglo | Cada casillero del arreglo. Es una variable común: guarda una primitiva o una referencia, según el tipo del arreglo. |
| index (position)                      | índice (posición) | Número que identifica un casillero del arreglo y permite llegar a él de forma directa, sin recorrer los anteriores. |
| array notation                        | notación de arreglo | Escribir `arreglo[índice]` para nombrar un elemento. Donde iría el nombre de una variable, va eso: `myDogs[0].bark()`. |
| implicit widening                     | ensanchamiento implícito | Java acepta sin pedir permiso un valor de tipo chico donde va uno más grande (un `byte` en un arreglo de `int`), porque no se puede perder nada. |
| spillage (jerga)                      | derrame | Forma del libro de decir que un valor no entra en una variable más chica (un `double` en un `int`); por eso el compilador lo rechaza. |
| lurking                               | agazapado, al acecho | Del chiste del libro: un `Cat` escondido dentro de un arreglo de `Dog`. Java lo impide chequeando el tipo en compilación. |
| state                                 | estado | Lo que un objeto SABE: el conjunto de valores que tienen sus instance variables en un momento dado. |
| behavior                              | comportamiento | Lo que un objeto SABE HACER: sus methods. Actúa sobre el estado y también puede modificarlo. |
| blueprint                             | plano, molde | La clase es el "blueprint" del objeto: describe cómo la JVM debe fabricar cada objeto de ese tipo. |
| argument                              | argumento | El VALOR concreto que quien llama pone entre paréntesis: el 3 de `d.bark(3);`. |
| parameter                             | parámetro | La VARIABLE LOCAL declarada entre los paréntesis del método, donde aterriza el argumento: el `int numOfBarks` de `void bark(int numOfBarks)`. |
| to pass / to take                     | pasar / tomar | Convención del libro: "A caller passes arguments. A method takes parameters." (Quien llama pasa argumentos. Un método toma parámetros.) |
| return type                           | tipo de retorno | Lo que un método devuelve, declarado ANTES de su nombre. `void` significa "no devuelve nada". |
| return (palabra reservada)            | devolver | Termina el método y manda el valor de vuelta a quien lo llamó: `return 42;`. |
| pass-by-value / pass-by-copy          | pasaje por valor / por copia | Java SIEMPRE pasa una COPIA del valor al método: el original de quien llamó no se toca. |
| These types must match                | Estos tipos tienen que coincidir | El tipo de la variable que recibe y el tipo de retorno del método tienen que ser el mismo. |
| foo / bar                             | (nombres de relleno) | Metasyntactic variables: nombres genéricos sin significado, tipo "fulano y mengano". Nunca usarlos en código real. |
| return                                | devolver, retornar | Mandar un valor de vuelta a quien llamó al método. |
| getter                                | getter | Método que devuelve el valor de una instance variable; convención: `get` + nombre con mayúscula inicial, sin parámetros. |
| setter                                | setter | Método que asigna el valor de una instance variable; convención: `set` + nombre con mayúscula inicial, un parámetro, `void`. |
| accessor                              | accesor | Nombre formal alternativo de "getter". |
| mutator                               | mutador | Nombre formal alternativo de "setter". |
| encapsulation                         | encapsulación, encapsulamiento | Esconder las instance variables de un objeto y forzar que se lean/modifiquen solo vía getters/setters. |
| faux pas                              | metida de pata | Error o torpeza social (término francés); el libro lo usa en broma para "dejar los datos expuestos". |
| this (adelanto)                       | this | Palabra reservada que dentro de un método/constructor se refiere al objeto actual; se usa para distinguir un parámetro de una instance variable con el mismo nombre (`this.size = size;`). Se formaliza más adelante. |
| access modifier                       | modificador de acceso | Palabra reservada que define quién puede tocar algo: `public` (cualquiera) o `private` (solo la propia clase). |
| private                               | privado | Modificador que restringe el acceso a la propia clase: nadie de afuera puede leer ni asignar esa variable con el operador punto. |
| rule of thumb                         | regla práctica | Guía general que funciona en la mayoría de los casos, sin ser una ley exacta. |
| throw an Exception (adelanto)         | lanzar una excepción | Que un método avise a los gritos que algo salió mal en vez de seguir en silencio; una de las salidas posibles de un setter. Capítulo propio más adelante. |
| overhead                              | costo/sobrecarga | Trabajo extra que agrega una solución; el libro aclara que el de un setter es minúsculo y casi nunca justifica exponer la variable. |
| water cooler                          | dispensador de agua | Rincón de oficina donde se charla y se chusmea; "overheard at the water cooler" = chisme de oficina. |
| default / package-private access      | acceso por defecto / de paquete | Nivel de acceso de un método o variable declarado SIN modificador; visible solo desde clases del mismo paquete (ni public ni private). |
| local variable                        | variable local | Variable declarada DENTRO de un método (no en la clase); a diferencia de las instance variables, Java no le pone valor por defecto: hay que inicializarla antes de usarla o el compilador la rechaza. |
| prep code                             | código de preparación | Forma de pseudocódigo para enfocarse en la LÓGICA de una clase/método sin preocuparse por la sintaxis; se escribe antes del test code. (Corregido en Sesión #61: la definición anterior tenía el foco al revés.) |
| test code                             | código de prueba | Clase o métodos que prueban el real code y validan que hace lo correcto; se escribe después del prep code y antes del real code. |
| real code                             | código real | La implementación real de la clase, ya en sintaxis Java de verdad — el último de los 3 pasos (prep code → test code → real code). |
| Test-Driven Development (TDD)         | desarrollo guiado por pruebas | Práctica de escribir el test code ANTES de que exista el método a probar; obliga a pensar qué debe hacer el método antes de programarlo. |
| stub code                             | código truncado / placeholder | Código mínimo que compila pero siempre falla (ej: `return null`), escrito solo para que un test recién creado pueda ejecutarse aunque el método real todavía no esté implementado. |
| enhanced for loop / for-each loop     | bucle for mejorado | `for (int x : arr)` recorre cada elemento de `arr` sin índice manual; existe desde Java 5. El `for` clásico sigue siendo válido. |
| increment/decrement operator          | operador de incremento/decremento | `x++` equivale a `x = x + 1`; `x--` equivale a `x = x - 1`. |
| break (statement)                     | corte de bucle | Corta la ejecución del bucle de inmediato, sin evaluar la condición ni las vueltas que faltan. |
| Ready-Bake Code                       | código listo para hornear | Código que el libro pide tipear tal cual (sin haberlo diseñado vos); se entiende en detalle más adelante. |
| Scanner                               | Scanner (clase) | Clase de `java.util` que envuelve una fuente de datos (como el teclado) para poder leerla con métodos como `nextInt()`. |
| System.in                             | System.in | El flujo de entrada estándar de Java: por defecto, representa el teclado. |
| cliffhanger                           | final en suspenso | Recurso narrativo: corta la historia en el momento de mayor tensión para enganchar con el próximo capítulo. |

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

SESIÓN #34 — 2026-07-25 — Reglas para nombrar y palabras reservadas (pág. 210-214, 14%)
- Pág. 210: enunciado del "Sharpen your pencil" — 12 líneas de asignación entre primitivas, marcar cuáles compilan. Regla que da el libro: de vaso CHICO a vaso GRANDE se puede; al revés no (spillage, Sesión #33).
- Pág. 211: mnemotecnia "Be Careful! Bears Shouldn't Ingest Large Furry Dogs" para las 8 primitivas (B C B S I L F D). Es un recurso de memoria en inglés; el libro invita a inventar la propia.
- Pág. 212 (el 80% de la tanda): un nombre (clase, método o variable) debe empezar con letra, `_` o `$`; nunca con número. Del segundo carácter en adelante sí van números. Y no puede ser una palabra reservada.
- Palabra reservada (reserved word / keyword): palabra que el compilador ya tiene tomada. `public`, `static`, `void` y las 8 primitivas son reservadas.
- El libro dice EXPLÍCITAMENTE que no hay que memorizar la lista de reservadas ahora: se aprenden usándolas.
- Nota del profe: `$` es legal pero NUNCA se usa (se reserva para código generado); `_` solo, desde Java 9, es palabra reservada y ya NO compila como nombre. Convención real: camelCase para variables/métodos, PascalCase para clases, MAYUS_CON_GUION_BAJO para constantes.
- Pág. 214: viñeta del oso repitiendo la mnemotecnia. Sin contenido nuevo.
- Ejercicios de la tanda: LIBRO "¿legal o no?" (lib07, pág. 210) — pendiente.
- Dudas: invirtió la nota del `_` (creyó que fallaba `_total`) — corregido: falla `int _ = 7;` porque el `_` SOLO es palabra reservada, igual que `int int = 5;`. La regla del primer carácter no cambió.
- PRÓXIMO PASO: página 215 (y quedaron salteadas la 209 y la 213).

SESIÓN #35 — 2026-07-25 — Referencias: el control remoto del objeto (pág. 214 resto, 218-220, 14%)
- Pág. 214 (resto, tras la tabla de reservadas): "Controlling your Dog object" — analogía CLAVE del capítulo: una variable de referencia a objeto es como un CONTROL REMOTO del objeto, no el objeto en sí. `d.bark()` es apretar el botón `bark` de ESE control remoto.
- Pág. 218: no existe "variable de objeto", solo variable de REFERENCIA a objeto. Sus bits representan una MANERA de acceder al objeto (como un puntero/dirección que administra sola la JVM), nunca el objeto en sí. Los objetos viven SOLO en el heap (Sesión #27/#31).
- Pág. 218: operador punto (dot operator) formalizado: "usá lo de antes del punto para conseguir lo de después del punto" — `myDog.bark();` = con `myDog`, invocá `bark()`.
- Pág. 219-220: retoma la analogía del vaso (Sesión #32): el vaso `reference` tiene el mismo formato que `byte`/`short`/`int`/`long`, pero adentro guarda un control remoto, no un número. Frase clave del libro en negrita: "el objeto Dog en sí NO va a la variable".
- Ejercicios de la tanda: ninguno nuevo (tramo puramente conceptual).
- Salteadas: 215, 216 y 217 (se suman a 177, 201, 209 y 213 pendientes).
- Dudas: pregunta de comprensión respondida MAL — dijo que `Auto a = new Auto();` guarda el objeto Auto completo en `a`. Corregido: `a` guarda la referencia (el control remoto); el objeto vive solo en el heap. La segunda pregunta (qué hace el operador punto) SÍ salió bien.
- PRÓXIMO PASO: página 221.

SESIÓN #36 — 2026-07-26 — Los 3 pasos de `new` + Java no es C (pág. 221-224, 14%)
- Formaliza `Dog myDog = new Dog();` en 3 pasos: (1) declarar la variable de referencia (el control remoto, tipeado para siempre a `Dog`), (2) crear el objeto en el heap (adelanto al Cap. 9, "Life and Death of an Object"), (3) vincular ambos con `=` ("programa el control remoto").
- Dato nuevo: todas las referencias de una misma JVM pesan lo mismo entre sí, sin importar el tamaño del objeto al que apuntan; lo que varía en tamaño son los objetos, no las referencias.
- Regla dura: no existe aritmética sobre referencias (nada de `myDog++` tipo puntero de C). Mantra del libro: "Java is not C".
- Sección de humor "Java Exposed": entrevista a una Object Reference, que confirma que una vez declarada con un tipo, nunca puede referirse a otro tipo de objeto.
- Sin ejercicios del libro en esta tanda (tramo puramente conceptual).
- Dudas: las 2 preguntas de comprensión salieron bien (qué paso reserva el heap; por qué no hay aritmética de referencias), con una ronda extra para profundizar el POR QUÉ de la segunda en vez de quedarse con la regla de memoria.
- PRÓXIMO PASO: página 225.

SESIÓN #37 — 2026-07-26 — `null` y la vida en el heap recolectable (pág. 225, 227-228, 14%)
- Pág. 225 (entrevista de humor a una Object Reference): una referencia se puede REPROGRAMAR a otro objeto del mismo tipo las veces que haga falta; la excepción es marcarla `final`, y ahí queda atada a ese único objeto para siempre.
- `null` es un VALOR, no la ausencia de valor: la variable existe pero no controla ningún objeto. Analogía del libro: un control remoto universal en una casa sin tele — se le pueden apretar los botones todo el día y no pasa nada.
- Consecuencia clave: si esa era la ÚNICA referencia a un objeto y se la pone en `null`, nadie puede volver a llegar a ese objeto → queda elegible para el garbage collector (recolector de basura).
- Nota del profe: invocar un método sobre una referencia en `null` explota en RUNTIME con `NullPointerException` (el error más común de Java); desde Java 14 el mensaje dice exactamente qué variable era null. Compila igual: el compilador no ve valores (Sesión #33).
- Pág. 227 "Life on the garbage-collectible heap": `Book b = new Book(); Book c = new Book();` → el libro arranca un contador Referencias/Objetos: 2 y 2.
- Pág. 228: `Book d = c;` NO crea un tercer objeto — copia los bits de `c` dentro de `d`. Dos controles remotos programados a la misma tele → 3 referencias, 2 objetos.
- Ejercicios de la tanda: ninguno nuevo (tramo conceptual).
- Salteadas: 226 (se suma a 177, 201, 209, 213 y 215-217 pendientes).
- Dudas: 1ra pregunta (3 referencias / 2 objetos) BIEN y con la analogía correcta. 2da MAL y corregida: creyó que `c = null;` deja el objeto elegible para el GC, olvidando que `d` sigue apuntándolo. Fondo del error: razonar desde la variable ("c no apunta a nada") en vez de desde el objeto ("¿queda ALGUIEN que pueda llegar a mí?"). La palabra clave de la pág. 225 es "the ONLY reference". Repregunta de cierre (`d = null;`) respondida BIEN y razonando ya desde el objeto: concepto recuperado en la misma sesión.
- PRÓXIMO PASO: página 226 (salteada) y 229.

SESIÓN #38 — 2026-07-26 — reprogramar una referencia ya asignada + "Life and death on the heap" (pág. 229-230, 15%)
- Pág. 229 `c = b;`: el mecanismo (copiar bits) es el mismo de `Book d = c;` (Sesión #37), pero acá `c` YA apuntaba a algo. La asignación hace dos cosas de un saque: `c` toma el objeto 1 y SUELTA el objeto 2 (la X sobre la flecha punteada del diagrama).
- Resultado: `b` y `c` al objeto 1, `d` al objeto 2 → 3 referencias, 2 objetos. El objeto 2 NO es basura: `d` todavía lo apunta. Soltar UNA referencia no mata al objeto; solo la ÚLTIMA lo hace.
- Pág. 230 arranca la sección "Life and death on the heap" reseteando el ejemplo: `Book b = new Book(); Book c = new Book();` → 2 y 2.
- Cambio de vocabulario deliberado del libro en esa página: "References/Objects" pasa a ser "ACTIVE References / REACHABLE Objects" — la precisión que hace falta antes de hablar de muerte de objetos.
- Concepto central: `reachable` (alcanzable) es LA palabra del garbage collector. No pregunta si el objeto le importa a alguien, pregunta si se puede LLEGAR hasta él.
- Ejercicios de la tanda: ninguno nuevo (tramo conceptual).
- Dudas: 1ra (`d = b;` → 1 objeto alcanzable) BIEN y razonando desde el objeto, justo el músculo que falló en la #37. 2da a medias: sabe que sin referencias activas el objeto es basura, pero al preguntarle qué referencia deja de ser activa contestó DESDE EL OBJETO ("el objeto queda sin variables") en vez de desde la variable. Respuesta correcta: una variable que vale `null` no es referencia activa. Patrón de fondo a vigilar: confunde los dos contadores (active references cuenta VARIABLES, reachable objects cuenta OBJETOS) y se mueven por separado — contraejemplo dado: `Book c = b; c = null;` baja las referencias activas sin tocar los objetos alcanzables.
- PRÓXIMO PASO: página 226 (salteada) y 231.

SESIÓN #39 — 2026-07-26 — muerte de un objeto paso a paso + arranca arrays (pág. 231-232, 15%)
- Pág. 231 `b = c;`: mismo mecanismo ya visto, pero acá el objeto que `b` suelta NO tenía otra referencia → queda ABANDONADO ("this dude is toast" / este está frito). Primera muerte real de un objeto en el libro.
- El contador se hace de TRES columnas: Active References 2, Reachable Objects 1, Abandoned Objects 1. Dos referencias apuntando al mismo objeto no suman dos objetos alcanzables.
- Pág. 232 `c = null;`: aparece la cuarta columna, `null` References 1. El objeto 2 sigue vivo porque `b` lo apunta: poner una variable en null solo mata al objeto si era la ÚLTIMA.
- Regla que resume las dos páginas: las referencias activas cuentan VARIABLES; los objetos alcanzables cuentan OBJETOS. Se mueven por separado.
- Pág. 232 abre "An array is like a tray of cups" (un arreglo es como una bandeja de vasos): acceso directo por índice, y cada elemento es una variable común del tipo declarado.
- Clave del tramo: EL ARREGLO ES UN OBJETO, aunque sea de primitivas. Por eso `int[] nums;` es una referencia y hace falta `nums = new int[7];` para crear el objeto en el heap.
- En un arreglo de objetos (`Dog[]`) cada casillero guarda un CONTROL REMOTO a un Dog, no el Dog: crear el arreglo no crea ni un solo Dog.
- Ejercicios de la tanda: ninguno nuevo (tramo conceptual).
- Dudas: 1ra (`b = null;` → 0 objetos alcanzables) BIEN y razonando desde el objeto, con el historial completo de por qué el objeto 1 ya estaba abandonado. Único matiz corregido: el GC lo hace ELEGIBLE, no lo borra en el acto. 2da MAL y re-explicada: ante `Dog[] perros = new Dog[3];` contestó "no se crea ningún objeto". Se corrigió: el arreglo ES un objeto (la bandeja vive en el heap), y sus 3 casilleros son variables de referencia en `null` esperando Dogs. Fondo del error: asocia "objeto" solo a las clases que él escribe, no al arreglo mismo. Repregunta de cierre (`String[] nombres = new String[4];`) respondida BIEN y completa (1 objeto, 4 referencias en null, imprime null): concepto recuperado en la misma sesión.
- PRÓXIMO PASO: página 226 (salteada) y 233 (paso 3 de los arrays, cortado a mitad).

SESIÓN #40 — 2026-07-26 — llenar un arreglo de primitivas y armar uno de objetos (pág. 234-236, 15%)
- Pág. 234 cierra el paso 3: `nums[0] = 6;` hasta `nums[6] = 1;`. Cada casillero es una variable `int` común y corriente; el corchete con el índice es solo su nombre.
- Un arreglo de 7 elementos usa los índices 0 a 6: el último índice SIEMPRE es longitud menos uno. Es el error clásico de todo principiante (off-by-one).
- Pág. 235 lo dice sin vueltas: "Arrays are always objects" (los arreglos siempre son objetos), guarden primitivas o referencias. La bandeja es un objeto del heap; los 7 vasos con ints adentro no lo son.
- Pág. 235-236 "Make an array of Dogs": mismos 3 pasos pero con objetos. `Dog[] pets;` declara, `pets = new Dog[7];` crea la bandeja... y el libro pregunta "What's missing?" (¿qué falta?): no hay NI UN Dog.
- La diferencia que lo explica todo: en `int[]` cada casillero GUARDA el valor; en `Dog[]` cada casillero guarda un CONTROL REMOTO, y arranca en `null`.
- Paso 3 de un arreglo de objetos: `pets[0] = new Dog();` — un `new` por cada elemento que quieras usar.
- Nota del profe: hoy se escribe todo junto (`int[] nums = new int[7];`), existe el atajo `int[] nums = {6, 19, 44};` que declara-crea-llena en una línea, y en el trabajo real se usa mucho más `ArrayList<Dog>` que el arreglo crudo (Cap. 6). Pasarse del último índice explota en runtime con `ArrayIndexOutOfBoundsException`.
- Ejercicios de la tanda: ninguno nuevo (tramo conceptual).
- Dudas: 1ra (`new String[5]` + imprimir el casillero 4) BIEN y bien justificada: el casillero existe desde que se creó el arreglo, con `null` adentro. 2da a medias y REINCIDENTE: al contar los `new` de `Dog[] pets = new Dog[3];` + los 3 perros contestó 3, se olvidó del `new` de la bandeja (son 4). Es el MISMO fondo que la duda 2 de la #39: asocia "objeto" solo a las clases que él escribe, no al arreglo. Regla que se le dio: un `new`, un objeto — contá los `new` y sabés cuántos objetos hay.
- PRÓXIMO PASO: página 226 (salteada) y 237.

SESIÓN #41 — 2026-07-26 — el punto sobre un elemento del arreglo + Java chequea el tipo (pág. 239-240 y 242, 15%)
- Pág. 239: repaso del operador punto (`fido.name`, `fido.bark()`). Lo único a subrayar: las instance variables son tazas que viven DENTRO del objeto; por eso hay que pasar por la referencia para llegar a ellas.
- Pág. 240 "Java cares about type": el compilador no deja meter en un arreglo nada que no sea del tipo declarado (ni un `Cat` en un `Dog[]`, ni un `double` en un `int[]`). Chequeo en COMPILE-TIME.
- Excepción: un `byte` SÍ entra en un `int[]` — implicit widening (ensanchamiento implícito): de taza chica a taza grande no se pierde nada, y Java lo acepta sin pedir permiso. Al revés hace falta cast (más adelante).
- Idea central de la tanda: cuando el objeto está en un arreglo NO tiene nombre propio, así que se lo nombra por su posición. `myDogs[0]` ocupa exactamente el lugar donde antes iba `fido`, y de ahí en más todo igual: `myDogs[0].name = "Fido";`, `myDogs[0].bark();`.
- Error clásico a evitar: `myDogs.bark()` no compila — le estarías pidiendo a la BANDEJA que ladre. Ladran los perros de adentro.
- Nota al pie del libro (importante): `fido.name = "Fido"` es mala práctica en Java real; lo correcto es un `setName(...)`. Lo hacen así para simplificar y lo arreglan en el Cap. 4 con encapsulation (encapsulamiento) — tema 80/20 fuerte, cae en entrevistas.
- Pág. 242: diagrama de la clase Dog (nombre / `name` / `bark()`, `eat()`, `chaseCat()`), formato ya conocido.
- Ejercicios de la tanda: ninguno nuevo (tramo conceptual y corto).
- Dudas: 1ra (llamar bark() sobre un casillero vacío) BIEN, con la analogía correcta ("hay control pero no tele"); se le dio el nombre técnico, NullPointerException en runtime. 2da A MEDIAS: explicó byte→int y double→int como dos reglas separadas en vez de ver la única razón de fondo — Java convierte solo cuando es IMPOSIBLE perder información; de grande a chico hay que firmar con un cast.
- PRÓXIMO PASO: página 243. OJO material faltante: el 1er pantallazo de esta tanda salió en negro (archivo roto), así que quedaron sin ver las pág. 237-238 y 241 (el código de "A Dog example", que el diagrama de la 242 acompaña).

SESIÓN #42 — 2026-07-26 — El programa completo del arreglo de Dogs, bullet points del Cap. 3 y BE the Compiler (pág. 243-246, 16%)
- Pág. 243: el ejemplo entero junto. Novedad de forma: el `main` puede vivir DENTRO de la propia clase `Dog`, sin una clase TestDrive aparte.
- `myDogs.length` = cantidad de elementos, es una VARIABLE (sin paréntesis), no un método. Por eso la condición del while va con `<` y nunca con `<=`: length vale 3 y los índices son 0, 1 y 2.
- Los String son objetos disfrazados: se crean y asignan como primitivas (`String name = "Bart";`, sin `new`), pero son variables de referencia. La sintaxis corta es un regalo de Java, no un cambio de naturaleza.
- `myDogs[2] = dog1;` NO crea nada: copia una referencia. Dos controles remotos, un solo perro; por eso la salida termina con "Bart says Ruff!".
- La salida arranca con `null says Ruff!` porque `dog1.bark()` corre ANTES de `dog1.name = "Bart"`. Una referencia sin asignar vale `null` y se imprime literalmente como texto — no revienta nada.
- Bullet points (pág. 244): repaso del capítulo. El único que hay que fijar: un arreglo SIEMPRE es un objeto, incluso declarado para primitivas — no existe el "arreglo primitivo", solo un arreglo que CONTIENE primitivas.
- Ejercicios de la tanda: EJERCICIO #08 "BE the Compiler" (pág. 245-246, programas A `Books` y B `Hobbits`) — pendiente. El ícono de zapatillas marca la sección Exercise del libro.
- Nota del profe: la consigna pide dos cosas distintas, "compile AND run without exception" (compile Y se ejecute sin excepción). Compilar bien y reventar en runtime es un resultado posible, no un caso raro.
- Dudas: (pendientes de la ronda de comprensión de esta tanda).
- PRÓXIMO PASO: página 247. Sigue pendiente el material faltante de pág. 237-238 y 241.

SESIÓN #43 — 2026-07-27 — Code Magnets: TestArrays + arranque de Pool Puzzle "Triangle" (pág. 247-250, 16%)
- Pág. 247: nueva ronda de "Code Magnets" (Imanes de Código): un programa desordenado como imanes en la heladera, hay que reconstruirlo a mano para que compile y dé la salida pedida. Se pueden repetir imanes, no hace falta usarlos todos, y las llaves `{ }` que falten se agregan donde corresponda.
- Pág. 248: los imanes de `TestArrays` — dos arreglos, `String[] islands` con 4 nombres y `int[] index` con 4 números — y un `while (y < 4)` que imprime `islands[ref]` usando `ref = index[y]` como intermediario.
- Idea clave del rompecabezas: `index[]` NO son datos a mostrar, son un MAPA de posiciones: para cada vuelta del bucle dice qué casillero de `islands[]` mostrar. Reordenando el `index[]` cambia el orden de salida sin tocar `islands[]`.
- Pág. 249: salida esperada (`island = Fiji / Cozumel / Bermuda / Azores`) y puntero a la solución en la sección "Code Magnets" del apéndice (NO consultada, es el ejercicio del usuario). Arranca un "Pool Puzzle" nuevo: completar huecos en una clase con fragmentos de un pool.
- Pág. 250: la salida objetivo de ese Pool Puzzle nuevo (`Triangle`, área de triángulos) — quedó con dos huecos por completar y sin el pool de fragmentos: falta la página siguiente para poder resolverlo.
- Ejercicios de la tanda: EJERCICIO #09 "Code Magnets: TestArrays" — pendiente.
- Dudas: `ref = index[y]` MAL al toque, corregida: dijo que creaba un "control remoto" a `islands[0]`; en realidad `ref` e `index` son primitivas (`int`), es una copia de valor, no una referencia. Recién `islands[ref]` usa ese número como posición. Corregido en el mismo mensaje, con la analogía del índice de un libro.
- PRÓXIMO PASO: página 251 (pool de fragmentos del Pool Puzzle "Triangle", sin resolver todavía).

SESIÓN #44 — 2026-07-27 — Pileta del Pool Puzzle "Triangle" + arranque de "A Heap o' Trouble" (pág. 251-252, 16%)
- Pág. 251: la pileta de fragmentos para el Pool Puzzle "Triangle" (arrancado pág. 250, Sesión #43) — identificadores, declaraciones de arreglo, condiciones y asignaciones sueltas, con la aclaración de que un fragmento se puede repetir. Registrado como EJERCICIO #10.
- Pág. 251-252: nuevo ejercicio "A Heap o' Trouble" ("Un montón de problemas" — juego de palabras con "heap", la zona de memoria, y el dicho "a heap of trouble" = muchísimos problemas): una clase `HeapQuiz` con un arreglo `hq[]` de 5 referencias y una serie de reasignaciones (`hq[3] = hq[1]; hq[3] = null; hq[0] = hq[3];`...); hay que unir cada `hq[x]` final con el objeto `HeapQuiz` (id 0, 1 o 2) que le corresponde. Registrado como lib08.
- Repaso del tramo (sin enseñar nada nuevo): reusa "referencia = control remoto" (Sesión #27/#31) y "Life on the garbage-collectible heap" (Sesión #37) — acá el arreglo `hq[]` guarda referencias, no valores, como ya se vio con `index[]` en la Sesión #43.
- Ejercicios de la tanda: EJERCICIO #10 "Pool Puzzle: Triangle" (pendiente, opcional) y LIBRO "A Heap o' Trouble" (pendiente, opcional).
- Teaser sin abrir: "The case of the pilfered references" (pág. 253) — título de la próxima sección, no leído todavía.
- PRÓXIMO PASO: página 253 ("The case of the pilfered references", sin abrir).

SESIÓN #45 — 2026-07-28 — Five-Minute Mystery "The case of the pilfered references" + soluciones oficiales del capítulo (pág. 254-255, 257-258, 16%)
- Pág. 254-255: el misterio. Dos formas de crear 10 objetos Contact en un celular con poca memoria: Bob usa un arreglo `Contact[] contacts` y guarda cada objeto en `contacts[x]`; Kate usa UNA sola variable `Contact contactRef` que reasigna en cada vuelta. Kate ahorra memoria en variables de referencia, y aun así Tawny elige a Bob. Registrado como lib09 (sin resolver en el chat).
- Concepto de fondo (ya visto, no es nuevo): reasignar una referencia no mueve ni copia el objeto; el objeto anterior queda sin quien lo apunte. Conecta la Sesión #37 (garbage collection) con la #43 (arreglo de referencias).
- Pág. 257 (mitad de abajo): solución oficial del Code Magnets "TestArrays" — confirma el EJERCICIO #09 del usuario y muestra las asignaciones de `index[0..3]` FUERA del `while`, tal como se le corrigió.
- Pág. 258: la pantalla de salida esperada de TestArrays (4 líneas, coincide exacto con la del usuario) y arranca la sección de soluciones de "BE the Compiler" (contenido no incluido en la tanda).
- SPOILER EVITADO A PROPÓSITO: la mitad de arriba de la pág. 257 es la solución del "Sharpen your pencil: ¿legal o no?" (pág. 210) que el usuario tiene PENDIENTE como lib07. No se explicó ni se comentó ninguna de las 12 líneas. Retomarla cuando entregue ese ejercicio.
- Ejercicios de la tanda: LIBRO lib09 "Five-Minute Mystery" (pendiente).
- PRÓXIMO PASO: página 256 (salteada en esta tanda, es parte de la solución de lib07) y 259 en adelante.

SESIÓN #46 — 2026-07-28 — soluciones oficiales del capítulo: BE the Compiler y Five-Minute Mystery (pág. 259, 262, 16%)
- Pág. 259 (A): solución oficial de "BE the Compiler" parte Books — los 3 `new Books()` que faltaban, exactamente lo que el usuario había agregado en el EJERCICIO #08. Nota al margen del libro: "Remember: We have to actually make the Book objects!" (Acordate: hay que crear de verdad los objetos Book.)
- Pág. 259 (B): solución oficial de la parte Hobbits — el libro arregla con `int z = -1;` y el `z = z + 1;` como PRIMERA línea del cuerpo; el usuario lo había arreglado con `z = 0`, el incremento al FINAL y `z < 3`. Las dos son correctas: visitan los mismos índices 0, 1 y 2. Nota al margen: "Remember: arrays start with element 0!" (Acordate: los arreglos empiezan en el elemento 0.)
- Nota del profe: un mismo bug de bucle admite varias correcciones válidas. Lo que se compara no es la forma sino QUÉ ÍNDICES termina visitando; si la salida es idéntica, las dos versiones son correctas.
- Pág. 262 (mitad del medio): solución del Five-Minute Mystery — Kate sí crea los 10 objetos Contact, pero al reasignar la MISMA variable en cada vuelta deja 9 abandonados en el heap ("unreachable", inalcanzables) y solo el último queda accesible. Confirma la corrección del lib09.
- SPOILERS EVITADOS A PROPÓSITO: la pág. 260 y la mitad de arriba de la 262 son la solución y la salida del Pool Puzzle "Triangle" (EJERCICIO #10, pendiente); la mitad de abajo de la 262 y toda la pág. 263 son la solución de "A Heap o' Trouble" (lib08, pendiente). No se explicó ni se comentó nada de las dos.
- Ejercicios de la tanda: ninguno nuevo (todo eran soluciones).
- Dudas: con `int z = 0;` y el incremento como primera línea, contestó que igual visitaría 0, 1 y 2 — CORREGIDO con traza: visita 1 y 2, `h[0]` queda en null y falta una línea de salida. Confundía "el valor con el que el bucle ENTRA" con "el valor con el que z se USA como índice".
- PRÓXIMO PASO: pág. 261 (no vino en esta tanda) y 264 en adelante.

SESIÓN #47 — 2026-07-28 — arranca el Capítulo 4: el estado afecta al comportamiento (pág. 264-267, 17%)
- Pág. 264: portada del Cap. 4 "How Objects Behave: Methods Use Instance Variables" (Cómo se comportan los objetos: los métodos usan variables de instancia). La viñeta "Let's keep those little variables private, OK?" es anticipo de `private` y del encapsulamiento, que llegan más adelante en el capítulo.
- Pág. 265: la idea madre del capítulo — "State affects behavior, behavior affects state" (el estado afecta al comportamiento y viceversa). State = instance variables; behavior = methods. Un `makeNoise()` que mira `weight` para decidir el ladrido es estado→comportamiento; un método que hace `weight = weight + 5` es comportamiento→estado.
- Pág. 265: la clase como "blueprint" (plano/molde) que le dice a la JVM cómo fabricar objetos de ese tipo. Diagrama de la clase `Song`: knows = title, artist; does = setTitle(), setArtist(), play().
- Pág. 266-267: respuesta al "¿pueden dos objetos tener métodos distintos?" — NO. Toda instancia de una clase tiene EXACTAMENTE los mismos métodos; lo que cambia es el valor de las instance variables sobre las que ese código trabaja. Mismo código, distintos datos, distinto resultado.
- Pág. 267: dentro de un método, nombrar `title` a secas significa "la instance variable del objeto sobre el que me llamaron" — no hace falta `s1.title`. Por eso `void play() { soundPlayer.playSound(title, artist); }` suena distinto en cada instancia.
- Referencias culturales explicadas: "My Way" de Sinatra (1969, melódico) vs. la versión punk de los Sex Pistols (1978), misma canción y resultado opuesto — por eso el libro la usa para dos objetos `Song`; y "Bark Different." como parodia del "Think Different." de Apple.
- Ejercicios de la tanda: ninguno nuevo.
- Nota del profe: este capítulo es la explicación formal del error de fondo del repaso de Television — métodos de acción que no tocan la instance variable de estado que deberían modificar.
- Dudas: dijo que `song1.play()` y `song2.play()` ejecutan "código diferente" — CORREGIDO: el método vive UNA sola vez en la clase y corre idéntico; lo único que cambia son los datos que va a buscar. Advertido de no mezclarlo con polimorfismo (Cap. 7-8). La pregunta del `bark()` ciego al estado la contestó perfecta.
- PRÓXIMO PASO: pág. 268 en adelante (el código concreto del `bark()` según el tamaño).

SESIÓN #48 — 2026-07-28 — el bark() según el size + argumentos y parámetros (pág. 270, 272-273, 17%)
- Pág. 270: `bark()` lee la instance variable `size` con un if/else if/else y elige entre "Wooof! Wooof!" (perro grande), "Ruff! Ruff!" (mediano) y "Yip! Yip!" (chico). El método no recibe nada: llega a `size` porque vive en el mismo objeto.
- Pág. 270: `DogTestDrive` crea tres Dogs con size 70, 8 y 35 y llama `one.bark()`, `two.bark()`, `three.bark()`. Es la Sesión #47 hecha código: mismas líneas ejecutadas, distinto estado, distinta salida.
- Pág. 270: se pueden mandar valores a un método — `d.bark(3);`. Convención del libro: "A caller passes arguments. A method takes parameters." (Quien llama pasa argumentos; un método toma parámetros.)
- Pág. 272: el argumento es el VALOR del lado de quien llama; el parámetro es una VARIABLE LOCAL del método (tipo + nombre). Viajan los bits del valor y aterrizan en la "taza" del parámetro.
- Pág. 272: regla dura — si un método toma un parámetro, hay que pasarle algo SÍ o SÍ, y del tipo apropiado. Faltar un argumento o mandarlo de otro tipo es error de COMPILACIÓN (mismo principio de "Java cares about type" de la Sesión #41).
- Pág. 272: el parámetro se usa como cualquier variable adentro del método y se puede modificar (`numOfBarks = numOfBarks - 1`), porque es local: nace y muere con la llamada.
- Pág. 273: arranca el tema espejo, el retorno. TODO método se declara con un tipo de retorno; `void` (vacío) significa "no devuelve nada". Queda explicado por fin el `void` de `public static void main`.
- Referencias culturales explicadas: Wooof/Ruff/Yip son las tres formas en que el inglés escribe el ladrido según el tamaño del perro (grave, normal, agudo); y la foto del cajero que devuelve un patito de goma ("Cute... but not exactly what I was expecting.") es un chiste sobre el tipo de retorno.
- Ejercicios de la tanda: ninguno nuevo.
- Dudas: contestó bien las dos de la ronda (llamar sin argumento es error de COMPILE-TIME, y en `main` el `void` es el tipo de retorno y `String[] args` el parámetro). Ajuste 1: `void` no es una variable sino palabra reservada en el lugar del tipo. Ajuste 2 (explicación extra sobre qué es el estado): dijo que `bark()` no es estado "porque desaparece cuando termina" — veredicto bien, razón mal: el método NO desaparece, vive una sola vez en la clase; lo que muere es el stack frame de la llamada. El criterio real es DATOS vs. CÓDIGO, no persiste vs. no persiste.
- PRÓXIMO PASO: pág. 274 en adelante (métodos que devuelven valores de verdad).

SESIÓN #49 — 2026-07-28 — tipo de retorno de verdad, varios parámetros y pass-by-value (pág. 274-277, 17%)
- Pág. 274: un método puede devolver un valor (`int giveSecret() { return 42; }`). El tipo declarado antes del nombre manda: "Whatever you say you'll give back, you better give back!" (Lo que decís que vas a devolver, más te vale devolverlo). Devolver otro tipo es error de COMPILACIÓN.
- Pág. 274: en `int theSecret = life.giveSecret();` los dos tipos tienen que coincidir — el de la variable que recibe y el de retorno del método. Viajan los bits del valor devuelto y aterrizan en la variable.
- Pág. 274: el libro deja abierta la excepción "o un valor COMPATIBLE con el tipo declarado" y la posterga a polimorfismo (caps. 7 y 8). Por ahora: tipo declarado = tipo devuelto.
- Pág. 275: varios parámetros se separan con comas y CADA UNO lleva su tipo (`void takeTwo(int x, int y)`, nunca `int x, y`). Los argumentos aterrizan por POSICIÓN, no por nombre.
- Pág. 275: peligro real — si dos parámetros son del mismo tipo e invertís el orden, compila igual y el resultado sale mal en silencio. Con tipos distintos te frena el compilador.
- Pág. 276: se pueden pasar variables además de literales, si el tipo coincide. Los nombres de la variable y del parámetro NO tienen que coincidir (`t.takeTwo(foo, bar)` → `takeTwo(int x, int y)`).
- Pág. 276: la anotación clave dice que los bits de `x` son IDÉNTICOS a los de `foo` — o sea otros bits iguales, no los mismos bits. Se copia el valor que la variable tenía en ESE momento.
- Pág. 277: título solo + viñeta de una fotocopiadora — "Java is pass-by-value. That means pass-by-copy." (Java es pasaje por valor, o sea pasaje por copia). El método recibe una fotocopia; el original no se toca. 80/20 fuerte: es pregunta clásica de entrevista junior, y la respuesta es SIEMPRE pass-by-value.
- Referencias culturales explicadas: `foo` y `bar` son metasyntactic variables, nombres genéricos de relleno tipo "fulano y mengano" (el libro los usa sin aclararlo); y la viñeta de la fotocopiadora es la metáfora entera del pass-by-copy.
- Ejercicios de la tanda: ninguno nuevo.
- Dudas: acertó los dos veredictos de la ronda (ni `takeTwo(3)` ni `takeTwo(3,4,5)` compilan; `foo` sigue valiendo 7). Ajuste 1: dijo "espera 3 argumentos" — espera DOS; confundió el valor 3 con la cantidad. Ajuste 2: creyó que del lado de quien llama hay que indicar el tipo — NO, el tipo vive solo en la declaración del método. Ajuste 3 (el importante): el veredicto de `foo` salió bien pero con razón vaga ("las instrucciones no cambian"); no nombró pass-by-value. Se le corrigió con la contradicción (`x = 100` SÍ cambia un valor, el de `x`) y con la idea de que `x` no ES `foo` sino una fotocopia. Volver a chequear este punto en la pág. 278.
- PRÓXIMO PASO: pág. 278 en adelante (la demostración con código de que la copia no afecta al original).

SESIÓN #50 — 2026-07-28 — pass-by-value con objetos, retorno múltiple y promoción de tipos (pág. 278-282, 17%)
- Pág. 278: poema "Make it Stick" refuerza pass-by-value = pass-by-copy (nada nuevo); post-its con adelantos (threads/wait()/notify(), mucho más adelante) y un chiste suelto sin contenido técnico.
- Pág. 279 (arriba): el mismo mecanismo de la Sesión #49 pero dibujado paso a paso con los "vasos" de bits: `x` y `z` son vasos distintos y sin conexión, cambiar `z` adentro del método no toca `x`.
- Pág. 279 (abajo), "There are no dumb questions": pasar un OBJETO también es pass-by-value — se copia la referencia (el control remoto), no el objeto. Por eso mutar un atributo del objeto adentro del método SÍ se ve reflejado afuera (misma referencia al mismo objeto en el heap), pero reasignar la variable parámetro a otro objeto NO se ve afuera.
- Misma página: un método solo declara UN tipo de retorno; para devolver varios valores se usa un arreglo. Al hacer `return` se puede promover implícitamente a un tipo más grande (`byte`→`int`), pero ir a uno más chico (`double`→`int`) no compila por pérdida de decimales. Tampoco es obligatorio usar el valor que devuelve un método.
- Pág. 281: viñeta Jirafa/Conejo — lo que entra o sale de un método tiene que ser del tipo declarado o compatible; semilla de IS-A/herencia (todavía adelanto, ver vocabulario).
- Pág. 282: "Bullet Points", cierre y repaso de todo el tramo de clases, parámetros y retorno — sin conceptos nuevos.
- Ejercicios de la tanda: ninguno nuevo.
- Dudas: ambas preguntas bien. La del objeto con matiz correcto (identidad del objeto no cambia, pero SÍ se ve el cambio de estado porque la copia de referencia apunta al mismo objeto); la de promoción de retorno también bien (byte→int compila, double→int no por pérdida de decimales).
- PRÓXIMO PASO: pág. 283 en adelante.

SESIÓN #51 — 2026-07-28 — getters, setters y arranque de encapsulación (pág. 283-284 y 286, 17%)
- Pág. 283: Getters y Setters (formal: Accessor/Mutator) — convención de Java: `getNombre()` devuelve el valor, `setNombre(valor)` lo asigna. Diagrama de `ElectricGuitar` con 3 instance variables y sus 6 getters/setters.
- Pág. 284: código completo de `ElectricGuitar`; arranca "Encapsulation" con el chiste "Do it or risk humiliation and ridicule".
- Pág. 286: por qué exponer una instance variable con el operador punto (`theCat.height = 27;`) es peligroso — cualquier código externo puede asignarle un valor inválido (`theCat.height = 0;`) sin control. Solución que viene: forzar el acceso solo vía setters.
- Página salteada: 285.
- Referencias culturales explicadas: chiste "Do it or risk humiliation and ridicule"; viñeta "Jen says you're well-encapsulated..." (piropo romántico con el término técnico).
- Ejercicios de la tanda: ninguno nuevo.
- Nota del profe: el usuario resolvió el setter con `this.size = size` (técnica válida y muy usada en el mundo real para no tener que renombrar el parámetro como hace el libro) antes de que `this` se explique formalmente — anotado en vocabulario como adelanto.
- Dudas: ambas bien conceptualmente (getSize()/setSize(int) correctos; supo explicar el riesgo de datos expuestos). Ajuste menor: faltaron los `;` de cierre en las dos instrucciones — no es grave (fue una respuesta de chat, no código compilado), pero repetirlo en un ejercicio real sí cuenta como error de compilación.
- PRÓXIMO PASO: pág. 287 en adelante.

SESIÓN #52 — 2026-07-29 — encapsulación: private, public y por qué de verdad importa (pág. 288-291, 18%)
- Pág. 288: el setter con GUARDIA — `setHeight(int ht)` con `if (ht > 9)` adentro: si el valor no pasa el control, no asigna nada y `height` queda como estaba. El setter no es un pasamanos: es un portero con criterio.
- Pág. 288: sección "Hide the data" — encapsular protege DOS cosas: los datos (nadie mete un valor inválido) y tu derecho a cambiar la implementación después. Se hace con los access modifiers `public` y `private` (`private` = solo se toca desde adentro de la propia clase).
- Pág. 289: LA REGLA (recuadro del libro): "Mark instance variables private. Mark getters and setters public." El libro la llama *starter* rule of thumb (regla inicial): con más experiencia se hacen cosas distintas, pero hoy es ley.
- Pág. 290: el tipo de dato NO alcanza — `int` acepta negativos, pero "-5 baños" o velocidad negativa no existen. El compilador solo sabe de tipos, no de sentido común; ese sentido común solo entra en el setter.
- Pág. 290: las 4 salidas de un setter — aceptar, rechazar sin hacer nada, lanzar una excepción (`throw an Exception`, se ve mucho más adelante), o corregir/redondear al valor aceptable más cercano.
- Pág. 290: LA RAZÓN DE FONDO (respuesta a "¿el setter no es overhead?"): "you can change your mind later, without breaking anybody else's code". Si 40 personas escribieron `theCat.height = 27;` y un día hacés la variable private, les rompés el código a las 40. Con setter desde el día uno, el cambio es invisible. La ganancia de rendimiento de ir directo es "miniscule".
- Pág. 291: diagrama de `GoodDog` (size / getSize(), setSize(), bark()) — anticipo de la versión encapsulada; el código con `private` viene en la página siguiente.
- Páginas salteadas: 287 (la tanda arrancó en 288).
- Referencias culturales explicadas: chiste del "water cooler" (dispensador de agua = chisme de oficina) con el "flat cat"; sección "Java Exposed" (entrevista falsa a un Objeto) y el sueño de estar desnudo en público; "Social Security number" = documento de identidad de EE.UU.
- Ejercicios de la tanda: ninguno nuevo.
- PRÓXIMO PASO: pág. 292 en adelante (código de GoodDog con `private`).

SESIÓN #53 — 2026-07-29 — GoodDog encapsulado, la llamada COMO valor y objetos dentro de un arreglo (pág. 292-293, 18%)
- Pág. 292: `GoodDog` completo y encapsulado — `private int size`, `getSize()`/`setSize(int)` public, y el TestDrive que ya no escribe `one.size = 70` sino `one.setSize(70)` / `one.getSize()`.
- Pág. 292 (clave): `bark()` lee `size` DIRECTO, sin pasar por `getSize()`, y está bien: `private` es una pared hacia AFUERA, no hacia adentro. Cualquier método de la propia clase ve sus instance variables private.
- Pág. 292: nota del margen — los getters/setters "no agregan funcionalidad nueva", pero te dejan volver después y hacer el método "safer, faster, better" (más seguro, rápido, mejor) sin tocar a nadie.
- Pág. 293: LA REGLA del retorno — "en cualquier lugar donde se pueda usar un valor de cierto tipo, se puede usar una llamada a un método que devuelva ese tipo": `int x = 3 + one.getSize();` es legal porque la llamada SE CONVIERTE en el int que devuelve.
- Pág. 293: "How do objects in an array behave?" → igual que cualquier objeto; lo único distinto es CÓMO llegás a ellos. `pets[0].setSize(30)` es lo mismo que `one.setSize(30)`: `[0]` reemplaza al nombre de la variable.
- Pág. 293: repaso del Cap. 3 en 3 pasos — `pets = new Dog[7]` crea SOLO el arreglo (7 tazas vacías, cero Dogs); `pets[0] = new Dog()` recién ahí crea el objeto; después el operador punto sobre `pets[0]`.
- Ejercicios de la tanda: ninguno nuevo.
- Nota del profe: `void bark()` va SIN modificador = nivel *default* (package-private), visible solo dentro del mismo paquete. Funciona por simplificación del libro; en código profesional lo que se usa desde afuera se marca `public` explícito.
- PRÓXIMO PASO: pág. 294 en adelante.

SESIÓN #54 — 2026-07-29 — valores por defecto de instance variables + instance vs. variable local (pág. 295-298, 18%)
- Pág. 295-296: `PoorDog` declara `size` y `name` SIN asignarles valor, y `PoorDogTestDrive` igual compila y corre: sale "Dog size is 0" / "Dog name is null". Toda instance variable no inicializada recibe un valor por defecto automático.
- Pág. 296: tabla de defaults — enteros → `0`, decimales → `0.0`, `boolean` → `false`, referencias (`String`, cualquier objeto) → `null`. `null` = "un control remoto que no está programado a nada: una referencia, pero sin objeto real" (misma analogía de la taza del Cap. 3).
- Pág. 297 (clave): instance variable = declarada DENTRO de la clase, FUERA de cualquier método (recibe default). Variable LOCAL = declarada DENTRO de un método; Java NO le pone ningún default y DEBE inicializarse antes de usarse.
- Pág. 298: la prueba — `int x;` local seguida de `int z = x + 3;` NO COMPILA (`variable x might not have been initialized`), a diferencia de una instance variable en la misma situación. Error de compile-time, no de runtime.
- Ejercicios de la tanda: ninguno nuevo.
- Nota del profe: el mensaje dice "might not have been initialized" (no "wasn't") porque el compilador rechaza CUALQUIER camino posible sin valor, aunque en la práctica nunca se ejecute — regla conservadora a propósito.
- Dudas: ninguna (tanda expositiva, sin ronda de comprensión todavía).
- PRÓXIMO PASO: pág. 299 en adelante.

SESIÓN #55 — 2026-07-29 — comparar variables: == (bits) vs. equals() (contenido) (pág. 299-302, 19%)
- Pág. 299: recuadro "no hay preguntas tontas" — los parámetros de método nunca quedan sin inicializar, porque el compilador exige un argumento para cada uno al llamar al método.
- Pág. 299-301: `==` SIEMPRE compara el patrón de BITS de la variable: con primitivos compara el valor (`int a = 3; byte b = 3; a == b` es `true`); con referencias, compara si apuntan al MISMO objeto del heap.
- Pág. 301: `.equals()` se usa para saber si dos objetos DISTINTOS son iguales en contenido (ej: dos `String` con "Fred" son iguales aunque sean dos objetos separados); qué significa "igual" depende del tipo de objeto, se retoma más adelante.
- Pág. 302: diagrama y código de `Foo` — `Foo c = a;` copia la REFERENCIA, no crea un objeto nuevo: `a == c` da `true`, `a == b` da `false` (son dos `new Foo()` distintos).
- Página salteada: 300.
- Referencias culturales explicadas: viñeta "I always keep my variables private. If you want to see them, you have to talk to my methods." (chiste de encapsulamiento, ya visto en Sesión #52).
- Ejercicios de la tanda: ninguno nuevo.
- Dudas: ambas bien — distinguió == (identidad de referencia) de .equals() (contenido) sin dudar.
- PRÓXIMO PASO: pág. 303 en adelante.

SESIÓN #56 — 2026-07-30 — cierre de encapsulamiento + ensanchamiento implícito en argumentos de métodos (pág. 304-307, 19%)
- Pág. 304: bullet points de cierre del capítulo de encapsulamiento — repite lo visto en Sesiones #52-55 (private+setter, valores por defecto, == vs. equals()), sin nada nuevo.
- Pág. 305-306: Sharpen your pencil "What's legal?" — aplica el ensanchamiento implícito (Sesión #41, antes visto con arreglos) a ARGUMENTOS de métodos: `byte`/`short` entran donde se pide `int` sin permiso; `long` a `int` NO (haría falta cast, tema futuro). También importa que la cantidad de argumentos calce con la firma. Registrado como lib10.
- Pág. 306: arranca sección "Exercise" (ícono zapatillas) pero el pantallazo no trae su cuerpo — posible pantallazo salteado por el usuario, pendiente de confirmar.
- Pág. 307: "BE the Compiler" con dos clases (A: XCopy, reusa pass-by-value de la Sesión #49; B: Clock/ClockTestDrive, con un `getTime()` declarado `void` que igual hace `return time;`). Registrado como EJ #11. Arranca además la intro de un "Who Am I?" nuevo (juego de adivinanzas con clases disfrazadas) — DISTINTO del lib06 dado de baja, pero sin las pistas todavía (pantallazo cortado).
- Ejercicios de la tanda: EJ #11 (BE the Compiler) y lib10 ("What's legal?"), ambos NO opcionales.
- Dudas: sin ronda de comprensión todavía (pendiente para el cierre de esta tanda).
- PRÓXIMO PASO: pág. 308 en adelante, más confirmar el hueco de pág. 306 y completar el "Who Am I?" de pág. 307.

SESIÓN #57 — 2026-07-30 — cierre de ejercicios integrados del capítulo de encapsulamiento (pág. 309-314, 19%)
- Pág. 309: arranca "Who Am I?" (juego de adivinanzas con clases disfrazadas de pistas) — DIFERIDO a pedido explícito del usuario, se retoma más adelante.
- Pág. 309-312: Pool Puzzle "Mixed Messages" con la clase `Mix4` — dos huecos a completar (condición del `while` y del `if`) y matchear con la salida. Registrado y COMPLETADO como lib11 (4/4 correcto en esta misma sesión).
- Pág. 312-314: Pool Puzzle "Puzzle4" / "Fast Times in Stim-City" — completar una clase con fragmentos de una pileta para imprimir "result 543345". Registrado como EJ #12, PENDIENTE.
- Ejercicios de la tanda: lib11 (completado 4/4) y EJ #12 (pendiente).
- Dudas: ninguna ronda nueva (tanda de cierre de ejercicios).
- PRÓXIMO PASO: pág. 315 en adelante (ojo: ahí están las respuestas de estos ejercicios).

SESIÓN #58 — 2026-07-30 — "Exercise Solutions": nuevo Five-Minute Mystery + confirmación de ejercicios cerrados (pág. 315-323, 20%)
- Pág. 315-316: nuevo "Five-Minute Mystery" (ficción policial/ciberpunk) — a Jai lo interceptan y lo llevan ante Leveler, que sospecha una filtración en su base de datos por un hacker; Buchanan describe cómo dejó sus métodos. Pregunta del libro: "¿qué sospechó Jai?". Registrado como lib12 (conceptual, NO opcional) — conecta con la regla de oro de encapsulamiento (Sesión #52).
- Pág. 317-318: soluciones oficiales de "What's legal?" (lib10) y "BE the Compiler: XCopy/Clock" (EJ#11) — ambos YA COMPLETADOS, coinciden con lo entregado, sin novedades.
- Pág. 319-321: respuestas de "Who Am I?" (diferido) y del Pool Puzzle "Puzzle4" (EJ#12, PENDIENTE) — NO explicadas a propósito, son spoilers de ejercicios sin resolver.
- Pág. 321: respuesta del Five-Minute Mystery de esta misma tanda — tampoco explicada, se guarda para cuando el usuario entregue lib12.
- Pág. 323: diagrama de solución de "Mixed Messages" (lib11) — confirma que las 4 respuestas del usuario fueron EXACTAS, incluso que dos candidatos comparten la salida "14 1".
- Ejercicios de la tanda: lib12 "Five-Minute Mystery" (nuevo, NO opcional).
- Dudas: sin ronda de comprensión (tanda de confirmación + 1 ejercicio nuevo).
- PRÓXIMO PASO: pág. 324 en adelante.

SESIÓN #59 — 2026-07-30 — Capítulo 5: intro a "Sink a Startup" + diseño con diagrama de flujo (pág. 324-330, 20%)
- Pág. 324: arranca el Capítulo 5, "Extra-Strength Methods" (métodos de fuerza extra) — viñeta de humor, sin contenido técnico nuevo.
- Pág. 325: mapa del capítulo — van a sumar operadores, bucle `for` y números aleatorios construyendo el juego "Sink a Startup" (parodia de Battleship: hundís startups de Silicon Valley en vez de barcos) en una grilla 7x7 por línea de comandos; versión simple acá, "deluxe" en el Cap. 6.
- Pág. 327: transcripción de una partida real (`java StartupBust`) — "hit"/"miss" por intento; al completar una startup el mensaje amigable ("You sunk poniez") va acompañado del valor CRUDO que devuelve el método ("kill") — mismo método, un String con 3 resultados posibles (hit/miss/kill).
- Pág. 329-330: "First, a high-level design" — ANTES de programar se mapea el flujo con un diagrama de flujo (flowchart): círculo = inicio/fin, rectángulo = acción, rombo = punto de decisión. Recorre todo el ciclo: setup → pedir intento → hit/miss/kill → ¿quedan startups? → mostrar rating → fin.
- Ejercicios de la tanda: ninguno (tanda de intro y diseño).
- Nota del profe: hoy un flowchart a mano se usa menos en la industria (se prefiere pseudocódigo o el Activity Diagram de UML), pero diseñar el flujo antes de tocar el teclado es una práctica universal. Semilla UML (en pausa): este diagrama es el ancestro directo del Activity Diagram.
- Páginas salteadas: 326 y 328.
- Dudas: 2/2 — P1 (hit sin completar la startup) perfecta; P2 (por qué la grilla arranca en 0) intuyó que es una convención pero sin conectarla con la razón real: anticipa que el juego se va a implementar con un arreglo, y los arrays de Java arrancan en 0.
- PRÓXIMO PASO: pág. 331 en adelante.

SESIÓN #60 — 2026-07-30 — flowchart completo de "Sink a Startup" + diseño de "Simple Startup Game" (pág. 331-337, 21%)
- Pág. 331: Figure 5-1, el flowchart COMPLETO del juego real (crear 3 Startups → grilla → repetir intento/chequeo/acción hasta que no queden → calificar al usuario).
- Pág. 331: antes de la versión completa, construyen "Simple Startup Game" (1 sola Startup, fila virtual de 7 celdas en vez de grilla 2D); diseño de 2 clases: `SimpleStartupGame` (solo `main`, sin instance variables) y `SimpleStartup` (`int[] locationCells`, `int numOfHits`, `checkYourself(int)`, `setLocationCells(int[])`).
- Pág. 333: pseudocódigo de `main()` + ejemplo de ejecución completo (4 intentos: hit, hit, miss, kill → "You took 4 guesses").
- Pág. 335: metodología de 8 pasos para desarrollar una clase (definir qué hace → listar variables/métodos → prep code → test code → implementar → probar → depurar → chiste final). Término nuevo: prep code.
- Pág. 337: checklist aplicado — a `SimpleStartupGame` se le tacha "test code" porque su propio `main()` ya sirve de prueba para `SimpleStartup`.
- Ejercicios de la tanda: ninguno (tanda de diseño, sin código propio del usuario todavía).
- Dudas: 2/2 — P1 (por qué clase empezar primero) contestó "la que mejor define lo que se crea", corregido: es por DEPENDENCIAS, se empieza por la clase que no depende de otras (SimpleStartup) para poder confiar en ella antes de construir la que la usa. P2 (por qué la fila virtual no necesita array de 7) no la tenía clara, explicada con ejemplo: solo se guardan las 3 celdas que importan, nunca las 7.
- PRÓXIMO PASO: pág. 338 en adelante.

SESIÓN #61 — 2026-07-30 — prep code completo de SimpleStartup (pág. 338-340, 21%)
- Pág. 338: definición precisa de las 3 partes de cada clase (prep code = pseudocódigo enfocado en lógica, test code = prueba del real code, real code = Java de verdad). Corrección: la definición de "prep code" que había quedado anotada en la Sesión #60 tenía el foco al revés (decía que era sobre sintaxis, no sobre lógica); ya corregida en el vocabulario.
- Pág. 339: prep code completo de `checkYourself(int)` (compara el intento contra cada celda de `locationCells`, cuenta hits, devuelve "hit"/"miss"/"kill") y de `setLocationCells(int[])` (setter simple).
- Pág. 340: arranca "Writing the method implementations" — viñeta de humor reforzando escribir test code antes que el real code.
- Ejercicios de la tanda: ninguno (sigue siendo diseño).
- Dudas: pendiente de corregir en el chat (por qué prep code va primero; trace manual de checkYourself con locationCells={2,4,6} y guess=6).
- PRÓXIMO PASO: pág. 341 en adelante.

SESIÓN #62 — 2026-07-30 — TDD y test code de SimpleStartup (pág. 341-346, 21%)
- Pág. 341: Test-Driven Development (TDD) — escribir el test code ANTES de que exista el método a probar. Arranca "Writing test code for the SimpleStartup class": para checkYourself() sí interesa el test; setLocationCells() es un setter trivial, no hace falta.
- Pág. 343: mismo prep code de checkYourself ya visto en Sesión #61 (no se repite); lista de 5 pasos de qué probar (instanciar, asignar ubicación, fabricar un guess falso, invocar checkYourself, imprimir resultado).
- Pág. 345: "There are no dumb questions" — cómo se corre un test sobre algo que no existe (con stub code, no se corre, se ESCRIBE primero) y por qué conviene escribir el test antes en vez de esperar al código real (aclara qué debe hacer el método, y si no se hace ahora nunca se hace).
- Pág. 346: código real de `SimpleStartupTestDrive` (test code completo, con guess falso = 2 comparado contra "hit"). Ejercicio "Sharpen your pencil": qué falta testear — registrado como lib13. Arranca "The checkYourself() method" (conversión de prep code a Java real, con marcas de sintaxis nueva para páginas siguientes).
- Ejercicios de la tanda: lib13 (nuevo, ver EJERCICIOS.md).
- Dudas: pendiente de corregir en el chat (por qué escribir el test antes si no compila; qué tendría que pasar para que el test de SimpleStartupTestDrive imprima "passed").
- PRÓXIMO PASO: pág. 347 en adelante.

SESIÓN #63 — 2026-07-31 — for-each, ++, break + código final de SimpleStartup (pág. 346[repetida]/348/350/351, 22%)
- Tres sintaxis nuevas antes del código completo: bucle for-each (`for (int cell : locationCells)`), operador `++` (post-incremento) y `break` (corta el bucle de inmediato).
- Código final completo de `SimpleStartup` (checkYourself con for-each+break) y `SimpleStartupTestDrive` (guess=2 sobre {2,3,4}) — salida esperada "hit"/"passed".
- El libro deja un foreshadowing sin explicar ("a little bug lurking here") — no spoileado, para más adelante.
- Ejercicios de la tanda: ninguno.
- Dudas: ninguna registrada.
- PRÓXIMO PASO: pág. 353 en adelante (Sesión #64).

SESIÓN #64 — 2026-07-31 — repaso + ejercicio prep code de SimpleStartupGame (pág. 349-354, 22%)
- Pág. 349-352: repaso de checkYourself()/for-each/++/break ya visto en Sesión #63 (comprimido, no repetido).
- Pág. 353-354: ejercicio "Sharpen your pencil" — prep code de la clase `SimpleStartupGame` (el `main()` completo del juego).
- Ejercicios de la tanda: lib14 (completado, con ayuda — ver EJERCICIOS-ARCHIVO.md).
- Dudas: ninguna registrada.
- PRÓXIMO PASO: pág. 354 en adelante — "Prep code for the SimpleStartupGame class" (solución del libro).

SESIÓN #65 — 2026-08-03 — cierre de SimpleStartupGame + Metacognitive Tip (pág. 353[repetida]/354/356, 22%)
- Pág. 353: mismo enunciado de "Sharpen your pencil" ya visto en Sesión #64 (lib14) — no se repite.
- Pág. 354: salida de ejemplo del juego terminado (4 intentos: hit, hit, miss, kill → "You took 4 guesses") y la solución oficial del libro ("Prep code for the SimpleStartupGame class"): usa una bandera booleana `isAlive` para cortar el `while`, en vez de `break`.
- Comparación break vs. bandera booleana: `break` sale del bucle en el instante exacto en que se ejecuta; la bandera recién corta en la próxima evaluación de la condición del `while` — en este ejercicio no cambia el resultado (nada sigue al `if` dentro del bucle), pero es una diferencia real de flujo de control.
- Pág. 356: "Metacognitive Tip" — alternar entre el lado lógico y el creativo del cerebro cada ~30 min evita el cansancio de uno solo.
- Ejercicios de la tanda: ninguno (cierre/repaso de lib14, ya archivado).
- Dudas: 2/2 — variable de control declarada afuera del while (bien, con matiz de scope) y break vs. bandera booleana (bien, con matiz de flujo de control).
- PRÓXIMO PASO: pág. 357 en adelante.

SESIÓN #66 — 2026-08-03 — main() completo del juego + Math.random() con cast (pág. 357-360, 22%)
- Pág. 357: bullet points de cierre — repaso de prep/test/real code, for vs. while, for-each, `++`/`--` y `break` (todo ya visto, sin novedad).
- Pág. 358: cómic "Howdy from Ghost Town" (parodia de pueblos fantasma con carteles "Pets.com"/"beyond.com", empresas reales quebradas en la burbuja punto-com) — conecta el chiste del capítulo con el tema de "Sink a Startup".
- Pág. 358: `main()` completo de `SimpleStartupGame` — arma `theStartup`, genera `locations` con `Math.random()`, declara `isAlive` y corre `while(isAlive)` pidiendo un guess vía `helper.getUserInput(...)`, llama `checkYourself()` y corta con `isAlive = false` (mismo patrón de Sesión #65, ahora con el helper real).
- Pág. 359: `Math.random()` devuelve un `double` entre 0.0 (incluido) y 1.0 (no incluido); `(int) (Math.random() * 5)` trunca la parte decimal y deja un entero de 0 a 4. NOTA DEL PROFE (el libro mismo lo dice): hoy se prefiere `java.util.Random` y su método `nextInt(int)`, que no necesita cast.
- Pág. 360: `getUserInput(String)` de la clase auxiliar (helper class) `GameHelper` — muestra el mensaje pasado por parámetro y devuelve un `int` leído por consola. Se anuncia `GameHelper` como la última clase que falta armar; el libro pospone el detalle de leer datos al Capítulo 16 y promete el código en la próxima página.
- Ejercicios de la tanda: ninguno.
- Dudas: pendiente de corregir en el chat (por qué hace falta el cast `(int)` en `Math.random() * 5`).
- PRÓXIMO PASO: pág. 361 en adelante (código de GameHelper).

SESIÓN #67 — 2026-08-03 — GameHelper completo + bug expuesto a propósito (pág. 361-367, 22%)
- Pág. 361: convención "Ready-Bake Code" (código para tipear tal cual, se entiende después); arranca el código de `GameHelper` (import Scanner, inicio de `getUserInput`).
- Pág. 362: se completa `getUserInput()` — `Scanner` envuelve `System.in` (el teclado) y `nextInt()` devuelve lo tipeado; remate de chiste visual sin contenido técnico.
- Pág. 363: corrida de ejemplo funcionando bien (1,2,3 miss, 4,5 hit, 6 kill → "You took 6 guesses").
- Pág. 365: "What's this? A bug?" — misma corrida pero tipeando 1,1,1 tres veces da hit, hit, kill → "You took 3 guesses"; algo no cierra.
- Pág. 367: "Sharpen your pencil" tipo cliffhanger — el libro NO revela el bug todavía, se lo deja "yours to solve" para antes del próximo capítulo. Arranca (solo título) "More about for loops".
- Ejercicios de la tanda: lib15 (nuevo — hipótesis sobre el bug, ver EJERCICIOS.md).
- Dudas: pendiente de corregir en el chat.
- PRÓXIMO PASO: pág. 368 en adelante ("More about for loops").

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
