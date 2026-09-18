# lib23 — REPASO r1 — Sharpen your pencil: contar el árbol Doctor / Surgeon / FamilyDoctor

**Origen:** Head First Java, pág. 482 (Sesión #88 de GUIA-JAVA.md)
**Si te trabás:** revisá la Sesión #88 y la #87 de GUIA-JAVA.md
**Checklist:** ToDo/entregar-un-ejercicio.md (Nivel 1 y Nivel 2)

Resolvelo DESDE CERO, sin mirar tu versión anterior.

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
   
   R/ Tiene 1 variable de instancia llamada worksAtHospital()

2. How many instance variables does Surgeon have?
   (¿Cuántas variables de instancia tiene Surgeon?)

   R/ Tiene 1 variable de instancia que hereda de Doctor y es worksAtHospital()

3. How many instance variables does FamilyDoctor have?
   (¿Cuántas variables de instancia tiene FamilyDoctor?)

   R/ Tiene 1 variable de instancia que hereda de Doctor y es worksAtHospital()

4. How many methods does Doctor have?
   (¿Cuántos métodos tiene Doctor?)

   R/ tiene 1 método llamado treatPatient()

5. How many methods does Surgeon have?
   (¿Cuántos métodos tiene Surgeon?)

   R/ Tiene dos métodos, treatPatient() pero cambia la forma del comportamiento del método es decir lo hereda pero tiene instrucciones adicionales o diferentes, y 
   tiene el método makeIncision() este método es único de la clase Surgeon.

6. How many methods does FamilyDoctor have?
   (¿Cuántos métodos tiene FamilyDoctor?)

   R/ Tiene 3 métodos, treatPatient() heredado de Doctor, makesHouseCalls() y giveAdvice() que son exclusivos de esta clase

7. Can a FamilyDoctor do treatPatient()?
   (¿Puede un FamilyDoctor hacer treatPatient()?)
   R/ Sí, ya que lo hederó de Doctor, y como no ha hecho sus propias instrucciones tendrá el mismo comportamiento tal cual lo heredó.

8. Can a FamilyDoctor do makeIncision()?
   (¿Puede un FamilyDoctor hacer makeIncision()?)
   R/ No, solo Surgeon puede hacerlo, en el arbol nunca sube la herencia solo baja.

En las preguntas 7 y 8, además del sí/no, escribí POR QUÉ en una línea.

---


---

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

```
/entrega Hice el REPASO r1 del ejercicio del libro lib23 "Sharpen your pencil:
contar el árbol Doctor/Surgeon/FamilyDoctor" (pág. 482), está en
ejercicios/repasos/lib23-r1.md. Corregí mis respuestas y comparalas con las
del original.
```
