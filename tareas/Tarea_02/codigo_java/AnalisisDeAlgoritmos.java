
package analisis.de.algoritmos;

public class AnalisisDeAlgoritmos {

    
    public static void main(String[] args) {
        
         int[] A = {4, 8, 6, 2, 5, 7, 1};
         
        //Arreglo Original
        System.out.println("Array original:");
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        //Ejemplo de uso
        int p = 0;
        int q = ((A.length-1)/2)-1; 
        int r = A.length-1 ;
        

        // Ahora hacemos la "merge" manualmente
        int nL = q - p + 1; //Tamaño de L
        int nR = r - q; //Tamaño de R

        int[] L = new int[nL];
        int[] R = new int[nR];
        
        //Copiar elementos en L
        for (int i = 0; i < nL; i++) {
            L[i] = A[p + i];
        }
        //Copiar elementos en R
        for (int j = 0; j < nR; j++) {
            R[j] = A[q + 1 + j];
        }
        
        int i = 0; //Indice en L
        int j = 0; //Indice en R
        int k = p; //Indice en A
        
        //Combinar los arreglos
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        
        //Elementos restantes de L
        while (i < nL) {
            A[k] = L[i];
            k++;
            i++;
        }
        //Elementos restantes de R
        while (j < nR) {
            A[k] = R[j];
            k++;
            j++;
        }
        
        //Presentacion del arreglo ordenado 
        System.out.println("Array parcialmente ordenado:");
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
    
}
