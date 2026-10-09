# CHECKLIST — Antes de entregar un ejercicio

Este checklist no habla de Java. Habla de **cómo se responde un
enunciado**, que es una habilidad aparte — y la que más puntos regala
cuando falta.

Recorrelo cuando creas que terminaste, ANTES de copiar el prompt de
entrega.

---

## La idea de fondo: un enunciado son varias preguntas disfrazadas de una

Los enunciados casi nunca piden una sola cosa. Piden dos o tres
pegadas con comas y con "y", y la vista se detiene en la primera.

> "¿Compila cada archivo? Si no, **¿por qué exactamente** y **cómo lo
> arreglarías**? Si sí compila, **¿cuál sería su salida**?"

Eso no es una pregunta. Son tres, y hay que responder las que
correspondan según por dónde salga la primera.

Diagnosticar es la mitad fácil. Arreglar es la mitad que demuestra que
entendiste, porque para arreglar hay que escribir la solución, y ahí
no se puede esconder nada.

---

## Nivel 1 — Releer el enunciado

- [ ] Leelo de nuevo **después** de escribir tu respuesta, no solo
      antes. Antes lo leés con expectativa; después lo leés con lo que
      escribiste al lado.
- [ ] **Contá los signos de pregunta** del enunciado. Ese número es
      cuántas respuestas tenés que tener.
- [ ] Subrayá los verbos que te piden acción: *decir*, *explicar*,
      *arreglar*, *completar*, *mostrar la salida*, *reconstruir*.
      Cada verbo es una entrega distinta.
- [ ] Buscá los condicionales: "**si** no compila...", "**si** sí
      compila...". Uno de los dos caminos te toca. Fijate cuál y
      respondelo entero.

## Nivel 2 — Revisar tu respuesta contra el enunciado

- [ ] Punto por punto: por cada pregunta que contaste arriba, señalá
      con el dedo **dónde** está su respuesta en tu texto. Si no la
      encontrás en dos segundos, no está.
- [ ] Si el enunciado tiene varias partes rotuladas (A, B, C...),
      comprobá que **todas** tengan respuesta. Una parte en blanco no
      es "obvia": es una parte en blanco.
- [ ] Si la misma respuesta va en **dos formatos** (una tabla Y un
      diagrama, un código Y su salida), cruzalos: cada cosa que está en
      uno tiene que estar en el otro, y decir lo mismo. Un diagrama de
      herencia muestra **quién cuelga de quién** (la superclase arriba,
      las subclases debajo, unidas con líneas): una lista de nombres
      encolumnados no es un diagrama.
- [ ] **En un diagrama de clases, los paréntesis mandan.** Un renglón
      con `()` es un MÉTODO (`giveAdvice()`); un renglón sin `()` es una
      VARIABLE de instancia (`makesHouseCalls`). Antes de contar cuántas
      variables y cuántos métodos tiene una clase, recorré la caja
      renglón por renglón marcando cuáles llevan paréntesis y cuáles no.
      Un renglón leído en la columna equivocada te arruina DOS
      respuestas de una: sobra de un lado y falta del otro.
- [ ] **Respetá esa marca también al escribir tu respuesta.** Si te
      encontrás escribiendo una variable con paréntesis
      (`worksAtHospital()`), esa es la señal temprana de que la estás
      contando mal. El nombre que escribís tiene que verse igual que en
      el diagrama.
- [ ] Si pidieron un arreglo, **escribí el arreglo**, no lo describas.
      "Habría que crear el método" no es un arreglo. El arreglo es el
      código, con su tipo de retorno, sus llaves y su `;`.
- [ ] Si pidieron una salida, escribila **literal**, tal como saldría
      en la pantalla, línea por línea. No "imprime los datos".
- [ ] Antes de escribir una salida, **señalá con el dedo qué métodos se
      ejecutan de verdad** y en qué orden. Si sacaste o agregaste una
      línea como arreglo, releé el `main` YA arreglado: las líneas que
      quedan son las únicas que imprimen.
- [ ] **No confundas la variable con la cuenta que la usa.** En
      `print(ivar + 6)` con `ivar = 7`, la variable SIGUE valiendo 7: lo
      que se imprime es el resultado, 13. Una cuenta adentro de un
      `print` no le asigna nada a nadie; solo `=` cambia una variable.
- [ ] **Leé el método ENTERO, no su primera línea.** Un método puede
      imprimir algo Y ADEMÁS llamar a otro método abajo. Cada llamada
      que veas adentro te obliga a entrar ahí y seguir leyendo: la
      salida son todos los `println` que se disparan en cadena, no el
      primero que encontraste.
- [ ] **Escribí la salida en el ORDEN en que se ejecutan las líneas**, de
      arriba hacia abajo. Si un método imprime algo y DESPUÉS llama a
      otro, lo suyo sale PRIMERO y lo del otro sale segundo. Java no
      ejecuta primero lo más profundo ni lo más interesante: va renglón
      por renglón en el orden en que están escritos. Numerá 1, 2, 3 las
      líneas que se disparan y copiá la salida en ESE orden. Tener las
      líneas correctas pero al revés es una salida equivocada.
- [ ] Si el método que se está ejecutando fue **heredado** de una clase
      de más arriba, y adentro llama a otro método, fijate si la clase
      del objeto tiene su **propia versión** de ese método. Si la tiene,
      corre ESA, no la de arriba. El método heredado no arrastra consigo
      las versiones de su clase de origen: siempre gana la versión más
      baja del árbol, la de la clase con la que se hizo el objeto.
- [ ] **Antes de decir qué versión corre, volvé a la línea donde se creó
      ESA variable y leé su `new`.** En `Payment p1 = new CardPayment();`
      el objeto de `p1` es un `CardPayment`: corre la versión de
      `CardPayment`. Con varias variables del mismo tipo (`p1`, `p2`), la
      vista agarra el objeto de la de al lado — el tipo de la izquierda es
      igual en todas, el `new` de la derecha es lo que las distingue.
- [ ] **Si el ejercicio inserta piezas en huecos ("A va en la clase X, B
      en la clase Y"), escribí al lado de cada pieza el nombre de SU
      clase antes de razonar.** Ya se ubicó en la superclase un tipo de
      retorno que estaba en la subclase: el veredicto salió bien, pero la
      explicación señalaba la clase equivocada.
- [ ] "Su propia versión" = mismo nombre **Y** mismos tipos de argumentos.
      Compará los paréntesis de la llamada con los del método: si la
      subclase tiene `hablar(String s)` y la llamada es `hablar()`, ese
      método NO es una versión propia (es sobrecarga) y corre el de
      arriba. No existe "lee primero el de la subclase": gana el que
      coincide con los argumentos.
- [ ] Copiá el texto de la salida **desde adentro del método**, leyendo
      su `println`. Nunca desde el nombre del método ni de memoria: dos
      métodos con nombres parecidos (`skipIntro` y `skipToNext`)
      imprimen cosas distintas, y la vista agarra el de al lado.

## Nivel 3 — Precisión de lo que decís

- [ ] Nombrá **la cosa exacta** que falla, no la zona donde falla.
      "Falta algo en el TestDrive" no sirve; "la variable `song` nunca
      se declaró" sí.
- [ ] Si tu explicación usa una palabra técnica, comprobá que sea la
      correcta. Estas tres se mezclan todo el tiempo:

| Palabra | Qué es | Ejemplo |
| --- | --- | --- |
| **clase** | El molde, el plano. Se escribe una vez. | `class Perro { }` |
| **objeto** | La cosa construida con ese molde. Vive en memoria. | lo que crea `new Perro()` |
| **referencia** (la variable) | El control remoto que apunta **a un objeto**, nunca a una clase. | `Perro p` |
| **método** | Una acción que vive DENTRO de una clase. Se nombra con paréntesis y diciendo de qué clase es; el nombre de la clase NO es un método. | "`ladrar()` de `Perro`", no "el método Perro" |

La frase "la referencia apunta a la clase" está mal. Apunta al
**objeto**. La clase solo dice de qué tipo puede ser ese objeto.

- [ ] Si dos cosas fallan por causas distintas, decí las dos. Si
      fallan por la misma, no la repitas dos veces con otras palabras.

- [ ] **Antes de decir qué versión de un método corre, comprobá que ese
      método EXISTA en la clase con la que declaraste la variable.** El
      compilador solo mira ese tipo (en `Animal a = new Perro()`, mira
      `Animal`): si `comer()` no está declarado ahí, el programa NO
      COMPILA (`cannot find symbol: method comer()` — no se encuentra el
      símbolo) y no se ejecuta ni una línea. "Corre la versión del padre"
      solo es posible cuando el padre TIENE ese método. Sin método
      arriba no hay versión que ganar: hay error de compilación.
- [ ] **Si decís QUIÉN decide qué versión corre, que sea la JVM — y el verbo
      es ELIGE, no "ejecuta".** Los dos trabajan, pero en momentos distintos y
      sobre cosas distintas:

| Quién | Cuándo | Qué mira | Qué decide |
| --- | --- | --- | --- |
| **compilador** | al compilar | el tipo de la **referencia** | si el método EXISTE (si no, no compila) |
| **JVM** | al ejecutar | el **objeto real** | QUÉ VERSIÓN de ese método corre |

      El compilador no puede elegir la versión aunque quiera: cuando él
      trabaja, el objeto **todavía no existe**. `new Motorcycle()` es texto en
      un archivo hasta que el programa corre. Si la referencia se asigna
      dentro de un `if` (`new Motorcycle()` o `new Truck()` según lo que
      escriba el usuario en la terminal), la versión que corre se sabe recién
      al ejecutar. Por eso decide la JVM, mirando el objeto.

- [ ] **`getClass()` le pregunta al OBJETO, nunca a la referencia.** Contá
      los `new` del programa: esos son TODOS los objetos que existen. En
      `Animal a = new Dog(); Object o = a;` hay UN objeto, así que
      `a.getClass()` y `o.getClass()` imprimen lo mismo: `class Dog` (con
      la palabra `class` adelante). Ya se contestó "Object" por mirar la
      variable.
- [ ] **Un método no se "extiende": se SOBRESCRIBE.** `extends` es para
      clases. Si la subclase escribe su propia versión y adentro llama a
      `super.run()`, decí "sobrescribe `run()` y con `super` llama a la
      versión del padre". Ya se dijo "lo estamos extendiendo" dos veces.

- [ ] **Antes de decir si una asignación `Tipo x = valor;` compila,
      escribí la frase "<tipo de lo de la DERECHA> ES UN <tipo de la
      IZQUIERDA>".** Si es verdad, compila; si es falsa, no. Siempre en ese
      orden: primero lo que llega, después la caja. `Object o = c;` (c es
      Cat) → "Cat ES UN Object" → compila. `Cat c2 = o;` (o es Object) →
      "Object ES UN Cat" → falso → no compila, aunque adentro haya un Cat.
      Ya se invirtió la frase dos veces, una para cada lado.
- [ ] **Si lo de la derecha es una LLAMADA a un método, su tipo es el
      tipo de RETORNO de la declaración** (`static Object sacar()` →
      Object), NO el `new` que hay adentro del método. El compilador lee
      la firma, no el cuerpo. `Guitar g = sacar();` → "Object ES UN
      Guitar" → no compila; se arregla con cast: `(Guitar) sacar()`.
- [ ] **Un cast hacia ABAJO (`(Guitar) i2` con `i2` de tipo Instrument)
      se decide en DOS momentos.** Compilador: ¿los dos tipos son de la
      misma familia de herencia? Si sí, compila (con un tipo sin relación,
      como `(String) i2`, no compila). JVM: abre la caja y mira el OBJETO;
      si no es un Guitar, revienta con `ClassCastException`. La línea del
      cast se quedó en blanco una vez.

- [ ] **"No se ejecuta" casi nunca es cierto.** Si el programa compila,
      la JVM lo ARRANCA igual: empieza por la primera línea del `main` y
      va bajando hasta que se topa con el problema. Lo correcto es
      "arranca y revienta en tal línea". Decir "no se ejecuta" suena a
      que la computadora se negó a correrlo, y eso solo pasa cuando NO
      compila.
- [ ] Cuando revienta, contá **cuántas líneas alcanzó a imprimir antes**
      y escribilas. Salida parcial + mensaje de error es la firma de un
      error de ejecución (runtime), y esa salida parcial te dice en qué
      vuelta del bucle murió.
- [ ] **Nombrá la excepción con su nombre propio**, tal como la vas a
      ver escrita en la terminal: `NullPointerException` (llamaste algo
      sobre una casilla vacía), `ArrayIndexOutOfBoundsException` (pediste
      un índice que no existe). "Error de desbordamiento" o "se pasa de
      rango" describe la idea, pero el nombre es lo que se busca en
      Google y lo que se dice en una entrevista.
- [ ] Si el ejercicio tiene DOS programas, aplicá la misma regla en los
      dos. Nombrar la excepción en uno y no en el otro no es un olvido
      chico: es la mitad de la respuesta.
- [ ] **Arreglo no es lista.** Un arreglo (`Books[] x = new Books[3]`)
      tiene tamaño fijo, se lee con `x[i]` y se mide con `x.length`. Una
      lista (`ArrayList`) crece sola, se lee con `get(i)` y se mide con
      `size()`. Son dos tipos distintos: usar la palabra equivocada hace
      pensar que estás mirando otro código.
- [ ] **`while` y `for` son BUCLES, no condicionales.** El condicional
      (`if`) decide UNA vez si algo corre; el bucle lo REPITE mientras
      la condición siga siendo verdadera.
- [ ] **Antes de decir si un `if` entra, escribí la condición con el
      valor real y decí VERDADERO o FALSO.** `x < 15` con x = 22 es
      `22 < 15` → falso → no entra. Ya se dio por hecho que entraba sin
      hacer la cuenta.
- [ ] **Si hay un `+` con un String al lado, escribí la palabra
      CONCATENACIÓN.** El `+` entre un String y otra cosa PEGA texto, no
      suma: `"Dog: " + name` da `Dog: Fido`. Dar bien el resultado sin
      nombrar el mecanismo ya falló cuatro veces seguidas.
- [ ] **Si convertís un String a número, escribí `Integer.parseInt(...)`
      con `Integer.` adelante, y la línea COMPLETA con su variable.**
      `parseInt` es un método de la clase `Integer`: suelto da `cannot
      find symbol`. Correcto: `int total = Integer.parseInt(cantidad) + 2;`
- [ ] **A `parseInt` no lo llames "casteo", y guardá su resultado en un
      `int`.** El cast `(Dog) o` no cambia el objeto. `parseInt` LEE el
      texto y FABRICA un número nuevo. Devuelve `int`, no `Integer`.
- [ ] **Si un método es heredado, "lo escribió" la clase donde está su
      código, no la que lo usa.** Antes de nombrarla, abrí la clase del
      objeto: si el método NO está escrito ahí, lo escribió una clase de
      más arriba (al final, `Object`). "Dog escribió equals y lo heredó"
      se contradice: o lo escribió, o lo heredó.
- [ ] **`==` entre referencias NUNCA mira el contenido: solo pregunta si
      las dos apuntan al MISMO objeto.** Si da true con dos String
      iguales, es porque son el mismo objeto (el String pool reusa los
      literales), no porque compare el texto. El texto lo compara `equals`.
- [ ] **Si `equals` es el HEREDADO de `Object`, hace lo mismo que `==`.**
      `Object` no sabe qué campos tiene tu clase, así que no puede
      comparar contenido: solo pregunta si es el mismo objeto. Dos
      objetos con el mismo dato y `equals` heredado → `false`. Solo
      compara contenido si la clase lo SOBRESCRIBIÓ (como `String`).
- [ ] **Si el enunciado da el nombre de una variable, copialo letra por
      letra** (`title`, no `tittle`; `name`, no `nombre`). Compila igual,
      pero no es lo que se pidió.

## Nivel 4 — Antes de mandar

- [ ] **Guardá el archivo.** Escribir en el editor no es guardar. Una
      respuesta sin guardar llega en blanco y se corrige en blanco.
- [ ] **Bajá por tu respuesta buscando rótulos vacíos.** Si hay un
      renglón tipo "Respuesta final:" o "Pares que cumplen:" sin nada al
      lado, falta tu conclusión. Ya llegó en blanco dos veces: razonar
      cada parte no reemplaza escribir la respuesta final.
- [ ] Comprobá que estás entregando **la ruta correcta** (el archivo
      del repaso, no el original; la carpeta del ejercicio, no otra).
- [ ] **Buscá los corchetes `[ ]` en el prompt de entrega y llenalos
      todos.** Los `[pegá acá...]` son huecos, no decoración: marcan
      exactamente lo que hay que copiar de la terminal o escribir a
      mano. Un prompt entregado con los corchetes intactos llega vacío
      y no se puede corregir — el código compilando no es la entrega,
      es solo una parte.
- [ ] **Poné tu predicción al lado de la salida real, línea por línea.**
      Si alguna no coincide, escribí cuál y POR QUÉ. Ese desajuste es lo
      más valioso del ejercicio: pegar la salida sin compararla lo tira.

---

## La trampa: "ya sé cuál es el error, listo"

Saber cuál es el error se siente como haber terminado. No lo es.

Diagnosticar usa **reconocimiento**: mirás el código y algo no encaja.
Arreglar usa **producción**: tenés que escribirlo bien de memoria.

Son dos músculos distintos, y en una entrevista técnica te van a pedir
el segundo. Nadie contrata a alguien que sepa señalar el bug pero no
sepa taparlo.

Regla dura: **si el enunciado pide un arreglo y tu respuesta no tiene
código escrito, no terminaste.**
