# 🌟 Tarea 03
## 📖 Semana 3

### 1.4. Caso Peor

#### 🎯 ¿Qué es el Caso Peor?

El **caso peor** (worst case) representa el escenario donde un algoritmo requiere el **máximo número de operaciones** para resolver un problema de tamaño *n*. Es como prepararse para la situación más difícil posible.

#### 📈 Características del Caso Peor

- **Garantiza un límite superior**: Sabemos que el algoritmo NUNCA tardará más que esto
- **Es pesimista**: Asume la peor situación posible
- **Útil para sistemas críticos**: Donde necesitamos garantías de tiempo

#### 💡 Ejemplos Prácticos

**🔍 Búsqueda Lineal:**
```java
int[] array = {1, 2, 3, 4, 5};
int target = 5; // último elemento
```
- **Caso peor**: El elemento está al final o no existe
- **Operaciones**: n comparaciones

**📊 Ordenamiento Burbuja:**
```java
int[] array = {5, 4, 3, 2, 1}; // orden inverso
```
- **Caso peor**: Array completamente desordenado
- **Operaciones**: n(n-1)/2 comparaciones

#### 🎨 Visualización del Caso Peor

```
Tiempo de Ejecución
        ↑
        |     ← Caso Peor (línea roja)
        |   /
        | /     ← Caso Promedio
        |/
        +-------→ Tamaño del Input (n)
```

#### ⚡ Importancia en la Práctica

- **Sistemas en tiempo real**: Aviones, marcapasos
- **Servidores web**: Garantizar tiempos de respuesta
- **Algoritmos de seguridad**: Prevenir ataques de denegación de servicio

---

### 1.5. Operación Elemental

#### 🧱 ¿Qué es una Operación Elemental?

Una **operación elemental** es la **unidad básica de trabajo** que un algoritmo puede realizar. Es como el "átomo" de la computación en nuestro análisis.

#### 🔧 Características de las Operaciones Elementales

- **Tiempo constante**: Siempre toman el mismo tiempo
- **Indivisibles**: No se pueden descomponer más
- **Independientes del tamaño**: Su costo no depende de *n*

#### 📝 Ejemplos de Operaciones Elementales

| Operación | Ejemplo de Código | Tiempo |
|-----------|-------------------|---------|
| **Asignación** | `int x = 5;` | O(1) |
| **Comparación** | `if (a > b)` | O(1) |
| **Operación Aritmética** | `int sum = a + b;` | O(1) |
| **Acceso a Array** | `arr[i]` | O(1) |
| **Llamada a Método** | `System.out.println(x);` | O(1) |

#### 🎯 ¿Qué NO son Operaciones Elementales?

- **Bucles**: `for`, `while` (pueden ejecutarse n veces)
- **Llamadas recursivas**: Pueden generar múltiples operaciones
- **Operaciones en estructuras complejas**: Ordenar un array

#### 💻 Ejemplo de Conteo

```java
public static int busquedaLineal(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {    // 1 operación (inicialización)
        if (arr[i] == target) {              // 2 operaciones por iteración
            return i;                        // 1 operación
        }
    }
    return -1;                               // 1 operación
}

// Total en caso peor: 1 + 2n + 1 = 2n + 2 operaciones elementales
```

#### 🎨 Visualización del Conteo

```
Algoritmo: Suma de Array
┌─────────────────────────────────┐
│ int sum = 0;      ← 1 operación │
│ for (int i = 0; i < n; i++) ← n operaciones (control del bucle) │
│   sum += arr[i];  ← 2n operaciones (acceso + suma) │
│ return sum;       ← 1 operación │
└─────────────────────────────────┘
Total: 1 + n + 2n + 1 = 3n + 2 operaciones
```