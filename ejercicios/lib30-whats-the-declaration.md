# LIBRO — Exercise: "What's the Declaration?" (¿Cuál es la declaración?) — pág. 617

Si te trabás: revisá las Sesiones #111, #112 y #113 de la guía.

## ENUNCIADO

Es el ejercicio AL REVÉS del anterior (lib29): ahora te dan el DIBUJO y
tenés que escribir las declaraciones Java válidas. El libro resolvió el
1 ("and it was a tough one" = y fue uno difícil — es un chiste: era el
más fácil).

### La clave (key) del dibujo

- Flecha SÓLIDA hacia arriba = **extends**.
- Flecha PUNTEADA hacia arriba = **implements**.
- Caja con nombre normal = **class**.
- Caja con nombre en *cursiva* = **interface**.
- Caja GRIS = **abstract class**.

### Ejemplo resuelto (el 1 del libro)

Dibujo: caja `Click` (clase común) arriba; caja `Clack` (clase común)
abajo, con flecha SÓLIDA de Clack hacia Click.

    public class Click { }
    public class Clack extends Click { }

### Los que te tocan (cada dibujo descripto en palabras; míralo también en el libro)

2. Caja `Top` GRIS arriba. Caja `Tip` (nombre normal) abajo, con flecha
   SÓLIDA de Tip hacia Top.

3. Caja `Fee` GRIS arriba. Caja `Fi` también GRIS abajo, con flecha
   SÓLIDA de Fi hacia Fee.

4. Tres cajas en columna:
   - `Foo` arriba, con el nombre en CURSIVA.
   - `Bar` al medio (nombre normal), con flecha PUNTEADA de Bar hacia Foo.
   - `Baz` abajo (nombre normal), con flecha SÓLIDA de Baz hacia Bar.

5. Cuatro cajas:
   - `Zeta` arriba, nombre en CURSIVA.
   - `Alpha` debajo de Zeta (nombre normal), con flecha PUNTEADA de Alpha hacia Zeta.
   - `Beta` a la izquierda, nombre en CURSIVA.
   - `Delta` abajo de todo (nombre normal), con DOS flechas que salen de
     ella: una SÓLIDA hacia Alpha y una PUNTEADA hacia Beta.

Escribí UNA línea de declaración por cada caja (con `public`, el tipo
correcto y las llaves vacías `{ }`, como en el ejemplo). No hace falta
compilar.

## MI RESPUESTA

2.


3.


4.


5.


---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

/entrega Ejercicio del libro "What's the Declaration?" (pág. 617). Mi respuesta está en ejercicios/lib30-whats-the-declaration.md
