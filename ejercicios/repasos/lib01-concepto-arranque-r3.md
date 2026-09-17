# REPASO CONCEPTUAL — "¿Qué hace falta para ARRANCAR un programa?" (r3)

Repaso desde cero, EN FRÍO: sin libro, sin guía, sin checklist, sin
código viejo abierto, y sin mirar tus respuestas de los repasos
anteriores ni del ejercicio #17. Contestá con tus palabras, como si te
lo preguntaran en una entrevista de trabajo. No hay código para
compilar: es un ejercicio de papel.

Si te trabás: revisá la Sesión #09 y la #10 de la guía (hoy viven en
GUIA-ARCHIVO.md).

Checklists:
- ToDo/entregar-un-ejercicio.md (Nivel 1). Este NO tiene respuestas:
  podés usarlo ANTES de entregar.
- ToDo/crear-una-clase-java.md (la sección "La trampa del `main`").
  OJO: este sí tiene las respuestas. Abrilo recién DESPUÉS de
  contestar, para autocorregirte, y si lo abriste antes, decilo en la
  entrega.

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

   Para que la JVM pueda arrancar un programa primero le tenemos que indicar le clase que queremos arrancar con java nombreClase
   la clase va arrancar si estamos en la carpeta correcta y adicional la clase tiene el método main.
   el método main es aquel que la JVM lee para saber donde arranca el programa.

2. Escribí la línea completa con la que se declara ese `main`, tal
   como la busca la JVM (la firma entera, palabra por palabra).

   public static void main(String[] args){}

3. Escribís en la terminal `java Gato`. ¿Qué se imprime? ¿Qué pasa con
   los `main` de `Perro` y de `Zoologico`: se ejecutan, se ignoran, o
   el programa da error porque hay "más de uno"? Explicá POR QUÉ.

   java Gato va a imprimir Miau, ya que dentro del método main tiene la instrucción de imprimir ese mensaje,
   los main de Perro y Zoologico los va ignorar, no le estamos diciendo a JVM que los ejecute entonces los ignora.
   no importa cuantas clases tenga método main, la que va a buscar son las que nosotros le indiquemos.

4. Escribís `java Termometro`. ¿Ese error aparece al COMPILAR o al
   EJECUTAR? ¿Y por qué `Termometro` sí compiló bien, si no tiene
   `main`?

   Va a dar error de ejecución, no de compilación, la clase compiló sin problemas, pero al arrancar el programa,
   JVM no va encontrar el método main y va a dar error de Main method not found in class Nombreclase


5. Estos son dos mensajes de error distintos que puede tirar `java`.
   Decí cuál de los dos te va a salir en la pregunta 4, y qué situación
   provoca el OTRO:
   - A: `Main method not found in class Termometro`
     (No se encontró el método main en la clase Termometro)
   - B: `Could not find or load main class Termometro`
     (No se pudo encontrar o cargar la clase principal Termometro)
  
  La que sale en la pregunta 4 es la opción A. Main method not found in class Termometro.
La situación para provocar el otro se deben a otros factores, por ejemplo estamos en la carpeta incorrecta,
o el nombre de la clase está mal escrito.
---


<!-- Escribí acá abajo tus cinco respuestas, numeradas. -->



---

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

/entrega Hice el REPASO r3 del concepto "qué hace falta para ARRANCAR
un programa" (post-graduación de lib01, Sesión #09/#10). Mi respuesta
está en ejercicios/repasos/lib01-concepto-arranque-r3.md. No hay nada
que compilar: es conceptual. Corregilo comparándolo con mi versión
anterior y decime qué mejoré y qué error repetí.
