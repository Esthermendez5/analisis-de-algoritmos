![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  

# Contenido Semanal:

# 📚 Semana 7 – Análisis de Algoritmos  
### Universidad Técnica Particular de Loja 🏛️  
### Asignatura: Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  

---

## 🔸 3.2 Análisis del Caso Medio ⚖️

El **análisis del caso medio** evalúa el comportamiento promedio de un algoritmo considerando todas las entradas posibles con igual probabilidad.

A diferencia del **caso peor**, que considera el escenario más desfavorable, y el **caso mejor**, que analiza el más favorable, el **caso medio** se centra en una situación típica o promedio.

### 📌 Ejemplo: Búsqueda Lineal en Java

```
public class BusquedaLineal {
    public static int buscar(int[] arr, int clave) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == clave) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] datos = {3, 7, 11, 18, 21, 29};
        int resultado = buscar(datos, 18);
        System.out.println("Elemento encontrado en índice: " + resultado);
    }
}
```

🔍 En el mejor caso (elemento al inicio): O(1)
🔍 En el peor caso (elemento no está): O(n)
🟢 En el caso medio: en promedio se recorren n/2 elementos → O(n)

---

### 🔸 3.3 Análisis Amortizado 📊
El análisis amortizado evalúa el costo promedio de una operación en una secuencia de operaciones, incluso si algunas son más costosas que otras.

🔧 Muy útil en estructuras dinámicas como ArrayList, pilas, colas o tablas hash, donde ciertas operaciones ocasionalmente requieren mucho tiempo (como redimensionar un array).

📌 Ejemplo: Inserciones en un ArrayList en Java

```
import java.util.ArrayList;

public class Amortizado {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(i);
            System.out.println("Elemento agregado: " + i + " | Tamaño actual: " + lista.size());
        }
    }
}
```

📌 Aunque ocasionalmente se redimensiona el arreglo (costo O(n)), la mayoría de las inserciones tienen un costo constante (O(1)).
🟢 El costo amortizado por operación sigue siendo O(1).

---

### 🔸 3.4 Recurrencias 🔁
Las recurrencias son fórmulas que describen el tiempo de ejecución de algoritmos recursivos.
Son esenciales en análisis de algoritmos que usan la técnica divide y vencerás.

📘 Un ejemplo típico de recurrencia es:

```
T(n) = 2T(n/2) + n

```

Este patrón aparece en algoritmos como Merge Sort, donde el problema se divide en dos partes y luego se combinan los resultados.

📌 Ejemplo: Merge Sort en Java


```
    public static void mergeSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int medio = (izq + der) / 2;
            mergeSort(arr, izq, medio);
            mergeSort(arr, medio + 1, der);
            merge(arr, izq, medio, der);
        }
    }

    public static void merge(int[] arr, int izq, int medio, int der) {
        int n1 = medio - izq + 1;
        int n2 = der - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[izq + i];
        for (int j = 0; j < n2; j++) R[j] = arr[medio + 1 + j];

        int i = 0, j = 0, k = izq;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] datos = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(datos, 0, datos.length - 1);

        System.out.print("Arreglo ordenado: ");
        for (int num : datos) System.out.print(num + " ");
    }
}
```

📌 Recurrencia: T(n) = 2T(n/2) + n → Tiempo total: O(n log n)

---

📊 Comparación Visual – Semana 7

| 🧠 Concepto              | ¿Qué analiza?                                        | 📌 Ejemplo Java                | ⏱️ Complejidad          |
|--------------------------|------------------------------------------------------|-------------------------------|--------------------------|
| **Caso Medio**           | Rendimiento promedio en entradas típicas             | Búsqueda lineal               | `O(n)`                   |
| **Análisis Amortizado**  | Promedio en secuencia de operaciones                 | Inserciones en `ArrayList`    | `O(1)` amortizado        |
| **Recurrencias**         | Coste de algoritmos recursivos                       | Algoritmo `MergeSort`         | `O(n log n)`             |


---

### ✅ Resumen Semana 7
🔍 Caso medio es útil para estimar un rendimiento típico.

⏳ Análisis amortizado se enfoca en el costo a lo largo del tiempo, ideal para estructuras dinámicas.

🔁 Recurrencias nos ayudan a entender la eficiencia de algoritmos recursivos, especialmente los que dividen y conquistan.