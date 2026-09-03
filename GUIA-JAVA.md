# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda del libro (tamaño según formato: 6-10
páginas si vino como texto, 3-5 si vino como pantallazos), explicada en
español y conectada con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página: 445 de 1629 (26%) — paquetes, nombre completo e `import`; `java.lang` es el único automático; `static final` = constante. Ver Sesión #81. **Próximo: pág. 446.** Deuda de páginas: PENDIENTES.md (la triagea `/pendientes`).
- Última sesión: **Sesión #81** (tanda). Desde el 2026-08-24, sin tandas nuevas: solo repasos, triage, examen y entregas (java-s56 a s66).
- PRÓXIMA SESIÓN: `/rename java-s67`
  (sale SIEMPRE de esta línea, no se calcula: es un contador distinto al
  de las tandas. La última cerrada fue java-s66: repaso lib15-r1 [BIEN],
  el vencido de mayor riesgo — r2 al 2026-09-17.)
- Ejercicios pendientes: 6 (5 obligatorios: lib07, lib12, lib13, ej13, lib17 · 1 opcional: lib18). Detalle y repasos: EJERCICIOS.md.
- ⚠ **14 repasos vencidos** (el más viejo, ej05 Robot r1, del 2026-07-28). Se atacan INDIVIDUALES y por RIESGO, no por fecha; el archivo de arranque lo crea `/repaso` en el momento. Pendientes de re-intento: lib14-r1 bis (2026-09-05, RE-ESTUDIO), lib19-r1 bis y el concepto "arrancar un programa" (los dos el 2026-09-06). El 2026-09-03 (java-s66) lib15-r1 salió BIEN, el de mayor riesgo de la lista.
- SPOILERS leídos y NO explicados (retomar solo al entregarse cada ejercicio): pág. 197-199, 257, 260-263, 319-321, 388-391.
- Último triage (`/pendientes`): **2026-08-25** — DECISIONES ABIERTAS sin aplicar: bajas propuestas de lib07 (redundante con lib10 ya completado) y lib12 (lectura pura, 26 días); y del backlog de páginas, baja de 428, 431 y 434-435 (cubiertas) más decidir 440 y 444. Quedan 47 páginas sin triagear.
- Último examen (`/examen`): **2026-09-03** (el segundo, java-s65). Sólido: compile-time vs. runtime, y que toda instrucción ejecutable vive dentro de un método. Flojo: qué hace falta para ARRANCAR un programa — mezcló "la clase que se ejecuta" con "el método específico que busca la JVM dentro de esa clase". Consecuencia: ese concepto se sacó de CONCEPTOS DOMINADOS (no se sostuvo en frío) y se re-agendó repaso para 2026-09-06. Próximo examen: ~2026-09-17.
- Entorno: OpenJDK 26.0.1, javac/java en PATH (Arch Linux), sin config extra.

## VOCABULARIO EN <-> ES (Claude agrega una fila por término nuevo)

| Inglés                            | Español | En una frase |
| --------------------------------- | ------- | ------------ |
| package                           | paquete | Agrupación con nombre de clases relacionadas de la biblioteca. `ArrayList` vive en el paquete `java.util`; las clases de ventanas, en `javax.swing`. |
| full name (fully qualified name)  | nombre completo (nombre calificado) | Paquete + clase: `java.util.ArrayList`. Es como Java identifica una clase sin ambigüedad. `ArrayList` a secas es el nombre corto. |
| import                            | importar | Línea al principio del archivo que le dice al compilador el nombre completo de una clase, para poder escribirla corta el resto del archivo. |
| Java API / Java library           | biblioteca de Java | Las miles de clases que vienen con Java listas para usar: String, ArrayList, Math, Scanner, Random... No se instalan, ya están. |
| name collision / name-scoping     | choque de nombres / ámbito de nombres | Dos clases distintas llamadas igual. Los paquetes lo resuelven: `java.util.Set` y `com.miempresa.Set` conviven sin pisarse. |
| constant                          | constante | Variable que no puede cambiar de valor: se declara `static final` y por convención se escribe `EN_MAYUSCULAS_CON_GUIONES`. |
| short-circuit (operator)          | (operador de) cortocircuito | `&&` y `||` cortan la evaluación apenas saben la respuesta: si la izquierda de un `&&` es false, la derecha ni se ejecuta. Es lo que hace seguro a `if (x != null && x.metodo())`. |
| Ready-Bake Code                   | código listo para usar | Sección donde el libro te regala código ya escrito (ej. GameHelper) para no perder tiempo tipeando algo que no enseña nada nuevo. |
| precedence                        | precedencia | El orden en que Java evalúa los operadores de una expresión. El libro recomienda no memorizarla: poner paréntesis. |
| Boolean expression                | expresión booleana | Cualquier pregunta que da `true` o `false`. Es lo que va adentro de un `if` o un `while`. |
| instantiate                       | instanciar | Crear un objeto con `new`. "El main instancia el objeto StartupBust" = lo fabrica en memoria. |
| delegate                          | delegar | Que un objeto le pida a otro que haga un trabajo en vez de hacerlo él. StartupBust delega la entrada del usuario en GameHelper. |
| loop through                      | recorrer | Pasar uno por uno por todos los elementos de una lista o arreglo con un bucle. |
| prompt (the user)                 | pedirle datos al usuario | Mostrar un mensaje y quedarse esperando a que el usuario escriba algo. |
| command line                      | línea de comandos | La terminal, sin ventanas ni botones: el programa escribe texto y el usuario responde escribiendo. |
| grid                              | grilla / cuadrícula | Tablero de filas por columnas. El de "Sink a Startup" es 7x7: filas A-G, columnas 0-6 (numeradas desde cero, como los arreglos). |
| cell                              | celda | Cada casilla de la grilla. Se nombra juntando fila y columna: "A3", "C5". |
| granularity                       | granularidad | Qué tan chicos son los pedazos en que se parte un trabajo. Métodos de granularidad chica = métodos cortos, fáciles de testear y cambiar. |
| annotate                          | anotar | Escribir al margen qué hace cada línea de código. Ejercicio típico de Head First. |
| magic number                      | número mágico | Un valor literal suelto en el código (`<= 18`) sin nombre que explique de dónde salió. Se reemplaza por una constante con nombre. |
| get out of the loop (early)       | salir del bucle (temprano) | Cortar el bucle antes de recorrer todo, con `break`, porque ya se consiguió lo que se buscaba. |
| slot                              | espacio / casillero | El renglón en blanco donde se escribe la respuesta en un ejercicio de papel. |
| guess                             | intento / adivinanza | Lo que el jugador escribe en cada turno. El juego responde "hit", "miss" o "kill". |
| Ready-Bake Code                   | código ya horneado | Código que el libro te da hecho y que NO hace falta entender todavía (acá: el algoritmo que ubica las Startups al azar, dentro de GameHelper). |
| type parameter                    | parámetro de tipo | El `<String>` de `ArrayList<String>`: le dice al compilador qué tipo de objeto acepta esa lista. |
| parameterized type                | tipo parametrizado | Un tipo que se completa con otro tipo entre ángulos. Existen desde Java 5; el detalle está en el Cap. 11. |
| array brackets                    | corchetes de arreglo | Los `[]`: sintaxis especial que en Java NO se usa en ningún otro lado que no sea un arreglo. |
| boundaries                        | límites | Los índices válidos de un arreglo: de 0 a `length - 1`. Salirse revienta en ejecución. |
| plain old Java object             | objeto Java común y corriente | Un objeto sin nada especial: se le piden cosas con el operador punto y listo. Así es un ArrayList, no un arreglo. |
| autoboxing                        | autoempaquetado | Conversión automática de una primitiva a su clase envoltorio al meterla en una colección (y de vuelta al sacarla). Desde Java 5. |
| primitive wrapper class           | clase envoltorio de primitiva | Clase que envuelve una primitiva para poder tratarla como objeto (int → Integer). Necesaria porque un ArrayList solo guarda objetos. |
| diamond operator                  | operador diamante | Los ángulos vacíos `<>` de `new ArrayList<>()`: desde Java 7 evitan repetir el tipo del lado derecho. |
| zero-based                        | de base cero | Que empieza a contar desde 0: el primer elemento está en el índice 0 (arreglos y ArrayList por igual). |
| poser                             | chanta / aparentador | Alguien que aparenta ser algo que no es. En el libro, cómo ArrayList trata al arreglo. |
| wrapper                           | envoltorio | Objeto que envuelve a otra cosa y le agrega métodos por encima; por dentro sigue estando lo envuelto. |
| dynamically                       | dinámicamente | En tiempo de ejecución, mientras el programa corre — no fijado de antemano al escribir el código. |
| ArrayList                         | lista de arreglo | Clase de la Java API que guarda objetos como un arreglo pero crece y se achica sola. |
| clunky                            | torpe / aparatoso | Una solución que funciona pero es incómoda y da más trabajo del necesario. |
| to shrink                         | achicarse / encoger | Reducir su tamaño; lo que un arreglo NO puede hacer y un ArrayList sí. |
| prebuilt classes                  | clases prediseñadas | Clases que ya vienen escritas y compiladas en la biblioteca; se usan sin escribirlas. |
| Java SE (Standard Edition)        | Java Edición Estándar | La plataforma Java base que trae el núcleo de la API (miles de clases listas). |
| reference book                    | libro de referencia | Se consulta puntualmente por un dato específico, no se lee de corrido (ej: una enciclopedia). |
| Java API                          | API de Java | Biblioteca de clases prediseñadas que trae el JDK, lista para usar en vez de reinventar la rueda. |
| novelty                           | novedad | Lo que el cerebro busca constantemente; lo rutinario se filtra como "no importante". |
| abstract method (adelanto)        | método abstracto | Método sin cuerpo, declarado pero no implementado; se ve en detalle con herencia. |
| IS-A / HAS-A (adelanto)           | relación ES-UN / TIENE-UN | Relaciones entre clases (herencia vs. composición); se ven en detalle más adelante. |
| metacognition                     | metacognición | Pensar sobre cómo uno piensa/aprende; prestar atención a cómo prestás atención. |
| object (adelanto)                 | objeto | Contenedor que agrupa datos propios de una "cosa"; se ve en detalle con clases y objetos. |
| reserved word / keyword           | palabra reservada | Palabra que el compilador ya tiene tomada con un significado del lenguaje; no se puede usar como nombre propio (public, static, void, int...). |
| Sharpen your pencil               | Afilá el lápiz | Sección recurrente del libro con ejercicios de papel (sin compilar nada). |
| Make it Stick                     | Hacé que se te pegue | Recuadro del libro con trucos de memoria (mnemotecnias) para fijar una lista. |
| BE the Compiler                   | Sé el Compilador | Ejercicio recurrente del libro donde el lector actúa como si fuera el compilador de Java. |
| BE the JVM                        | Sé la JVM | Variante de "BE the Compiler": el lector predice qué imprime en consola un programa ya compilado, actuando como la máquina virtual. |
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
| boolean test                          | prueba booleana | La condición del `for`/`while`: debe resolver siempre a `true` o `false`. |
| iteration expression                  | expresión de iteración | La 3ra parte del `for` clásico (ej. `i++`); se ejecuta al FINAL de cada vuelta, no al principio. |
| pre-increment vs. post-increment      | pre-incremento vs. post-incremento | Solo importa cuando `++x`/`x++` es PARTE de una expresión mayor: `++x` incrementa y DESPUÉS usa el valor nuevo; `x++` usa el valor actual y DESPUÉS incrementa. |
| narrowing conversion                  | conversión reductora (narrowing) | Cast de un tipo primitivo grande a uno chico (ej. `long` a `short`); puede perder datos (los bits de más se cortan), por eso Java exige el cast explícito. Es lo inverso del ensanchamiento implícito. |

============================================================
(SESIONES — desde la #56 en formato CORTO: 5-8 bullets, sin bloques
de código, máximo ~15 líneas por sesión. Las sesiones #01 a #55 están
en GUIA-ARCHIVO.md.)
============================================================

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

SESIÓN #68 — 2026-08-07 — for clásico: sus 3 partes + flowchart (pág. 367[repetida]/368/369/370/371, 22%)
- Pág. 367: chiste visual (foto colgado de una soga, "It's a cliff-hanger!") reforzando el pun ya visto — sin novedad técnica.
- Pág. 368: arranca "More about for loops" — se distingue el `for` clásico (regular/non-enhanced) del for-each ya usado; diagrama con sus 3 partes: initialization, boolean test, iteration expression (+ el operador `++`).
- Pág. 369: chiste visual (flexiones), pun con "reps" (repeticiones) — sin novedad técnica.
- Pág. 370: traducción mental "repeat 100 times" y cómo lo ve el compilador (3 pasos); explica cada parte del `for` por separado. Dato clave: la iteration expression corre al FINAL de cada vuelta, no al principio. Ejemplo `for (int i=0;i<8;i++) { println(i); }`.
- Pág. 371: flowchart formal del mecanismo interno del `for` (declare→test→body→increment→vuelve a test; false→sigue después del bucle).
- Ejercicios de la tanda: ninguno.
- Dudas: 2/2 bien (cuenta de vueltas del for y qué parte corre una sola vez).
- PRÓXIMO PASO: pág. 372 en adelante (quedan 2 pantallazos sin procesar en paginas/, ya tomados después de esta tanda: seguir por ahí).

SESIÓN #69 — 2026-08-07 — cierre del capítulo: for vs. while, pre/post-incremento, for-each del compilador, casting reductor (pág. 371-375, 23%)
- Pág. 371: mismo bucle reescrito con `while` en vez de `for` — muestra que `while` no trae init/incremento incorporados, hay que ponerlos a mano.
- Pág. 372: salida de consola confirmando que da lo mismo que la versión con `for` — sin novedad.
- Pág. 373: trampa `++x` (pre-incremento) vs. `x++` (post-incremento) cuando forman parte de una expresión mayor — mismo valor final de `x`, pero distinto valor asignado a la otra variable.
- Pág. 374: `enhanced for` (ya usado en Sesión #63) explicado paso a paso desde el punto de vista del compilador (crea variable en null → asigna primer elemento → corre cuerpo → repite).
- Pág. 375: casting reductor (narrowing) entre primitivos — de tipo grande a chico se pueden perder bits, por eso Java exige cast explícito; es lo inverso del ensanchamiento implícito (Sesión #56).
- Ejercicios de la tanda: ninguno.
- Dudas: 1/2 — casting reductor bien; post-decremento (x--) calculó bien los valores (x=4, y=5) pero invirtió el orden de impresión del println (dijo "5 4", era "4 5").
- PRÓXIMO PASO: pág. 376 en adelante (queda 1 pantallazo sin procesar en paginas/).

SESIÓN #70 — 2026-08-07 — cierre de narrowing con overflow/truncamiento + arranque de "BE the JVM" (pág. 376-380, 23%)
- Pág. 376: cierra narrowing con más ejemplos — long→int con cast (ok), long→short donde el valor no entra (40002 excede el límite de 16 bits: el resultado envuelve a -25534, dato raro pero calculable), float→int con truncamiento puro (3.14f → 3, sin redondear). Remata: nunca castear boolean con ningún otro tipo (ni con cast explícito).
- Pág. 378: arranca "BE the JVM" (variante de "BE the Compiler": predecir la salida real de un programa ya compilado) — clase `Output` con un `for` de 1 a 7 que mezcla post-incremento (`value++`) fuera del `if` y pre-incremento (`++value`) dentro de un `System.out.print`, más un corte con `break` cuando `value` supera 14.
- Pág. 379-380: 3 ventanas de terminal con posibles salidas para elegir ("12 14" / "12 14 x = 6" / "13 15 x = 6"), cierran el ejercicio.
- Ejercicios de la tanda: "BE the JVM" nuevo, registrado como lib16 (no opcional).
- Dudas: pendiente de verificar en el chat (narrowing con overflow y truncamiento).
- PRÓXIMO PASO: pág. 381 en adelante (Code Magnets "MultiFor", crucigrama "JavaCross" y un "Mixed Messages" nuevo — ya tomados, quedan para la próxima sesión de Claude).

SESIÓN #71 — 2026-08-07 — "Code Magnets" MultiFor + crucigrama "JavaCross" (pág. 380-384, 23%)
- Pág. 380-382: "Code Magnets" — reconstruir 7 imanes de código (dos `for` anidados, `i++` e `if`) para que `MultiFor` imprima "0 4 / 0 3 / 1 4 / 1 3 / 3 4 / 3 3"; repasa las 3 partes del for (Sesión #68) y pre/post-incremento (Sesión #69).
- Pág. 383-384: crucigrama "JavaCross" — 32 pistas (16 horizontales, 16 verticales) de vocabulario Java visto hasta ahora, cada palabra respuesta queda en inglés (término técnico real).
- Pág. 384: arranca (solo título + consigna, sin contenido) un "Mixed Messages" nuevo — queda para la próxima tanda.
- Ejercicios de la tanda: "MultiFor" nuevo (ej13, no opcional) y "JavaCross" nuevo (lib17, no opcional).
- Dudas: ninguna (tanda 100% de ejercicios, sin explicación de concepto nuevo).
- PRÓXIMO PASO: pág. 385 en adelante (contenido real del "Mixed Messages" nuevo).

SESIÓN #72 — 2026-08-07 — "Mixed Messages" #3 nuevo + cierre del capítulo con soluciones (pág. 386-391, 23%)
- Pág. 386-387: enunciado completo de un "Mixed Messages" nuevo — programa con dos `for` anidados (outer 0-2, inner de 4 a 2) más un `if (x == 6) { break; }`, un bloque candidato a insertar y `x`/`y` que se actualizan cada vuelta. 6 candidatos (`x=x+3`, `x=x+6`, `x=x+2`, `x++`, `x--`, `x=x+0`) contra 7 posibles salidas.
- Pág. 387-391: "Exercise Solutions" / "Puzzle Solutions" — cierre del capítulo con las soluciones oficiales de BE the JVM (ya cerrado, coincide con lo resuelto), Code Magnets "MultiFor" y JavaCross (ambos AÚN PENDIENTES para el usuario) y de este "Mixed Messages" nuevo (recién registrado). Las 3 pendientes quedan como SPOILER, no se explicaron.
- Nota del profe: esta tanda fue una EXCEPCIÓN a la regla de "una tanda de imágenes por sesión de Claude" — el usuario pidió seguir en la misma sesión porque era el cierre del capítulo con soluciones, decisión suya explícita.
- Ejercicios de la tanda: "Mixed Messages" #3 nuevo, registrado como lib18 (opcional).
- Dudas: ninguna (tanda de enunciado + spoilers diferidos, sin pregunta de comprensión).
- PRÓXIMO PASO: pág. 392 en adelante.

SESIÓN #73 — 2026-08-07 — arranca Capítulo 6: Java API + recap del bug de SimpleStartupGame (pág. 393-398, 23%)
- Pág. 393: título del Capítulo 6 "Using the Java Library: Get to Know the Java API" — cómic de apertura.
- Pág. 394: intro a la Java API (biblioteca de clases prediseñadas del JDK); retoma el cliffhanger del capítulo anterior mostrando el juego funcionando bien (1-6 → 6 intentos).
- Pág. 396-398: recap oficial del libro sobre el bug que el usuario ya resolvió en lib15 — mismo diagnóstico (contaba hits repetidos sin chequear celdas ya acertadas) y misma solución propuesta (Opción uno: segundo arreglo para trackear celdas ya acertadas).
- Ejercicios de la tanda: ninguno nuevo (puro recap + introducción de tema).
- Dudas: ninguna.
- PRÓXIMO PASO: pág. 399 en adelante (contenido nuevo de Java API, probablemente ArrayList).

SESIÓN #74 — 2026-08-07 — por qué el arreglo se queda corto y aparece ArrayList (pág. 400-403, 24%)
- Pág. 400: Opción dos para el bug — un solo arreglo, marcando con -1 las celdas ya acertadas. Menos torpe que dos arreglos, pero sigue obligando a recorrer las 3 posiciones aunque ya estén muertas.
- Pág. 401: Opción tres — "borrar" la celda acertada achicando el arreglo. Imposible directo: EL TAMAÑO DE UN ARREGLO NO SE PUEDE CAMBIAR. Hay que crear un arreglo nuevo más chico, copiar lo que queda y reasignar la referencia.
- Pág. 402: prep code real vs. prep code soñado, lado a lado — "recorré las celdas restantes", "QUITÁ esta celda", "SI el arreglo quedó vacío → kill". Toda la lógica de contar hits desaparece si la colección se achica sola.
- Pág. 403: "Wake up and smell the library" — eso existe y se llama ArrayList, una clase del núcleo de la Java API, ya compilada. Métodos clave: add, remove(int index), remove(Object o), contains, isEmpty, indexOf, size, get.
- Nota del profe: `add(E e)` con esa E rara es genéricos (Capítulo 11); por ahora leerlo como "add() recibe el objeto que querés meter".
- Ejercicios de la tanda: ninguno nuevo.
- Dudas: ninguna.
- PRÓXIMO PASO: pág. 404 en adelante (ArrayList en código: declararla, importarla, usarla).

SESIÓN #75 — 2026-08-07 — las ocho operaciones de ArrayList + entrevista ArrayList vs. arreglo (pág. 405-410, 24%)
- Pág. 405: las 8 operaciones básicas — crear con `<Tipo>` (genéricos, Cap. 11), add, size, contains, indexOf, isEmpty, remove. La lista crece sola con cada add: no se declara tamaño.
- Diferencia que se pregunta en entrevistas: arreglo usa `length` (VARIABLE, sin paréntesis) y cuenta cajones existan o no; ArrayList usa `size()` (MÉTODO) y cuenta lo que hay adentro de verdad.
- ArrayList es zero-based igual que el arreglo: `indexOf()` del segundo elemento devuelve 1.
- Pág. 408-410 ("Java Exposed", entrevista a ArrayList): leer `dogArray[1]` NO saca nada del arreglo, solo copia la referencia; el objeto y la posición siguen ahí. `remove()` de ArrayList sí quita de verdad.
- Por dentro un ArrayList ES un arreglo que se recrea más grande al llenarse (la "Opción tres" de la Sesión #74, pero ya escrita por otro): esa es la idea de usar la API.
- ArrayList NO guarda primitivas: van envueltas en su primitive wrapper class (Integer, etc.), automático desde Java 5 (autoboxing, Cap. 10).
- Nota del profe: desde Java 7 se escribe `new ArrayList<>()` con diamond operator (ángulos vacíos); el libro usa la forma larga, el trabajo real usa la corta.
- Ejercicios de la tanda: lib19 "Sharpen your pencil: ArrayList vs. arreglo común" (pág. 407) — pendiente.
- Dudas: `length` vs `size()` bien; CORREGIDO un error de fondo — creía que `new Dog[5]` crea 5 objetos Dog con valores por defecto y que faltan las referencias. Es al revés: crea 5 REFERENCIAS en null y faltan los objetos (5 `new`). Solo los arreglos de primitivas se llenan con valores por defecto reales.
- PRÓXIMO PASO: pág. 411 en adelante (arreglar el juego con ArrayList).

SESIÓN #76 — 2026-08-07 — solución de la tabla ArrayList vs. arreglo + las 4 diferencias de fondo (pág. 412-416, 24%)
- Pág. 412: solución oficial de lib19. El detalle fino: el libro escribe `b.equals(item)` (la variable que NO es null va primero) y corta con `break` al encontrarlo.
- Pág. 413: un arreglo ES un objeto, pero vive en un mundo aparte — NO se le puede invocar ningún método; lo único accesible es su única instance variable, `length`. Por eso va sin paréntesis. Un ArrayList es un objeto común y corriente: todo se le pide con el operador punto.
- Diferencia 1 — el arreglo EXIGE su tamaño al crearse (`new String[2]`) y ese tamaño queda fijo; `new ArrayList<String>()` no pide tamaño y crece/se achica solo.
- Diferencia 2 — en un arreglo hay que asignar a una posición EXACTA (`myList[1] = b`), y un índice fuera de rango revienta en tiempo de ejecución (ArrayIndexOutOfBoundsException). En ArrayList, `add(objeto)` sin índice va agregando y la lista hace lugar sola.
- Pág. 414-415: Diferencia 3 — los corchetes `[]` son sintaxis especial que no se usa en ningún otro lado de Java; ArrayList no tiene sintaxis propia. Diferencia 4 — pero sí usa tipos parametrizados: el `<String>` es un "parámetro de tipo" que fuerza al compilador a aceptar solo ese tipo (detalle completo en el Cap. 11, existen desde Java 5).
- Pág. 416: arranca "Let's fix the Startup code" — la clase pasa a llamarse `Startup` (antes `SimpleStartup`) y se re-muestra la versión con el bug ya diagnosticado en lib15: contaba cada guess como hit sin chequear si esa celda ya había sido acertada.
- Nota del profe: el orden `b.equals(item)` vs. `item.equals(b)` no es un capricho — evita el NullPointerException cuando el arreglo tiene posiciones en null. En Java moderno también existe `Objects.equals(a, b)`, que aguanta null de los dos lados.
- Ejercicios de la tanda: ninguno nuevo (la pág. 412 cerró lib19, completado en esta misma sesión).
- Dudas: ninguna nueva; se cerró lib19 con las 6 filas correctas en el 2do intento.
- PRÓXIMO PASO: pág. 417 en adelante (reescribir Startup con ArrayList). Pág. 411 quedó salteada.

SESIÓN #77 — 2026-08-07 — Startup reescrita con ArrayList + planificación del juego real "Sink a Startup" (pág. 418-423, 25%)
- Pág. 418: la clase Startup con ArrayList<String>. Desapareció `numOfHits`: el estado vive en la lista misma, que se achica de verdad con `remove(index)`. La lógica de checkYourself pasó de un for + contador a tres líneas.
- `indexOf(userInput)` devuelve el índice o -1 si no está: por eso el if pregunta `index >= 0` (el índice 0 es un acierto válido). `isEmpty()` da true cuando la lista quedó vacía = "kill". checkYourself ahora recibe un String ("A3"), no un int.
- Lección de fondo del capítulo: cada variable de estado llevada en paralelo (un contador manual) es un bug esperando a nacer — el bug de lib15 era exactamente eso. Si la estructura de datos puede representar el estado sola, dejala.
- Pág. 419-420: el juego real "Sink a Startup" (clon de Batalla Naval con startups punto-com falsas: poniez, cabista, hacqi). Grilla 7x7, filas A-G y columnas 0-6 (desde cero, como los arreglos); 3 Startups de 3 celdas cada una, colocadas al azar. Corre por línea de comandos: se escribe una celda ("A3") y responde hit / miss / kill.
- Pág. 422: qué cambia. `SimpleStartup` → `Startup` (se le agrega una variable `name`), `SimpleStartupGame` → `StartupBust` (crea 3 Startups, les pone nombre con un setter, chequea cada intento contra las tres y juega hasta que no quede ninguna viva), `GameHelper` sin cambios. El algoritmo de ubicación al azar va en GameHelper como Ready-Bake Code.
- Pág. 423: 3 clases y 5 objetos (1 StartupBust + 3 Startup + 1 GameHelper), más cuatro ArrayLists (una del juego y una por cada Startup). StartupBust "crea y juega con" Startup, y "usa" GameHelper para la entrada del usuario y las ubicaciones.
- Nota del profe: "get out of main" — main no es donde va la lógica, es la puerta de entrada: crea un objeto y le pide que arranque. Un main de 200 líneas es señal de alarma en cualquier revisión de código.
- Ejercicios de la tanda: ninguno nuevo.
- Dudas: ninguna.
- PRÓXIMO PASO: pág. 424 en adelante (el diagrama de los 5 objetos y el prep code de StartupBust). Pág. 421 quedó salteada.

SESIÓN #78 — 2026-08-08 — "Quién hace qué en el juego StartupBust (y cuándo)": los 6 pasos (pág. 423-426, 25%)
- Pág. 423, paso 1: el `main()` de la clase StartupBust instancia UN objeto StartupBust, y ese objeto hace todo el juego. La clase que tiene main solo enciende la máquina; no es el juego.
- Pág. 424, paso 2: el objeto StartupBust instancia un GameHelper y lo guarda en su variable de instancia `helper`.
- Pág. 425, pasos 3 y 4: instancia el ArrayList que va a guardar las tres Startups (variable `startups`), y después crea los tres objetos Startup y los mete adentro.
- Pág. 426, paso 5: le pide al helper una ubicación (tres veces, una por Startup) y se la pasa a cada Startup; cada Startup guarda SUS tres celdas en SU PROPIO ArrayList.
- Pág. 426, paso 6: le pide al helper el intento del usuario, recorre la lista de Startups y le pide a cada una que lo chequee; cada una responde "hit" / "miss" / "kill". El ciclo sigue hasta que no queda ninguna viva.
- Conteo real de objetos vivos: 9 — 1 StartupBust + 1 GameHelper + 1 ArrayList de Startups + 3 Startup + 3 ArrayList de celdas (uno por cada Startup). Las 3 clases del diagrama de la Sesión #77 producen 9 objetos, no 5.
- Idea de fondo: ningún objeto hace todo. StartupBust COORDINA y DELEGA — ubicaciones e input al helper, el chequeo del intento a cada Startup. Cada objeto sabe solo lo suyo.
- Nota del profe: esta secuencia numerada es, dibujada a mano, lo que en el trabajo real se llama diagrama de secuencia (quién le habla a quién y en qué orden). Reaparece en la Fase 2 con UML.
- Ejercicios de la tanda: ninguno nuevo.
- Dudas: ninguna.
- PRÓXIMO PASO: pág. 427 en adelante (el prep code / código de StartupBust).

SESIÓN #79 — 2026-08-08 — StartupBust: del prep code al código real (pág. 427-433, 25%)
- Granularidad: 3 trabajos (preparar / jugar / terminar) se parten en 4 métodos, porque métodos chicos se testean, se depuran y se cambian más fácil.
- Los 4 métodos del juego son `private` y solo `main` es `public`: encapsulamiento aplicado a métodos — se expone la puerta de entrada y se esconde la cocina, para que nadie de afuera llame un paso interno fuera de orden.
- `while (!startups.isEmpty())` en vez de `size() > 0`: hace lo mismo pero dice la intención en voz alta. El `!` invierte el booleano.
- Patrón del caso pesimista: `String result = "miss";` y que la evidencia lo cambie. Ahorra el `else` de "no pasó nada".
- Comparación de Strings con `.equals()`, nunca con `==`: `==` pregunta si son el MISMO objeto, `.equals()` si dicen lo mismo. Error clásico de entrevista junior.
- `break` tras un hit/kill: no tiene sentido preguntarle a las otras Startups, cada una ocupa celdas distintas.
- El `main` son 3 líneas: crea el objeto juego, `setUpGame()`, `startPlaying()`. `finishGame()` lo llama `startPlaying()` al salir del while — el main arranca, no dirige.
- Nota del profe (1): `startups.remove(...)` dentro de un enhanced for normalmente lanza `ConcurrentModificationException`; acá solo funciona porque el `break` de abajo corta el bucle y nunca hay vuelta siguiente. Lo robusto es `Iterator.remove()` o `removeIf()`.
- Nota del profe (2): el `18` de `numOfGuesses <= 18` es un magic number; en código profesional va como `private static final int GOOD_SCORE = 18;`.
- Ejercicios de la tanda: lib20 "Annotate the code yourself!" (21 números vs. 21 anotaciones, pág. 430-433) — PENDIENTE. El Sharpen your pencil de test code de la pág. 430 es el mismo pedido que lib13, se resuelven juntos.
- Dudas: ninguna.
- PRÓXIMO PASO: pág. 434 en adelante (la versión anotada del libro — recién después de entregar lib20).

SESIÓN #80 — 2026-08-13 — Operadores booleanos y cortocircuito (pág. 436-439, 25%)
- Pág. 436-437 fueron recap: la solución oficial del lib20 (coincidió con las 21 anotaciones del usuario) y la versión final de la clase Startup, con sus dos variables de instancia `private` y `indexOf()` devolviendo -1 cuando no encuentra.
- `&&` es Y (exigente: pide que TODO sea true), `||` es O (generoso: le alcanza con uno). Dos símbolos, no uno.
- No existe `if (300 <= price < 400)`: en Java no se encadenan comparaciones. Cada lado del `&&` tiene que ser una pregunta completa que dé true o false sola — hay que repetir la variable.
- Negar: `!=` para primitivas, `!` adelante del `.equals()` para objetos. `!brand.equals("X")` se lee "no es cierto que brand sea X".
- CORTOCIRCUITO (short-circuit): si el lado izquierdo de un `&&` es false, la JVM corta ahí y ni mira el derecho; con `||`, si el izquierdo es true tampoco sigue. No es una optimización invisible: cambia lo que se ejecuta.
- De ahí sale el guard más escrito de Java: `if (refVar != null && refVar.metodo())`. El orden NO es negociable — al revés explota con NullPointerException.
- `&` y `|` (un solo símbolo) son los NO cortocircuito: siempre miran los dos lados. Contexto, no para dominar (su uso real es manipular bits), pero escribir `&` donde iba `&&` rompe el guard del null.
- El libro recomienda usar paréntesis en vez de memorizar precedencia. Contracara vista el mismo día en el ej14: en aritmética los paréntesis no aclaran, MANDAN (`celsius * (9 / 5)` fuerza división entera y arruina la cuenta).
- Ejercicios de la tanda: ninguno (estas 4 páginas no traen Sharpen your pencil ni puzzles).
- Nota del profe: `"hit".equals(result)` (condición Yoda) evita el NPE sin guard; desde Java 14 la NPE dice exactamente qué fue null; `Objects.equals(a, b)` aguanta nulls de los dos lados.
- Dudas: ninguna.
- PRÓXIMO PASO: pág. 440 en adelante (Ready-Bake Code: la clase GameHelper, sin la cual StartupBust no compila).

SESIÓN #81 — 2026-08-13 — Ready-Bake GameHelper + paquetes e import (pág. 441-445, 26%)
- Pág. 441, Ready-Bake Code ("código listo para usar"): el libro REGALA la clase GameHelper. No hay que entenderla línea por línea, pero sin ella StartupBust no compila.
- `static final` = CONSTANTE: `static` la hace única para toda la clase (no una por objeto), `final` prohíbe cambiarla. Convención MAYÚSCULAS_CON_GUIONES. Es el antídoto al magic number de la Sesión #79.
- El `while (!success & attempts++ < MAX_ATTEMPTS)` del libro usa `&` de un solo símbolo: el NO cortocircuito de la Sesión #80. Acá no rompe nada, pero es exactamente lo que ayer se marcó como riesgoso.
- Pág. 442-443: la biblioteca de Java (Java API) está partida en PAQUETES. `ArrayList` está en `java.util`, las clases de ventanas en `javax.swing`. El chiste del dibujo son paquetes postales atados con piolín.
- NOMBRE COMPLETO = paquete + clase (`java.util.ArrayList`). Java siempre lo necesita; dos formas de dárselo: `import` arriba del archivo, o escribirlo entero en CADA uso (declaración, argumento y tipo de retorno).
- Ya usabas paquetes sin saberlo: `System`, `String` y `Math` viven en `java.lang`, el ÚNICO que Java importa solo. Por eso nunca importaste `String`.
- Pág. 445: los paquetes existen por tres razones — organizar la biblioteca, evitar choques de nombres (tu clase `Set` vs. la `Set` del API) y restringir accesos.
- Nota del profe: `import` no copia código ni agranda el programa, es un atajo de escritura con cero costo en ejecución; la convención que el libro calla es el dominio al revés (`com.miempresa.proyecto`); y desde Java 9 hay una capa por encima, los MÓDULOS (`module-info.java`) — contexto, no para dominar.
- Ejercicios de la tanda: ninguno (estas páginas no traen Sharpen your pencil ni puzzles).
- Chequeo: `static final` PERFECTO (separó los dos efectos solo). En el import detectó bien el error, pero como "las dos formas" dio `import` específico vs. `import` con `*` — que son la MISMA opción A. La opción B del libro es escribir el nombre completo en cada uso. Corregido.
- Dudas: ninguna.
- PRÓXIMO PASO: pág. 446 en adelante. Salteadas nuevas: 440 y 444. FALTA además el resto del Ready-Bake de GameHelper: los 5 métodos privados que llama `placeStartup` (`getIncrement`, `startupFits`, `coordsAvailable`, `savePositionToGrid`, `convertCoordsToAlphaFormat`) — sin ellos la clase no compila.

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
