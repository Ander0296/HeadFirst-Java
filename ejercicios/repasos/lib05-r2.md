# REPASO r2 — LIBRO "BE the Compiler, parte 2" (pág. 183-184, Sesión #28)

Repaso DESDE CERO. No mires tu respuesta anterior ni la corrección:
volver a resolverlo es lo que fija el conocimiento, releerlo no.

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
#28 de GUIA-JAVA.md.

Checklist: ToDo/entregar-un-ejercicio.md — recorrelo ANTES de entregar.

## MI RESPUESTA

Escribí acá abajo. Para CADA archivo (A y B) el enunciado te pide dos
cosas, no una:

1. ¿Compila? Si NO, ¿cuál es el error exacto y por qué?
2. El ARREGLO escrito en código Java (la línea o el bloque tal como
   iría en el archivo). Si SÍ compila, la salida exacta.

A: No compila, no estamos creando la instancia song con new, entonces song es una variable u objeto desconocido por el compilador.
Para arreglarlo debemos crearla primero de la siguiente manera
StreamingSong song = new StreamingSong();
una ves arreglado la clase va a dar como salida:
Playing song
This is Come Together by The Beatles


B: No compila, el problema es que está llamando un método que no existe en la clase Episode, especificamente es el método play()
Tenemos dos opciones para arreglarlo, 1 agregar el método play() a la clase, o sacar esa línea de código.
Vamos a tomar el ejemplo en que sacamos el método, la sálida sería 
Loading next episode...

---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

```
/entrega Hice el REPASO r2 del ejercicio del libro "BE the Compiler,
parte 2" (página 183-184). Mi respuesta está en
ejercicios/repasos/lib05-r2.md. Corregilo EN EL CHAT comparando contra
mi versión original: qué mejoré, qué error repetí y por qué. Dame
primero pistas, no la solución completa. Después actualizá REPASOS en
EJERCICIOS.md.
```
