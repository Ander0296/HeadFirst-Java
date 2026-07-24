# LIBRO — BE the Compiler, parte 2 (pág. 183-184, Sesión #28)

## Enunciado (tal cual lo plantea el libro)

"Each of the Java files on this page represents a complete source
file. Your job is to play compiler and determine whether each of
these files will compile. If they won't compile, how would you fix
them, and if they do compile, what would be their output?"

(Cada uno de los archivos Java de esta página representa un archivo
fuente completo. Tu trabajo es actuar de compilador y decidir si cada
uno va a compilar. Si no compila, ¿cómo lo arreglarías? Y si sí
compila, ¿cuál sería su salida?)

Son 2 "archivos" (A y B). Analizalos uno por uno.

### A

```java
class StreamingSong {
  String title;
  String artist;
  int duration;

  void play() {
    System.out.println("Playing song");
  }

  void printDetails() {
    System.out.println("This is " + title + " by " + artist);
  }
}

class StreamingSongTestDrive {
  public static void main(String[] args) {
    song.artist = "The Beatles";
    song.title = "Come Together";
    song.play();
    song.printDetails();
  }
}
```

### B

```java
class Episode {
  int seriesNumber;
  int episodeNumber;

  void skipIntro() {
    System.out.println("Skipping intro...");
  }

  void skipToNext() {
    System.out.println("Loading next episode...");
  }
}

class EpisodeTestDrive {
  public static void main(String[] args) {
    Episode episode = new Episode();
    episode.seriesNumber = 4;
    episode.play();
    episode.skipIntro();
  }
}
```

Si te trabás: revisá la Sesión #25 (new, operador punto) y la Sesión
#16/#18 de GUIA-JAVA.md (mismo formato de ejercicio, ya resuelto antes).

## MI RESPUESTA

Para cada archivo (A, B): ¿compila? Si no, ¿por qué exactamente y cómo
lo arreglarías? Si sí compila, ¿cuál es la salida?

A: No va compilar, la variable song no está definida por más que se haga ver que es una instancia, no se declara en ningún momento.
Para arreglarlo se necesita declarar la variable es decir crear la instancia, arriba de la linea song.artist creamos la variable con StreamingSong song = new StreamingSong();

B: No va compilar, el método play de la clase Episode no existe.
Para arreglar el problema creamos el método play con 
void play(){
  System.out.println("Play song");
}
---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

```
Hice el ejercicio del libro "BE the Compiler, parte 2" (página
183-184). Mi respuesta está en ejercicios/lib05-be-the-compiler-2.md
(o la escribo acá: [...]). Corregilo pero SIN darme la solución
completa de entrada: decime qué tengo bien, qué tengo mal, y dame
pistas para lo que falta. La solución completa solo si te la pido
después. Registrá el resultado en EJERCICIOS.md y, si quedó
completado, agendá sus repasos.
```
