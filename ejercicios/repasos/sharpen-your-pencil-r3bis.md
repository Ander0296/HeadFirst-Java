# REPASO r3 bis — Sharpen your pencil (Afilá tu lápiz): "Look how easy it is to write Java" (Mirá qué fácil es escribir Java) (pág. 80-81, Sesión #09)

Repaso programado para 2026-10-01. ÚLTIMO DEL CICLO: si sale bien, el
ejercicio se gradúa. Se hace DESDE CERO: no mires tu solución original
ni las de los repasos anteriores.

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
1.  int size = 27;
2.  String name = "Fido";
3.  Dog myDog = new Dog(name, size);
4.  x = size - 5;
5.  if (x < 15) myDog.bark(8);
6.  while (x > 3) {
7.    myDog.play();
8.  }
9.  int[] numList = {2, 4, 6, 8};
10. System.out.print("Hello");
11. System.out.print("Dog: " + name);
12. String num = "8";
13. int z = Integer.parseInt(num);
14. try {
15.   readTheFile("myFile.txt");
16. } catch (FileNotFoundException ex) {
17.   System.out.print("File not found.");
18. }
```

(Los números de línea van solo para que puedas referirte a cada una: no
son parte del código.)

Si te trabás: revisá la Sesión #09 de GUIA-JAVA.md.
Checklist: ToDo/entregar-un-ejercicio.md (Niveles 1 y 3).

## MI RESPUESTA

1. declarar una variable entera llamada 'size' (tamaño) y darle el valor 27
2. declarar una variable String llamada 'name' (nombre) y darle el valor "Fido"
3. declarar una variable de referencia 'myDog' y asignarla al objeto dog con argumentos (name, size)
la variable name es "Fido"
la variable size es 27
4. La variable x no está declarada solo inicializada, pero si estuviera inicializada el valor es 22
5. si x (que vale 22) es menor que 15, decirle al perro que ladre 8 veces
6. mientras x (que vale 22) sea mayor a 3
7. decirle al perro que juegue llamando al método play()
8. 
9. declarar un arreglo llamado 'numList' con valores 2,4,6 y 8
10. imprime el String "Hello"
11. imprime el String "Dog: " y concatena la variable name que tiene valor "Fido"
12. declara una variable String llamada 'num' y darle valor 8
13. declara una variable entera llamada 'z' y darle el valor de la variable num parseando el String en un entero.
14. intenta
15. lee el archivo myFile.txt con el método static readTheFile
16. si encuentra el error FileNotFoundException
17. imprime el String "File not found."
18.

---

PROMPT DE ENTREGA (copiá y pegá esto cuando termines):

/entrega Hice el repaso r3 bis de "Sharpen your pencil" (pág. 80-81), mi respuesta está en ejercicios/repasos/sharpen-your-pencil-r3bis.md
