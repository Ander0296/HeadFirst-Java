# REPASO lib27 r1 — BE the Compiler (Sé el compilador): Monster / Vampire (pág. 533-535)

Desde cero: NO mires tu versión anterior.

Si te trabás: revisá las Sesiones #95-#98 de GUIA-JAVA.md (arreglos
polimórficos, reglas para sobrescribir, sobrecarga).
Checklist: ToDo/entregar-un-ejercicio.md (Nivel 2: qué método corre).

## ENUNCIADO

"Which of the A-B pairs of methods listed on the right, if inserted into the
classes on the left, would compile and produce the output shown?"
(¿Cuáles de los pares de métodos A-B de la derecha, si se insertan en las
clases de la izquierda, compilarían Y producirían la salida mostrada?)

"The A method inserted into class Monster, the B method inserted into class
Vampire." (El método A se inserta en la clase Monster; el método B, en la
clase Vampire.)

Nombres: Monster (monstruo), Vampire (vampiro), Dragon (dragón),
MonsterTestDrive (prueba de manejo del monstruo), monsters (monstruos),
frighten (asustar), scare (espantar), degree (grado, intensidad).

### El programa (A y B son los huecos)

```
public class MonsterTestDrive {
  public static void main(String[] args) {
    Monster[] monsters = new Monster[3];
    monsters[0] = new Vampire();
    monsters[1] = new Dragon();
    monsters[2] = new Monster();
    for (int i = 0; i < monsters.length; i++) {
      monsters[i].frighten(i);
    }
  }
}

class Monster {
  [A]
}

class Vampire extends Monster {
  [B]
}

class Dragon extends Monster {
  boolean frighten(int degree) {
    System.out.println("breathe fire");   // (echar fuego)
    return true;
  }
}
```

### La salida que tiene que dar

```
% java MonsterTestDrive
a bite?          (¿un mordisco?)
breathe fire     (echar fuego)
arrrgh           (un grito de monstruo)
```

### Los 4 pares candidatos

```
PAR 1
  A: boolean frighten(int d) { System.out.println("arrrgh");  return true;  }
  B: boolean frighten(int x) { System.out.println("a bite?"); return false; }

PAR 2
  A: boolean frighten(int x) { System.out.println("arrrgh");  return true; }
  B: int frighten(int f)     { System.out.println("a bite?"); return 1;    }

PAR 3
  A: boolean frighten(int x) { System.out.println("arrrgh");  return false; }
  B: boolean scare(int x)    { System.out.println("a bite?"); return true;  }

PAR 4
  A: boolean frighten(int z)  { System.out.println("arrrgh");  return true; }
  B: boolean frighten(byte b) { System.out.println("a bite?"); return true; }
```

### Qué tenés que entregar (las DOS mitades, por cada par)

Para CADA uno de los 4 pares:
1. ¿Compila? Sí / No — y si no, POR QUÉ (qué regla rompe).
2. Si compila: ¿qué imprime EXACTAMENTE, línea por línea? ¿Coincide con la
   salida pedida? ¿Por qué?

Al final: cuáles pares cumplen las dos cosas.

## MI RESPUESTA

PAR 1: El par 1 compila no rompe ninguna regla porque se está sobreescribiendo el método en cada clase de manera correcta, imprime exactamente 
a bite?
breathe fire
arrrgh
coincide con la salida pedida, porque una ves el compilador mira la referencia y se asegura que el método exista JVM ejecuta el método correspondiente
para el arreglo monsters en la posición 0 es de tipo Vampiro y tiene el método sobreescrito que da como salida a bite?
en la posición 1 es de tipo Dragon y el método se sobreescribe dando como salida breathe fire
en la posicion 2 es de tipo Monster y no sobreescribe el método es de donde nace, y da como sálida arrrgh

PAR 2: el par 2 no compila, está rompiendo la regla del tipo del método, debe ser de tipo boolean
si arreglamos el método haciendolo de tipo boolean y el return de tipo boolean nos deja compilar el programa
como salida nos daria la salida pedida porque son los métodos sobreescritos del par 1.
imprime
a bite?
breathe fire
arrrgh

PAR 3: el par 3 compila, no rompe ninguna regla porque Vampire no tiene explicitamente el método sobreescrito, lo hereda y usa el de Monster
la salida es: 
arrrgh
breathe fire
arrrgh
la linea uno sale del método de Vampire que lo hereda de Monster al no sobreescribirlo da la salida como la heredó.
la linea 2 es sobreescrito por Dragon y da como salida breathe fire
la linea 3 es la propia de la clase Moster y ejecuta esa misma arrrgh

PAR 4: El par 4 compila, no rompe ninguna regla, Vampire está sobrecargando el método, si se le pasa el como argumento un int toma el método de Monster, si toma como argumento un byte toma el método de Vampire
la salida es 
arrrgh
breathe fire
arrrgh
como estamos pasando en el for un int, va a dar el mismo resultado del par 3, porque está tomando el método que no sobreesbrió de Monster es decir ejecuta tal cual lo heredó.

Pares que compilan Y dan la salida pedida:

---

PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):

/entrega Hice el REPASO r1 del ejercicio del libro lib27 BE the Compiler
"Monster/Vampire" (pág. 533-535), está en ejercicios/repasos/lib27-r1.md.
Corregí mis respuestas y comparalas con las del original.
