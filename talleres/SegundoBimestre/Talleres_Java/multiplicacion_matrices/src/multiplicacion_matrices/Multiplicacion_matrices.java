
package multiplicacion_matrices;


public class Multiplicacion_matrices {

    
    public static void main(String[] args) {
         
        // Matrices de entrada (2x2)
        int[][] A = {
            {1, 3},
            {5, 7}
        };

        int[][] B = {
            {8, 4},
            {6, 2}
        };

        // Aplicar algoritmo de Strassen
        int[][] resultado = strassen(A, B);

        // Mostrar resultado final
        System.out.println("\nResultado Final (C = A x B):");
        mostrarMatriz(resultado);

        // Prueba de escritorio: mostrar todos los pasos
        System.out.println("\n========== PRUEBA DE ESCRITORIO ==========");
        ejecutarPruebaDeEscritorio(A, B);
    }

    /**
     * Algoritmo de Strassen para matrices 2x2
     */
    public static int[][] strassen(int[][] A, int[][] B) {
        int a11 = A[0][0], a12 = A[0][1], a21 = A[1][0], a22 = A[1][1];
        int b11 = B[0][0], b12 = B[0][1], b21 = B[1][0], b22 = B[1][1];

        // Cálculo de las 7 multiplicaciones de Strassen
        int M1 = (a11 + a22) * (b11 + b22);
        int M2 = (a21 + a22) * b11;
        int M3 = a11 * (b12 - b22);
        int M4 = a22 * (b21 - b11);
        int M5 = (a11 + a12) * b22;
        int M6 = (a21 - a11) * (b11 + b12);
        int M7 = (a12 - a22) * (b21 + b22);

        // Combinación para obtener la matriz resultante C
        int c11 = M1 + M4 - M5 + M7;
        int c12 = M3 + M5;
        int c21 = M2 + M4;
        int c22 = M1 - M2 + M3 + M6;

        // Construir la matriz resultado
        return new int[][] {
            {c11, c12},
            {c21, c22}
        };
    }

    /**
     * Mostrar matriz de forma bonita
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.print("| ");
            for (int valor : fila) {
                System.out.printf("%4d ", valor);
            }
            System.out.println("|");
        }
    }

    /**
     * Desarrollar paso a paso la prueba de escritorio
     */
    public static void ejecutarPruebaDeEscritorio(int[][] A, int[][] B) {
        int a11 = A[0][0], a12 = A[0][1], a21 = A[1][0], a22 = A[1][1];
        int b11 = B[0][0], b12 = B[0][1], b21 = B[1][0], b22 = B[1][1];

        System.out.println("\nSubmatrices:");
        System.out.println("A:");
        mostrarMatriz(A);
        System.out.println("B:");
        mostrarMatriz(B);

        // Cálculo detallado de M1 a M7
        int M1 = (a11 + a22) * (b11 + b22);
        int M2 = (a21 + a22) * b11;
        int M3 = a11 * (b12 - b22);
        int M4 = a22 * (b21 - b11);
        int M5 = (a11 + a12) * b22;
        int M6 = (a21 - a11) * (b11 + b12);
        int M7 = (a12 - a22) * (b21 + b22);

        System.out.println("\n| M  | Expresión                                     | Resultado |");
        System.out.println("|----|-----------------------------------------------|-----------|");
        System.out.printf("| M1 | (%d + %d) * (%d + %d) = %2d * %2d         | %9d |\n", a11, a22, b11, b22, (a11 + a22), (b11 + b22), M1);
        System.out.printf("| M2 | (%d + %d) * %d = %2d * %2d                  | %9d |\n", a21, a22, b11, (a21 + a22), b11, M2);
        System.out.printf("| M3 | %d * (%d - %d) = %2d * %2d                  | %9d |\n", a11, b12, b22, a11, (b12 - b22), M3);
        System.out.printf("| M4 | %d * (%d - %d) = %2d * %2d                  | %9d |\n", a22, b21, b11, a22, (b21 - b11), M4);
        System.out.printf("| M5 | (%d + %d) * %d = %2d * %2d                  | %9d |\n", a11, a12, b22, (a11 + a12), b22, M5);
        System.out.printf("| M6 | (%d - %d) * (%d + %d) = %2d * %2d           | %9d |\n", a21, a11, b11, b12, (a21 - a11), (b11 + b12), M6);
        System.out.printf("| M7 | (%d - %d) * (%d + %d) = %2d * %2d           | %9d |\n", a12, a22, b21, b22, (a12 - a22), (b21 + b22), M7);

        // Composición final de la matriz resultado
        int c11 = M1 + M4 - M5 + M7;
        int c12 = M3 + M5;
        int c21 = M2 + M4;
        int c22 = M1 - M2 + M3 + M6;

        System.out.println("\nResultado final:");
        System.out.println("| C11 = M1 + M4 - M5 + M7 = " + c11);
        System.out.println("| C12 = M3 + M5 = " + c12);
        System.out.println("| C21 = M2 + M4 = " + c21);
        System.out.println("| C22 = M1 - M2 + M3 + M6 = " + c22);

        System.out.println("\nMatriz C (resultado):");
        System.out.printf("| %4d %4d |\n", c11, c12);
        System.out.printf("| %4d %4d |\n", c21, c22);
    }
}