// ╔══════════════════════════════════════════════════════════════════════════════╗
// ║            Algoritmo de Prim con Prueba de Escritorio                         ║
// ╚══════════════════════════════════════════════════════════════════════════════╝
package funcion_prim;

import java.util.*;

class Arista {
    int origen, destino, peso;  // Nodos origen y destino, y peso de la arista

    /**
     * Constructor de la clase Arista
     */
    Arista(int origen, int destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    /**
     * Método toString personalizado para mostrar la arista
     * Convierte índices internos (0-5) a numeración humana (1-6)
     */
    @Override
    public String toString() {
        return "{" + (origen + 1) + "," + (destino + 1) + "}";
    }
}

/**
 * Clase principal que implementa el algoritmo de Prim
 * para encontrar el Árbol de Recubrimiento Mínimo
 */
public class Funcion_Prim  {
    static int V = 6; // Número total de vértices en el grafo
    
    // Lista de adyacencia: cada posición i contiene las aristas del nodo i
    static List<List<Arista>> grafo = new ArrayList<>();

    /**
     * Método principal - punto de entrada del programa
     */
    public static void main(String[] args) {
        // Inicializar las listas de adyacencia para cada nodo (0 a 5)
        for (int i = 0; i < V; i++) {
            grafo.add(new ArrayList<>());  // Crea una lista vacía para cada nodo
        }

        // Definir todas las aristas del grafo (nodos indexados desde 0)
        // Formato: agregarArista(nodo1, nodo2, peso)
        agregarArista(0, 1, 6);  // Arista entre nodo 1 y 2 (mostrado) con peso 6
        agregarArista(0, 2, 1);  // Arista entre nodo 1 y 3 (mostrado) con peso 1
        agregarArista(0, 3, 5);  // Arista entre nodo 1 y 4 (mostrado) con peso 5
        agregarArista(1, 2, 5);  // Arista entre nodo 2 y 3 (mostrado) con peso 5
        agregarArista(1, 4, 3);  // Arista entre nodo 2 y 5 (mostrado) con peso 3
        agregarArista(2, 4, 6);  // Arista entre nodo 3 y 5 (mostrado) con peso 6
        agregarArista(2, 5, 4);  // Arista entre nodo 3 y 6 (mostrado) con peso 4
        agregarArista(2, 3, 5);  // Arista entre nodo 3 y 4 (mostrado) con peso 5
        agregarArista(3, 5, 2);  // Arista entre nodo 4 y 6 (mostrado) con peso 2
        agregarArista(4, 5, 6);  // Arista entre nodo 5 y 6 (mostrado) con peso 6

        // Ejecutar el algoritmo de Prim
        prim();
    }

    /**
     * Método para agregar una arista al grafo no dirigido
     * Como el grafo es no dirigido, se agrega la arista en ambas direcciones
     */
    static void agregarArista(int u, int v, int peso) {
        // Agregar arista u->v a la lista de adyacencia del nodo u
        grafo.get(u).add(new Arista(u, v, peso));
        // Agregar arista v->u a la lista de adyacencia del nodo v (grafo no dirigido)
        grafo.get(v).add(new Arista(v, u, peso));
    }

    /**
     * Implementación del algoritmo de Prim con visualización paso a paso
     * Encuentra el Árbol de Recubrimiento Mínimo (MST) del grafo
     */
    static void prim() {
        // Array para marcar qué nodos ya están incluidos en el árbol
        boolean[] visitado = new boolean[V];
        
        // Cola de prioridad que ordena aristas por peso (menor peso = mayor prioridad)
        PriorityQueue<Arista> cola = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso));
        
        // Lista que almacenará las aristas del árbol de recubrimiento mínimo
        List<Arista> arbol = new ArrayList<>();
        
        // Conjunto B: nodos que ya están conectados al árbol
        Set<Integer> B = new HashSet<>();

        // PASO 1: Inicializar con el nodo 0 como punto de partida
        visitado[0] = true;           // Marcar nodo 0 como visitado
        B.add(0);                     // Agregar nodo 0 al conjunto de nodos conectados
        cola.addAll(grafo.get(0));    // Agregar todas las aristas del nodo 0 a la cola

        // Imprimir encabezado de la tabla de seguimiento
        System.out.println("\n═════════════════════════════════════════════════════════════════════════════════════════════════════════════");
        System.out.printf("%-35s | %-15s | %-15s | %-10s | %-5s\n",
                "T (Árbol Parcial)",      // Aristas ya seleccionadas
                "B (Visitados)",          // Nodos ya conectados al árbol
                "N/B (No Visitados)",     // Nodos aún no conectados
                "e = {u,v}",              // Arista seleccionada en esta iteración
                "Peso");                  // Peso de la arista seleccionada
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────");

        // PASO 2: Bucle principal - continuar hasta tener V-1 aristas
        // Un árbol con V nodos tiene exactamente V-1 aristas
        while (arbol.size() < V - 1) {
            // Extraer la arista de menor peso de la cola de prioridad
            Arista a = cola.poll();

            // Verificar si esta arista conecta un nodo visitado con uno no visitado
            // (esto previene la formación de ciclos)
            if (!visitado[a.destino]) {
                // PASO 2a: Agregar el nuevo nodo al árbol
                visitado[a.destino] = true;    // Marcar el nodo destino como visitado
                arbol.add(a);                  // Agregar la arista al árbol MST
                B.add(a.destino);              // Agregar el nodo al conjunto de conectados
                
                // PASO 2b: Agregar todas las aristas del nuevo nodo a la cola
                // Esto permite considerar nuevas conexiones en las siguientes iteraciones
                cola.addAll(grafo.get(a.destino));

                // PASO 2c: Calcular el conjunto de nodos no visitados (N \ B)
                Set<Integer> NB = new HashSet<>();
                for (int i = 0; i < V; i++) {
                    if (!visitado[i]) {      // Si el nodo i no ha sido visitado
                        NB.add(i);           // Agregarlo al conjunto de no visitados
                    }
                }

                // PASO 2d: Imprimir el estado actual en la tabla de seguimiento
                System.out.printf("%-35s | %-15s | %-15s | %-10s | %-5d\n",
                        arbol.toString(),    // Lista de aristas en el árbol actual
                        mostrar(B),          // Conjunto de nodos visitados
                        mostrar(NB),         // Conjunto de nodos no visitados
                        a.toString(),        // Arista que se acaba de agregar
                        a.peso               // Peso de esa arista
                );
            }
            // Si el nodo destino ya fue visitado, simplemente ignoramos esta arista
            // (esto puede ocurrir porque pueden quedar aristas obsoletas en la cola)
        }

        // Imprimir línea de cierre de la tabla
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════════════════════════");

        // PASO 3: Mostrar el resultado final del Árbol de Recubrimiento Mínimo
        System.out.println("\nÁrbol de Recubrimiento Mínimo Final:");
        for (Arista a : arbol) {
            // Mostrar cada arista del MST con índices humanos (1-6) y su peso
            System.out.printf("• %d — %d : %d\n", a.origen + 1, a.destino + 1, a.peso);
        }
        
        // Calcular y mostrar el costo total del MST
        int costoTotal = 0;
        for (Arista a : arbol) {
            costoTotal += a.peso;
        }
        System.out.println("\nCosto total del MST: " + costoTotal);
    }

    /**
     * Método auxiliar para convertir un conjunto de nodos a formato legible
     * Convierte índices internos (0-5) a numeración humana (1-6)
     */
    static String mostrar(Set<Integer> conjunto) {
        List<Integer> lista = new ArrayList<>();
        // Convertir cada nodo del conjunto sumando 1 para mostrar numeración desde 1
        for (int x : conjunto) {
            lista.add(x + 1);
        }
        // Retornar la representación en string de la lista
        return lista.toString();
    }
}
