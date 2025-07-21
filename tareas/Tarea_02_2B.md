![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  
# Contenido Semanal: Análisis de Algoritmos 🧠💻
## 📅 Semana 2: Algoritmos Voraces – Parte II

### 🔸 4.3 Algoritmos Voraces en Grafos Dirigidos ➡️
![Dijkstra Example](https://www.wextensible.com/temas/voraces/ejemplos/dijkstra.png)

Los grafos dirigidos se utilizan especialmente para encontrar **caminos mínimos** entre nodos.

Un **grafo dirigido** o **dígrafo** contiene **aristas con dirección**. Es decir, una conexión de `A ➡ B` no implica que exista una conexión de `B ➡ A`.

Estos grafos son útiles en problemas donde **el sentido importa**, como en:

- 📍 Mapas de navegación (una vía)
- 🔁 Flujos de redes
- 🔗 Dependencias entre tareas

#### 🛣️ Algoritmo de Dijkstra:
![Dijkstra Example](https://www.wextensible.com/temas/voraces/ejemplos/grafo-dirigido.png)

El **algoritmo de Dijkstra** encuentra el **camino más corto** desde un nodo origen hasta todos los demás en un grafo dirigido con **pesos no negativos**.

🧠 Estrategia voraz:  
Selecciona el **nodo con menor distancia conocida** y actualiza las distancias a sus vecinos.

- Determina el camino más corto desde un nodo origen a todos los demás nodos.

- Utiliza una cola de prioridad para elegir el nodo con menor distancia provisional.

- No funciona con pesos negativos.

📌 Ejemplo: Encontrar la ruta más corta entre dos ciudades considerando distancias en kilómetros.

#### 🧠 Proceso paso a paso:
1. Inicializa todas las distancias como infinitas excepto el nodo de inicio (distancia = 0).

2. Marca el nodo de inicio como visitado.

3. Para cada vecino del nodo actual, actualiza la distancia si es menor que la ya registrada.

4. Selecciona el siguiente nodo con menor distancia no visitado.

5. Repite hasta visitar todos los nodos.

✅ Es muy utilizado en mapas GPS, routers de red y videojuegos.
#### 🧠 Conclusión
Los grafos dirigidos amplían las posibilidades de análisis y resolución de problemas reales como rutas, redes y flujos.
Usar un algoritmo voraz como Dijkstra es clave cuando necesitas eficiencia sin sacrificar precisión (siempre que los pesos no sean negativos).

##### 🚦 Importante:

Dijkstra no funciona bien con pesos negativos.

Para eso, se usa Bellman-Ford.