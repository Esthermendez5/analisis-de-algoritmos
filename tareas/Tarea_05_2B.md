![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  
# Contenido Semanal: Análisis de Algoritmos 🧠💻
## 📅 Semana 5

### 🔸 2.2 Notación Omega (Ω) ⏬

La **notación Omega** representa la cota inferior del tiempo de ejecución de un algoritmo, es decir, el tiempo mínimo que puede tardar.

**En resumen:** La notación omega representa un límite inferior para la tasa de crecimiento del tiempo de ejecución de un algoritmo. Describe el escenario ideal.

📌 Ejemplo: Buscar un elemento en un arreglo y encontrarlo en la primera posición.
```
public class BusquedaMejorCaso {

    public static int buscarElemento(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i; // Lo encontró en la primera posición (mejor caso)
            }
        }
        return -1; // No se encontró
    }

    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 9, 11, 13};
        int resultado = buscarElemento(numeros, 3); // El 3 está al inicio
        System.out.println("Elemento encontrado en la posición: " + resultado);
    }
}
```

---

### 🔸 2.3 Notación Theta (Θ) ➖

La **notación Theta** representa el caso promedio, o una función que acota el tiempo de ejecución por arriba y por abajo.
**En resumen:** La notación theta representa tanto los límites superior como inferior. Proporciona un límite preciso para la tasa de crecimiento.

📌 Ejemplo: Recorrer todo el arreglo sin importar la posición del elemento.
```
public class RecorridoCompleto {

    public static void mostrarElementos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + arreglo[i]);
        }
    }

    public static void main(String[] args) {
        int[] datos = {10, 20, 30, 40, 50};
        mostrarElementos(datos); // Siempre recorre todos los elementos
    }
}

```

---

### 🔸 2.4 Notación asintótica condicional 📊

Este tipo de análisis asume ciertas condiciones o supuestos sobre la entrada para describir el rendimiento.

Las notaciones Big O, Omega y Theta ofrecen una perspectiva única sobre el comportamiento de un algoritmo. Big O arroja luz sobre los límites superiores, advirtiendo a los ingenieros sobre los peores escenarios, mientras que Omega la complementa revelando los límites inferiores o los mejores escenarios. La notación Theta aporta equilibrio al proporcionar una comprensión precisa y precisa de la tasa de crecimiento de un algoritmo. 

📌 Ejemplo: Si sabemos que los datos están parcialmente ordenados, podríamos asumir que el algoritmo de ordenamiento tiene mejor rendimiento bajo esa condición.

---
### 📊 Comparación Visual entre Notaciones

| **Notación** | **Significado**              | **Caso Representado**  | **Ejemplo**                    |
|--------------|-------------------------------|--------------------------|-------------------------------|
| `Ω(n)`       | Cota inferior (mínimo)        | Mejor caso               | Encontrar el primer elemento  |
| `Θ(n)`       | Cota ajustada (exacto)        | Comportamiento promedio  | Recorre toda la lista siempre |
| `O(n)`       | Cota superior (máximo)        | Peor caso                | No encuentra el elemento      |

🧠 *Recuerda:*  
- **O(n)** es lo peor que puede pasar.  
- **Ω(n)** es lo mejor que puede pasar.  
- **Θ(n)** es lo que ocurre **en promedio o siempre**.

---