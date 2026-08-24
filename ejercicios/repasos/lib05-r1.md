# REPASO r1 — "BE the Compiler, parte 2" (pág. 183-184)

Head First Java, Capítulo 2. Repaso del ejercicio de la Sesión #28
(programado para 2026-07-28).

Se hace DESDE CERO: resolvé sin mirar tu solución original ni su
corrección.

## Enunciado (igual que la primera vez)

Cada archivo Java de abajo representa un archivo fuente completo.
Actuá de compilador: ¿compila cada uno? Si no, ¿por qué exactamente y
cómo lo arreglarías? Si sí compila, ¿cuál sería su salida?

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

Si te trabás: revisá la Sesión #25 (en GUIA-ARCHIVO.md).

## MI RESPUESTA

A: No compila porque no se ha creado un objeto de tipo streaming song, y encimas estamos usando los métodos de esa clase, al no tener control remoto que apunte a esa clase no va a compilar.
Para arreglarlo crearía la instancia StreamingSong song = new StreamingSong();

B: No compila porque estamos usando un método que no existe, por lo que va dar error de compilación, el método play es el que no existe.
Para poder arreglarlo crearía el método play con 
  void play() {
    System.out.println("Playing song");
  }

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el repaso r1 de "BE the Compiler, parte 2" (pág. 183-184), mi
respuesta está en ejercicios/repasos/lib05-r1.md.
Comparalo con mi intento original (sin mostrármelo antes) y decime qué
mejoré y qué se repitió. Actualizá EJERCICIOS.md: si salió bien,
agendá el r2; si salió mal, acortá el intervalo a ~3 días.
