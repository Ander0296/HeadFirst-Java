# LIBRO — Sharpen your pencil: "Annotate the code yourself!" (Anotá el código vos mismo) — pág. 430-433, Sesión #79

## Enunciado (traducido)

"Annotate the code yourself! Match the annotations at the bottom of each
page with the numbers in the code. Write the number in the slot in front
of the corresponding annotation. You'll use each annotation just once,
and you'll need all of the annotations."

(¡Anotá el código vos mismo! Emparejá las anotaciones del pie de cada
página con los números del código. Escribí el número en el espacio
delante de la anotación correspondiente. Vas a usar cada anotación una
sola vez, y vas a necesitar todas.)

Y el aviso del libro: "Whatever you do, DON'T turn the page! Not until
you've finished this exercise. Our version is on the next page."
(Hagas lo que hagas, ¡NO des vuelta la página! No hasta que hayas
terminado este ejercicio. Nuestra versión está en la página siguiente.)

Son DOS bloques independientes: los números 1 a 10 se emparejan con las
diez anotaciones del BLOQUE A, y los números 11 a 21 con las once del
BLOQUE B. Cada anotación se usa una sola vez y no sobra ninguna.

## BLOQUE A — código de la pág. 430 (números 1 a 10)

```
import java.util.ArrayList;

public class StartupBust {
   private GameHelper helper = new GameHelper();                     -- 1
   private ArrayList<Startup> startups = new ArrayList<Startup>();   -- 1
   private int numOfGuesses = 0;                                     -- 1

   private void setUpGame() {
      // first make some Startups and give them names
      Startup one = new Startup();                                   -- 2
      one.setName("poniez");                                         -- 2
      Startup two = new Startup();                                   -- 2
      two.setName("hacqi");                                          -- 2
      Startup three = new Startup();                                 -- 2
      three.setName("cabista");                                      -- 2
      startups.add(one);                                             -- 2
      startups.add(two);                                             -- 2
      startups.add(three);                                           -- 2

      System.out.println("Your goal is to sink three Startups.");           -- 3
      System.out.println("poniez, hacqi, cabista");                         -- 3
      System.out.println("Try to sink them all in the fewest number of guesses"); -- 3

      for (Startup startup : startups) {                                    -- 4
         ArrayList<String> newLocation = helper.placeStartup(3);            -- 5
         startup.setLocationCells(newLocation);                             -- 6
      } // close for loop
   } // close setUpGame method

   private void startPlaying() {
      while (!startups.isEmpty()) {                                         -- 7
         String userGuess = helper.getUserInput("Enter a guess");           -- 8
         checkUserGuess(userGuess);                                         -- 9
      } // close while
      finishGame();                                                         -- 10
   } // close startPlaying method
```

### Anotaciones del BLOQUE A (escribí el número delante de cada una)

```
___  Declarar e inicializar las variables que vamos a necesitar
___  Obtener la entrada del usuario
___  Pedirle al helper una ubicación de Startup
___  Repetir con cada Startup de la lista
___  Imprimir instrucciones breves para el usuario
___  Llamar al método setter de esta Startup para darle la ubicación que
     acabás de conseguir del helper
___  Llamar a nuestro propio método checkUserGuess
___  Crear tres objetos Startup, darles nombres y meterlos en el ArrayList
___  Mientras la lista de Startups NO esté vacía
___  Llamar a nuestro propio método finishGame
```

## BLOQUE B — código de la pág. 433 (números 11 a 21)

```
   private void checkUserGuess(String userGuess) {
      numOfGuesses++;                                                -- 11
      String result = "miss";                                        -- 12

      for (Startup startupToTest : startups) {                       -- 13
         result = startupToTest.checkYourself(userGuess);            -- 14

         if (result.equals("hit")) {
            break;                                                   -- 15
         }
         if (result.equals("kill")) {
            startups.remove(startupToTest);                          -- 16
            break;
         }
      } // close for

      System.out.println(result);                                    -- 17
   } // close method

   private void finishGame() {
      System.out.println("All Startups are dead! Your stock is now worthless");  -- 18
      if (numOfGuesses <= 18) {                                                  -- 18
         System.out.println("It only took you " + numOfGuesses + " guesses.");   -- 18
         System.out.println("You got out before your options sank.");            -- 18
      } else {                                                                   -- 18
         System.out.println("Took you long enough. " + numOfGuesses + " guesses."); -- 18
         System.out.println("Fish are dancing with your options");               -- 18
      }
   } // close method

   public static void main(String[] args) {
      StartupBust game = new StartupBust();                          -- 19
      game.setUpGame();                                              -- 20
      game.startPlaying();                                           -- 21
   } // close method
}
```

### Anotaciones del BLOQUE B (escribí el número delante de cada una)

```
___  Repetir con todas las Startups de la lista
___  Esta está muerta, así que sacala de la lista de Startups y salí del bucle
___  Imprimir un mensaje diciéndole al usuario cómo le fue en el juego
___  Imprimir el resultado para el usuario
___  Incrementar la cantidad de intentos que hizo el usuario
___  Decirle al objeto juego que prepare el juego
___  Asumir que es un 'miss', salvo que te digan lo contrario
___  Salir del bucle temprano, no tiene sentido probar las otras
___  Decirle al objeto juego que arranque el bucle principal de juego
     (sigue pidiendo entrada del usuario y chequeando el intento)
___  Pedirle a la Startup que chequee el intento del usuario, buscando un
     hit (o kill)
___  Crear el objeto juego
```

## MI RESPUESTA

(escribí acá los dos bloques con los números puestos. Alcanza con una
lista tipo "1 → Declarar e inicializar..." si te resulta más cómodo que
llenar los guiones de arriba.)

### Bloque A


### Bloque B


## Pistas si te trabás

Si te trabás: revisá la Sesión #79 de la guía (el prep code de
StartupBust y el código real), y la Sesión #78 (los 6 pasos de "quién
hace qué en StartupBust").

Dos preguntas que ordenan el trabajo: ¿esta línea la ejecuta el objeto
juego por su cuenta, o le está pidiendo algo a OTRO objeto (el helper,
una Startup)? Y en las que se parecen entre sí: ¿el bucle sale porque
terminó de recorrer, o porque alguien lo cortó a propósito?

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "Annotate the code yourself!" de StartupBust
(páginas 430-433). Mi respuesta está en
ejercicios/lib20-anotar-startupbust.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
