# REPASO CONCEPTUAL — "¿Qué hace falta para ARRANCAR un programa?" (r1)

Repaso desde cero, EN FRÍO: sin libro, sin guía, sin checklist, sin
código viejo abierto. Contestá con tus palabras, como si te lo
preguntaran en una entrevista de trabajo. No hay código para compilar:
es un ejercicio de papel.

Si te trabás: revisá la Sesión #09 y la #10 de la guía (hoy viven en
GUIA-ARCHIVO.md).

Checklist: ToDo/crear-una-clase-java.md (la sección "La trampa del
`main`"). OJO: ese checklist tiene las respuestas. Abrilo recién
DESPUÉS de contestar, para autocorregirte, y si lo abriste antes,
decilo en la entrega.

---

## ENUNCIADO

Tenés una carpeta con tres archivos que ya compilaste con `javac`, sin
errores: `Perro.java`, `Gato.java` y `Zoologico.java`. Al lado de cada
uno quedó su `.class`.

- `Perro` tiene un método `main` que imprime "Guau".
- `Gato` tiene un método `main` que imprime "Miau".
- `Zoologico` tiene un método `main` que imprime "Bienvenidos".
- Además hay una cuarta clase, `Termometro`, que compiló bien y NO
  tiene ningún método `main`.

Contestá las cinco preguntas:

1. En una o dos frases: ¿qué hace falta, EXACTAMENTE, para que la JVM
   pueda arrancar un programa? Nombrá qué es `main` (¿una clase? ¿un
   método? ¿otra cosa?) y DÓNDE lo busca la JVM.

2. Escribí la línea completa con la que se declara ese `main`, tal
   como la busca la JVM (la firma entera, palabra por palabra).

3. Escribís en la terminal `java Gato`. ¿Qué se imprime? ¿Qué pasa con
   los `main` de `Perro` y de `Zoologico`: se ejecutan, se ignoran, o
   el programa da error porque hay "más de uno"? Explicá POR QUÉ.

4. Escribís `java Termometro`. ¿Ese error aparece al COMPILAR o al
   EJECUTAR? ¿Y por qué `Termometro` sí compiló bien, si no tiene
   `main`?

5. Estos son dos mensajes de error distintos que puede tirar `java`.
   Decí cuál de los dos te va a salir en la pregunta 4, y qué situación
   provoca el OTRO:
   - A: `Main method not found in class Termometro`
     (No se encontró el método main en la clase Termometro)
   - B: `Could not find or load main class Termometro`
     (No se pudo encontrar o cargar la clase principal Termometro)

---

## MI RESPUESTA

1. Para que pueda arrancar un programa la JVM debe encontrar el método main, el método main es un método el cual le indica a JVM cuál es la clase de arranque
Cuando compilamos las clases con javac, compila en código bytecode, ese código bytecode lo lee la JVM y arranca el programa, para que pueda arrancar el nombre de la clase
debe ser igual al nombre del archivo, como ya nos dieron que compilaron sin problemas, los archivos con método main van a correr.

2. public static void main(String[] args){}

3. Cuando escribo java Gato, imprime Miau, JVM busca el .class creado cuando se compiló la clase y arranca el programa, los main de Perro y Zoologico no hacen nada
los main de Perro y Zoologico no hacen nada, están los .class pero no se le están diciendo que arranquen, es decir se ignoran aunque el .class ya esté creado.
no hay error, todas las clases pueden tener método main, pero el programa solo puede tener un solo main, y como solo se está llamando el de Gato no hay problema.

4. Da error de ejecución, nos dará error de main method not found in class Termometro, compila bien porque no es necesario tener main, Termometro es una clase creada para 
usarse como plantilla, y la usará la clase que la use con el new. si no tiene main.

5. El error que tira as el A, El segundo error es cuando no hemos compilado y no se encuentra el archivo .class

---

## PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines)

```
/entrega Hice el REPASO r1 del concepto "qué hace falta para ARRANCAR
un programa" (post-graduación de lib01, Sesión #09/#10). Mi respuesta
está en ejercicios/repasos/lib01-concepto-arranque-r1.md. Corregilo EN
EL CHAT comparándolo con mis dos caídas anteriores en los exámenes, y
decime qué mejoré y qué error repetí.
```
