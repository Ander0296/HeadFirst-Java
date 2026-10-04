# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda del libro (tamaño según formato: 6-10
páginas si vino como texto, 3-5 si vino como pantallazos), explicada en
español y conectada con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página: 617 de 1629 (35%) — capítulo 8: `super` como parte de la superclase, Bullet Points del capítulo y los ejercicios de diagramas (Sesión #113). **Próximo: pág. 618** (sigue el cierre del cap. 8). Desde java-s117 se lee en la app de Android: el número de página sale ABAJO A LA IZQUIERDA ("Page X of 1629"). Deuda de páginas: PENDIENTES.md (la triagea `/pendientes`).
- Última sesión: **Sesión #113** (tanda de 5 pantallazos, 2026-10-04).
- PRÓXIMA SESIÓN: `/rename java-s131` (sale SIEMPRE de esta línea, NO se calcula: es un contador distinto al de las tandas. La última fue java-s130 (04/10): Sesión #113. paginas/ queda vacía: traer pantallazos desde la pág. 618.)
- Ejercicios: **lib26** "Mixed2" COMPLETADO el 28/09 (4/4 tras una pista; r1 al 2026-10-02). **lib27** Monster/Vampire: r1 BIEN 4/4 el 03/10 (línea final en blanco por 2ª vez; r2 al 17/10). **ej18** Pool Puzzle "los botes" COMPLETADO el 30/09 con muchas pistas, trabado por el inglés (r1 al 2026-10-04; desde ahora todo puzzle trae diccionario de la piscina). **lib24** dado de baja en el triage del 01/10.
- ⚠ **27 repasos en cola** tras el triage del 01/10 (el más viejo, lib10 "What's legal?" r1, del 2026-08-03). No converge (entran ~1,3/día, sale 1): se atacan por RIESGO, no por fecha; el arranque lo crea `/repaso`. Recientes: sobrescritura r1 BIEN (23/09, r2 07/10); compilador vs. JVM r1 bis BIEN (28/09, r2 12/10); lib23 r1 bis BIEN 8/8 (28/09, r2 12/10). **Sharpen pág. 80-81 GRADUADO (01/10)** con el r3 bis: "concatena" y "arreglo" sin pistas; evaluar `22 < 15` salió recién con pista (mirarlo en el examen). Errores a vigilar: media consigna, "no se ejecuta" cuando revienta, no nombrar la excepción, "lista" por arreglo, hardcodear en vez de `.length`, no EVALUAR la condición con el valor real (ToDo/entregar-un-ejercicio.md).
- SPOILERS leídos y NO explicados (retomar solo al entregarse cada ejercicio): pág. 197-199, 257, 260-263, 319-321, 388-391, **538-540** (soluciones del cap. 7: lib27, lib26 y ej18).
- Último triage (`/pendientes`): **2026-10-01** — bajas: 5 repasos (ej01, ej02, ej03, lib11, lib20) + lib24; cola de repasos 32 → 27. PENDIENTES.md: solo el Ready-Bake de GameHelper. Ritmo real: **5,46 pág./tanda** (102 tandas, pág. 557) → faltan **~196 tandas** (~143 con TEXTO). Freno principal: de java-s103 a s115 solo 3 sesiones tuvieron tanda; el resto, repasos.
- Último examen (`/examen`): **2026-10-01** (el sexto, java-s115; el quinto fue el 20/09). SÓLIDO: concatenación de izquierda a derecha (`"Suma: " + 3 + 4` → `Suma: 34`; `3 + 4 + " total"` → `7 total`), evaluar la condición con el valor real (vio el borde `1 > 1`) y clase/método abstracto (eligió con dos razones). FLOJO: `Integer.parseInt` (escribió `parseInt` suelto) → sale de DOMINADOS; r1 BIEN el 04/10 (pero lo llamó "casteo" y usó `Integer` por `int`), r2 al 18/10. Transversal: media consigna en 4 de 4 (porqué, tipo, línea completa, la línea ilegal); sigue sin decir "concatena". ToDo/entregar-un-ejercicio.md: punto nuevo de parseInt.
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
| type parameter                    | parámetro de tipo | El tipo escrito entre `< >`: en `ArrayList<Button>` le dice al compilador que ahí solo entran objetos Button. |
| angle brackets                    | paréntesis angulares | Los signos `< >` que encierran el parámetro de tipo. |
| to wrap / to unwrap               | envolver / desenvolver | Lo que hace el compilador solo: mete la primitiva en un objeto al agregarla a una colección y la saca al leerla. |
| bullet points                     | puntos clave | Página de resumen con la que Head First cierra cada capítulo. |
| hand model                        | modelo de manos | Persona cuyo trabajo es que le fotografíen las manos (relojes, cremas). Chiste del libro: tipear de más le arruina la herramienta de trabajo. |
| "Roses are red"                   | "Las rosas son rojas" | Molde de poema infantil inglés de cuatro versos ("Roses are red, violets are blue, ...") que se usa sobre todo para chistes: lo gracioso es el remate. |
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
| module                            | módulo | Agrupación de PAQUETES, desde Java 9. Es la capa de arriba de todo: módulo → paquete → clase → método. `java.base` es el módulo con lo fundamental, y viene incluido siempre. |
| javadoc                           | javadoc (documentación de la API) | Las páginas HTML con la ficha de cada clase de Java. Las genera una herramienta automáticamente a partir de los comentarios del código fuente. |
| deprecated                        | obsoleto / desaconsejado | Método o clase que todavía funciona y compila, pero que Java pide no usar en código nuevo porque existe una alternativa mejor. |
| to browse / to flip through       | hojear | Pasar páginas sin buscar nada puntual, para ver qué hay. Es como se DESCUBREN clases que no sabías que existían. |
| to stumble on to                  | toparse con / tropezarse con | Encontrar algo útil por casualidad, sin haberlo buscado. |
| in a nutshell                     | en pocas palabras / resumido | Modismo inglés. Da nombre al libro de referencia "Java in a Nutshell". |
| index                             | índice | Lista alfabética de TODO lo que hay en la documentación (clases, métodos, variables). La entrada más rápida si sabés el nombre a medias. |
| immutable                         | inmutable | Objeto que no se puede modificar después de creado. La lista que devuelve `List.of(...)` es inmutable: no acepta `add()`. |
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
| `is` / `has` (prefijos)               | prefijos `is` / `has` | La forma que toma un getter cuando devuelve un `boolean`: `isEncendido()`, `hasPilas()`. Son getters igual que `get`: LEEN y devuelven, no cambian nada. No son verbos de acción. |
| action method / behavior method       | método de acción / verbo puro | Método que HACE un trabajo en vez de leer o asignar un campo: `encender()`, `apagar()`, `imprimirEstado()`. No lleva NINGÚN prefijo. Los get/set/is describen al objeto; los verbos puros lo hacen funcionar. |
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
| final (en una clase o método)         | final | En una CLASE: nadie puede extenderla (ej. `String`). En un MÉTODO: ninguna subclase puede sobrescribirlo. Da seguridad de que funcionan como se escribieron. |
| contract (of a method)                | contrato (de un método) | Lo que un método promete hacia afuera: qué argumentos recibe y qué devuelve. Quien lo sobrescribe tiene que respetarlo idéntico. |
| @Override                             | (anotación) sobrescribe | Se pone arriba de un método para que el compilador verifique que de verdad sobrescribe uno de la superclase; si la firma no coincide, da error. |
| overloading                           | sobrecarga | Varios métodos con el MISMO nombre en la misma clase, que se diferencian por lo que reciben entre paréntesis: `add(E e)` y `add(int index, E element)`. Java elige cuál llamar mirando los argumentos, nunca el tipo de retorno. |
| shallow copy                          | copia superficial | Copia que duplica el contenedor pero NO los objetos de adentro: `clone()` de un ArrayList devuelve una lista nueva cuyos elementos son los mismos objetos. Agregar o borrar en una no toca a la otra, pero modificar un elemento se ve en las dos. |
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
| method signature                      | firma del método | La línea que identifica un método: nombre + tipos que recibe entre paréntesis (`int indexOf(Object o)`). Dice QUÉ recibe y qué devuelve, pero NO qué pasa en los casos borde: eso está en la descripción y en Throws. |
| Throws (sección del javadoc)          | Lanza | Sección de la ficha de un método que dice con qué EXCEPCIÓN revienta y bajo qué condición (`get()`: IndexOutOfBoundsException si `index < 0 || index >= size()`). Es la mitad que la firma no muestra. |
| type parameter `E` (generics)         | tipo genérico (Elemento) | Hueco para un tipo en la ficha de una colección: `class ArrayList<E>`. Se llena al crear el objeto (`new ArrayList<String>()` hace E = String), así que todo el javadoc se relee cambiando E por ese tipo. |
| LTS (Long Term Support)               | soporte a largo plazo | Versión de Java que recibe parches durante años; es en la que se paran las empresas. Fueron LTS la 8, 11, 17, 21 y 25. |
| insert (add at index)                 | insertar | `lista.add(2, "dos")` mete el elemento EN la posición 2 y corre un lugar a todos los que estaban de ahí en adelante; nada se pierde. Distinto de `set(2, "dos")`, que PISA lo que había en la 2. |
| red herring                           | pista falsa | Literalmente "arenque rojo": en inglés, un dato puesto a propósito para despistar. El libro avisa que una respuesta del crucigrama es un red herring (`tapas`, la comida española) y no tiene nada que ver con Java. |
| inheritance                           | herencia | Relación entre clases: una clase general (superclase) define atributos y métodos, y las clases específicas (subclases) los reciben automáticamente, sin copiarlos. Se lee "Square hereda de Shape". |
| superclass                            | superclase | La clase de arriba, la más general/abstracta. Tiene lo que TODAS las de abajo comparten. En Java se declara con `class Subclase extends Superclase`. |
| subclass                              | subclase | La clase de abajo, la más específica. Hereda todo lo de la superclase y puede agregar lo suyo o cambiar lo heredado. |
| override / overriding                 | sobrescribir | Una subclase REDEFINE un método que heredó, escribiendo su propia versión con el mismo nombre. Se usa cuando ese comportamiento tiene que ser distinto en la subclase. NO se borra el de la superclase: las otras subclases lo siguen usando. |
| polymorphism                          | polimorfismo | Que un mismo llamado (`rotate()`) ejecute código distinto según qué objeto lo reciba. La JVM decide en tiempo de EJECUCIÓN cuál versión corre. Es el tema central del capítulo 7. |
| abstract (more abstract)              | abstracto (más general) | En un diagrama de herencia, hacia arriba es más ABSTRACTO (menos detalle, más cosas encajan: Shape) y hacia abajo más ESPECÍFICO (Circle). No confundir con la palabra clave `abstract` de Java, que llega después. |
| extends                               | extiende / hereda de | Palabra clave de Java que crea la relación de herencia: `public class Surgeon extends Doctor` se lee "Surgeon hereda de Doctor". Va en la declaración de la SUBCLASE y nombra a la superclase. Una clase solo puede extender UNA clase. |
| members (of a class)                  | miembros (de una clase) | Todo lo que una clase tiene adentro: sus variables de instancia (estado) MÁS sus métodos (comportamiento). Cuando el libro dice "la subclase hereda los miembros de la superclase" quiere decir las dos cosas juntas. |
| state / behavior                  | estado / comportamiento | Las dos mitades de una clase. Estado = las variables de instancia (lo que el objeto SABE); comportamiento = los métodos (lo que el objeto HACE). Diseñar una superclase es buscar el estado y el comportamiento repetidos y subirlos. |
| inheritance tree                  | árbol de herencia | El dibujo de qué clase hereda de cuál. La superclase arriba, las subclases colgando con una flecha hacia arriba. La caja de una subclase muestra SOLO lo que ella escribe: lo heredado está, pero no se dibuja. |
| abstraction                       | abstracción | Subir lo que se repite a un lugar común más arriba en el árbol. Si dos o más subclases hermanas comparten un comportamiento, se crea una clase intermedia que lo tenga una sola vez. |
| class hierarchy                   | jerarquía de clases | El árbol completo de herencia, con todos sus niveles. Puede tener más de dos: `Animal` → `Feline` → `Lion`. Un objeto ejecuta la versión de método MÁS CERCANA subiendo por el árbol. |
| Feline / Canine (clase intermedia)| felino / canino (clase intermedia) | Clase que va entre la superclase general y las concretas, para alojar lo que comparten SOLO algunas subclases y no todas. |
| the lowest one wins               | gana la más baja | Al llamar a un método, corre la versión más específica para el tipo del objeto: la JVM busca primero en la clase del objeto y sube por la jerarquía hasta encontrarla. |
| inheritance table                 | tabla de herencia | Tabla de diseño con tres columnas (Class / Superclasses / Subclasses) que se llena ANTES de dibujar el árbol. Cada relación aparece dos veces, una en cada fila. |
| IS-A test                         | prueba ES-UN | Preguntarse "¿tiene sentido decir que X ES UN Y?". Si es verdad, X puede extender a Y; si suena falsa (una bañera ES UN baño), no corresponde herencia. |
| HAS-A (composition)               | TIENE-UN (composición) | Una clase guarda a otra en una variable de instancia (`Bathroom` tiene `Tub bathtub;`): están relacionadas sin que ninguna extienda a la otra. |
| super (keyword)                   | super (palabra clave) | Dentro de una subclase, se refiere a la superclase. `super.roam();` en un método sobrescrito ejecuta la versión HEREDADA de `roam()` y después sigue con el código propio: extiende el comportamiento en vez de reemplazarlo. |
| oneway-ness (of IS-A)             | dirección única (de ES-UN) | La relación ES-UN vale en un solo sentido: `Triangle IS-A Shape` es verdad, `Shape IS-A Triangle` no. Por eso `extends` nunca se puede dar vuelta. |
| protected                         | protegido | Tercer nivel de acceso (entre default y public): visible en el mismo paquete Y en las subclases. Detalle en el Apéndice B del libro; para un junior alcanza con saber que existe. |
| contract / protocol (of a supertype) | contrato / protocolo (de un supertipo) | Promesa que hace una superclase con sus métodos heredables: "todo Animal (y toda subclase) sabe hacer makeNoise(), eat()..." con esa firma exacta. El código de afuera puede confiar en eso sin saber qué subclase tiene. |
| supertype reference              | referencia de tipo supertipo | Variable declarada con el tipo de la superclase que apunta a un objeto de una subclase (`Animal a = new Dog();`). Es la puerta de entrada al polimorfismo; se ve en la próxima tanda. |
| reference type / object type     | tipo de la referencia / tipo del objeto | En `Animal a = new Dog();` el tipo de la referencia es Animal (a la izquierda: decide qué métodos se pueden llamar) y el del objeto es Dog (después de `new`: decide qué versión corre). |
| polymorphic array                | arreglo polimórfico | Arreglo declarado con el supertipo (`Animal[]`) que guarda objetos de subclases distintas (Dog, Cat, Hippo...). Recorriéndolo, cada objeto ejecuta SU versión del método. |
| overloading / overloaded method  | sobrecarga / método sobrecargado | Dos métodos con el mismo nombre y distinta lista de argumentos (`addNums(int, int)` y `addNums(double, double)`). El compilador elige cuál por los tipos que le pasás. NO es sobrescritura. |
| polymorphic argument             | argumento polimórfico | Parámetro declarado con el supertipo (`giveShot(Animal a)`): acepta cualquier subclase, y el método que corre adentro es el del objeto real que llegó. |
| instantiate                      | instanciar | Crear un objeto de una clase con `new`. "Una clase que no se puede instanciar" = una clase a la que no se le puede hacer `new`. |
| abstract class                   | clase abstracta | Clase que NO se puede instanciar: existe para que otras la extiendan (ej. `Animal`, que es un concepto general, no un animal concreto). |
| concrete class                   | clase concreta | Clase que NO es abstracta: es lo bastante específica para crear objetos con `new` (ej. `Dog`, `Lion`). |
| cannot be instantiated           | no se puede instanciar | Parte del error del compilador al hacer `new` de una clase abstracta: "Canine is abstract; cannot be instantiated". |
| interface                        | interfaz | Contrato de métodos que una clase se compromete a tener. El libro la presenta como "una clase 100% abstracta". No confundir con la interfaz gráfica (GUI). |
| abstract method                  | método abstracto | Método declarado con `abstract` y SIN cuerpo: sin llaves, termina en `;` (`public abstract void eat();`). Obliga a la primera subclase concreta a escribirlo. Si una clase tiene uno, la clase tiene que ser abstracta. |
| implement (a method)             | implementar (un método) | Escribirle el cuerpo a un método abstracto heredado: misma firma, tipo de retorno compatible. Es igual que sobrescribir. |
| implements                       | implementa | Palabra clave para que una clase firme el contrato de una interface: `class Dog extends Canine implements Pet`. Va DESPUÉS del `extends`; la clase queda obligada a escribir todos los métodos de la interface. |
| implicitly                       | implícitamente | Sin escribirlo: Java lo da por hecho. Los métodos de una interface son implícitamente `public` y `abstract`. |
| role                             | rol | Lo que una interface define: un papel que puede cumplir una clase de CUALQUIER árbol de herencia ("treat an object by the role it plays", tratar al objeto por el rol que cumple). |
| Serializable / Runnable          | serializable / ejecutable | Dos interfaces de la API: Serializable = el objeto puede guardar su estado en un archivo; Runnable = puede correr en otro hilo. Se ven en capítulos posteriores. |
| method body                      | cuerpo del método | Lo que va entre las llaves `{ }` de un método. Un método abstracto no tiene. `{ }` vacío SÍ es un cuerpo. |
| method signature                 | firma del método | Nombre + lista de argumentos (`eat()`, `roam(int)`). Es lo que tiene que coincidir para implementar o sobrescribir. |
| protocol                         | protocolo | El conjunto de métodos que un supertipo promete que TODAS sus subclases tienen. Los métodos abstractos definen protocolo sin escribir código. |
| pass the buck                    | pasar la pelota | Expresión: dejarle la responsabilidad a otro. Una clase abstracta puede no implementar los métodos abstractos que heredó y dejárselos a la primera subclase concreta. |
| heterogeneous (list)             | (lista) heterogénea | Colección que guarda objetos de clases DISTINTAS bajo un mismo supertipo: un `Animal[]` con perros y gatos adentro. |
| Object (class)                   | (la clase) Object | La raíz de TODAS las clases de Java: quien no escribe `extends` hereda de ella automáticamente. Trae equals(), getClass(), hashCode() y toString(). |
| explicitly / implicitly          | explícitamente / implícitamente | Explícito = lo escribís vos (`extends Animal`). Implícito = Java lo hace solo sin que lo escribas (toda clase sin `extends` extiende `Object`). |
| equals()                         | es igual a | Método de Object que dice si dos objetos se consideran iguales. La versión de Object solo da true si son EL MISMO objeto (como `==`); String la sobrescribe para comparar el texto. |
| hashcode / hashCode()            | código hash | Número entero que identifica a un objeto, pensado para guardarlo rápido en tablas hash (HashMap). Por ahora: "una especie de ID"; dos objetos distintos pueden llegar a compartirlo. |
| toString()                       | a texto (convertir a String) | Método de Object que devuelve un String que representa al objeto. El de Object da `NombreClase@número-hex` (Cat@7d277f); println(obj) lo llama solo. |
| type-safety                      | seguridad de tipos | Garantía de Java de que no le pidas a un objeto algo que no sabe hacer: el compilador solo deja llamar métodos que existen en el tipo de la referencia. |
| strongly typed                   | fuertemente tipado | Lenguaje donde cada variable tiene un tipo fijo y el compilador lo controla. Java lo es: `Object o` solo deja usar métodos de Object. |
| incompatible types (found / required) | tipos incompatibles (encontrado / requerido) | Error de compilación cuando el tipo del valor no entra en la variable: "found: Object, required: Dog". El javac actual lo dice como "Object cannot be converted to Dog". |
| inner core (inner Object)        | núcleo interno (el Object de adentro) | Todo objeto lleva adentro la parte que hereda de cada superclase, hasta Object. `new Snowboard()` es UN solo objeto en el heap, no dos. |
| many forms                       | muchas formas | Significado literal de "polimorfismo": un mismo objeto se puede ver como su clase o como cualquier superclase (Snowboard o Object), según el tipo de la referencia. |
| cast back to its real type       | devolver (con un cast) a su tipo real | Convertir una referencia general (Object) al tipo verdadero del objeto (Dog) para recuperar sus métodos. No cambia el objeto: cambia el control remoto. |
| instanceof                       | es instancia de | Operador que pregunta si un objeto ES UN tipo dado: `o instanceof Dog` da true o false. Se usa antes de un cast para evitar el ClassCastException. |
| expose (a method)                | exponer (un método) | Hacerlo accesible al código de afuera de la clase, normalmente marcándolo `public`. Los métodos expuestos forman el contrato de la clase. |
| multiple inheritance             | herencia múltiple | Que una clase extienda DOS o más superclases. Java NO la permite: `extends` acepta una sola clase (`class Dog extends Animal, Pet` no compila). |
| Deadly Diamond of Death          | diamante mortal de la muerte | El problema que justifica la prohibición: dos superclases sobrescriben el mismo método y la clase de abajo hereda de las dos → ¿cuál versión corre? (No confundir con el diamond operator `<>`.) |
| do-nothing method                | método que no hace nada | Implementación con cuerpo vacío `{ }`, escrita solo para cumplir con un método abstracto heredado. |
| class diagram                    | diagrama de clases | Dibujo de cajas (una por clase/interface) unidas por flechas: SÓLIDA = extends, PUNTEADA = implements, siempre de la hija hacia arriba. Es notación UML. |
| type safety (generics)           | seguridad de tipos (genéricos) | `ArrayList<Dog>` no es una clase especial: el compilador solo deja meter Dogs y por eso pone el cast al sacar. El error aparece al COMPILAR, no en ejecución delante del cliente. |

============================================================
(SESIONES — desde la #86 en formato CORTO: 5-8 bullets, sin bloques
de código, máximo ~15 líneas por sesión. Las sesiones #01 a #99 están
en GUIA-ARCHIVO.md.)
============================================================

SESIÓN #100 — 2026-09-28 — Arranca el capítulo 8: interfaces y clases abstractas; el problema de `new Animal()` (pág. 541-546, 32%)
- Capítulo 8 "Serious Polymorphism" (polimorfismo en serio). La herencia es solo el comienzo: para aprovechar el polimorfismo del todo hacen falta INTERFACES (no las gráficas: contratos de código).
- Adelanto del libro: interfaz = clase 100% abstracta; CLASE ABSTRACTA = clase que NO se puede instanciar (no se le puede hacer `new`).
- Pág. 542-545: el diseño de animales del cap. 7 está bien (poco código duplicado, overrides donde hace falta, `Animal` como protocolo común de 4 métodos, y sirve para subclases que todavía no existen)... pero "¿nos olvidamos de algo?".
- Tres casos: `Wolf aWolf = new Wolf();` (mismo tipo), `Animal aHippo = new Hippo();` (tipos distintos: polimorfismo) y `Animal anim = new Animal();` (mismo tipo, pero RARO).
- El problema: `Animal` es un concepto general. Un objeto "Animal" a secas no tiene forma, ruido ni comida con sentido: nadie debería poder crearlo. La solución (clase abstracta) viene en la próxima tanda.
- Pág. 543-544: Kindle saltea números por el diagrama grande (cubierto igual).
- Ejercicios de la tanda: ninguno.
- Nota del profe: desde Java 8 las interfaces pueden tener métodos `default` con cuerpo, así que "100% abstracta" es una simplificación; el libro lo ve más adelante.
- Chequeo: LAS DOS BIEN, sin pistas y con las dos mitades. (1) Referencia Animal, objeto Hippo, corre el `eat()` de Hippo y lo decide la JVM. (2) `Animal` es una categoría ("dame una verdura" → "¿cuál?"); `new Hippo()` sí dice qué objeto concreto es.
- PRÓXIMO PASO: pág. 547 — qué hacer con `new Animal()` (clases abstractas).

SESIÓN #101 — 2026-09-28 — Clases abstractas vs. concretas (pág. 547-550, 32%)
- Algunas clases NO deben instanciarse: un objeto `Animal` a secas no tiene forma, color ni patas (el "accidente del teletransportador" de Star Trek).
- Se marca con la palabra clave `abstract` en la declaración: `abstract class Canine extends Animal { }`. El COMPILADOR prohíbe todo `new` de esa clase ("Canine is abstract; cannot be instantiated").
- Lo único prohibido es el `new`: la clase abstracta SÍ sirve como tipo de referencia (variable, argumento, retorno, arreglo polimórfico). `Canine c = new Dog();` compila.
- CLASE CONCRETA = la que no es abstracta, lo bastante específica para instanciarse. Árbol: Animal, Canine y Feline abstractas; Hippo, Wolf, Dog, Lion, Cat y Tiger concretas.
- Una clase abstracta casi no sirve si nadie la extiende: el trabajo en ejecución lo hacen instancias de sus subclases concretas. Excepción: miembros `static` (cap. 10).
- En la API hay muchas: `Component` (GUI) es abstracta; se instancia `JButton`, nunca `Component`.
- Pág. 548: Kindle salta el número, el texto sigue sin corte (cubierto igual). BRAIN POWER de la 550: la pregunta sigue en la 551.
- Ejercicios de la tanda: ninguno.
- Nota del profe: el libro escribe `abstract public class`; compila igual, pero la convención es `public abstract class`.
- Chequeo: BIEN tras pedirle las mitades que faltaban (b sin "quién", c sin "porqué": otra vez media consigna). (1) b no compila y lo frena el compilador; c compila porque ES-UN se hereda por toda la cadena. (2) Ejemplo propio: Forma abstracta, Triangulo y Circulo concretas.
- PRÓXIMO PASO: pág. 550-551 — el BRAIN POWER del vino (¿abstracta o concreta?).

SESIÓN #102 — 2026-09-29 — Métodos abstractos (pág. 552-557, 32%)
- BRAIN POWER del vino: Wine, Red y White probablemente abstractas; una botella puntual (Camelot 1997 Pinot Noir) seguro concreta. Dónde se corta depende de la aplicación.
- Clase abstracta = DEBE ser extendida; método abstracto = DEBE ser sobrescrito (implementado). Se usa cuando no existe un cuerpo genérico con sentido (¿cómo come un "animal" a secas?).
- Sintaxis: `public abstract void eat();` — sin cuerpo, sin llaves, termina en punto y coma.
- Un método abstracto obliga a que la CLASE sea abstracta. Una clase abstracta puede mezclar métodos abstractos y con cuerpo.
- Para qué sirve: define PROTOCOLO. "Todos los subtipos tienen ESTE método" → el compilador acepta `a.eat()` sobre una referencia `Animal`, y `Vet` no necesita un método por cada subclase.
- La PRIMERA subclase concreta implementa TODOS los abstractos pendientes. Una abstracta intermedia (Canine) puede pasar la pelota o implementar algunos. Implementar = misma firma + retorno compatible; el contenido da igual para Java (hasta `{ }`).
- Pág. 553 y 555-556: Kindle saltea números por las viñetas; el texto sigue sin corte (cubierto igual).
- Ejercicios de la tanda: Sharpen "Abstract versus Concrete classes" (pág. 557): la tabla está en la página siguiente → su arranque se crea en la próxima tanda.
- Nota del profe: en el trabajo real, `@Override` arriba de cada método implementado; los IDE los generan solos (IntelliJ: "Implement methods", Fase 3).
- Chequeo: veredictos BIEN (Parrot no compila y lo frena el compilador; método abstracto → clase abstracta). Faltó la salida principal: IMPLEMENTAR `fly()`; hacer Parrot abstracta compila pero prohíbe `new Parrot()`. El porqué de "la abstracta puede tener cuerpo" no llegó (media consigna).
- PRÓXIMO PASO: pág. 558 — la tabla del Sharpen "Abstract versus Concrete".

SESIÓN #103 — 2026-10-02 — polimorfismo en acción: MyDogList → MyAnimalList, y Object (pág. 560-564, 33%)
- Lista propia hecha a mano: arreglo de 5 casillas + `nextIndex` (próximo índice); `add()` guarda solo si `nextIndex < arreglo.length`, si no, no hace NADA (ni error ni mensaje).
- Al sumar gatos: una clase por animal o dos arreglos con `addCat`/`addDog` es torpe; la buena es UNA lista con el SUPERTIPO (`Animal[]`, `add(Animal a)`) que acepta cualquier subclase, incluso las futuras.
- `new Animal[5]` con Animal abstracta COMPILA: crea UN objeto arreglo con 5 casillas en null, ningún Animal. Lo prohibido es `new Animal()`.
- Toda clase que no escribe `extends` hereda automáticamente de `Object`, la raíz de todo el árbol: equals(), getClass(), hashCode(), toString().
- La app numera por pantalla: la tabla del Sharpen y MyDogList dicen las dos "Page 560". Pág. 562: cubierto igual (el código sigue sin corte).
- Ejercicios de la tanda: lib28 Sharpen "Abstract versus Concrete" (pendiente): imaginar una app donde cada clase sea concreta y otra donde sea abstracta.
- Nota del profe: en el trabajo real nadie escribe esta lista: se usa `ArrayList<Animal>`, que crece sola. "Una clase que acepte cualquier cosa" se resuelve con genéricos (cap. 11).
- Chequeo: las dos BIEN (0 Animals, arreglo en null; la sexta llamada no hace nada y nextIndex queda en 5). Faltó escribir `5 < 5` → false y "no imprime nada". Práctica libre en Eclipse (Pildoras): faltaba `package`, Cat no extendía Feline.
- PRÓXIMO PASO: pág. 565 (qué trae Object).

SESIÓN #104 — 2026-10-02 — la clase Object y sus 4 métodos (pág. 565-569, 33%)
- Para una lista que acepte CUALQUIER cosa hace falta un tipo por encima de Animal: ya existe, es `Object`. Toda clase que no extiende nada explícitamente la extiende implícitamente (`class Dog extends Object`).
- Si la clase ya extiende otra, NO extiende Object directo: Dog → Canine → Animal → Object. Lo hereda indirectamente, igual que todo lo demás.
- Por qué existe: los autores de la biblioteca escribieron métodos que reciben y devuelven tipos que no conocían (tus clases); sin una raíz común eso sería imposible.
- `equals(Object o)`: ¿se consideran iguales? Dog vs. Cat → false. `getClass()`: la clase con la que se creó el objeto → `class Cat`. `hashCode()`: un número tipo ID (8202111). `toString()`: `Cat@7d277f`.
- Nota del profe: el equals de Object compara si es el MISMO objeto (igual que `==`); String lo sobrescribe para comparar texto (por eso `b.equals(x)`). El hashCode NO es único garantizado. El número de toString es el hashCode en hexadecimal (7d277f = 8202111). `println(c)` llama solo a `c.toString()`.
- Nota del profe: en el trabajo se sobrescriben equals/hashCode/toString en las clases propias (y los `record` de Java 16+ los generan solos).
- Duda: == vs. equals (programa propio en nvim): entendido. Con literales iguales, == da true por el String pool; con new String da false. Regla: los String se comparan con equals.
- Ejercicios de la tanda: ninguno.
- Chequeo: veredictos BIEN (indirecto; true/false; 2 objetos). Porqués MAL: "toString sale de Animal" (sale de Object) y "equals compara el contenido" (el de Object compara si es el mismo objeto). Repaso del concepto al 05/10.
- PRÓXIMO PASO: pág. 570.

SESIÓN #105 — 2026-10-02 — el precio de usar referencias Object (pág. 569-574, 33%)
- Object es CONCRETA (sus métodos traen código). Sus métodos `final` no se sobrescriben (getClass); se recomienda sobrescribir equals, hashCode y toString.
- Object sirve para dos cosas: tipo polimórfico para métodos que aceptan cualquier clase, y código común que todo objeto hereda. `new Object()` casi nunca se usa.
- Type-safety (seguridad de tipos): solo se llama un método si la clase del TIPO DE LA REFERENCIA lo tiene. `Object o = new Ferrari(); o.goFast();` no compila.
- Con `ArrayList<Dog>`, get() devuelve Dog. Con `ArrayList<Object>`, get() devuelve Object aunque adentro haya un Dog: `Dog d = lista.get(0);` NO COMPILA.
- El objeto no deja de ser Dog: solo lo "parece" (para el compilador, que lee la etiqueta de la referencia). Próximo: un método que devuelve Object, y cómo recuperar el Dog.
- Ejercicios de la tanda: ninguno. Hueco 570-571: cubierto igual (la pantalla de Android junta páginas).
- Chequeo: BIEN 2/2 (dijo "línea 4" por la 3: contar las líneas). Pidió la explicación más fácil: el compilador es un guardia que solo lee la etiqueta de la caja.
- PRÓXIMO PASO: pág. 575.

SESIÓN #106 — 2026-10-03 — un método que devuelve Object (pág. 574-576, 33%)
- `public Object getObject(Object o) { return o; }` es legal: recibe un Dog y devuelve una referencia al MISMO Dog, pero con tipo de retorno Object. Es lo mismo que hace get() de `ArrayList<Object>`.
- `Dog sameDog = getObject(aDog);` NO COMPILA: "incompatible types, found: java.lang.Object, required: Dog". El compilador lee el TIPO DE RETORNO declarado, no lo que el método devuelve de verdad.
- `Object sameDog = getObject(aDog);` SÍ compila: a una referencia Object entra cualquier objeto, porque toda clase pasa la prueba ES-UN con Object (está en la cima de todo árbol).
- Pero sirve de poco: con `Object o` solo se llaman métodos de Object (`o.hashCode()` sí, `o.bark()` no compila). El compilador decide por el tipo de la REFERENCIA, no del objeto real: para él podría ser un Button o un Microwave.
- Ejercicios de la tanda: ninguno. Pág. 576 repasa type-safety de la #105 con otro ejemplo. Un pantallazo salió vacío (cubierto igual: 574-576 sin hueco).
- Nota del profe: el javac actual dice el mismo error como "incompatible types: Object cannot be converted to Dog".
- Chequeo: P2 BIEN (`o.hashCode()` sí, `o.meow()` no; escribió `hashcode`). P1 MAL: dijo que `Cat c = findPet();` compila, y después que `Object o = c;` no: invirtió la frase ES-UN las dos veces. Con el método de 3 pasos ("<derecha> ES UN <izquierda>") acertó `Cat c2 = o;` → no compila. Repaso del concepto adelantado al 06/10.
- PRÓXIMO PASO: pág. 577 (cómo recuperar el Dog: el cast).

SESIÓN #107 — 2026-10-03 — el núcleo Object de todo objeto (pág. 576-579, 33%)
- Pág. 576 y 578 vuelven sobre la #106: el método que se llama sobre una referencia TIENE que existir en la clase de ESA referencia. Con `Object o`, el control remoto tiene 4 botones (equals, getClass, hashCode, toString), aunque el objeto sea un Dog.
- `o.bark()` no compila aunque VOS sepas que es un Dog: para el compilador podría ser un Button o un Microwave.
- Pág. 579 (viñeta): "me trata como un Object, pero puedo hacer mucho más": la referencia esconde lo que el objeto sabe hacer.
- "Get in touch with your inner Object": un objeto contiene TODO lo que hereda de cada superclase. `new Snowboard()` crea UN solo objeto en el heap, que envuelve un núcleo con la parte Object. No son dos objetos.
- Por eso todo objeto puede tratarse como su clase Y como Object. Snowboard = 4 métodos heredados de Object + 4 propios (turn, shred, getAir, loseControl).
- Ejercicios de la tanda: ninguno. Pág. 577 no vino: el texto de la 576 empalma con el dibujo de la 578 (cubierto igual).
- Chequeo: BIEN 2/2 (`o.turn()` no, `o.toString()` sí, por el tipo de la referencia; UN solo objeto). Detalle: dijo "toString pertenece a un método de Object" (ES un método de Object) y escribió "Objeto" por `Object`.
- PRÓXIMO PASO: pág. 580 (cómo ver al objeto "por lo que realmente es": el cast).

SESIÓN #108 — 2026-10-03 — polimorfismo con Object y el problema de recuperar el Dog (pág. 582-585, 34%)
- "Polymorphism means many forms" (polimorfismo = muchas formas): un Snowboard se puede tratar como Snowboard o como Object. El objeto es UNO; lo que cambia es el control remoto.
- El control remoto suma botones al bajar por el árbol: Object = 4 botones; Snowboard = esos 4 + los propios. Más específica la clase, más botones (salvo que la subclase solo sobrescriba).
- `Snowboard s = new Snowboard(); Object o = s;` → dos referencias, UN objeto. `o` solo ve la parte Object del objeto.
- Regla de ArrayList<Object>: lo que entra se trata solo como Object, y lo que sale (`get`) es SIEMPRE una referencia Object.
- Pág. 584-585: "¿de qué sirve un Dog que salió como Object si no puede hacer cosas de perro?" → se lo devuelve a su tipo REAL con un cast. La sintaxis viene en la pág. 586.
- Ejercicios de la tanda: ninguno. Pág. 580-581 y 583 no vinieron: el dibujo de la 582 es el mismo de la #107 (cubierto igual).
- Chequeo: P1 BIEN (un objeto; `o.getAir()` no compila por el tipo Object). P2 a medias: referencia Object bien, pero dijo que el objeto en el heap es "ArrayList" (es el Dog: `get()` devuelve el elemento, no la lista).
- PRÓXIMO PASO: pág. 586 (el cast de referencias: `Dog d = (Dog) o;`).

SESIÓN #109 — 2026-10-03 — el cast de referencias y el contrato de una clase (pág. 586-591, 34%)
- `Dog d = (Dog) o;` copia la referencia Object en una referencia Dog. El objeto NO cambia (sigue siendo el mismo Dog); cambia el control remoto, que recupera los botones de Dog (`d.roam()`).
- El cast es una PROMESA tuya al compilador ("sé que es un Dog"). Si mentís, compila igual pero en ejecución revienta con `ClassCastException`.
- Si no estás seguro: `if (o instanceof Dog) { Dog d = (Dog) o; }`. `instanceof` pregunta "¿el objeto ES UN Dog?" y devuelve true/false.
- Los métodos públicos de una clase son su CONTRATO con el mundo. Exponer (expose) un método = hacerlo accesible, normalmente con `public`.
- Ejemplo Account (debit, credit, getBalance): si la clase no tuviera de verdad el método, explotaría en ejecución. Eso no pasa porque el compilador revisa la clase de la REFERENCIA en cada punto (`a.metodo()`): que exista, que reciba esos argumentos y que devuelva ese tipo.
- El contrato de Dog incluye todo lo heredado: Canine, Animal y Object. Problema nuevo: reusar Dog en un PetShop que pide comportamientos de mascota (`beFriendly()`, `play()`). Opción 1: meterlos en Animal → hereda todo el mundo, pero un Hippo o un Lion quedan con métodos de mascota, y Dog y Cat igual tendrían que sobrescribirlos.
- Ejercicios de la tanda: ninguno (el Brain Power se responde en las páginas que siguen). Pág. 587, 589 y 590 no vinieron: el texto empalma (cubierto igual).
- Nota del profe: desde Java 16, `if (o instanceof Dog d) { d.roam(); }` hace el chequeo y el cast en una línea (pattern matching).
- Chequeo: veredictos BIEN 2/2 (compila y revienta; UN solo Dog). Flojo: no nombró `ClassCastException` ni dijo POR QUÉ (el objeto real es un Cat); dijo "casteamos la variable o" (o sigue siendo Object: el cast crea una SEGUNDA referencia `d`).
- PRÓXIMO PASO: pág. 591-592 (opción 2 y siguientes para el PetShop).

SESIÓN #110 — 2026-10-03 — diseñar el PetShop y la herencia múltiple (pág. 591-601, 34%)
- Opción 2: métodos de mascota ABSTRACTOS en Animal → ningún no-mascota hereda comportamiento, pero cada clase concreta (Hippo, Lion...) tipea métodos "do-nothing" `{ }`, y el contrato MIENTE: anuncia beFriendly() sin hacerlo. En Animal va solo lo que vale para TODOS los animales.
- Opción 3: métodos de mascota SOLO en Dog y Cat. Dos problemas: (1) sin contrato, el compilador no detecta si alguien escribe doFriendly() o pone un String donde iba un int; (2) sin polimorfismo: `Animal a = new Dog(); a.beFriendly();` no compila (Animal no tiene el método).
- Lo que se necesita: comportamiento solo en las mascotas + garantía de mismos métodos + polimorfismo → parecen hacer falta DOS superclases (Pet y Animal).
- Herencia múltiple (`extends Animal, Pet`) NO existe en Java por el Deadly Diamond of Death: CDBurner y DVDBurner sobrescriben burn() de DigitalRecorder; ComboDrive heredaría de las dos → ¿qué burn() corre? ¿qué `i`? La salida de Java: la interface (páginas siguientes).
- Pág. 592-594, 597-598 y 600: la app saltea números en páginas con dibujo; el texto empalma (cubierto igual). Ejercicios: ninguno.
- Chequeo: BIEN 2/2 (el compilador mira la referencia; Java no sabría qué burn() ejecutar). Detalle: "se rompe" → mejor "es ambiguo, por eso Java no lo compila".
- PRÓXIMO PASO: pág. 601-602 en adelante (la interface).

SESIÓN #111 — 2026-10-04 — la interface al rescate (pág. 602-604, 35%)
- Permitir el diamante obliga a reglas especiales para cada ambigüedad; Java prefiere reglas simples y consistentes (C++ sí lo permite).
- Solución: la `interface` (palabra clave, no la interfaz gráfica): da casi todo el polimorfismo de la herencia múltiple sin el diamante.
- El truco: TODOS sus métodos son abstractos → la subclase concreta está OBLIGADA a escribirlos, así que en ejecución hay UNA sola versión y la JVM no duda cuál llamar.
- Definir: `public interface Pet { ... }` (interface en lugar de class). Métodos sin cuerpo, terminan en `;`.
- Los métodos de una interface son IMPLÍCITAMENTE `public` y `abstract`: escribirlo es opcional y se considera mal estilo (el libro lo escribe solo para remarcarlo).
- Implementar: `class Dog extends Canine implements Pet { }` → se puede extender UNA clase y además implementar la interface. Dog ES-UN Canine y ES-UN Pet.
- Pág. 602-604 sin huecos (la 604 vino en dos pantallazos). Ejercicios: ninguno. Nota del profe: los métodos `default` con cuerpo (Java 8) ya anotados en la Sesión #100.
- Chequeo: P1 BIEN (método con cuerpo en interface no compila). P2 a medias: sabía que sin métodos no compila, pero dijo que Cat ES-UN "Feline y Animal" y OMITIÓ Pet (lo que agrega `implements`). Leer la declaración entera.
- PRÓXIMO PASO: pág. 605 en adelante.

SESIÓN #112 — 2026-10-04 — interfaces como ROLES y cuándo usar cada cosa (pág. 605-609, 35%)
- Al implementar Pet, Dog DEBE escribir `beFriendly()` y `play()` con cuerpo `{ }` (el contrato); `roam()` y `eat()` son sobrescrituras normales de Animal.
- Tipo polimórfico CLASE → solo objetos de ESE árbol (parámetro Canine acepta Wolf y Dog, no Cat ni Hippo). Tipo INTERFACE → cualquier árbol: RoboDog (extends Robot) también es un Pet. Se trata al objeto por el ROL que cumple.
- Una clase extiende UNA clase pero implementa VARIAS interfaces: `class Dog extends Animal implements Pet, Saveable, Paintable`. La superclase dice quién sos; las interfaces, qué roles cumplís.
- En la API: Serializable (guardar estado en archivo) y Runnable (otro hilo) se ven más adelante.
- Decisión: clase común (no pasa ES-UN con nada) / subclase (versión MÁS ESPECÍFICA) / abstracta (plantilla con código común, no instanciable) / interface (ROL en cualquier árbol).
- `super.runReport();` (repaso): BuzzwordsReport usa el código de Report y le AGREGA lo suyo. La pág. 609 sigue en la 610.
- Pág. 608 no vino (cubierto igual: la 609 arranca con encabezado nuevo). Ejercicios: ninguno. Nota del profe: `default`/`static` en interfaces (Java 8), ya anotados en #100.
- Chequeo: P1 BIEN (Pet sí, Animal no), pero dijo que implements "permite crear el objeto" (lo crea `new`; implements deja que una referencia Pet lo apunte). P2 BIEN (compila, se pierde el código del padre), pero llamó "método BuzzwordsReport" a la clase. PRÓXIMO PASO: pág. 610.

SESIÓN #113 — 2026-10-04 — `super` como "la parte de la superclase" + Bullet Points del cap. 8 (pág. 612-617, 35%)
- `super` es una referencia a la PORCIÓN de superclase dentro del objeto: `super.runReport();` corre la versión de Report aunque la subclase la haya sobrescrito. Desde AFUERA, una referencia siempre llama a la versión de la subclase (polimorfismo); solo el código de la subclase puede pedir la del padre.
- Bullet Points: repaso de TODO el capítulo (abstract, Object, cast, ClassCastException en ejecución, ArrayList<Object>, diamante, interface/implements, varias interfaces, super). Nada nuevo salvo el adelanto de `default`/`static` (cap. 12).
- Pregunta tonta: `ArrayList<Dog>` devuelve Dogs sin cast porque el COMPILADOR pone el cast por vos: solo te dejó meter Dogs, así que sabe que es seguro. Ventaja real: el error salta al compilar, no en ejecución. Detalle en el cap. 11 (genéricos).
- Ejercicios: lib29 "What's the Picture?" (código → diagrama) y lib30 "What's the Declaration?" (diagrama → código), pendientes. Clave: flecha sólida = extends, punteada = implements, cursiva = interface, gris = abstracta.
- Huecos: 610-611 y 613-614 cubierto igual (la 612 rehace el ejemplo de super; la app saltea números).
- Chequeo: P1 BIEN (corre la de BuzzwordReport y super trae la de Report), pero sin el porqué (la JVM mira el OBJETO) y dijo "extender" un método (es sobrescribir). P2 a medias: "el compilador pone el cast" bien, pero invirtió la ventaja (el error se encuentra AL compilar) y omitió que solo deja meter Dogs. PRÓXIMO PASO: pág. 618.

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
