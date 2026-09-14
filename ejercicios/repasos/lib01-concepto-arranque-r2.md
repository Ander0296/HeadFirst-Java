# REPASO CONCEPTUAL — "¿Qué hace falta para ARRANCAR un programa?" (r2)

Repaso desde cero, EN FRÍO: sin libro, sin guía, sin checklist, sin
código viejo abierto, y sin mirar tu respuesta del repaso anterior.
Contestá con tus palabras, como si te lo preguntaran en una entrevista
de trabajo. No hay código para compilar: es un ejercicio de papel.

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

<!-- Escribí acá abajo tus cinco respuestas, numeradas. -->

1. Para que la JVM pueda correr una clase, la clase debe tener el método main, adicional debe estar compilado, una ves todo esté bien, la JVM correrá el programa.
El metodo main sirve para que JVM lea la clase y sepa que va empezar por esa misma clase con el método main, esto lo logramos diciendole que ejecute la clase con
java nombreClase.

2. public static void main(String[] args){}

3. Java Gato ejecuta la clase Gato, esa clase dice que imprime Miau, los otros main se ignoran, nosotros le estamos diciendo que inicie desde la clase Gato, al tener
el método main va a correr el programa.

4. El error es de Main method not found in class nombreClase, y aparece al ejecutar, para compilar no se necesita tener una clase main
la clase main es para correr el programa.

5. A cuando la clase no tiene main, va a dar error de ejecución.
B. cuando no se encuentra la clase main debido a que estamos en otra carpeta.

---

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

/entrega Hice el REPASO r2 del concepto "qué hace falta para ARRANCAR
un programa" (post-graduación de lib01, Sesión #09/#10). Mi respuesta
está en ejercicios/repasos/lib01-concepto-arranque-r2.md. No hay nada
que compilar: es conceptual. Corregilo comparándolo con mi versión
anterior y decime qué mejoré y qué error repetí.
