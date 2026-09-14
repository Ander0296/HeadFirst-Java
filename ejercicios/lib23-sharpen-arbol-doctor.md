# lib23 — Sharpen your pencil: contar el árbol Doctor / Surgeon / FamilyDoctor

**Origen:** Head First Java, pág. 482 (Sesión #88 de GUIA-JAVA.md)
**Si te trabás:** revisá la Sesión #88 y la #87 de GUIA-JAVA.md

---

## ENUNCIADO

Tenés este árbol de herencia (es el dibujo de la página 482):

```
                    Doctor
              ┌──────────────────┐
              │ worksAtHospital  │
              ├──────────────────┤
              │ treatPatient()   │
              └────────△─────────┘
                   ┌───┴────┐
            ┌──────┴─────┐  ┌┴───────────────┐
            │  Surgeon   │  │  FamilyDoctor  │
            ├────────────┤  ├────────────────┤
            │treatPatient()│ │makesHouseCalls│
            │makeIncision()│ │giveAdvice()   │
            └────────────┘  └────────────────┘
```

Recordá: en un diagrama de herencia, la caja de una subclase muestra SOLO lo
que esa clase escribe. Lo heredado no se dibuja, pero está.

Contestá:

1. How many instance variables does Doctor have?
   (¿Cuántas variables de instancia tiene Doctor?)
   Tiene 1 warksAtHospital

2. How many instance variables does Surgeon have?
   (¿Cuántas variables de instancia tiene Surgeon?)
   TIene 1 instance variable, y es la que hereda de Doctor

3. How many instance variables does FamilyDoctor have?
   (¿Cuántas variables de instancia tiene FamilyDoctor?)
   Tiene 2 instance variables, la heredada de Doctor y makeHouseCalls

4. How many methods does Doctor have?
   (¿Cuántos métodos tiene Doctor?)
   Doctor tiene un método treatPatient()

5. How many methods does Surgeon have?
   (¿Cuántos métodos tiene Surgeon?)
   Sorgeon tiene dos métodos el heredado de Doctor y makeIncision()

6. How many methods does FamilyDoctor have?
   (¿Cuántos métodos tiene FamilyDoctor?)
   tiene 2, el heredado de Doctor y giveAdvice()

7. Can a FamilyDoctor do treatPatient()?
   (¿Puede un FamilyDoctor hacer treatPatient()?)
   Si, ya que usa el de Doctor, entonces la JVM la encuentra en la clase Doctor al ir subiendo en jerarquia.

8. Can a FamilyDoctor do makeIncision()?
   (¿Puede un FamilyDoctor hacer makeIncision()?)
   No, ese método es de Surgeon, entonces la JVM no encuentra ese método.

En las preguntas 7 y 8, además del sí/no, escribí POR QUÉ en una línea.

---


## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

```
/entrega Hice el ejercicio del libro lib23 "Sharpen your pencil: contar el
árbol Doctor/Surgeon/FamilyDoctor" (pág. 482), está en
ejercicios/lib23-sharpen-arbol-doctor.md. Corregí mis respuestas.
```
