# GUÍA: HEAD FIRST JAVA (Sierra, Bates y Gee, 3ra ed.) + POO EN JAVA
No asume conocimiento previo — la mantiene Claude Code sesión a sesión.
Cada sesión cubre una tanda del libro (tamaño según formato: 6-10
páginas si vino como texto, 3-5 si vino como pantallazos), explicada en
español y conectada con código Java que el usuario escribe a mano.
Ejercicios: ver EJERCICIOS.md.

## INICIO RÁPIDO

- Última página: 491 de 1629 (28%) — **capítulo 7 (herencia)**: terminado el diseño del simulador de animales. Se sobrescriben `eat()` y `makeNoise()` en cada subclase; `sleep()` y `roam()` quedan genéricos, y aparecen las clases intermedias `Feline` y `Canine` con su propio `roam()`. Ver Sesión #89. **Próximo: pág. 492**. Deuda de páginas: PENDIENTES.md (la triagea `/pendientes`).
- Última sesión: **Sesión #89** (tanda de 4 pantallazos, 2026-09-10).
- PRÓXIMA SESIÓN: `/rename java-s85`
  (sale SIEMPRE de esta línea, no se calcula: es un contador distinto al
  de las tandas. La última fue java-s84: Sesión #89, Feline y Canine.)
- Ejercicios pendientes: **lib23** "Sharpen your pencil: contar el árbol Doctor" (pág. 482, contar variables y métodos heredados vs. escritos).
- ⚠ **11 repasos vencidos** (el más viejo, ej09 TestArrays r1, del 2026-08-01). Se atacan INDIVIDUALES y por RIESGO, no por fecha; el arranque lo crea `/repaso`. El 10/09 salió BIEN ej08 BE the Compiler r1 (los dos programas, salida exacta; r2 al 24/09). Errores a vigilar: decir "no se ejecuta" cuando el programa arranca y revienta (mirar cuántas líneas imprimió antes), no nombrar la excepción (`NullPointerException` / `ArrayIndexOutOfBoundsException`), llamar "lista" a un arreglo, y hardcodear el tamaño en vez de `.length`.
- SPOILERS leídos y NO explicados (retomar solo al entregarse cada ejercicio): pág. 197-199, 257, 260-263, 319-321, 388-391.
- Último triage (`/pendientes`): **2026-09-08** — backlog viejo de páginas SALDADO: las 41 sin clasificar se dieron de baja (Kindle web saltea números; no era contenido faltante). PENDIENTES.md queda con 2 entradas vivas, las dos con QUÉ falta escrito: pág. 447-448 y el Ready-Bake de GameHelper. También de baja lib13. Ritmo real: 5,5 pág./tanda (83 tandas, pág. 456 de 1629) → faltan ~214 tandas; pasando el material como TEXTO en vez de pantallazos bajarían a ~147.
- Último examen (`/examen`): **2026-09-08** (el tercero, java-s77). 7 de 8 sólidos: compile-time vs. runtime, instrucción ejecutable dentro de un método, ArrayList (`size`/`indexOf`/`remove` y por qué se compacta), ArrayList vs. arreglo, `b = a` copia la referencia no el objeto, y paquetes/`import`/nombre completo (el `*` no pesa ni ralentiza). Flojo por SEGUNDA vez: qué hace falta para ARRANCAR un programa — dijo "clase main" y cree que solo una clase puede tener `main`. Repaso re-agendado al 2026-09-11 y checklist ampliado. Próximo examen: ~2026-09-22.
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

============================================================
(SESIONES — desde la #86 en formato CORTO: 5-8 bullets, sin bloques
de código, máximo ~15 líneas por sesión. Las sesiones #01 a #85 están
en GUIA-ARCHIVO.md.)
============================================================

SESIÓN #86 — 2026-09-09 — Arranca el capítulo 7: herencia y sobrescritura (pág. 472-476, 27%)
- HERENCIA (inheritance): en vez de repetir el mismo método en cuatro clases, se saca lo común a UNA clase más general (superclase) y las específicas (subclases) cuelgan de ella. Se lee "Square hereda de Shape".
- Los 4 pasos de Brad, que son la receta del capítulo: (1) mirar qué tienen en común todas las clases, (2) abstraer eso a una clase nueva, (3) linkear las otras a ella con herencia, (4) sobrescribir en la subclase lo que necesite comportarse distinto.
- Qué se gana: UNA sola copia de `rotate()` para mantener en vez de cuatro. Si la superclase tiene la funcionalidad, las subclases la tienen automáticamente — no hay que copiarla ni llamarla, ya es de ellas.
- SOBRESCRIBIR (override): la subclase redefine un método heredado cuando necesita cambiarlo o extenderlo. Amoeba redefine `rotate()` y `playSound()`; Square, Circle y Triangle quedan con las cajas VACÍAS en el diagrama, y esa caja vacía es justamente la señal de que heredan.
- Quién decide qué versión corre: la JVM, en TIEMPO DE EJECUCIÓN. Cuando alguien le pide a un Amoeba que rote, corre el `rotate()` de Amoeba, no el de Shape. Ese mecanismo es el corazón del polimorfismo.
- Eje del diagrama: hacia ARRIBA más abstracto (superclass = more abstract), hacia ABAJO más específico (subclasses = more specific). La flecha de herencia se dibuja de la subclase HACIA la superclase.
- Ejercicios de la tanda: ninguno entregable. La pág. 476 es un Brain Power y vino sin texto (hueco de formato anotado en PENDIENTES.md).
- Nota del profe: en código esto se escribe con la palabra clave `extends` (`class Square extends Shape`). El libro todavía no la mostró; se adelantó en el chat porque el diagrama sin sintaxis no se puede escribir.
- Chequeo de comprensión: LAS DOS BIEN, sin pistas. (1) Caja vacía de Square = sí puede rotar, con el comportamiento de Shape "porque no se modificó, solo se heredó". (2) El `rotate()` de Shape sigue existiendo; la única que cambia el comportamiento es Amoeba. Se le agregó el matiz: heredar NO es recibir una copia — el método vive una sola vez en la superclase.
- PRÓXIMO PASO: pág. 477 en adelante. Siguen faltando 447-448 y ahora la 476 (huecos de formato en PENDIENTES.md).


SESIÓN #87 — 2026-09-10 — `extends` en código: qué se hereda, qué se agrega y qué se sobrescribe (pág. 476-481, 28%)
- Pág. 476 (Brain Power, hueco de formato SALDADO): gato doméstico vs. tigre. La pregunta trampa es "¿el gato es un tigre especializado?" — no: ninguno hereda del otro, los dos son subclases de algo más general (Felino).
- Pág. 477: la sintaxis real de la herencia — `class Subclase extends Superclase`. La subclase hereda los MEMBERS (miembros) de la superclase: variables de instancia + métodos, las dos cosas.
- Una subclase puede hacer TRES cosas con lo heredado: usarlo tal cual, AGREGAR lo suyo (métodos y variables nuevos) y SOBRESCRIBIR lo que necesite distinto. FriedEggMan no sobrescribe nada y es una clase válida (cuerpo vacío).
- Pág. 478: las VARIABLES DE INSTANCIA NO SE SOBRESCRIBEN — no hace falta, porque no definen comportamiento. Cada objeto le pone a `tights` el valor que quiera (púrpura, blanco) sin tocar la declaración heredada. Solo los MÉTODOS se sobrescriben.
- Pág. 481: ejemplo Doctor/FamilyDoctor/Surgeon. `Surgeon` sobrescribe `treatPatient()` (misma firma, cuerpo distinto: cirugía en vez de chequeo) y AGREGA `makeIncision()`. `FamilyDoctor` no sobrescribe nada: solo agrega `makesHouseCalls` y `giveAdvice()`. Ninguna de las dos vuelve a declarar `worksAtHospital`: ya lo tienen.
- Ejercicios de la tanda: hay un "Sharpen your pencil" en la pág. 481 pero llegó SIN enunciado (solo el ícono del lápiz) — anotado como hueco de formato.
- Chequeo de comprensión: LAS DOS BIEN, sin pistas. (1) `Surgeon` tiene `worksAtHospital` porque lo hereda con `extends`; declarado una sola vez en Doctor.java. (2) `FamilyDoctor.treatPatient()` corre el chequeo de `Doctor` porque no lo sobrescribió. Matiz agregado: heredar la variable NO es compartir el valor — cada objeto tiene su propia copia.
- PRÓXIMO PASO: pág. 479-480 (faltan) y 482 en adelante.


SESIÓN #88 — 2026-09-10 — El árbol Doctor dibujado + arranca el diseño del simulador de animales (pág. 482-484, 28%)
- Pág. 482: el diagrama del árbol Doctor/Surgeon/FamilyDoctor. En un diagrama, la caja de una subclase muestra SOLO lo que ESA clase escribe; lo heredado está pero no se dibuja.
- Anotaciones del libro: Surgeon "overrides the inherited treatPatient()" (sobrescribe el heredado) y agrega `makeIncision()`; FamilyDoctor agrega la variable `makesHouseCalls` y el método `giveAdvice()`.
- Arranca el ejemplo largo del capítulo: un simulador donde el usuario tira animales a un entorno. No se programa todavía: se DISEÑA.
- La condición que manda el diseño: "otros programadores tienen que poder agregar tipos nuevos de animales en cualquier momento". Ese es el motivo real de la herencia en el trabajo: dejar la puerta abierta a código que todavía no existe, no ahorrar tipeo.
- PASO 1 del método: buscar objetos con atributos y comportamientos en común. Dos preguntas guía: qué tienen en común los seis tipos (→ paso 2) y cómo se relacionan (→ pasos 4-5).
- Pág. 484: los seis animales (lion, hippo, tiger, wolf, dog, cat) y el estado común: 5 variables de instancia (`picture`, `food` —meat o grass—, `hunger` (int), `boundaries` (ej. 640x480), `location` (X e Y)) y 4 métodos (`makeNoise()`, `eat()`, `sleep()`, `roam()`).
- PASO 2: diseñar una clase con ese estado y comportamiento común → la superclase `Animal`, con las seis subclases colgando y sus cajas VACÍAS (por ahora se conforman con todo lo heredado).
- Vocabulario clave: estado (state) = variables de instancia, lo que el objeto SABE; comportamiento (behavior) = métodos, lo que el objeto HACE.
- Ejercicios de la tanda: lib23 "Sharpen your pencil: contar el árbol Doctor" (pág. 482) — PENDIENTE.
- Chequeo de comprensión: LAS DOS BIEN, sin pistas. (1) Lion puede hacer `roam()`: el método vive una sola vez en `Animal` y se ejecuta subiendo por el árbol. (2) Para agregar `Elephant` NO hay que tocar nada de lo ya escrito: solo un archivo nuevo que extienda `Animal`, y sobrescribir solo si el comportamiento difiere.
- Nota del profe: eso último tiene nombre y aparece en entrevistas — principio abierto/cerrado (Open/Closed Principle, la "O" de SOLID): abierto a extensión, cerrado a modificación. La herencia es la primera herramienta que lo permite. Reaparece en la Fase 2.
- PRÓXIMO PASO: pág. 485 en adelante (pasos 3-5 del diseño). Falta la 483 (hueco de formato).

SESIÓN #89 — 2026-09-10 — Pasos 3, 4 y 5 del diseño: qué se sobrescribe y las clases intermedias Feline/Canine (pág. 486-491, 28%)
- PASO 3: decidir si una subclase necesita comportamiento propio. Las 5 variables sirven igual para todos (cambian los VALORES, no las variables); lo que cambia de verdad es el comportamiento.
- Decisión: `eat()` y `makeNoise()` se sobrescriben en cada subclase (un león no come como un hipopótamo, un perro no suena como un gato). `sleep()` y `roam()` quedan genéricos en `Animal`.
- El libro se corrige solo: SÍ se podría escribir un `makeNoise()` genérico que reproduzca un sonido guardado en una variable, pero queda poco especializado (un animal puede tener varios ruidos según la situación).
- PASO 4: buscar más abstracción — dos o más subclases que compartan comportamiento entre ellas. Wolf y Dog se parecen; Lion, Tiger y Cat también.
- PASO 5: terminar la jerarquía usando las familias biológicas: clases intermedias `Feline` y `Canine` entre `Animal` y los animales concretos.
- `Canine` define un `roam()` común (se mueven en manada) y `Feline` otro `roam()` común (evitan a los de su especie); `Hippo` cuelga directo de `Animal` y se queda con el `roam()` genérico heredado.
- Regla nueva: con tres niveles, un objeto ejecuta la versión del método MÁS CERCANA subiendo por el árbol. Un `Lion` usa el `roam()` de `Feline`, no el de `Animal`.
- Ejercicios de la tanda: ninguno.
- Nota del profe: las clases intermedias son la respuesta a "¿dónde pongo este método?" — se sube al nivel más alto donde el comportamiento sea verdadero para TODOS los de abajo, ni más arriba ni más abajo.
- Chequeo de comprensión: LAS DOS BIEN, sin pistas. (1) Un `Dog` ejecuta el `roam()` de `Canine` "por ser el más cercano". (2) El andar en manada no puede vivir en `Animal` porque no es cierto para todos; y agregó solo el criterio profesional: ante la duda, dejar a `Hippo` heredando lo más general en vez de inventarle un override.
- PRÓXIMO PASO: pág. 492 en adelante (el diseño vuelve más adelante en el capítulo).


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
