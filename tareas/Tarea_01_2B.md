![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  

# Contenido Semanal: Análisis de Algoritmos 🧠💻  

## 📅 Semana 1: Algoritmos Voraces – Parte I
![Dijkstra Example](https://madi.nekomath.com/_static/logo.png)
### 🔸 4.1 Características de los Algoritmos Voraces

Los algoritmos voraces siguen una estrategia simple: en cada paso, eligen la mejor opción **localmente** con la esperanza de que esta decisión lleve a una solución **óptima global**.

#### ✨ Características principales:
- **Simplicidad y rapidez**: Son fáciles de implementar y entender.
- **Resolución de problemas de optimización**.
- **No siempre óptimos globalmente**, pero útiles para soluciones rápidas y razonables.
- **Heurísticas de decisión** en cada paso.

#### ✅ Ventajas:
- Eficiencia en tiempo.
- Implementación directa.
- En algunos casos, logran la solución óptima.

#### ❌ Desventajas:
- No siempre aseguran la mejor solución global.
- Dependen mucho de la estrategia de selección.

---

### 🔸 4.2 Algoritmos Voraces en Grafos No Dirigidos 🌐
![Dijkstra Example](https://www.wextensible.com/temas/voraces/ejemplos/arbol-recubrimiento-minimo.png)


Los algoritmos voraces son ampliamente utilizados en la búsqueda de árboles de recubrimiento mínimo.

#### 🌲 Algoritmo de Kruskal:
- Ordena las aristas por peso.
- Agrega la arista más ligera, evitando ciclos.
- Continua hasta conectar todos los vértices.

📌 *Ejemplo:* Conectar varias ciudades minimizando el costo de construcción de carreteras.

#### 🌲 Algoritmo de Prim:
- Parte de un vértice.
- Agrega aristas más baratas que conecten con nuevos nodos.

📌 *Ejemplo:* Creación de redes eléctricas eficientes.
