# lib27 — BE the Compiler (Sé el compilador): Monster / Vampire (pág. 533-535, Sesión #98)

Si te trabás: revisá las Sesiones #95-#98 de la guía (arreglos polimórficos,
reglas para sobrescribir, sobrecarga).
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
   salida pedida?

Al final: cuáles pares cumplen las dos cosas.

## MI RESPUESTA

PAR 1:

PAR 2:

PAR 3:

PAR 4:

Pares que compilan Y dan la salida pedida:

---

PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):

/entrega Hice el ejercicio del libro lib27 BE the Compiler "Monster/Vampire"
(pág. 533-535). Mi respuesta está en ejercicios/lib27-be-the-compiler-monster.md.
