![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  
# Contenido Semanal: Análisis de Algoritmos 🧠💻
# 📅 Semana 4: Algoritmos Divide y Vencerás
## 🔢 5.2 Ordenación
![Dijkstra Example](https://cdn.goconqr.com/uploads/node/image/93464809/desktop_b554f9e9-aedc-48cf-9039-a01e651e4f09.jpg)


### 🧩 ¿Qué es un algoritmo de ordenación?

Un algoritmo de ordenación es aquel que organiza una colección de datos (como números o palabras) siguiendo un criterio específico (por ejemplo, de menor a mayor).

El enfoque **divide y vencerás** es especialmente útil para este tipo de problemas, ya que divide el conjunto de datos en partes más pequeñas, las ordena y luego las une.

---

### 📌 Principales algoritmos de ordenación por divide y vencerás

| 🛠️ Algoritmo         | 🧠 Idea principal                        | ⏱️ Complejidad promedio | 💬 Comentario breve                    |
|----------------------|------------------------------------------|--------------------------|----------------------------------------|
| 🌀 Merge Sort         | Divide en mitades, ordena y combina      | O(n log n)               | Estable, muy eficiente                 |
| 🔀 Quick Sort         | Escoge un pivote, divide y ordena        | O(n log n)               | Muy rápido en la práctica              |

---

### 📚 Ejemplo práctico en Java – Merge Sort

```java
public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) return;

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) left[i] = array[i];
        for (int i = mid; i < array.length; i++) right[i - mid] = array[i];

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length)
            result[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];

        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] nums = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(nums);
        for (int num : nums) System.out.print(num + " ");
    }
}
```
### 🎯 Conclusión
Los algoritmos de ordenación basados en "divide y vencerás" son muy eficientes para grandes volúmenes de datos.

- Merge Sort es muy confiable y estable.

- Quick Sort es más rápido en promedio pero no garantiza estabilidad.

💡 Divide y vencerás es como organizar un cuarto desordenado: primero organizas por zonas pequeñas (ropa, libros, etc.), y luego juntas todo en orden.

### 📊 Comparación visual: Merge Sort vs Quick Sort

| ⚙️ Característica         | 🌀 Merge Sort                             | 🔀 Quick Sort                              |
|--------------------------|-------------------------------------------|--------------------------------------------|
| 📚 Método                | Divide y mezcla                           | Divide y conquista con pivote              |
| 🧠 Estrategia             | Divide en mitades, ordena, y combina       | Escoge un pivote, particiona y ordena      |
| ⏱️ Complejidad (promedio) | O(n log n)                                | O(n log n)                                 |
| ⏱️ Complejidad (peor caso)| O(n log n)                                | O(n²) (cuando el pivote es mal elegido)    |
| 🧪 Estabilidad           | ✅ Sí (mantiene el orden de iguales)       | ❌ No necesariamente estable                |
| 💾 Uso de memoria        | 🧠 Más memoria (usa arrays temporales)     | 💡 Menos memoria (en el lugar)             |
| 💻 Rendimiento en práctica| Algo más lento por copias de arrays        | Rápido, especialmente para grandes datos   |
| ✔️ Ideal para            | Datos grandes y cuando se necesita estabilidad | Rendimiento puro, si no importa la estabilidad |

🔎 *Resumen:*  
- **Merge Sort** es más **estable** y predecible.
- **Quick Sort** es más **rápido**, pero **riesgoso** en su peor caso.