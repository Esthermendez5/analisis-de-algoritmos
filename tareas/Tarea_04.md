# 🌟 Tarea 04
## 📊 Semana 4

### 2.1. Notación para el "orden de"

#### 🎯 ¿Qué es la Notación Big-O?

La **notación Big-O** (O-grande) describe el **crecimiento asintótico** de una función. Nos dice cómo se comporta un algoritmo cuando el tamaño del input se vuelve muy grande.

#### 📐 Definición Matemática

> f(n) = O(g(n)) si existen constantes c > 0 y n₀ ≥ 0 tales que:
> 
> **f(n) ≤ c × g(n) para todo n ≥ n₀**

#### 🎨 Interpretación Visual

```
    f(n)
     ↑
     |     c×g(n) ← Función cota superior
     |    /
     |   /
     |  /── f(n) ← Nuestra función
     | /
     |/
n₀───+────────→ n
```

#### 🏆 Jerarquía de Complejidades (de mejor a peor)

| Notación | Nombre | Ejemplo | Descripción |
|----------|--------|---------|-------------|
| **O(1)** | Constante | Acceso a array | ⚡ Súper rápido |
| **O(log n)** | Logarítmica | Búsqueda binaria | 🔥 Muy rápido |
| **O(n)** | Lineal | Búsqueda lineal | ✅ Bueno |
| **O(n log n)** | Lineal-logarítmica | Merge sort | 📊 Aceptable |
| **O(n²)** | Cuadrática | Bubble sort | ⚠️ Lento |
| **O(n³)** | Cúbica | Multiplicación de matrices | 🐌 Muy lento |
| **O(2ⁿ)** | Exponencial | Problema de la mochila | 💀 Intratable |

#### 📈 Gráfica Comparativa

```
Tiempo
  ↑
  |                    O(2ⁿ) ← Exponencial
  |                  /
  |               O(n³) ← Cúbica
  |            /
  |        O(n²) ← Cuadrática
  |      /
  |   O(n log n) ← Lineal-log
  | O(n) ← Lineal
  |O(log n) ← Log
  |O(1) ← Constante
  +──────────────────→ n
```

#### 💡 Ejemplos Prácticos

**🔍 O(1) - Acceso Directo:**
```java
public static int getFirstElement(int[] arr) {
    return arr[0];  // Siempre 1 operación
}
```

**🔍 O(n) - Búsqueda Lineal:**
```java
public static boolean linearSearch(int[] arr, int target) {
    for (int item : arr) {  // En el peor caso, n operaciones
        if (item == target) {
            return true;
        }
    }
    return false;
}
```

**🔍 O(n²) - Búsqueda de Duplicados:**
```java
public static boolean hasDuplicates(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {  // Bucle anidado
            if (arr[i] == arr[j]) {
                return true;
            }
        }
    }
    return false;
}
```

#### 🎯 Reglas para Calcular Big-O

1. **Descartar constantes**: O(3n) → O(n)
2. **Quedarse con el término dominante**: O(n² + n) → O(n²)
3. **Los bucles anidados se multiplican**: O(n × n) = O(n²)
4. **Los bucles secuenciales se suman**: O(n + m) = O(n + m)