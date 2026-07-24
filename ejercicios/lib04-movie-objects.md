# LIBRO — Sharpen your pencil: "Movie objects" (pág. 170-173, Sesión #26)

## Enunciado (tal cual lo plantea el libro)

"The MovieTestDrive class creates objects (instances) of the Movie
class and uses the dot operator (.) to set the instance variables to
a specific value. The MovieTestDrive class also invokes (calls) a
method on one of the objects. Fill in the chart to the right with the
values the three objects have at the end of main()."

(La clase MovieTestDrive crea objetos —instancias— de la clase Movie
y usa el operador punto (.) para asignarles un valor a las instance
variables. La clase MovieTestDrive también invoca —llama— un method
sobre uno de los objetos. Completá la tabla con los valores que tienen
los tres objetos AL FINAL de main().)

No hay que escribir ni compilar código: es un ejercicio de LECTURA —
mirar el código de abajo y anotar en qué quedó cada objeto al
terminar main().

Código completo (clase Movie + clase MovieTestDrive con su main()):

```java
class Movie {
  String title;
  String genre;
  int rating;

  void playIt() {
    System.out.println("Playing the movie");
  }
}

public class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "Gone with the Stock";
    one.genre = "Tragic";
    one.rating = -2;

    Movie two = new Movie();
    two.title = "Lost in Cubicle Space";
    two.genre = "Comedy";
    two.rating = 5;
    two.playIt();

    Movie three = new Movie();
    three.title = "Byte Club";
    three.genre = "Tragic but ultimately uplifting";
    three.rating = 127;
  }
}
```

Si te trabás: revisá la Sesión #25 y #26 de GUIA-JAVA.md (new, operador
punto, y que cada objeto tiene su propia copia de las instance
variables).

## MI RESPUESTA

object 1 (title / genre / rating):
object one ("Gone with the Stock", Tragic, -2)

object 2 (title / genre / rating):
object two ("Lost in Cubicle Space", Comedy, 5)

object 3 (title / genre / rating):
object three ("byte club","Tragic but ultimately uplifting", 127 )

---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

```
Hice el ejercicio del libro "Movie objects" (página 170-173).
Mi respuesta está en ejercicios/lib04-movie-objects.md (o la escribo
acá: [...]). Corregilo pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. Registrá el resultado
en EJERCICIOS.md y, si quedó completado, agendá sus repasos.
```
