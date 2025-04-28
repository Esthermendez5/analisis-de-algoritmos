# 🚀 Tarea 02 - Eficiencia de Algoritmos y Caso Medio 🚀

---

## 1.2 📈 Eficiencia de los algoritmos

La **eficiencia de un algoritmo** se refiere a su capacidad de realizar su tarea usando **la menor cantidad posible de recursos**, principalmente:

- ⏱️ **Tiempo de ejecución**
- 💾 **Espacio en memoria**

Un algoritmo eficiente resuelve el problema **más rápido y con menos uso de memoria**, lo cual es crucial en aplicaciones del mundo real donde el tiempo y los recursos son limitados.

### ✅ Factores que afectan la eficiencia:
- El **tamaño** de la entrada (número de datos que recibe).
- La **complejidad** de las operaciones realizadas.
- El **tipo de operaciones** (accesos a disco, cálculos, llamadas a red, etc.).

### 🌟 Ejemplo simple:

Supongamos que queremos buscar un número en una lista:

- **Búsqueda lineal**: Recorre uno por uno → eficiencia baja en listas grandes (O(n)).
- **Búsqueda binaria**: Divide a la mitad cada vez → mucho más eficiente en listas ordenadas (O(log n)).

| Algoritmo          | Eficiencia |
|--------------------|------------|
| Búsqueda lineal    | O(n)       |
| Búsqueda binaria   | O(log n)   |

---

## 1.3 ⚖️ Caso medio

El **caso medio** (o **average case**) representa **el comportamiento esperado** de un algoritmo cuando se ejecuta sobre una entrada **típica o promedio**.

- No es el peor ni el mejor escenario, sino un valor intermedio basado en suposiciones sobre la distribución de entradas.
- Sirve para dar una estimación realista del rendimiento cotidiano del algoritmo.

### ✅ Características:
- Suele basarse en **probabilidades** (si todas las entradas son igualmente probables).
- Es importante para aplicaciones donde las condiciones extremas no son comunes.

### 🌟 Ejemplo simple:

En la **búsqueda lineal** de un número en una lista de `n` elementos:

- **Peor caso:** encontrarlo en la última posición (n comparaciones).
- **Mejor caso:** encontrarlo en la primera posición (1 comparación).
- **Caso medio:** encontrarlo en la mitad (n/2 comparaciones en promedio).

> 🎯 Por eso, el **caso medio** de la búsqueda lineal se considera O(n).

---

> 👩‍💻 **Estudiante:** Esther Méndez  
> 🏫 **Materia:** Análisis de Algoritmos
