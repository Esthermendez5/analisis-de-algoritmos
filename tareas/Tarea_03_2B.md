![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## 👩‍🏫 Análisis de Algoritmos  
### 👤 Nombre: Esther Méndez  
### 📘 Segundo Bimestre  

# Contenido Semanal: Análisis de Algoritmos 🧠💻 
## 🗓️ Semana 3: Algoritmos Divide y Vencerás – Parte 1 ⚔️📐  
📌 Tema: **5.1 Búsqueda Binaria**

---

### 🔍 ¿Qué es un algoritmo "Divide y Vencerás"?  
Es una técnica que consiste en **dividir un problema en subproblemas más pequeños**, resolverlos de manera recursiva y **combinar sus soluciones**.  

🧠 Se aplica cuando un problema puede **fragmentarse en partes similares** al original.

---

## 📦 Tema 5.1: Búsqueda Binaria 🔍📊  
![Dijkstra Example](https://somoshackersdelaprogramacion.es/wp-content/uploads/2022/05/busqueda-binaria.png)


La **búsqueda binaria** es un algoritmo eficiente para encontrar un elemento en una **lista ordenada**.

✅ Divide el arreglo a la mitad en cada paso.  
✅ Reduce el tiempo de búsqueda de **O(n)** a **O(log n)**.  

---

### 🧪 Ejemplo en Java: Búsqueda Binaria

```java
public class BusquedaBinaria {
    // Método iterativo
    public static int buscar(int[] arr, int x) {
        int inicio = 0, fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == x)
                return medio;
            if (arr[medio] < x)
                inicio = medio + 1;
            else
                fin = medio - 1;
        }
        return -1; // No encontrado
    }

    public static void main(String[] args) {
        int[] datos = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int valorBuscado = 23;

        int resultado = buscar(datos, valorBuscado);
        if (resultado == -1)
            System.out.println("❌ Elemento no encontrado");
        else
            System.out.println("✅ Elemento encontrado en el índice: " + resultado);
    }
}
🧮 Salida esperada:
✅ Elemento encontrado en el índice: 5
```
## ⚖️ Comparación entre Búsqueda Binaria y Búsqueda Lineal

| 🔍 Tipo de Búsqueda    | ⏱️ Complejidad Temporal | 🚀 Ventajas                          | 🔃 Requiere Ordenamiento |
|------------------------|--------------------------|--------------------------------------|---------------------------|
| 🔎 Búsqueda Lineal     | O(n)                     | Funciona en listas no ordenadas     | ❌ No                    |
| 📐 Búsqueda Binaria    | O(log n)                 | Mucho más rápida si la lista está ordenada | ✅ Sí               |

### 🧠 Conclusión:

- **Búsqueda Lineal**: Recorre todos los elementos hasta encontrar el objetivo o llegar al final.
- **Búsqueda Binaria**: Divide el conjunto de datos a la mitad en cada paso, acelerando la búsqueda significativamente, pero **solo si** el arreglo está ordenado previamente.


