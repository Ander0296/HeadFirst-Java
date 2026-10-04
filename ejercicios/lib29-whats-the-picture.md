# LIBRO — Exercise: "What's the Picture?" (¿Cuál es el dibujo?) — pág. 615-617

Si te trabás: revisá las Sesiones #111, #112 y #113 de la guía.

## ENUNCIADO

"Here's your chance to demonstrate your artistic abilities." (Esta es tu
oportunidad de demostrar tus habilidades artísticas.)

A la izquierda hay grupos de declaraciones de clases e interfaces. Tu
trabajo: DIBUJAR el diagrama de clases de cada grupo. El libro resolvió
el 1 como ejemplo.

### La clave (key) del dibujo

- Flecha con línea SÓLIDA (`|`) apuntando hacia arriba = **extends** (extiende).
- Flecha con línea PUNTEADA (`:`) apuntando hacia arriba = **implements** (implementa).
- Caja con nombre normal = **class** (clase común).
- Caja con nombre en *cursiva* = **interface**. Acá, como no hay cursiva, escribí `(interface)` arriba del nombre.
- Caja GRIS = **abstract class** (clase abstracta). Acá escribí `(abstract)` arriba del nombre.
- La flecha sale de la clase "hija" y apunta a la clase o interface de la que extiende / que implementa.

### Ejemplo resuelto (el 1 del libro)

    public interface Foo { }
    public class Bar implements Foo { }

    +-------------+
    | (interface) |
    |     Foo     |
    +-------------+
           ^
           :          <- punteada = implements
    +-------------+
    |     Bar     |
    +-------------+

### Los que te tocan

2.
    public interface Vinn { }
    public abstract class Vout implements Vinn { }

3.
    public abstract class Muffie implements Whuffie { }
    public class Fluffie extends Muffie { }
    public interface Whuffie { }

4.
    public class Zoop { }
    public class Boop extends Zoop { }
    public class Goop extends Boop { }

5.
    public class Gamma extends Delta implements Epsilon { }
    public interface Epsilon { }
    public interface Beta { }
    public class Alpha extends Gamma implements Beta { }
    public class Delta { }

(Los nombres son inventados, sin significado: no hay nada que traducir.
OJO en el 3 y el 5: el ORDEN en que vienen escritas las líneas no es el
orden del árbol. Primero ubicá quién está arriba de quién.)

Dibujá cada diagrama con cajas de texto como el ejemplo (con `^`, `|` y
`:` para las flechas). En el 5 puede haber flechas que lleguen a una
caja desde el costado: dibujalas como puedas, lo que importa es que
quede claro QUIÉN apunta a QUIÉN y con qué tipo de línea.

## MI RESPUESTA

2.


3.


4.


5.


---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

/entrega Ejercicio del libro "What's the Picture?" (pág. 615-617). Mi respuesta está en ejercicios/lib29-whats-the-picture.md
