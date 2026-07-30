/*
LIBRO — Pool Puzzle: "Puzzle4" (pág. 312-314, Sesión #57) — OPCIONAL
(ícono Puzzle del libro, no es un Exercise obligatorio).

ENUNCIADO (tal cual lo plantea el libro):
Tu trabajo es tomar fragmentos de código de "la pileta" (pool) y
colocarlos en los espacios en blanco del código de abajo. NO PODÉS usar
el mismo fragmento más de una vez, y no vas a necesitar usar todos los
fragmentos (ojo: es la regla CONTRARIA a la de "Triangle", EJERCICIO
#10 — ahí sí se podía repetir fragmento). Tu objetivo es armar una
clase que compile, corra, y produzca exactamente esta salida:

  result 543345

ESQUELETO CON ESPACIOS EN BLANCO (tal cual lo da el libro — los
guiones bajos son huecos a completar, no código real):

public class Puzzle4 {
  public static void main(String [] args) {
    ________________________
    int number = 1;
    int i = 0;
    while (i < 6) {
      ________________________
      ________________________
      number = number * 10;
      ________________________
    }

    int result = 0;
    i = 6;
    while (i > 0) {
      ________________________
      result = result + ________________________
    }
    System.out.println("result " + result);
  }
}

class __________ {
  int intValue;
  ________ ________ doStuff(int _________) {
    if (intValue > 100) {
      return ________________________
    } else {
      return ________________________
    }
  }
}

FRAGMENTOS DISPONIBLES EN LA PILETA — "Fast Times in Stim-City" (tal
cual aparecen en la página; NOTA: es un juego de palabras del libro
entre la película "Fast Times at Ridgemont High" y el videojuego
"SimCity" — no tiene relación con el ejercicio en sí, es solo el
nombre decorativo de esta pileta. Cada fragmento se puede usar UNA sola
vez, y puede que sobren fragmentos sin usar):

  Llamadas a método:
    doStuff(i);
    values.doStuff(i);
    values[i].doStuff(factor);
    values[i].doStuff(i);

  Asignaciones a intValue:
    intValue = i;
    values.intValue = i;
    values[i].intValue = i;
    values[i].intValue = number;

  Declaraciones de arreglo:
    Puzzle4 [] values = new Puzzle4[6];
    Value [] values = new Value[6];
    Value [] values = new Puzzle4[6];

  Expresiones (para los return):
    intValue + factor;
    intValue * (2 + factor);
    intValue * (5 - factor);
    intValue * factor;

  Tipos / nombres de clase:
    Puzzle4
    Value
    Value()
    int
    short

  Control del bucle:
    i = i + 1;
    i = i - 1;

  Modificadores:
    public
    private

  Otros:
    factor
    values [i] = new Value(i);
    values [] = new Value();
    values [i] = new Value();
    values = new Value();

Si te trabás: revisá la Sesión #40 a #43 de la guía (arreglos de
objetos, notación arreglo[índice], `new` para crear el objeto arreglo
y cada objeto adentro) y las sesiones donde se explicaron los métodos
con parámetros y valor de retorno. También te puede servir comparar
con el EJERCICIO #10 (mismo tipo de acertijo, pero con la regla de
fragmentos al revés: ahí SÍ se repetían).

Escribí tu código DEBAJO de este bloque, todo a mano (recordá que la
clase pública tiene que llamarse igual que el archivo: Puzzle4).

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

Hice el ejercicio #12 (Pool Puzzle: Puzzle4), está en
ejercicios/ej12-pool-puzzle-puzzle4/Puzzle4.java.
Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
Revisalo línea por línea EN EL CHAT: qué está bien, qué está mal y POR
QUÉ. En EJERCICIOS.md actualizá el estado con una corrección de 3
líneas como máximo; si quedó completado, movelo con su corrección a
EJERCICIOS-ARCHIVO.md y agendá sus repasos.
*/
