![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  

# Contenido Semanal: Análisis de Algoritmos 🧠💻  
## 📅 Semana 6

### 🔸 3.1 Estructuras de control 🔁
![Dijkstra Example](https://keepcoding.io/wp-content/uploads/2024/09/imagen-103.png)

Las estructuras de control en programación son herramientas que hacen posible que los algoritmos sigan un flujo lógico de acontecimientos y que gestionen el comportamiento de un programa, dadas ciertas condiciones específicas. En el día de hoy queremos explicarte más a fondo qué son las estructuras de control, cómo funcionan, sus tipos y cómo puedes usarlas en programación.

Las estructuras de control (como condicionales, bucles y funciones) definen el flujo del algoritmo y afectan directamente su complejidad.

📌 Ejemplo: Un bucle **for** dentro de otro indica una complejidad cuadrática (O(n²)).

```java
// Bucle anidado = O(n^2)
public class ControlEstructuras {
    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4, 5};
        for (int i : datos) {
            for (int j : datos) {
                System.out.println(i + "," + j);
            }
        }
    }
}
```

🔎 Analizar el número de veces que se ejecutan estas estructuras ayuda a predecir la eficiencia.

# Tipos de estructuras de control
Las estructuras de control se dividen en tres categorías: secuenciales, condicionales e iterativas. Veamos en qué consiste cada una.

## Estructuras de control secuenciales
Las estructuras de control secuenciales son las más básicas. En este caso, las instrucciones se ejecutan una tras otra en el mismo orden en que están escritas. Piensa en este tipo de estructuras como una fila de acciones que siguen un patrón fijo. Estas son la base de cualquier algoritmo, en donde cada acción sigue a la anterior de modo predecible. Veamos un ejemplo en Javascript:
```
// Ejemplo en JavaScript
let nombre = "María";
let saludo = "Hola, " + nombre + "!";
console.log(saludo);
```

En este ejemplo, la primera línea asigna un valor a la variable nombre, luego se crea un saludo y finalmente se imprime en la consola. Todas las acciones ocurren en el orden en que fueron escritas.

--- 
## Estructuras de control condicionales

### Condicionales simples

Una estructura condicional simple ejecuta un bloque de código solo si una condición se cumple:
```
if (edad >= 18) {
    console.log("Eres mayor de edad.");
}
```
En este caso, si la variable edad es mayor o igual a 18, el programa imprimirá «Eres mayor de edad». Si no, simplemente saltará ese bloque de código.

--- 
### Condicionales dobles
Aquí se añaden dos posibles caminos: si la condición es verdadera, se ejecuta un bloque, y si es falsa, se ejecuta otro:
```
if (edad >= 18) {
    console.log("Puedes votar.");
} else {
    console.log("No puedes votar.");
}
```

Este código ofrece dos respuestas posibles, dependiendo del valor de la variable edad. Si es mayor, o tiene 18 años, aparecerá el mensaje «Puedes votar». De lo contrario, aparecerá el mensaje «No puedes votar».

--- 
### Condicionales múltiples
Las condicionales múltiples o anidadas se usan para evaluar más de dos condiciones, ya que nos permiten manejar varios casos y tomar decisiones más complejas. Veamos un ejemplo:
```
if (edad < 18) {
    console.log("No puedes votar.");
} else if (edad >= 70) {
    console.log("Votar es opcional.");
} else {
    console.log("Debes votar obligatoriamente.");
}
```

Aquí, dependiendo de la edad, el programa imprimirá uno de tres posibles mensajes:

- Si es menor de 18 años, aparecerá el mensaje «No puedes votar».
- Si es mayor, o tiene 70 años, aparecerá el mensaje «Votar es opcional».
- Si no se cumple ninguna de las dos condiciones anteriores (que sea menor de 18 años o tenga 70 o más), aparecerá el mensaje «Debes votar obligatoriamente».
---
### Estructuras de control iterativas
Las estructuras de control iterativas nos permiten repetir un conjunto de instrucciones varias veces. Se presenta cuando necesitamos realizar la misma acción en diferentes valores, o cuando no sabemos cuántas veces una condición será verdadera. Algunas de las más conocidas son:

--- 

### Bucle for
Este tipo de bucle for repite un bloque de código un número fijo de veces:
```
for (let i = 0; i < 5; i++) {
    console.log("Iteración " + i);
}
```

En este ejemplo el bucle imprimirá cinco veces el texto «Iteración», cambiando el valor de i en cada repetición.

---

### Bucle while
El bucle while sigue repitiendo un bloque de código mientras que una condición sea verdadera. Si no sabes de antemano cuántas veces se va a repetir una acción, debes usarlo:
```
let contador = 0;
while (contador < 5) {
    console.log("Contador: " + contador);
    contador++;
}
```
Este código imprimirá el valor de contador hasta que llegue a 5.

---