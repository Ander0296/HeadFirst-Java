# CHECKLIST — Crear una clase en Java

Usalo **mientras escribís**, no después. Recorrelo de arriba a abajo
antes de compilar.

## La idea de fondo: cajas dentro de cajas

Java es un juego de muñecas rusas. Cada cosa vive en un nivel, y solo
en ese nivel. Si tenés este dibujo en la cabeza, la mayoría de los
errores desaparecen:

```
ARCHIVO .java
 └── CLASE
      ├── variables de instancia   (lo que la clase TIENE)
      └── MÉTODOS                  (lo que la clase SABE HACER)
           └── instrucciones       (while, if, asignaciones, prints)
```

**Ninguna cosa puede saltearse un nivel.** Una instrucción no puede
vivir directamente dentro de una clase: le falta el método del medio.

---

## Nivel 1 — El archivo

- [ ] La clase pública se llama **exactamente** igual que el archivo.
      `Termometro.java` → `class Termometro`. Java distingue mayúsculas
      de minúsculas: `termometro` no sirve.
- [ ] El archivo termina en `.java` (no `.txt`, no sin extensión).
- [ ] Los `import` (si hay) van **arriba de todo**, antes del `class`.

## Nivel 2 — La clase

- [ ] Está declarada: `public class Nombre {`
- [ ] Abre llave `{` y **cierra** llave `}` al final del archivo.
- [ ] Adentro de la clase, a nivel suelto, **solo hay dos cosas**:
      variables y métodos. Nada más.

Pregunta de control para cada línea suelta que veas dentro de la clase:

> **¿Esto es algo que la clase TIENE, o algo que SABE HACER?**
> Si no es ninguna de las dos, está en el lugar equivocado.

Un `while` no es lo que el objeto tiene ni lo que sabe hacer: es *parte
de cómo* lo hace. Va adentro de un método.

## Nivel 3 — Las variables de instancia

- [ ] Cada una tiene **tipo y nombre**: `int watts;`, `double
      temperatura;`, `String nombre;`
- [ ] Termina en punto y coma `;`
- [ ] El tipo aguanta lo que le vas a meter. Si va a tener decimales,
      `int` no sirve (trunca).
- [ ] Empiezan en minúscula, por convención: `temperaturaActual`, no
      `TemperaturaActual`. Las clases sí van en mayúscula.

## Nivel 4 — Los métodos

- [ ] Cada método tiene esta forma:
      `tipoQueDevuelve nombre(parámetros) {`

```java
void encender() { }            // no devuelve nada
double getTemperatura() { }    // devuelve un double
void setWatts(int w) { }       // recibe un int, no devuelve nada
```

- [ ] Si el tipo de retorno **no** es `void`, hay un `return` adentro
      que devuelve **ese** tipo exacto.
- [ ] Si el tipo es `void`, no devuelve nada.
- [ ] Los parámetros van con **tipo y nombre**: `(int w)`, nunca `(w)`.
- [ ] Abre `{` y cierra `}`.
- [ ] **Los métodos NO se anidan**: un método nunca va dentro de otro.
      Si cerraste mal una llave, te puede pasar sin darte cuenta.

## Nivel 5 — Las instrucciones

- [ ] **Toda instrucción ejecutable está dentro de un método.** Sin
      excepciones: `while`, `if`, `for`, `System.out.println`,
      asignaciones como `x = x - 1`.
- [ ] Cada instrucción termina en `;`
- [ ] Pero `while (x > 1) { }` y `if (...) { }` **no** llevan `;`
      después del cierre de llave.
- [ ] Las variables locales están **declaradas antes** de usarse, y con
      un valor asignado antes de leerse. Java no asume un valor por
      defecto en las variables locales: da error de compilación
      ("variable might not have been initialized" / "puede que la
      variable no haya sido inicializada").

## Nivel 6 — Antes de compilar

- [ ] Contá las llaves: **cada `{` tiene su `}`**. Es el error número
      uno. El compilador suele reportarlo veinte líneas más abajo de
      donde está el problema real, así que no te fíes de la línea que
      te marca.
- [ ] Compilá: `javac Archivo.java`. Sin mensajes = compiló bien.
- [ ] Ejecutá: `java NombreDeLaClase` (sin el `.java`).

---

## La trampa del `main` (la que más confunde)

| ¿Necesito un método `main`? | Respuesta |
| --- | --- |
| Para que la clase **compile** | **NO.** Nunca. |
| Para **arrancar** un programa desde esa clase | **SÍ.** La JVM entra por ahí. |

Tres cosas que conviene tener clarísimas:

1. `main` es un **método**, no una clase. "Una clase main" no existe.
   Su forma completa es `public static void main(String[] args)`.
2. Una clase **sin** `main` compila perfectamente. La mayoría de las
   clases de cualquier programa real no lo tienen.
3. `main` es la **puerta de entrada** que busca la JVM para arrancar.
   Una casa sin puerta de calle sigue siendo una casa bien construida:
   simplemente no podés entrar desde afuera.

Si al ejecutar te aparece un mensaje sobre un "main method not found"
(no se encontró el método main), eso es un error de **ejecución**, no
de compilación. La clase estaba bien: lo que faltaba era la puerta.

---

## Compilar vs. ejecutar — no mezclarlos nunca

Es la distinción que más errores causa al principio. Son dos momentos
distintos, con dos jueces distintos:

| | COMPILAR (`javac`) | EJECUTAR (`java`) |
| --- | --- | --- |
| Quién juzga | El compilador | La JVM |
| Qué revisa | Gramática y anidamiento | Lo que pasa de verdad |
| Ejemplos de error | falta un `;`, un `while` suelto, tipos que no coinciden | NullPointerException, división por cero, `main` no encontrado |
| Bucle infinito | **NO es error acá** | Se cuelga, pero tampoco "falla" |

El compilador **no ejecuta** tu programa. No sabe ni le importa si tu
`while` termina algún día. Solo revisa que esté bien escrito.
