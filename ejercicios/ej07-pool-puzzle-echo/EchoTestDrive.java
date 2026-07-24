/*
LIBRO — Pool Puzzle: "Echo" (pág. 187-190, Sesión #29) — OPCIONAL
(ícono Puzzle del libro, no es un Exercise obligatorio).

ENUNCIADO (tal cual lo plantea el libro):
Tu trabajo es tomar fragmentos de código de "la pileta" (pool) y
colocarlos en los espacios en blanco del código de abajo. PODÉS usar
el mismo fragmento más de una vez, y NO vas a necesitar usar todos los
fragmentos. Tu objetivo es armar dos clases que compilen, corran, y
produzcan EXACTAMENTE la salida indicada. El libro aclara que algunos
ejercicios/acertijos pueden tener más de una respuesta correcta — si
encontrás otra que también funcione, date puntos extra.

SALIDA ESPERADA (al ejecutar):
% java EchoTestDrive
helloooo...
helloooo...
helloooo...
helloooo...
10

PREGUNTA BONUS del libro: si la última línea de salida fuera 24 en vez
de 10, ¿cómo completarías el acertijo?

ESQUELETO CON ESPACIOS EN BLANCO — clase Echo (tal cual la da el
libro — los guiones bajos son huecos a completar, no código real):

class __________ {
  int __________ = 0;
  void __________ {
    System.out.println("helloooo... ");
  }
}

ESQUELETO CON ESPACIOS EN BLANCO — clase EchoTestDrive:

public class EchoTestDrive {
  public static void main(String[] args) {
    Echo e1 = new Echo();

    __________
    int x = 0;
    while (__________) {
      e1.hello();

      __________
      if (__________) {
        e2.count = e2.count + 1;
      }
      if (__________) {
        e2.count = e2.count + e1.count;
      }
      x = x + 1;
    }
    System.out.println(e2.count);
  }
}

FRAGMENTOS DISPONIBLES EN LA PILETA (cada uno se puede usar MÁS DE UNA
VEZ; no hace falta usarlos todos):

  Nombres/identificadores:
    x
    y
    e2
    count
    Echo
    Tester
    echo()
    count()
    hello()

  Condiciones:
    x < 4
    x < 5
    x > 0
    x > 1
    x == 3
    x == 4

  Asignaciones/instrucciones:
    e1 = e1 + 1;
    e1 = count + 1;
    e1.count = count + 1;
    e1.count = e1.count + 1;
    e2 = e1;
    Echo e2;
    Echo e2 = e1;
    Echo e2 = new Echo();

Si te trabás: revisá la Sesión #25/#26 (new, operador punto, cada
objeto con su propia copia de instance variables) y la Sesión #17
(EJERCICIO #04, mismo tipo de acertijo) de GUIA-JAVA.md.

Este ejercicio tiene DOS clases en un solo archivo, tal como las da el
libro. Escribí tu código DEBAJO de este bloque, todo a mano (recordá
que la clase pública tiene que llamarse igual que el archivo:
EchoTestDrive).

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

Hice el ejercicio #07 (Pool Puzzle: Echo), está en
ejercicios/ej07-pool-puzzle-echo/EchoTestDrive.java.
Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
Revisalo línea por línea: qué está bien, qué está mal y POR QUÉ, y
actualizá su estado y tu corrección en EJERCICIOS.md. Si quedó
completado, agendá sus repasos.
*/
