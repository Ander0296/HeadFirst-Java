# REPASO r1 — CONCEPTO: "el compilador mira la referencia, la JVM mira el objeto"

Repaso desde cero. NO compiles nada: se resuelve leyendo el código y
razonando, como en una entrevista. Contestá CADA parte con su número, y
cada pregunta COMPLETA (si pide dos cosas, van las dos).

Si te trabás: revisá las Sesiones #91 y #94 de GUIA-JAVA.md.
Checklist: ToDo/entregar-un-ejercicio.md (Nivel 3: precisión de lo que decís).

## El código

Nombres: `Employee` (empleado), `Manager` (gerente), `Intern` (pasante),
`work()` (trabajar), `approveBudget()` (aprobar presupuesto),
`Office` (oficina).

```java
class Employee {
    void work() {
        System.out.println("Employee works");   // (El empleado trabaja)
    }
}

class Manager extends Employee {
    void work() {
        System.out.println("Manager works");    // (El gerente trabaja)
    }
    void approveBudget() {
        System.out.println("Budget approved");  // (Presupuesto aprobado)
    }
}

class Intern extends Employee {
}

public class Office {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.work();            // línea A
        e.approveBudget();   // línea B
    }
}
```

## PARTE 1 — ¿Compila?

¿Este programa compila, sí o no? Si no compila: decí QUÉ línea falla
(A o B), QUIÉN lo detecta (el compilador o la JVM) y QUÉ MIRA ese que lo
detecta para decidir que está mal.

El programa no compila, porque el compilador no encuentra el método approveBudget en la clase Employee es decir la linea B.



## PARTE 2 — Sin la línea que molesta

Borrá la línea que falla (si hay una) y dejá todo lo demás igual.
a) ¿Qué imprime el programa, exacto?
Se borra la linea B, e.approveBudget(), y al ejecutar el programa va a imprimir Manager works
b) ¿QUIÉN elige qué versión de `work()` corre (el compilador o la JVM), y
   QUÉ MIRA para elegirla?
El que elije que versión corre es la JVM al momento de crear el objeto y ejecutar el programa, cuando llega a la línea de work() analiza la clase
si el método está en la clase lo ejecuta, si no empieza a revisar en el arbol hasta donde encuentre el método.

## PARTE 3 — El arreglo

Ahora imaginá este `main` en lugar del anterior (las clases no cambian):

```java
Employee[] staff = new Employee[2];   // staff (personal)
staff[0] = new Manager();
staff[1] = new Intern();
for (Employee x : staff) {
    x.work();
}
```

a) ¿Compila? ¿Por qué sí o por qué no, nombrando QUÉ mira el compilador?
Si compila, para el compilador no hay errores de sintaxis, el método existe, y para él todo está bien. 
b) Si corre: escribí la salida EXACTA, en orden, línea por línea.
Corre :
Manager works
Employee works
c) Para `staff[1]` (el `Intern`, que no escribió ningún `work()`): ¿qué
   versión corre y por qué?
Corre la versión de Employee porque no está sobreescribiendo, lo heredó y lo usa tal cual está el método en Employee.

## PARTE 4 — La trampa

Cambiamos UNA sola cosa: le borramos el método `work()` a la clase
`Employee` (queda vacía: `class Employee { }`). `Manager` sigue igual.
Con el `main` de la PARTE 3:

a) ¿Compila? Sí o no, y QUIÉN decide eso.
No compila, lo decide el compilador al no encontrar el método work() en la clase Intern
b) Si no compila: ¿qué harías para arreglarlo SIN tocar el `main`?
Sin tocar el main lo que haría sería crear un método work() en la clase Intern, o volverlo a hacer en la clase que hereda Employee

## PARTE 5 — Con tus palabras

Escribí DOS oraciones, una que empiece con "El compilador..." y otra con
"La JVM...". Cada una tiene que decir QUÉ MIRA (qué tipo) y QUÉ DECIDE.
El compilador mira que el programa esté bien escrito,es decir la sintaxis, mira que todo esté bien en el código y que no sean instruciones que se vayan a crear
en el tiempo de ejecución, cuando todo esté listo se compila y crea los .class que son el bytecode que lee la jvm.
JVM ejecuta ese bytecode y si en las instrucciones se crean objetos y se llaman métodos el mira si esos objetos tienen esos métodos o si los hereda de otra clase.

## MI RESPUESTA

PARTE 1:

PARTE 2:

PARTE 3:

PARTE 4:

PARTE 5:

---

## PROMPT DE ENTREGA (copiar y pegar en Claude cuando termines)

/entrega Terminé el REPASO r1 del CONCEPTO "el compilador mira la
referencia, la JVM mira el objeto". Está en
ejercicios/repasos/concepto-compilador-vs-jvm-r1.md.
No lo compilé: lo razoné a mano, como pedía la consigna.
