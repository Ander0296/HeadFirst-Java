# REPASO r1 — "Sharpen your pencil": línea por línea, qué hace cada instrucción (pág. 80-81)

Head First Java, Capítulo 1. Repaso del ejercicio de la Sesión #09
(programado para 2026-07-20).

Se hace DESDE CERO: resolvé sin mirar tu intento original ni su
corrección. Es normal si no te acordás de los detalles — de eso se
trata un repaso.

## Enunciado (igual que la primera vez)

Abajo tenés un fragmento de código Java. Todavía es intuición pura,
como si fuera casi inglés/pseudocódigo: escribí en una frase simple
qué hace CADA línea (en español está bien, no hace falta en inglés).

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

Si te trabás: revisá la Sesión #09 de GUIA-JAVA.md.

## MI RESPUESTA

(escribí acá tu frase para cada línea, desde cero)

int size = 27; Es una variable Int con nombre size y tiene un valor de 27
String name = "Fido"; Es una variable String con nombre name y valos "Fido"
Dog myDog = new Dog(name, size); Es una instancia creada a partir de la clase Dog y se llama Mydog, new Dog la crea con los parametros name = "Fido", size = 27;
x = size - 5; una variable x equivalente a size 27 - 5 = 22
if (x < 15) myDog.bark(8); Condicional if donde indica que si x es menor que 15 ejecuta myDog.bark y tiene un parametro que es 8;

while (x > 3) { condicional while, mientras x sea mayor que 3
  myDog.play(); si es mayor que 3 ejecuta myDog.play()
}

int[] numList = {2, 4, 6, 8}; un array de numeros enteros y son numeros pares
System.out.print("Hello"); imprime en consola hello
System.out.print("Dog: " + name); imprime en consola Dog: "Fido"
String num = "8"; Una variable String que se llama num y tiene como valor "8" entre comillas porque es String
int z = Integer.parseInt(num); variable llamada z, tiene como valor num pero parseada a int, convirtiendo en int el String numerico en este caso 8;

try { un try, intenta hacer algo
  readTheFile("myFile.txt"); va a leer el archivo myfile.txt
} catch (FileNotFoundException ex) { si no existe o tenemos un error, imprime el mensaje de abajo
  System.out.print("File not found."); Imprime file not found es decir no se encontró el archivo
}

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el repaso r1 de "Sharpen your pencil" (pág. 80-81), mi respuesta
está en ejercicios/repasos/sharpen-your-pencil-r1/sharpen-your-pencil-r1.md.
Comparalo con mi intento original (sin mostrármelo antes si no lo
recuerdo) y decime qué mejoré, qué error se repitió y por qué.
Actualizá EJERCICIOS.md: si salió bien, agendá el siguiente repaso del
ciclo; si salió mal, acortá el intervalo a ~3 días.
