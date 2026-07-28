/*
LIBRO — Pool Puzzle: "Triangle" (pág. 250-251, Sesión #44) — OPCIONAL
(ícono Puzzle del libro, no es un Exercise obligatorio).

ENUNCIADO (tal cual lo plantea el libro):
Tu trabajo es tomar fragmentos de código de "la pileta" (pool) y
colocarlos en los espacios en blanco del código de abajo. PODÉS usar
el mismo fragmento más de una vez, y NO vas a necesitar usar todos los
fragmentos. Tu objetivo es armar una clase que compile, corra, y tenga
sentido con el resto del programa (arreglo de 4 triángulos, cada uno
con su área calculada).

NOTA A MANO del libro sobre la clase: "A veces no usamos una clase de
prueba separada, porque estamos tratando de ahorrar espacio en la
página." (por eso todo — la clase Triangle Y el main — está en un
solo archivo, cosa que ya vimos con Echo en el EJERCICIO #07).

ESQUELETO CON ESPACIOS EN BLANCO (tal cual lo da el libro — los
guiones bajos son huecos a completar, no código real):

class Triangle {
  double area;
  int height;
  int length;

  public static void main(String[] args) {
    __________
    ________________________
    while ( __________ ) {
      ________________________
      __________.height = (x + 1) * 2;
      __________.length = x + 4;
      ________________________
      System.out.print("triangle " + x + ", area");
      System.out.println(" = " + __________.area);
      ________________________
    }
    ________________
    x = 27;
    Triangle t5 = ta[2];
    ta[2].area = 343;
    System.out.print("y = " + y);
    System.out.println(", t5 area = " + t5.area);
  }
  void setArea() {
    __________ = (height * length) / 2;
  }
}

FRAGMENTOS DISPONIBLES EN LA PILETA (tal cual aparecen en la página;
cada uno se puede usar MÁS DE UNA VEZ, y puede que sobren fragmentos
sin usar):

  Nombres/expresiones:
    area
    ta.area
    x
    y
    ta.x.area
    ta[x].area
    ta.x
    ta(x)
    ta[x]

  Declaraciones de arreglo:
    Triangle [] ta = new Triangle(4);
    Triangle ta = new [] Triangle[4];
    Triangle [] ta = new Triangle[4];

  Declaraciones de variables:
    int x;
    int y;
    int x = 0;
    int x = 1;
    int y = x;

  Condiciones:
    x < 4
    x < 5

  Asignaciones/instrucciones:
    ta[x] = setArea();
    ta.x = setArea();
    ta[x].setArea();
    x = x + 1;
    x = x + 2;
    x = x - 1;
    ta = new Triangle();
    ta[x] = new Triangle();
    ta.x = new Triangle();

  Valores sueltos (para otra parte del acertijo, no necesariamente
  para estos huecos):
    4, t5 area = 18.0
    4, t5 area = 343.0
    27, t5 area = 18.0
    27, t5 area = 343.0
    28.0
    30.0

Si te trabás: revisá la Sesión #40 a #43 de la guía (arreglos de
objetos, notación arreglo[índice], `new` para crear el objeto arreglo
y cada objeto adentro) y el EJERCICIO #07 (mismo tipo de acertijo,
Pool Puzzle con una sola clase).

Escribí tu código DEBAJO de este bloque, todo a mano (recordá que la
clase pública tiene que llamarse igual que el archivo: Triangle).

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

Hice el ejercicio #10 (Pool Puzzle: Triangle), está en
ejercicios/ej10-pool-puzzle-triangle/Triangle.java.
Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
Revisalo línea por línea EN EL CHAT: qué está bien, qué está mal y POR
QUÉ. En EJERCICIOS.md actualizá el estado con una corrección de 3
líneas como máximo; si quedó completado, movelo con su corrección a
EJERCICIOS-ARCHIVO.md y agendá sus repasos.
*/
