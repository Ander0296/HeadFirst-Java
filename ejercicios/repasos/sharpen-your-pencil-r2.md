# REPASO r2 — Sharpen your pencil: "Look how easy it is to write Java" (pág. 80-81, Sesión #09)

Repaso programado para 2026-08-04. Se hace DESDE CERO: resolvé sin
mirar tu solución original ni la del repaso r1. Es normal si no te
acordás de los detalles — de eso se trata un repaso.

Enunciado (igual al original): abajo tenés un fragmento de código
Java. Todavía es intuición pura, como si fuera casi
inglés/pseudocódigo: escribí en una frase simple qué hace CADA línea
(en español está bien, no hace falta en inglés).

El libro ya da 3 ejemplos resueltos como guía de formato:
- Línea 1 → "declare an integer variable named 'size' and give it the value 27"
- Línea con el `if` → "if x (value of 22) is less than 15, tell the dog to bark 8 times"
- Una de las líneas con `print` → "print out 'Hello'... probably at the command line"

Código completo:
```java
int size = 27;
String name = "Fido";
Dog myDog = new Dog(name, size);
x = size - 5;
if (x < 15) myDog.bark(8);

while (x > 3) {
  myDog.play();
}

int[] numList = {2, 4, 6, 8};
System.out.print("Hello");
System.out.print("Dog: " + name);
String num = "8";
int z = Integer.parseInt(num);

try {
  readTheFile("myFile.txt");
} catch (FileNotFoundException ex) {
  System.out.print("File not found.");
}
```

Si te trabás: revisá la Sesión #09 de GUIA-JAVA.md (ahí está el
contexto de "Speed and memory usage" y "Code structure in Java").

## MI RESPUESTA

int size = 27; se declara una variable de tipo int llamada size y se inicializa en 27 
String name = "Fido"; se declara una varible de tipo String llamada name y se inicializa en "Fido";
Dog myDog = new Dog(name, size); se crea una instancia de la clase Dog, se pasa por parámetros los valores de name y size para iniciar sus argumentos y no de error de compilación
x = size - 5;  a la variable x se le asigna el valor de size menos 5, OJO la variable x nunca fue declarada en tipo de dato 
if (x < 15) myDog.bark(8); si x es menor a 15 myDog va a usar el método bark para ladrar 8 veces

while (x > 3) { mientras x sea mayor a 3
  myDog.play(); myDog usa el método play
}

int[] numList = {2, 4, 6, 8}; se crea una variable de tipo array llamada numList y se inicializa con los valores 2, 4, 6 y 8
System.out.print("Hello"); se imprime por pantalla la palabra Hello
System.out.print("Dog: " + name); Se imprime por pantalla Dog: Fido debido a que name es equivalente a Fido
String num = "8"; Se crea una variable de tipo String llamada num, se inicializa con el valor de "8"
int z = Integer.parseInt(num); se crea una variable de tipo int llamada z, se inicializa con un parseInt de la variable "8", por lo tanto ese "8" pasa a ser 8 entero

try { intenta
  readTheFile("myFile.txt"); intenta leer myFile.txt
} catch (FileNotFoundException ex) { si no existe el archivo 
  System.out.print("File not found."); imprime "File not found."
}

---

PROMPT DE ENTREGA (copiá y pegá esto cuando termines):

Hice el repaso r2 de "Sharpen your pencil" (pág. 80-81), mi respuesta
está en ejercicios/repasos/sharpen-your-pencil-r2.md.
Comparalo con mi intento original y con el repaso r1 (sin
mostrármelos antes si no los recuerdo) y decime qué mejoré, qué error
se repitió y por qué. Actualizá EJERCICIOS.md: si salió bien, agendá
el siguiente repaso del ciclo (r3); si salió mal, acortá el intervalo
a ~3 días.
