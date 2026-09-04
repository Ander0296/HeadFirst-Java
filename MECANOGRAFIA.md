# MECANOGRAFÍA — frases de tipeo por sesión

Las mantiene Claude (regla de mecanografía en CLAUDE.md): al cerrar
cada tanda agrega acá 1-2 frases CORTAS en español (10-16 palabras)
con las ideas clave de la sesión, y vuelca CADA frase aplanada (una
palabra por línea) a su propio archivo:
~/.config/ttyper/texts/headfirst-java-sNN.txt.
Yo practico con ttyper (CTRL+SUPER+ALT+T) sin mirar el teclado.
Las frases no se editan después; si un concepto cambió, frase nueva.

============================================================

s08 — JVM y bytecode:
javac compila el código fuente a bytecode y la JVM lo ejecuta en
cualquier sistema.

s10 — anatomía del main:
Java arranca en public static void main(String[] args) { } dentro
de una clase pública.

s12 — statements, loops y branching:
En un método hay statements, loops para repetir y branching con if
para decidir.

s13 — if/else:
La condición del if siempre es un boolean y va entre paréntesis.

s15 — arrays y Random:
Los arrays empiezan en cero y nextInt(limite) devuelve un entero al
azar.

s16a — BE the Compiler, estructura obligatoria:
Todo bucle o if vive dentro de un método, y todo método dentro de una
clase.

s16b — errores de compilación:
Si el compilador encuentra un error de sintaxis, el programa no
compila ni corre.

s17a — trazar un while paso a paso:
Para predecir la salida hay que rastrear el código vuelta por vuelta,
variable por variable.

s17b — concatenar números como texto:
x + "" + y con enteros no suma, concatena como texto pegado.

s18 — bucle infinito por falta de incremento:
Sin x = x + 1 dentro del while, la condición nunca se vuelve falsa.

s19 — fin del Capítulo 1, arranca el Capítulo 2:
Termina Breaking the Surface y empieza Objectville: clases y objetos.

s20a — Chair Wars, procedural vs objetos:
Laura pensó en procedimientos, Brad pensó en objetos: rotate y playSound por forma.

s20b — cada objeto sabe hacer lo suyo:
Cada clase sabe hacer sus propias cosas: eso es orientado a objetos.

s21a — el desenlace de Chair Wars:
Brad solo tocó la clase Amoeba; Laura tuvo que re-testear todo de nuevo.

s21b — qué es un atributo:
Un atributo es un dato propio de cada objeto, adelanto de instance variable.

s22a — herencia, superclase y subclases:
Shape es superclase, Square y Circle son subclases que heredan de ella.

s22b — qué es hacer override:
Override significa que la subclase redefine un método heredado.

s23a — diseñar una clase, checklist básico:
Al diseñar una clase pensá qué sabe el objeto y qué sabe hacer.

s23b — interfaz vs implementación:
El objeto sabe cómo hacerlo, el resto del programa solo dice qué hacer.

s24a — instance variable vs método:
Instance variable es lo que el objeto sabe, método es lo que sabe hacer.

s24b — instancia es sinónimo de objeto:
Pensá en instancia como otra forma de decir objeto en POO.

s25a — new y el operador punto:
Con new creo un objeto y con el punto accedo a sus datos y métodos.

s25b — escribir un dato vs. ejecutar un método:
d.size = 40 escribe el dato; d.bark() ejecuta el método.

s26a — varios objetos de la misma clase:
Cada objeto Movie guarda sus propios valores de title, genre y rating.

s26b — Objectville, objetos que hablan entre sí:
En una app real los objetos se llaman métodos entre sí, no todo lo hace main.

s27a — heap y garbage collection:
Los objetos viven en el heap y Java los borra solo cuando ya no se usan.

s27b — while(true) y break:
Un while(true) repite para siempre hasta que un break lo corta.

s28a — clase como receta, objeto como galletita:
Una clase es como una receta y cada objeto es una galletita distinta hecha con ella.

s28b — static es la excepción, no la regla:
Lo estático es la excepción en POO, casi todo sigue viviendo dentro de un objeto.

s29a — Code Magnets, otra vuelta:
Armar código con imanes sueltos entrena reconocer qué va en cada clase.

s29b — Pool Puzzle, fragmentos reutilizables:
En un Pool Puzzle un mismo fragmento de la pileta se puede usar varias veces.

s30a — el compilador chequea los methods:
objeto.metodo() solo compila si la clase declara ese método.

s30b — varias clases por archivo:
Un archivo .java puede tener varias clases, solo la pública se llama como el archivo.

s31 — primitivos vs referencias:
Un primitivo guarda el valor directo, una referencia guarda la dirección de un objeto.

s32a — las 8 primitivas:
Java tiene ocho primitivas: byte, short, int, long, float, double, boolean y char.

s32b — copia por valor:
z copia el valor de x en ese momento; después x puede cambiar sin afectarlo.

s33a — el compilador mira el tipo:
El compilador mira el tipo, no el valor: byte b = x; no compila.

s33b — declarar y asignar son dos actos:
boolean isLearning; declara el vaso vacío, isLearning = true; le pone el valor.

s34a — reglas para nombrar:
Un nombre empieza con letra, guion bajo o signo peso, nunca con un número.

s34b — palabras reservadas:
No podés llamar a tu variable public, static, void, int ni boolean: son reservadas.

s35a — la referencia como control remoto:
Una variable de referencia es como un control remoto: no es el objeto, lo maneja.

s35b — el objeto nunca va a la variable:
El objeto nunca entra en la variable; solo entra la manera de llegar a él.

s55a — comparar bits con ==:
El operador == compara bits: sirve para primitivos y para ver si dos referencias son iguales.

s55b — equals() versus ==:
Dos objetos distintos pueden ser iguales en contenido; para eso existe el método equals().

s36a — los 3 pasos de new:
Declarar, crear y vincular: los 3 pasos que arma new Dog() en una sola línea.

s36b — Java no es C:
En Java no existe la aritmética de referencias: myDog++ nunca compila.

s37a — null, el control remoto sin tele:
Una variable de referencia en null no apunta a ningún objeto: existe
pero no controla nada.

s37b — copiar una referencia no copia el objeto:
Book d = c; copia los bits de c en d: dos referencias, un solo objeto.

s38a — reasignar suelta el objeto viejo:
c = b; hace que c suelte su objeto viejo y controle el objeto de b.

s38b — objeto alcanzable:
Un objeto es alcanzable si al menos una referencia activa todavía lo apunta.

s39a — objeto abandonado:
Si b = c; deja al objeto 1 sin referencias, ese objeto queda abandonado y es basura.

s39b — el arreglo es un objeto:
int[] nums; declara la referencia; nums = new int[7]; crea el objeto en el heap.

s40a — índices de un arreglo:
Un arreglo de 7 elementos usa los índices 0 a 6; el último es siempre longitud menos uno.

s40b — arreglo de objetos:
pets = new Dog[7]; crea la bandeja; pets[0] = new Dog(); crea el primer perro.

s41a — notación de arreglo:
myDogs[0].bark(); llama al método sobre el objeto guardado en la posición cero.

s41b — Java chequea el tipo:
El compilador rechaza un Cat en un arreglo Dog[]; un byte sí entra en int[].

s42a — length de un arreglo:
while (x < myDogs.length) recorre bien; con <= te pasás del último índice.

s42b — referencias y null:
Una variable de referencia sin objeto vale null y se imprime como el texto null.

s43a — Code Magnets:
Un programa desordenado en imanes; lo armás vos para que compile y corra bien.

s43b — arreglo como mapa:
El arreglo index guarda posiciones, no datos; apunta a otro arreglo.

s44a — Pool Puzzle Triangle:
Ahora aparece el pool de fragmentos para completar los huecos.

s44b — A Heap o' Trouble:
Unir cada hq[x] con el objeto HeapQuiz correcto.

s45a — referencias robadas:
Reasignar la misma referencia en cada vuelta deja sin dueño al objeto anterior.

s45b — arreglo de referencias:
Un arreglo guarda diez referencias; una sola variable guarda apenas la última.

s46a — más de una solución válida:
Hay más de una forma correcta de arreglar un bucle: el libro elige una.

s46b — referencias perdidas:
Kate creó diez objetos Contact pero solo el último quedó accesible.

s47a — el estado afecta al comportamiento:
Todos los objetos de una clase tienen los mismos métodos, pero el estado cambia su comportamiento.

s47b — los métodos usan instance variables:
void play() { soundPlayer.playSound(title, artist); } usa las instance variables del objeto.

s48a — argumentos y parámetros:
Quien llama pasa argumentos; un método toma parámetros, que son variables locales.

s48b — tipo de retorno:
void bark(int numOfBarks) { } declara un parámetro y un tipo de retorno vacío.

s49a — un método que devuelve un valor:
Si declarás int giveSecret() tenés que devolver un int: return 42; y los tipos coinciden.

s49b — pass-by-value:
Java pasa una copia del valor: takeTwo(foo, bar) no modifica foo ni bar afuera del método.

s50a — pasar objetos también es por valor:
Pasar un objeto también es pass-by-value: se copia la referencia, no el objeto.

s50b — promoción de retorno:
Un método puede devolver un byte donde declaró int, pero no un double.

s51a — getters y setters:
El getter de numOfPickups se llama getNumOfPickups() y el setter setNumOfPickups(int).

s51b — encapsulamiento:
La encapsulación evita que código externo asigne theCat.height = 0; directamente.

s52a — el setter como portero:
El setter valida antes de asignar: if (ht > 9) { height = ht; }

s52b — la regla de oro de la encapsulación:
Marcá las instance variables private y los getters y setters public.

s53a — private frena hacia afuera:
El private frena a los de afuera: bark() lee size directo sin llamar a getSize().

s53b — la llamada vale por su retorno:
Donde entra un int entra una llamada: int x = 3 + pets[0].getSize();

s54a — el valor por defecto:
Una instance variable sin valor no queda vacía, Java le pone un default.

s54b — la variable local no perdona:
La variable local debe inicializarse antes de usarse o el compilador la frena.

s56a — ensanchamiento implícito en argumentos:
Un short entra donde se pide un int, pero un long necesita un cast.

s56b — void no puede devolver valor:
Un método void no puede tener un return con valor, revienta al compilar.

s57a — Mixed Messages, dos huecos que interactúan:
La condición del while define las vueltas y la del if cuándo suma extra.

s57b — Pool Puzzle sin repetir fragmentos:
En este Pool Puzzle no podés repetir fragmentos, a diferencia de Triangle.

s58 — Five-Minute Mystery, la pista vive en la historia:
Un misterio de cinco minutos esconde el error de diseño en el propio relato.

s59a — diseñar antes de programar:
Diseñá el flujo del juego con un diagrama de flujo antes de escribir código.

s59b — un método, tres resultados posibles:
El método devuelve hit, miss o kill según el resultado del intento.

s60a — empezar por la clase sin dependencias:
Programá primero la clase que no depende de ninguna otra clase.

s60b — la fila virtual no existe en el código:
Guardá solo las celdas que importan, nunca la fila entera.

s61a — prep code es lógica, no sintaxis:
El prep code es pseudocódigo enfocado en la lógica, no en la sintaxis.

s61b — escribí el test code antes del real code:
Escribí siempre el código de prueba antes de escribir el código real.

s62a — TDD, escribir el test antes del método:
En TDD escribís el código de prueba antes de que exista el método real.

s62b — stub code, un placeholder que compila y falla:
Un stub es código truncado que compila pero siempre falla el test.

s63a — el bucle for-each recorre sin índice:
El for each recorre el arreglo entero sin necesitar un índice manual.

s63b — incrementar y cortar el bucle:
El operador ++ suma uno y break corta el bucle de inmediato.

s64 — prep code antes de la clase completa:
Antes de escribir el juego real, primero planifico su lógica en prep code.

s65a — bandera booleana en vez de break:
El booleano isAlive arranca en true y se apaga con set false al matar la startup.

s65b — Metacognitive Tip del libro:
Cambiar de tema cada rato descansa un lado del cerebro mientras trabaja el otro.

s66a — Math.random() y el cast a int:
Math.random() devuelve un double, hay que castear a int para quedarse con un entero.

s66b — GameHelper como clase auxiliar:
La clase GameHelper agrupa el código auxiliar para leer los datos que ingresa el usuario.

s67a — Scanner para leer teclado:
Scanner envuelve System.in para leer con nextInt() lo que el usuario tipea.

s67b — el bug queda como desafío:
El libro deja un bug sin resolver a propósito: hay que descubrirlo antes del próximo capítulo.

s68a — las 3 partes del for clásico:
El for tiene inicialización, prueba booleana y expresión de iteración separadas por punto y coma.

s68b — cuándo corre la iteration expression:
for (int i = 0; i < 8; i++) { println(i); } imprime 8 valores, del 0 al 7.

s69a — pre vs. post-incremento:
El post-incremento x++ usa el valor actual y recién después lo incrementa.

s69b — casting reductor (narrowing):
Castear de long a short puede perder bits: por eso Java exige el cast explícito.

s70a — overflow al castear a short:
Castear un long grande a short puede dar un número negativo inesperado.

s70b — Be the JVM:
En Be the JVM el lector predice qué imprime un programa antes de ejecutarlo.

s71a — Code Magnets:
Reordenar imanes con dos for(i) y for(j) anidados hasta acertar la salida.

s71b — crucigrama JavaCross:
Un crucigrama de Java repasa vocabulario técnico con pistas en inglés.

s72a — Mixed Messages con break:
Un bloque candidato puede cambiar en qué vuelta corta el break del bucle.

s73a — arranca la Java API:
La Java API trae miles de clases prediseñadas para no reinventar la rueda.

s73b — recap del bug de SimpleStartupGame:
Un segundo arreglo guarda qué celdas ya fueron acertadas antes de sumar hits.

s74a — el arreglo no se achica:
El tamaño de un arreglo no se puede cambiar: hay que crear otro y copiar los valores.

s74b — aparece ArrayList:
Un ArrayList crece y se achica solo con add(), remove(), contains() y size().

s75a — length contra size():
Un arreglo usa length sin paréntesis; un ArrayList usa size() con paréntesis.

s75b — leer no saca nada:
Leer dogArray[1] solo copia la referencia: el objeto sigue adentro del arreglo.

s76a — el arreglo es un objeto raro:
Un arreglo es un objeto, pero no acepta métodos: solo la variable length.

s76b — parámetro de tipo:
ArrayList<String> significa una lista de Strings; los ángulos <> son un parámetro de tipo.

s77a — el estado vive en la lista:
remove(index) achica la lista de verdad: el contador numOfHits ya no hace falta.

s77b — indexOf devuelve -1:
indexOf devuelve -1 cuando no encuentra nada; por eso el if pregunta index >= 0.

s78a — main solo enciende:
El main de StartupBust solo instancia el objeto que después juega todo el juego.

s78b — delegar:
El objeto del juego delega: pide la ubicación al helper y el chequeo a cada Startup.

s79a — private esconde la cocina:
Los métodos internos del juego van private; solo main queda public.

s79b — comparar Strings:
Para comparar Strings usá result.equals("hit"); el operador == compara referencias.

s80a — cortocircuito:
Si la izquierda del && es false, la JVM corta y ni mira la derecha.

s80b — el guard del null:
Escribí if (refVar != null && refVar.isValidType()) y nunca al revés.

s81a — constantes:
private static final int GRID_SIZE = 49; declara una constante que ningún objeto puede cambiar.

s81b — el import:
Escribí import java.util.ArrayList; arriba de todo y después usá el nombre corto.

s81c — recorrer una lista:
En un ArrayList escribí lista.size() y lista.get(i); los corchetes son solo para arreglos.

s81d — el valor por defecto:
Las casillas vacías de un arreglo de objetos valen null, y nunca cero.

s82a — size() contra length:
El ArrayList responde size() con paréntesis y el arreglo expone length sin paréntesis.

s82b — qué hace un import:
Un import solo te ahorra tipear el nombre completo; no copia código ni agranda tu programa.
