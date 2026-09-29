# REPASO r3 — Sharpen your pencil (Afilá tu lápiz): "Look how easy it is to write Java" (Mirá qué fácil es escribir Java) (pág. 80-81, Sesión #09)

Repaso programado para 2026-09-25. ÚLTIMO DEL CICLO: si sale bien, el
ejercicio se gradúa. Se hace DESDE CERO: no mires tu solución original
ni las de los repasos r1 y r2.

## ENUNCIADO

Abajo tenés un fragmento de código Java. Escribí en una frase simple
qué hace CADA línea (en español). Contestá TODAS las líneas, una por
una, numeradas.

El libro da 3 ejemplos resueltos como guía de formato:
- Línea 1 → "declare an integer variable named 'size' and give it the
  value 27" (declarar una variable entera llamada 'size' (tamaño) y
  darle el valor 27)
- Línea del `if` → "if x (value of 22) is less than 15, tell the dog to
  bark 8 times" (si x (que vale 22) es menor que 15, decirle al perro
  que ladre 8 veces)
- Una de las líneas con `print` → "print out 'Hello'... probably at the
  command line" (imprimir 'Hello' (Hola)... probablemente en la línea
  de comandos)

Nombres del código: `size` (tamaño), `name` (nombre), `Dog` (perro),
`myDog` (miPerro), `bark()` (ladrar), `play()` (jugar), `numList`
(listaDeNúmeros), `num` (número), `Integer.parseInt()` (Entero.convertir
texto a entero), `readTheFile()` (leerElArchivo), `"myFile.txt"`
(miArchivo.txt), `FileNotFoundException` (excepción de archivo no
encontrado), `ex` (abreviatura de excepción), `"Fido"` (un nombre
típico de perro), `"Dog: "` (Perro: ), `"File not found."` (Archivo no
encontrado.).

```java
1.  int size = 27; Declara una variable de tipo int llamada size, también se inicializa con un valor de 27.
2.  String name = "Fido"; Declara una variable de tipo String llamada name y se inicializa con la cadena "Fido".
3.  Dog myDog = new Dog(name, size); Declara una variable de referencia de tipo Dog llamada myDog, y crea el objeto de tipo Dog cen new, con argumentos name y size.
4.  x = size - 5; error de compilación, la variable x no está declarada.
5.  if (x < 15) myDog.bark(8); condicional if que se cumple siempre que x sea menor que 15 y ejecuta el método bark del objeto myDog.
6.  while (x > 3) { condicional while que se repite mientras x sea mayor a 3, no aumenta la variable y crea un bucle infinito.
7.    myDog.play(); ejecuta el método play del objeto myDog.
8.  }
9.  int[] numList = {2, 4, 6, 8}; Declara una lista de numeros enteros llamada numList y la inicializa con los valores 2,4,6,8
10. System.out.print("Hello"); imprime el String "Hello"
11. System.out.print("Dog: " + name); imprime el String "Dog: " con el valor que tenga la variable name en este caso sería "Dog: Fido"
12. String num = "8"; Declara una variable de tipo String llamada num y se inicializa con un String "8"
13. int z = Integer.parseInt(num); declara una variable de tipo int llamada z y se inicaliza parseando el valor de tipo String "8" de num, lo que lo convierte en un int
14. try { intenta leer el archivo myFile.txt
15.   readTheFile("myFile.txt");
16. } catch (FileNotFoundException ex) { si no lo encuentra imprime el mensaje "File not found."
17.   System.out.print("File not found.");
18. }
```

(Los números de línea van solo para que puedas referirte a cada una: no
son parte del código.)

Si te trabás: revisá la Sesión #09 de GUIA-JAVA.md.
Checklist: ToDo/entregar-un-ejercicio.md (Nivel 1).




---

PROMPT DE ENTREGA (copiá y pegá esto cuando termines):

/entrega Hice el repaso r3 de "Sharpen your pencil" (pág. 80-81), mi respuesta está en ejercicios/repasos/sharpen-your-pencil-r3.md
