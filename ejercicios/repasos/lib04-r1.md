# REPASO r1 — Sharpen your pencil: "Movie objects" (pág. 170-173)

Head First Java, Capítulo 2. Repaso del ejercicio de la Sesión #26
(programado para 2026-07-28).

Se hace DESDE CERO: resolvé sin mirar tu solución original ni su
corrección.

## Enunciado (igual que la primera vez)

La clase MovieTestDrive crea objetos (instancias) de la clase Movie y
usa el operador punto (.) para asignarles valores a las instance
variables, y también invoca un method sobre uno de los objetos.
Completá la tabla con los valores que tienen los tres objetos AL FINAL
de main(). Es un ejercicio de LECTURA: no hay que compilar nada.

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

Si te trabás: revisá la Sesión #25 (en GUIA-ARCHIVO.md).

## MI RESPUESTA

object 1 (title / genre / rating):

object 2 (title / genre / rating):

object 3 (title / genre / rating):

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el repaso r1 de "Movie objects" (pág. 170-173), mi respuesta está
en ejercicios/repasos/lib04-r1.md.
Comparalo con mi intento original (sin mostrármelo antes) y decime qué
mejoré y qué se repitió. Actualizá EJERCICIOS.md: si salió bien,
agendá el r2; si salió mal, acortá el intervalo a ~3 días.
